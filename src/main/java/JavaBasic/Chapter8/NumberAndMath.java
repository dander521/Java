package JavaBasic.Chapter8;

import static java.lang.Integer.valueOf;

public class NumberAndMath {


    public static void main(String[] args) {
        Short number = 22;
        /*
        xxxValue()
        将 Number 对象转换为xxx数据类型的值并返回。
         */
        Integer intNum = number.intValue();
        System.out.println(intNum);

        /*
        compareTo()
        将number对象与参数比较。
        如果指定的数与参数相等返回0。
        如果指定的数小于参数返回 -1。
        如果指定的数大于参数返回 1。
        */
        Integer intNumOne = 10;
        System.out.println(intNumOne.compareTo(intNum));

        /*	equals()
        判断number对象是否与参数相等。
        */
        System.out.println(intNum.equals(intNumOne));

        /*valueOf()-返回一个 Number 对象指定的内置数据类型*/
        Integer x =valueOf(9);
        Float a = Float.valueOf("80");

        Integer b = valueOf("444",8);   // 使用 16 进制

        System.out.println(x);
        System.out.println(a);
        System.out.println(b);

        /*toString()-以字符串形式返回值。*/
        System.out.println(intNum.toString());

        /*parseInt()-将字符串解析为int类型。*/
        System.out.println(Integer.parseInt("22",8));

        /*	abs()-返回参数的绝对值。*/
        Integer intTwo = -20;
        System.out.println(Math.abs(intTwo));

        /*floor 取下限
        * ceil 取上限
        * 返回类型 为 double*/

        double d = 100.675;
        float f = -90;

        System.out.println(Math.floor(d));
        System.out.println(Math.floor(f));

        System.out.println(Math.ceil(d));
        System.out.println(Math.ceil(f));

        /*rint()-返回与参数最接近的整数。返回类型为double。*/
        System.out.println(Math.rint(d));

        /*round()-返回一个最接近的int、long型值。*/
        System.out.println(Math.round(f));

        /*	min()-返回两个参数中的最小值。
        max()-返回两个参数中的最大值。*/

        System.out.println(Math.min(intNum,intNumOne));
        System.out.println(Math.max(intNum,intNumOne));

        /*exp()-返回自然数底数e的参数次方。*/
        System.out.println(Math.E);
        System.out.println(Math.exp(d));

        /*log()-返回参数的自然数底数的对数值。*/
        /*pow()-返回第一个参数的第二个参数次方。*/
        /*	sqrt()-求参数的算术平方根。*/
        System.out.println(Math.sqrt(d));

        /*sin()-求指定double类型参数的正弦值。*/
        /*cos()-求指定double类型参数的余弦值。*/
        /*tan()-求指定double类型参数的正切值。*/
        /*asin()-求指定double类型参数的反正弦值。*/
        /*acos()-求指定double类型参数的反余弦值。*/
        /*atan()-求指定double类型参数的反正切值。*/
        /*atan2()-将笛卡尔坐标转换为极坐标，并返回极坐标的角度值。*/

        /*toDegrees()-将参数转化为角度。*/
        /*toRadians()-将角度转换为弧度。*/
        /*random()-返回一个随机数。*/
    }

}
