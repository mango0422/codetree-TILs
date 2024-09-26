import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int a = sc.nextInt();
        // System.out.println("a : " + a);
        final int b = sc.nextInt();
        // System.out.println("b : " + b);
        int gcd = 1;
        int lcm = 1;

        for(int i=1; i<a; i++){
            if(a % i == 0 && b % i == 0){
                gcd = i;
            }
        }
        lcm = a * b / gcd;
        System.out.println(lcm);
    }
}