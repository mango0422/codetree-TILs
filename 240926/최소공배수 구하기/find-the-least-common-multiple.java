import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int a = sc.nextInt();
        final int b = sc.nextInt();
        int lcm = 1;

        for(int i=1; i<a; i++){
            if(a % i == 0 && b % i == 0){
                lcm = lcm * i;
            }
        }
        System.out.println(lcm);
    }
}