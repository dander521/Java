package JavaBasic.Chapter4;

public class Variable {
    /*
    类变量：独立于方法之外的变量，用 static 修饰。

    实例变量：独立于方法之外的变量，不过没有 static 修饰。

    局部变量：类的方法中的变量。*/

    public static int allClicks = 0;
    private static int allClicksTime = 0;

    public String str = "Hello World";
    private String onlyStr = "Private";


    public void method() {
        int i = 0;
    }
}
