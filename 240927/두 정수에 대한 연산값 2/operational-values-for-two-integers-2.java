import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int arr[] = cal(a, b);
        System.out.println(arr[0] + " " + arr[1]);
    }

    public static int[] cal(int a, int b){
        if( a > b ){
            a *= 2;
            b += 10;
        } else{
            a += 10;
            b *= 2;
        }
        int arr[] = {a, b};
        return arr;
    }
}