// Employee class
class Employee {
    private String name;
    private int id;
    private double salary;

    // Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }
}

// MyClass with the main method
public class MyClass {
    public static void main(String[] args) {
        // Creating an Employee object using the constructor
        Employee employee = new Employee("Alice Johnson", 1001, 50000.00);

        // Displaying initial details
        System.out.println("Employee Details:");
        System.out.println("Name: " + employee.getName());
        System.out.println("ID: " + employee.getId());
        System.out.println("Salary: $" + employee.getSalary());

        // Modifying details using setters
        employee.setName("Bob Williams");
        employee.setId(1002);
        employee.setSalary(55000.00);

        // Displaying updated details
        System.out.println("\nUpdated Employee Details:");
        System.out.println("Name: " + employee.getName());
        System.out.println("ID: " + employee.getId());
        System.out.println("Salary: $" + employee.getSalary());
    }
}
