package challenge79;

public class TestEmployee {

    public static void main(String[] args) {

        Employee emp = new Employee("Prince", 21, 25000);
        System.out.println(emp.getEmployeeDetails());
        emp.setName("Golu");
        System.out.println(emp.getEmployeeDetails());

    }
}
