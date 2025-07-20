public class Swap_twoNum_using_TempVar {

    static void swap(int a, int b){
        System.out.println("ORIGINAL VALUES BEFORE SWAPPING...");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("VALUES AFTER SWAPPING...");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }

    public static void main(String[] args) {
        int a=9;
        int b=3;
        swap(a,b);
    }
}
