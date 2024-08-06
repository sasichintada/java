import java.util.* ;
class positive {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = scanner.nextInt();
       if(n>0) {
        System.out.println("n is positive");
       } else if(n<0) {
        System.out.println("n is negative");
       } else {
        System.out.println("n is zero");
       }
       scanner.close();
    }
}
