import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        boolean isLeap = isLeapYear(y);

        if (isValidDate(y, m, d, isLeap)) {
            System.out.println(getSeason(m));
        } else {
            System.out.println("-1");
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }

    public static boolean isValidDate(int year, int month, int day, boolean isLeap) {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isLeap) {
            daysInMonth[2] = 29;
        }

        if (month < 1 || month > 12) {
            return false;
        }

        return day >= 1 && day <= daysInMonth[month];
    }

    public static String getSeason(int month) {
        switch (month) {
            case 12: case 1: case 2:
                return "Winter";
            case 3: case 4: case 5:
                return "Spring";
            case 6: case 7: case 8:
                return "Summer";
            default:
                return "Fall";
        }
    }
}