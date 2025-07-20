import java.util.Scanner;
public class Arraycopy {

    static void change_array(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=0;
        }
    }

    static void printArr(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("ENTER THE ELEMENTS OF ARRAY:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Original arr..!");
        printArr(arr);
        int[] arr2=arr.clone();                                   //Trying to copy arr   //clone() method is used to get new space on heap
       //also called deep copy without disturbing original array
        System.out.println("Copied arr..!");              //reference copy is made instead of actual address
        printArr(arr2);

        //changing values of arr2
        arr2[0]=0;
        arr2[1]=0;
        System.out.println("Original array after changing arr2");      //original arr also changed due to same address
        printArr(arr);
        System.out.println("Copied arr2 after changing arr2");
        printArr(arr2);
        //after changing the arr2 both arr and arr2 were changed because both arrays are referring same address
        //also called SHALLOW COPY

        change_array(arr);
        System.out.println("changed array:");        //change array after completion is deleted from stack
        printArr(arr);
        //all operations takes place on stack not on heap in case of primitive datatypes
    }
}
