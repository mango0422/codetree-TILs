import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        for(int i=1; i<a+1; i++){
            if(i%2==0 || i%3==0){
                System.out.print("1 ");
            } else{
                System.out.print("0 ");
            }
        }
    }
}