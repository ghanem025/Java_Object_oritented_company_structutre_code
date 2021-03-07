import java.util.ArrayList;

//Name Ghanem Ghanem
//Date: 2020-11-08
//ID 110005430
public class CompanyTester {

    public static void main(String [] args){
        Company google = new Company("google",1987);
        Employee employee3 = new Employee("jack","gray",5190034343L,2,19,2015,135000,10,10);
        Employee employee2 = new Employee("alex","smith",5190034343L,10,19,2018,100000,10,10);
        Employee employee1 = new Employee("john","smith",5190034343L,9,9,2016,125000,10,10);
        Manager manager2 = new Manager("lake","jake",5190024233L,1,29,2010,150000,10,10,500);
        Manager manager1 = new Manager("chris","smith",5190023343L,10,19,2010,150000,10,10,500);
        google.AddWorkers(employee1);//adding the employees to the company
        google.AddWorkers(manager1);
        google.AddWorkers(employee2);
        google.AddWorkers(manager2);
        google.AddWorkers(employee3);
        manager1.AddEmployee(employee1);//each manager has a set of employees added to them
        manager1.AddEmployee(employee3);
        manager2.AddEmployee(employee2);

        System.out.println("Company name: "+google.getCompanyName()+"\nStarting year: "+google.getStarting());
        System.out.println("all Employees of the company:\n"+google.getWorkers());
        System.out.println("All the employees of the company sorted by last name\n"+ google.SortByLast());
        System.out.println(manager1.getEmployees());// print out all the employees that work for that manager
        System.out.println(manager2.getEmployees());//print out all the employees that work for that manager

    }
}
