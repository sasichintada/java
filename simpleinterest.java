import java.util.*;
class simpleinterest {
    public static void main(String args[])  {
        int P,T,R,SI;
        Scanner scanner = new Scanner(System.in);
        P = scanner.nextInt();
        T = scanner.nextInt();
        R = scanner.nextInt();
        SI = (P*T*R)/100;
        System.out.println("simple interest SI=" +SI);
        scanner.close();
    }

}
