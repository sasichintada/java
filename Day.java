import java.util.Scanner;
public class Day {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
        sc.close();
        switch (day) {
            case 1:
            if(day==1)
                System.out.println("sunday");
                break;
            case 2:
            if(day==2)
                System.out.println("Monday");
                break;
            case 3:
            if(day==3)
                System.out.println("Tuesday");
                break;
            case 4:
            if(day==4)
                System.out.println("Wednesday");
                break;
            case 5:
            if(day==5)
                System.out.println("Thursday");
                break;
            case 6:
            if(day==6)
                System.out.println("Friday");
                break;
            case 7:
            if(day==7)
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid");
    }
}
}