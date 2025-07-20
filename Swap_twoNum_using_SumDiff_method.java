public class Swap_twoNum_using_SumDiff_method {
    public static void main(String[] args) {
        int a=12;
        int b=6;
        System.out.println("NUMBERS BEFORE SWAPPING...");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("NUMBERS AFTER SWAPPING...");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
}
