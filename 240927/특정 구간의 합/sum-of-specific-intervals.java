import java.util.Scanner;

public class Main {
    static int[] prefixSum;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] A = new int[n + 1];
        prefixSum = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            A[i] = sc.nextInt();
            prefixSum[i] = prefixSum[i - 1] + A[i];
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(sum(a, b));
        }
    }

    public static int sum(int a, int b) {
        return prefixSum[b] - prefixSum[a - 1];
    }
}