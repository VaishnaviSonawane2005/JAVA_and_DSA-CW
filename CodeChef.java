import java.util.*;

class CodeChef {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int j = 0; j < T; j++) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] arr = new int[N];
            List<Integer> a = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                a.add(sc.nextInt());
            }
            while (K-- > 0) {
                int firstElement = a.get(0);
                int lastElement = a.get(N - 1);
                int sum = firstElement + lastElement;
                a.remove(0);
                a.remove(N - 1);
                a.add(sum);
                for (int i = 0; i < N - 1; i++) {
                    System.out.print(a.get(i) + " ");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}