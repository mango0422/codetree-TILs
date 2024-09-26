import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        
        if(m == 12 || m == 1){
            if( d > 0 && d < 32 ){
                System.out.println("Winter");
            }
        } else if(m == 2){
            if ( d > 0 && d < 29 ){
                System.out.println("Winter");
            } else if( d == 29 && (y % 4 == 0) ){
                if(y % 100 !=0 || (y % 100 == 0 && y % 400 == 0)){
                    System.out.println("Winter");
                } else{
                    System.out.println("-1");
                }
            }
        } else if(m == 3 || m == 5){
            if( d > 0 && d < 32 ){
                System.out.println("Spring");
            }
        } else if(m == 4){
            if( d > 0 && d < 31 ){
                System.out.println("Spring");
            }
        } else if(m==6){
            if( d > 0 && d < 31 ){
                System.out.println("Summer");
            }
        } else if(m == 7 || m == 8){
            if( d > 0 && d < 32 ){
                System.out.println("Summer");
            }
        } else if(m == 9 || m == 11){
            if( d > 0 && d < 31 ){
                System.out.println("Fall");
            }
        } else if(m == 10){
            if( d > 0 && d < 32 ){
                System.out.println("Fall");
            }
        } else{
            System.out.println("-1");
        }
    }
}