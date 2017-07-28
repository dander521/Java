package JavaBasic.Chapter2;

public class Emplyee {
    String name;
    String designation;
    int age;
    double salary;

    public Emplyee(String name) {
        this.name = name;
    }

    public void empAge(int empAge) {
        age = empAge;
    }

    public void empDesignation(String empDesign) {
        this.designation = empDesign;
    }

    public void empSalary(double empSalary) {
        this.salary = empSalary;
    }

    public void printEmployee() {
        System.out.println("名字：" + name);
        System.out.println("年龄：" + age);
        System.out.println("职位：" + designation);
        System.out.println("薪水：" + salary);
    }
}
