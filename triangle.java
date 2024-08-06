import java.util.*;
class Triangle {
    public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of rows:");
    scanner.close();
    int r=scanner.nextInt();
    for(int i=1;i<=r;i++) 
     {
        for(int j=1;j<=i;j++)
     System.out.println(j+ " ");
    }
    }
}
