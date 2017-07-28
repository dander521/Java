package JavaObject;

public class CustomObject implements CustomInterface {

    public int test(){
        System.out.println("test1");
        return 1;
    }

    public void test(int a){
        System.out.println("test2");
    }

    //以下两个参数类型顺序不同
    public String test(int a,String s){
        System.out.println("test3");
        return "returntest3";
    }

    public String test(String s,int a){
        System.out.println("test4");
        return "returntest4";
    }

    public void eat() {

    }

    public void travel() {

    }

    public static void main(String[] args) {
        Mouse mouse = new Mouse("Tom", 5);
        Penguin penguin = new Penguin("Gaff", 10);

        mouse.eat();
        mouse.sleep();
        mouse.introduction();

        /*
        重写是子类对父类的允许访问的方法的实现过程进行重新编写, 返回值和形参都不能改变。即外壳不变，核心重写！
        重写的好处在于子类可以根据需要，定义特定于自己的行为。 也就是说子类能够根据需要实现父类的方法。

        重写方法不能抛出新的检查异常或者比被重写方法申明更加宽泛的异常。
        例如： 父类的一个方法申明了一个检查异常 IOException，但是在重写这个方法的时候不能抛出 Exception 异常，
        因为 Exception 是 IOException 的父类，只能抛出 IOException 的子类异常。*/

        /*
        重载(overloading) 是在一个类里面，方法名字相同，而参数不同。返回类型可以相同也可以不同。

        每个重载的方法（或者构造函数）都必须有一个独一无二的参数类型列表。

        最常用的地方就是构造器的重载。

        重载规则
        被重载的方法必须改变参数列表(参数个数或类型或顺序不一样)；
        被重载的方法可以改变返回类型；
        被重载的方法可以改变访问修饰符；
        被重载的方法可以声明新的或更广的检查异常；
        方法能够在同一个类中或者在一个子类中被重载。
        无法以返回值类型作为重载函数的区分标准。*/

        CustomObject o = new CustomObject();
        System.out.println(o.test());
        o.test(1);
        System.out.println(o.test(1, "test3"));
        System.out.println(o.test("test4", 1));

        /*
        抽象类总结规定

        1. 抽象类不能被实例化(初学者很容易犯的错)，如果被实例化，就会报错，编译无法通过。只有抽象类的非抽象子类可以创建对象。

        2. 抽象类中不一定包含抽象方法，但是有抽象方法的类必定是抽象类。

        3. 抽象类中的抽象方法只是声明，不包含方法体，就是不给出方法的具体实现也就是方法的具体功能。

        4. 构造方法，类方法（用static修饰的方法）不能声明为抽象方法。

        5. 抽象类的子类必须给出抽象类中的抽象方法的具体实现，除非该子类也是抽象类。*/
    }
}
