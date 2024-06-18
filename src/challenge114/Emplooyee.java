package challenge114;

public class Emplooyee {

    private final String name;

    private final int salary;

    public Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
    public String getName(){
        return name;
    }

    public int getSalary(){
        return salary;
    }
}
