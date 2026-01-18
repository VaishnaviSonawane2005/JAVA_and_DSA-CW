package StringBuilder_and_strings;

public class Demo1 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
        str.append(" world");
        System.out.println(str);
        str.setCharAt(0, 'H');
        System.out.println(str);
        str.append(10);
        System.out.println(str);
        System.out.println(str.insert(0,"Welcome to "));
        System.out.println(str.indexOf("Welcome"));
        System.out.println(str.deleteCharAt(0));
    }
}
