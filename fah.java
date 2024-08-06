import java.util.Scanner;
class Fah {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fahrenheit=sc.nextInt();
        float celsius=(fahrenheit-32)*5/9f;
        System.out.println("Celsius: "+celsius);
        sc.close();
    }    
}
