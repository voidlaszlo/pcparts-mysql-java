import dao.PartDao;
import model.Part;

public class PcPartsDemo {
    public static void main(String[] args) throws Exception {
        new Part("GTX 2080", "Nvidia", 850);
        new Part("GTX 2080 Ti", "Nvidia", 1280);
        new Part("GTX 2070", "Nvidia", 500);
        new Part("GTX 2060", "Nvidia", 370);

        PartDao partDao = new PartDao();
        partDao.createRecords(Part.parts);
    }
}
