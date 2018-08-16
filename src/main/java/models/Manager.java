package models;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {

    private int budget;
    private String department;
    private List<Administrator> administrators;

    public Manager() {
    }

    public Manager(String name, String NINumber, int salary, int budget, String department) {
        super(name, NINumber, salary);
        this.budget = budget;
        this.department = department;
        this.administrators = new ArrayList<Administrator>();
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<Administrator> getAdministrators() {
        return administrators;
    }

    public void setAdministrators(List<Administrator> administrators) {
        this.administrators = administrators;
    }
}
