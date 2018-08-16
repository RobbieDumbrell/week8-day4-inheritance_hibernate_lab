import db.DBHelper;
import models.Administrator;
import models.Manager;

public class Runner {

    public static void main(String[] args) {

        Manager manager1 = new Manager("Jimbob", "AB123456", 10, 7, "Lemonade Stands");
        DBHelper.save(manager1);

        Administrator administrator1 = new Administrator("Jimmyjohn", "CD987654", 4, manager1);
        Administrator administrator2 = new Administrator("Laura Laurason", "EF987653", 4, manager1);
        DBHelper.save(administrator1);
        DBHelper.save(administrator2);

    }

}
