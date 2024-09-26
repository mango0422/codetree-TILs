import java.util.Scanner;

public class Main {
    static int[] A;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        A = new int[n];
        for(int i=0; i<n; i++){
            A[i] = sc.nextInt();
            // System.out.println(A[i]);
        }
        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(sum(a, b));
        }
    }

    public static int sum(int a, int b){
        int sum = 0;
        for(int i=a-1; i<b; i++){
            sum += A[i];
        }
        return sum;
    }
}