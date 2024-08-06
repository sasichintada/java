
import java.util.*;
class Swap {
    public static void main(String args[]) {
      int a,b,t;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println("Before swapping:"+a+" "+b);
        t = a;
        a = b;
        b = t;
        System.out.println("After swapping:"+a+" "+b);
        scanner.close();
      }
}
