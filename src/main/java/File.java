import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class File {
    public static void saveEmployeeSpecialFormat(List<Employee> employeeList) {
//        Save Output
        try (FileOutputStream fos = new FileOutputStream("employee.txt");
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {
            for (Employee e : employeeList) {
                String em = e.toString() + "\n";
                bos.write(em.getBytes());
            }
        } catch (IOException e) {
            e.fillInStackTrace();
        }
    }
}
