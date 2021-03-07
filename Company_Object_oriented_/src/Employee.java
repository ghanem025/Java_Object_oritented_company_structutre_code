//Name Ghanem Ghanem
//Date: 2020-11-08
//ID 110005430
import java.util.ArrayList;
import java.util.Comparator;

public class Employee extends Person {
    int year_hiring;
    int salary;
    int vacationDays;
    int unusedDays;

    public Employee(String fname , String lname,long phoneNum,int month , int day ,int year_hiring , int salary , int vacationDays, int unusedDays){
        super(fname,lname,phoneNum,month,day);
        this.year_hiring=year_hiring;
        this.salary=salary;
        this.vacationDays=vacationDays;
        this.unusedDays=unusedDays;

    }
    public int getYear_hiring() {
        return year_hiring;
    }// getter and setters for all the properties of an employee

    public void setYear_hiring(int year_hiring) {
        this.year_hiring = year_hiring;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getVacationDays() {
        return vacationDays;
    }

    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }

    public int getUnusedDays() {
        return unusedDays;
    }

    public void setUnusedDays(int unusedDays) {
        this.unusedDays = unusedDays;
    }
    @Override
    public String toString() {//return the name of the employee , we can also use the getters to return many things
        //such a salary (getSalary) and vacaction days , however for an easier look at the code i decided not to add
        //all the properties of the employees in my return statement
        return "Name: "+fname+" "+lname+", Year of hiring: "+getYear_hiring()+", salary: " + getSalary()+ ", Vacation days: "
                +getVacationDays()+", unused Vacation days: "+getUnusedDays();
    }


}
class Manager extends Employee{//manager class that extends from the employee class
    int bonus;
    ArrayList<Employee>employees = new ArrayList<>();
    public Manager(String fname , String lname,long phoneNum,int month , int day ,int year_hiring , int salary , int vacationDays, int unusedDays,int bonus){
        super(fname,lname,phoneNum,month,day,year_hiring,salary,vacationDays,unusedDays);
        this.bonus =bonus;
        employees = new ArrayList<>();
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public ArrayList<Employee> getEmployees() {
        System.out.println("Employees working under "+getFname()+" "+getLname());
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
    public void AddEmployee(Employee emp){
        employees.add(emp);

    }
    @Override
    public String toString() {//return the name of the employee , we can also use the getters to return many things
        //such a salary (getSalary) and vacaction days , however for an easier look at the code i decided not to add
        //all the properties of the employees in my return statement
        return super.toString()+" bonus: "+getBonus();
    }


}
