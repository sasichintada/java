public class Rectangle {
    int width,height;
    Rectangle() {
        width=15;
        height=8;
    }
    Rectangle(int w,int h) {
        width=w;
        height=h;
    }
    public double getArea() {
        return width*height;
    }
    public double getPerimeter() {
        return 2*(width*height);
    } 
}
class Rectangle1 {
    public static void main(String[] args) {
        Rectangle obj=new Rectangle();
        Rectangle obj1=new Rectangle(20,40);
        System.out.println(obj.getArea());
        System.out.println(obj.getArea());
        System.out.println(obj1.getPerimeter());
        System.out.println(obj1.getPerimeter());

    }
}
