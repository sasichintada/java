import java.util.*;
class Leap {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = scanner.nextInt();
        if (year%4==0 && year%100!=0||year%400==0) {
            System.out.println("It is a leap year");
        } else {
            System.out.println("It is not a leap year");
        }
        scanner.close();
    }
}
