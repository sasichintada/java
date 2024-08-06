import java.util.Scanner;
class Born {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int age=sc.nextInt();
        int presentyear=2024;
        int year=presentyear-age;
        System.out.println(name +" is born in "+ year);
        sc.close();
    }


    }

