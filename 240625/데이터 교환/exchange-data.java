public class Main {
    public static void main(String[] args) {
        int a = 5, b = 6, c = 7;
        int tempC = c, tempB = b, tempA = a;
        c = tempB;
        b = tempA;
        a = tempC;
        System.out.println(a + "\n" + b + "\n" + c);
    }
}