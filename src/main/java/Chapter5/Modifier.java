package Chapter5;

public class Modifier {
    /*修饰符*/

    /*
    共有的，以 public 修饰符指定，对所有类可见。

    受保护的，以 protected 修饰符指定，对同一包内的类和所有子类可见。

    默认的，也称为 default，在同一包内可见，不使用任何修饰符。

    私有的，以 private 修饰符指定，在同一类内可见。*/

    /*
    static 修饰符，用来创建类方法和类变量。

    final 修饰符，用来修饰类、方法和变量，final 修饰的类不能够被继承，修饰的方法不能被继承类重新定义，修饰的变量为常量，是不可修改的。

    abstract 修饰符，用来创建抽象类和抽象方法。

    synchronized 和 volatile 修饰符，主要用于线程的编程*/

    /*运算符*/

    String name = "James";
    boolean result = name instanceof String; // 由于 name 是 String 类型，所以返回真
}
