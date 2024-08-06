import java.util.Scanner;
class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2!=0 || n==2)
            System.out.println(n +"is a prime");
        else
            System.out.println(n+"is not prime");
    sc.close();

    }
}
