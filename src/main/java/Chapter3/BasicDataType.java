package Chapter3;

public class BasicDataType {
    public static void main(String[] args) {
        System.out.println("BasicDataType");

        /*Byte*/
        System.out.println("基本类型：byte 二进制位数：" + Byte.SIZE);
        System.out.println("包装类：java.lang.Byte");
        System.out.println("最小值：Byte.MIN_VALUE =" + Byte.MIN_VALUE);
        System.out.println("最大值：Byte.MAX_VALUE =" + Byte.MAX_VALUE);
        System.out.println();

        /*Short*/
        System.out.println(Short.SIZE);
        System.out.println("java.lang.Short");
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println();

        /*Int*/
        System.out.println(Integer.SIZE);
        System.out.println("java.lang.Integer");
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println();

        /*Long*/
        System.out.println(Long.SIZE);
        System.out.println("java.lang.Long");
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println();

        /*Float*/
        System.out.println(Float.SIZE);
        System.out.println("java.lang.Float");
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println();

        /*Double*/
        System.out.println(Double.SIZE);
        System.out.println("java.lang.Double");
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println();

        /*Char*/
        System.out.println(Character.SIZE);
        System.out.println("java.lang.Character");
        System.out.println((int)Character.MIN_VALUE);
        System.out.println((int)Character.MAX_VALUE);
        System.out.println();

        final double PI = 3.1415927;

        byte a = 68;
//        char a = 'A';

        int decimal = 100;
        int octal = 0144;
        int hexa = 0x64;

//        char a = '\u0001';
//        String a = "\u0001";


    }
}
