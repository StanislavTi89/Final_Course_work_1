
public class Employee {
    public String name;
    public String surName;
    public String lastName;
    public int department;
    public double salary;
    public long id = count;
    public static long count = 1L;

    public Employee(String surName, String name, String lastName, int department, double salary) {
        this.surName = surName;
        this.name = name;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
        count++;
    }

    public String toString() {
        return "Сотрудник: " + "Ф.И.О. " + surName + " " + name + " " +lastName+ " " + id + "Сотрудник отдела: " + department + ", выплата оклада: " + salary;
    }

}
