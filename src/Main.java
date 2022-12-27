public class Main {
    public static void main(String[] args) {
        System.out.println("Курсовая_работа_1!");

        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addEmployee(new Employee("Набиулина", "Лидия", "Ивановна", 4, 44223));
        employeeBook.printEmployee();
        employeeBook.printSumSalaryIndex();
        System.out.println("Максимальная зарплата сотрудника: " + employeeBook.getMaxSalaryEmployee());
        System.out.println("Минимальная зарплата сотрудника: " + employeeBook.getMinSalaryEmployee());

    }
}