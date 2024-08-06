
import java.util.Scanner;
class Fahrenheit {
   public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    float F,C;
    F = scanner.nextFloat();
    C = (F-32)*5/9;
    System.out.printf("celsius=" +C);
     scanner.close();

   }  
}
