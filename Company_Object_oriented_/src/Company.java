//Name Ghanem Ghanem
//Date: 2020-11-08
//ID 110005430
import java.util.ArrayList;
import java.util.Comparator;

public class Company {
    String companyName;
    int starting;
    ArrayList<Employee> workers = new ArrayList<>();


    public Company(String companyName, int starting){
        this.companyName=companyName;
        this.starting=starting;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getStarting() {
        return starting;
    }

    public void setStarting(int starting) {
        this.starting = starting;
    }

    public ArrayList<Employee> getWorkers() {
        return workers;
    }
    public ArrayList<Employee>SortByLast(){//display all current friends  sorted by there last names
       workers.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLname().compareTo(o2.getLname());
            }
        });
        return workers;
    }

    public void AddWorkers(Employee e) {
        workers.add(e);
    }

}
