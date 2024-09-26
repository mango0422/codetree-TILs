import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        
        if (isValidDate(y, m, d)) {
            System.out.println(getSeason(m));
        } else {
            System.out.println("-1");
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 != 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean isValidDate(int year, int month, int day) {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2) {
            if (isLeapYear(year)) {
                return day >= 1 && day <= 29;
            } else {
                return day >= 1 && day <= 28;
            }
        }
        if (month >= 1 && month <= 12) {
            return day >= 1 && day <= daysInMonth[month];
        }
        return false;
    }

    public static String getSeason(int month) {
        if (month == 12 || month == 1 || month == 2) {
            return "Winter";
        } else if (month >= 3 && month <= 5) {
            return "Spring";
        } else if (month >= 6 && month <= 8) {
            return "Summer";
        } else {
            return "Fall";
        }
    }
}