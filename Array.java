import java.util.Scanner;
class Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the size: ");
        int A[]=new int[n];
        System.out.println("Enter the elements: ");
        int min = A[0];
        int max = A[0];

        for (int i = 1; i < n; i++) {
            if (A[i] < min) {
                min = A[i];
            }
            if (A[i] > max) {
                max = A[i];
            }
        }
        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
        sc.close();
    }
    
}
