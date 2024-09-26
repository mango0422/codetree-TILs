import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        cal(arr, n-1, arr[0]);
    }

    public static void cal(int[] a, int b, int lcm){
        if (b>0){
            lcm  = lcm * a[6-b] / gcd(lcm, a[6-b]);
            // System.out.println("b : " + b + " gcd: " + gcd(lcm, a[6-b]) + " lcm: " + lcm);
            cal(a, b-1, lcm);
        } else{
            System.out.println(lcm);
        }
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}