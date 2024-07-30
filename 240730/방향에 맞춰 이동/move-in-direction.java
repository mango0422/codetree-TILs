import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int y = 0;
        for(int i=0; i<n; i++){
            char dir = sc.next().charAt(0);
            int cnt = sc.nextInt();
            if(dir == 'N'){
                y += cnt;
            } else if(dir == 'S'){
                y -= cnt;
            } else if(dir == 'E'){
                x += cnt;
            } else{
                x -= cnt;
            }
        }
        System.out.print(x + " " + y);
    }
}