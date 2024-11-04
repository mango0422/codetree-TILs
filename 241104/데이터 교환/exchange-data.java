public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 7;
        int temp = c;
        c = b;
        b = a;
        a = temp;
        System.out.printf("%d\n%d\n%d", a, b, c);
    }
}