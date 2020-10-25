package person;

import java.util.*;

public class WorkWithEmployees {
    private final List<Employee> employeeList;

    public WorkWithEmployees(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public List<Person> extractPersonsBySalary(int salary) {
        List<Person> personList = new ArrayList<>();

        for (Employee employee : employeeList) {
            if (employee.getSalary() > salary) {
                personList.add(employee);
            }
        }
        return personList;
    }

    public Map<String, List<Person>> extractPersonsByCompany() {
        Map<String, List<Person>> result = new HashMap<>();

        for (Employee employee : employeeList) {
            List<Person> personList = result.get(employee.getCompany());
            if (personList == null) {
                personList = new ArrayList<>();
                result.put(employee.getCompany(), personList);
            }
            personList.add(employee);
        }
        return result;
    }

    public int sumOfSalaries() {
        int sum = 0;
        for (Employee employee : employeeList) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public String biggestSalary() {
        int max = 0;
        String company = "";
        for (Employee employee : employeeList) {
            if (employee.getSalary() > max) {
                max = employee.getSalary();
                company = employee.getCompany();
            }
        }
        return company;
    }
}
