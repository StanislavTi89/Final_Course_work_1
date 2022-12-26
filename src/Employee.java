import java.util.Objects;

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

    public String getSurName() {
        return surName;
    }
    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getDepartment() {
        return department;
    }
    public void setDepartment(int department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String toString() {
        return "Сотрудник: " + "Ф.И.О. " + surName + " " + name + " " +lastName+ ", " + id + "Сотрудник отдела: " + department + ", выплата оклада: " + String.format("%.2f",salary);
    }
    //String sf1=String.format("name is %s",name);
    //String sf2=String.format("value is %f",32.33434);
    //String sf3=String.format("value is %32.12f",32.33434);
    // returns 12 char fractional part filling with 0
    //name is Stan
    //value is 32.334340
    //value is 32.334340000000

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

    //public boolean equals(Object o) {
    //        // now check the reference of both object
    //        if(this == o) return true;
    //        // check the type of class
    //        if(o == null || o.getClass() != this.getClass()) return false;
    //        // now compare the value
    //        Employee employee = (Employee)o;
    //        if(employee.id == this.id && employee.name.equals(this.name)) {
    //            return true;
    //        } else return false;
    //    }
    public int hashCode() {
        return Objects.hash(id);
    }
    //public int hashCode() {
    // here we are using id. We can also use other logic such as prime number addition or memory address.
    //  return ...id;
    //    }

}
