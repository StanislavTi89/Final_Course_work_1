import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeBook {
    private static Employee[] employees = new Employee[10];{
        employees[0] = new Employee("Ларина", "Ариана", "Ивановна", 1, 35442);
        employees[1] = new Employee("Галкина", "Анна", "Максимовна", 2, 43550);
        employees[2] = new Employee("Акимова", "Малика", "Матвеевна", 3, 54353);
        employees[3] = new Employee("Воронин", "Никита", "Никита", 4, 34324);
        employees[4] = new Employee("Орлов", "Максим", "Максимович", 5, 54355);
        employees[5] = new Employee("Кулешов", "Михаил", "Артёмович", 6, 24232);
        employees[6] = new Employee("Федотов", "Никита", "Романович", 7, 54534);
        employees[7] = new Employee("Цветков", "Михаил", "Александрович", 8, 33445);
        employees[8] = new Employee("Яшина", "София", "Ивановна", 9, 55543);
        employees[9] = new Employee("Филатова", "Амина", "Михайловна", 10, 34567);
    }

    public void printEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public double sumSalary() {
        double sum = 0d;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public void printSumSalaryIndex() {
        System.out.println(sumSalary());
    }

    public int getIndexSalaryEmployee() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                return i;
            }
        }
        throw new RuntimeException("Сотрудник Не индифицирован");
        // throw new NullPointerException("Кота не существует");
        //        } catch (NullPointerException e) {
    }

    public Employee getMinSalaryEmployee() {
        Employee employeeWithMinSalary = employees[getIndexSalaryEmployee()];
        for (int i = getIndexSalaryEmployee() + 1; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employees[i];
            }
        }
        return employeeWithMinSalary;
    }

    public Employee getMaxSalaryEmployee() {
        Employee employeeWithMaxSalary = employees[getIndexSalaryEmployee()];
        for (int i = getIndexSalaryEmployee() + 1; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employees[i];
            }
        }
        return employeeWithMaxSalary;
    }

    public void printAllDepartment(String department) {
        for (Employee employee : employees) {
            if (department.equals(employee.getDepartment())) {
                System.out.println(employee);
            }
        }
    }

    public void printAllEmployeeDepartment() {
        List<String> departments = findAllDepartment();
        for (String department : departments) {
            System.out.println("В отделе №: " + department + ", работают");
            printAllDepartment(department);
        }
    }

    public List<String> findAllDepartment() {
        List<String> allDepartment = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee != null && !allDepartment.contains(employee.getDepartment())) {
                allDepartment.add(String.valueOf(employee.getDepartment())); //ALT Метод valueOf()
            }
        }
        return  allDepartment;
    }

}
