package JavaBasic.Chapter2;

public class EmployeeTest {
    public static void main(String[] args) {
        Emplyee roger = new Emplyee("Roger");
        Emplyee chen = new Emplyee("Chen");

        roger.empAge(20);
        roger.empDesignation("初级程序员");
        roger.empSalary(1000);
        roger.printEmployee();

        chen.empAge(30);
        chen.empDesignation("高级程序员");
        chen.empSalary(10000);
        chen.printEmployee();
    }
}
