import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Pedro", "Perez", 344, 230.00));
        list.add(new Employee("Juan", "Molina", 433, 430.00));
        list.add(new Employee("Felipe", "Jara", 122, 330.00));
        list.add(new Employee("Jaime", "Parra", 899, 330.00));

        File.saveEmployeeSpecialFormat(list);
    }
}
