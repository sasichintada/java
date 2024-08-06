import java.util.Scanner;
public class Insertion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n=sc.nextInt();
        int[] A=new int[n];
        System.out.println("Enter the elements: ");
        for (int i=0;i<n;i++)
            A[i]=sc.nextInt();
        ISort(A);
        System.out.println("After sorting: ");
        for(int i=0;i<A.length;i++)
            System.out.print(A[i]+" ");
        sc.close();
    }
    public static void ISort(int[] A){
        int n=A.length;
        int key;
        for(int i=1;i<n;i++){
            key=A[i];
            int j=i-1;
            while (j>=0 && A[j]>key) {
                A[j+1]=A[j];
                j--;
            }
            A[j+1]=key;
        }
    }
}         
                
