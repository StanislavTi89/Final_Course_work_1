public class EmployeeBook {
    private static Employee[] employees = new Employee[10];{
        employees[0] = new Employee("Ларина", "Ариана", "Ивановна", 2, 35442);
        employees[1] = new Employee("Галкина", "Анна", "Максимовна", 43, 43550);
        employees[2] = new Employee("Акимова", "Малика", "Матвеевна", 32, 54353);
        employees[3] = new Employee("Воронин", "Никита", "Никита", 51, 34324);
        employees[4] = new Employee("Орлов", "Максим", "Максимович", 12, 54355);
        employees[5] = new Employee("Кулешов", "Михаил", "Артёмович", 13, 24232);
        employees[6] = new Employee("Федотов", "Никита", "Романович", 43, 54534);
        employees[7] = new Employee("Цветков", "Михаил", "Александрович", 21, 33445);
        employees[8] = new Employee("Яшина", "София", "Ивановна", 11, 55543);
        employees[9] = new Employee("Филатова", "Амина", "Михайловна", 21, 34567);
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
                sum += employee.getSalary;
            }
        }
        return sum;
    }

    public void printSumSalaryIndex() {
        System.out.println(sumSalary());
    }

    public Employee getMinSalaryEmployee() {
        Employee employeeWithMinSalary = employees[getMinSalaryEmployee()];
        for (int i = getMinSalaryEmployee() + 1; i < employees.length; i++) {
            if (employees[i] != null && employees[i].)
        }
    }
}
