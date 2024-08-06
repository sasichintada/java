import java.util.Scanner;
class Area {
        public static void main(String args[]) {
        Scanner scan= new Scanner(System.in);
        scan.close();
        int l = scan.nextInt();
        int b = scan.nextInt();
        int area=l*b;
        System.out.println("The area of a rectangle is "+area);
        int perimeter=2*(l+b);
        System.out.println("The perimeter of a rectangle is "+perimeter);
    }
}
