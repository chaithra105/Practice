//public class HighestSalary {
//}
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HighestSalary {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1,"Ann",200,"jan","cs"),
                new Employee(2,"Alice",100,"feb","cs"),
                new Employee(3,"Bob",300,"jan","fb"),
                new Employee(4,"David",300,"jan","ed"));

        Map<Double, List<Employee>> employeesBySalary = employees.stream()
                .collect(Collectors.groupingBy(Employee::getSalary));

        Map<Double, List<Employee>> employeesWithSameSalary = employeesBySalary.entrySet().stream()
                .filter(entry -> entry.getValue().size() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        employeesWithSameSalary.forEach((salary, employeeList) -> {
            System.out.println("Salary: " + salary);
            employeeList.forEach(System.out::println);
        });
    }
}