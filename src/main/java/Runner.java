import db.DBHelper;
import db.DBManager;
import models.Administrator;
import models.Department;
import models.Employee;
import models.Manager;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Manager manager1 = new Manager("Jimbob", "AB123456", 10, 7);
        Manager manager2 = new Manager("Robert Robertson", "ZY999999", 10, 9);
        DBHelper.save(manager1);
        DBHelper.save(manager2);

        Department department1 = new Department("Lemonade Stands", manager1);
        Department department2 = new Department("Kite Making", manager2);
        DBHelper.save(department1);
        DBHelper.save(department2);

        Administrator administrator1 = new Administrator("Jimmyjohn", "CD987654", 4, manager1);
        Administrator administrator2 = new Administrator("Laura Laurason", "EF987653", 4, manager1);
        Administrator administrator3 = new Administrator("Billybob", "GH66666", 4, manager2);
        DBHelper.save(administrator1);
        DBHelper.save(administrator2);
        DBHelper.save(administrator3);

        List<Employee> foundEmployees = DBHelper.getAll(Employee.class);
        List<Manager> foundManagers = DBHelper.getAll(Manager.class);
        List<Administrator> foundAdministrators = DBHelper.getAll(Administrator.class);
        List<Department> foundDeparments = DBHelper.getAll(Department.class);

        List<Employee> jimbobsEmployees = DBManager.getEmployeesForManager(manager1);

        Department foundJimbobsDepartment = DBManager.getManagerDeparment(manager1);

    }

}
