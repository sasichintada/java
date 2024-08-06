import java.util.*;
class years {
    public static void main(String args []) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of days:");
    int n = scanner.nextInt();
    int years = n/365;
    n = n % 365;
    int months = n/30;
    int days = n%30;
    System.out.println("No. of years:"+years);
    System.out.println("No. of months:"+months);
    System.out.println("days:" +days);
    scanner.close();

    }
}
