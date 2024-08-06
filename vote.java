import java.util.*;
class Vote {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age:");
        int age = scanner.nextInt();
        if (age>18) {
            System.out.println("A person can vote");
        } else {
            System.out.println("A person cannot vote");
        }
       scanner.close(); 
    }
}
