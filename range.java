import java.util.*;
class range {
    public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
     System.out.println("Enter the n value:");
     int n = scanner.nextInt();
     int lowerbound=6;
     int upperbound=20;
     if (n>lowerbound && n<upperbound) {
        System.out.println("The number lies within the range");
     } else {
        System.out.println("The number not lies within the range");
     }
     scanner.close();
    }
}
