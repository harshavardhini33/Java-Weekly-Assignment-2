class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    String specialization;
}

class Manager extends Member {
    String department;
}

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "John Smith";
        employee.age = 25;
        employee.phoneNumber = "1234567890";
        employee.address = "123 Main St, Anytown USA";
        employee.salary = 50000.00;
        employee.specialization = "Java Developer";

        Manager manager = new Manager();
        manager.name = "Jane Doe";
        manager.age = 35;
        manager.phoneNumber = "0987654321";
        manager.address = "456 Elm St, Anytown USA";
        manager.salary = 100000.00;
        manager.department = "Engineering";

        System.out.println("Employee:");
        System.out.println("Name: " + employee.name);
        System.out.println("Age: " + employee.age);
        System.out.println("Phone Number: " + employee.phoneNumber);
        System.out.println("Address: " + employee.address);
        System.out.println("Salary: " + employee.salary);
        System.out.println("Specialization: " + employee.specialization);

        System.out.println("\nManager:");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone Number: " + manager.phoneNumber);
        System.out.println("Address: " + manager.address);
        System.out.println("Salary: " + manager.salary);
        System.out.println("Department: " + manager.department);
    }
}
