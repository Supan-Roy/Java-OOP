// Interface - common actions for any user
interface UserActions {
    void login();
    void logout();
} 

// Abstract Class - common properties and some methods
abstract class Person implements UserActions {
    protected String id;
    protected String name;

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void showBasicInfo() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    // Abstract method to be implemented by all
    public abstract void showRole();
}

// Student class - Inherits Person
class Student extends Person {
    private String major;

    public Student(String id, String name, String major) {
        super(id, name);
        this.major = major;
    }

    @Override
    public void login() {
        System.out.println(name + " (Student) logged into student portal.");
    }

    @Override
    public void logout() {
        System.out.println(name + " (Student) logged out.");
    }

    @Override
    public void showRole() {
        System.out.println(name + " is a Student of " + major);
    }
}

// Teacher class - Inherits Person
class Teacher extends Person {
    private String department;

    public Teacher(String id, String name, String department) {
        super(id, name);
        this.department = department;
    }

    @Override
    public void login() {
        System.out.println(name + " (Teacher) logged into teaching panel.");
    }

    @Override
    public void logout() {
        System.out.println(name + " (Teacher) logged out.");
    }

    @Override
    public void showRole() {
        System.out.println(name + " is a Teacher in " + department + " department.");
    }
}

// Admin class - Inherits Person
class Admin extends Person {
    private String responsibility;

    public Admin(String id, String name, String responsibility) {
        super(id, name);
        this.responsibility = responsibility;
    }

    @Override
    public void login() {
        System.out.println(name + " (Admin) logged into admin dashboard.");
    }

    @Override
    public void logout() {
        System.out.println(name + " (Admin) logged out.");
    }

    @Override
    public void showRole() {
        System.out.println(name + " is an Admin responsible for " + responsibility);
    }
}

public class UniversityApp {
    public static void main(String[] args) {
        // Polymorphism: using Person reference for each subclass object
        Person student = new Student("S001", "Supan", "CSE");
        Person teacher = new Teacher("T001", "Jahanara Mam", "Mathematics");
        Person admin = new Admin("A001", "Reza Sir", "IT Infrastructure");

        // Student
        student.showBasicInfo();
        student.login();
        student.showRole();
        student.logout();

        // Teacher
        teacher.showBasicInfo();
        teacher.login();
        teacher.showRole();
        teacher.logout();

        // Admin
        admin.showBasicInfo();
        admin.login();
        admin.showRole();
        admin.logout();
    }
}
