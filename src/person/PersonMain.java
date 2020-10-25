package person;

import java.util.List;

public class PersonMain {
    public static void main(String[] args) {
        WorkWithPersons person = new WorkWithPersons(List.of(
                new Person("Bela", 25,"black"),
                new Person("Marcel", 20,"brown"),
                new Person("Dan", 44,"black"),
                new Person("Ana", 70,"blonde"),
                new Person("Maria", 44,"pink")));

        WorkWithEmployees employee = new WorkWithEmployees(List.of(
                new Employee("Bela", 25,"black", "WebEye", 1000),
                new Employee("Marcel", 20,"brown", "Ikea", 1200),
                new Employee("Dan", 44,"black", "Ikea", 2300),
                new Employee("Ana", 70,"blonde", "Lotus", 500),
                new Employee("Maria", 44,"pink", "McNeil", 3333),
                new Employee("Mark", 44,"black", "McNeil", 333)));

        System.out.println(person.personNames());

        System.out.println("\n");
        System.out.println(person.mapNameToAge());

        System.out.println("\n");
        System.out.println(person.extractPersons(50));

        System.out.println("\n");
        System.out.println(person.mapFromColourToName());

        System.out.println("\n");
        System.out.println(person.mapFromAgeToPerson());

        System.out.println("\n");
        System.out.println(employee.extractPersonsBySalary(2000));

        System.out.println("\n");
        System.out.println(employee.extractPersonsByCompany());

        System.out.println("\n");
        System.out.println(employee.sumOfSalaries());

        System.out.println("\n");
        System.out.println(employee.biggestSalary());
    }
}
