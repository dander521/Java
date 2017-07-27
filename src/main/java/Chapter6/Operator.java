package Chapter6;

public class Operator {
    /*
    算术运算符

    关系运算符

    位运算符

    逻辑运算符

    赋值运算符

    其他运算符
    与iOS中的运算符 没有很大的出入*/

    public static void main(String args[]) {
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println("a + b = " + (a + b) );
        System.out.println("a - b = " + (a - b) );
        System.out.println("a * b = " + (a * b) );
        System.out.println("b / a = " + (b / a) );
        System.out.println("b % a = " + (b % a) );
        System.out.println("c % a = " + (c % a) );
        System.out.println("a++   = " +  (a++) );
        System.out.println("a--   = " +  (a--) );
        // 查看  d++ 与 ++d 的不同
        System.out.println("d++   = " +  (d++) );
        System.out.println("++d   = " +  (++d) );

//        variable x = (expression) ? value if true : value if false
//        ( Object reference variable ) instanceof  (class/interface type)
    }
}
