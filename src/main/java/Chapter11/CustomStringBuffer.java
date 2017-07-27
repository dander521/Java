package Chapter11;

public class CustomStringBuffer {

    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("菜鸟");
        buffer.append("aaaa");
        System.out.println(buffer);

        /*
        public StringBuffer append(String s)-将指定的字符串追加到此字符序列。

        public StringBuffer reverse()-将此字符序列用其反转形式取代。

        public delete(int start, int end)-移除此序列的子字符串中的字符。

        public insert(int offset, int i)-将 int 参数的字符串表示形式插入此序列中。

        replace(int start, int end, String str)-使用给定 String 中的字符替换此序列的子字符串中的字符。*/
    }
}
