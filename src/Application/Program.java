package Application;

import Model.Dao.DaoFactory;
import Model.Dao.SellerDao;
import Model.Entities.Department;
import Model.Entities.Seller;
import java.time.LocalDate;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TESTE 1: seller findById =====");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n=== TESTE 2: seller findByDepartment =====");
        Department department = new Department (2, "Eletronics");
        List<Seller> sellers = sellerDao.findByDepartment(department);
        for (Seller obj : sellers) {
            System.out.println(obj);
        }

        System.out.println("\n=== TESTE 3: seller findAll =====");
        sellers = sellerDao.findAll();
        for (Seller obj : sellers) {
            System.out.println(obj);
        }

        System.out.println("\n=== TESTE 4: seller insert =====");
        LocalDate birthDate = LocalDate.parse("2004-12-11");
        Seller sellerInsert = sellerDao.insert(new Seller(null, "Flávio", "flavio@gmail.com", birthDate, 1620.0, department));
        System.out.println(sellerInsert);
    }
}
