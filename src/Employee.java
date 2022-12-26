
public class Employee {
    private String name;
    private String surName;
    private String lastName;
    private int department;
    private double salary;
    private final long id = count;
    private static long count = 1L;

    public Employee(String surName, String name, String lastName, int department, double salary) {
        this.surName = surName;
        this.name = name;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
        count++;
    }

    public String toString() {
        return "Сотрудник: " + "Ф.И.О. " + surName + " " + name + " " +lastName+ ", " + id + "Сотрудник отдела: " + department + ", выплата оклада: " + salary;
    }

    public boolean isDepartment(String department) {
        if (department.equals("1") || department.equals("2") || department.equals("3") || department.equals("4") || department.equals("5")) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Employee employee = (Employee) obj;
        return id == employee.id;
    }

}
