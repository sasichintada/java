class OverloadDemo {
       void test() {
        System.out.println("student details: ");
    }
    void test(int a) {
        System.out.println("one integer parameter: "+a);
    }
    void test(int a,int b) {
        System.out.println("two integer parameters: " +a +","+ +b);
    }
    void test(double a) {
        System.out.println("one double parameter: "+a);
    }
}
class Overload {
     public static void main(String[] args) {
        OverloadDemo obj=new OverloadDemo();
        obj.test();
        obj.test(10);
        obj.test(10,20);
        obj.test(3.657);
     }
}