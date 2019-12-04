package dao;

import model.Part;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.*;

public class PartDao {
    Connection con = null;

    // CONNECT
    public void connect() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abc?autoReconnect=true&useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "pass");
    }

    // CREATE RECORDS
    public int createRecords(List<Part> parts) throws Exception {
        connect();

        PreparedStatement st = con.prepareStatement("insert into parts values (?, ?, ?, ?)");
        for(Part part : parts) {
            st.setString(1, part.getId());
            st.setString(2, part.getName());
            st.setString(3, part.getBrand());
            st.setInt(4, (int) part.getPrice());
            st.executeUpdate();
        }

        con.close();
        st.close();
        return 1;
    }
}
