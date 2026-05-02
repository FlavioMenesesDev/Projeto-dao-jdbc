package Application;

import Model.Entities.Department;
import Model.Entities.Seller;
import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {

        Department obj = new Department(1, "books");

        LocalDate birthDate = LocalDate.of(2004, 12, 11);
        Seller seller =  new Seller(1, "Flavio", "flavio@gmail.com", birthDate, 1620.0, obj);

        System.out.println(seller);
    }
}
