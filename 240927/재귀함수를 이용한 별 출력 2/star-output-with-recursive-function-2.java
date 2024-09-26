import java.util.Scanner;

public class Main {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        count(n * 2);
    }

    public static void count(int a){
        if(a > 0){
            if( a > n ){
                printStar(a - n);
            } else if ( n >= a ){
                printStar(n - a + 1);
            }
            count(a - 1);
        }
    }
    
    public static void printStar(int a){
        for(int i=0; i<a; i++){
            System.out.print("* ");
        }
        System.out.println();
    }
}