package Lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

        System.out.println("List:");
        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println("");
        System.out.println("Who is with index 1?");
        System.out.println(employeeList.get(1));

        System.out.println("");
        System.out.println("Is Empty?");
        System.out.println(employeeList.isEmpty());

        System.out.println("");
        System.out.println("List 2:");
        employeeList.set(1, new Employee("John", "Adams", 456));
        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println("");
        System.out.println("What is the size?");
        System.out.println(employeeList.size());


        System.out.println("");
        System.out.println("List 3:");
        employeeList.add(3, new Employee("John", "Doe", 4567));
        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println("");
        System.out.println("What is the size now?");
        System.out.println(employeeList.size());

        System.out.println("");
        System.out.println("List 4:");
        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for (Employee employee : employeeArray) {
            System.out.println(employee);
        }

        System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22)));
        System.out.println(employeeList.indexOf(new Employee("John", "Doe", 4567)));

        employeeList.remove(2);

        System.out.println("");
        System.out.println("List 5:");
        employeeList.forEach(employee -> System.out.println(employee));
    }
}
