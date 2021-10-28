import static java.awt.Color.GREEN;
import static java.awt.Color.RED;

public class main {
    public static void main(String[] args){
        point t = new point();
        point z = new point(1,2);
        System.out.println(t);
        System.out.println(z);
        Rectangle c = new Rectangle(RED,z);
        c.setBoundingBox(4,5);
        System.out.println(c);
        Square s = new Square(GREEN,z);
        s.setBoundingBox(58,8);
        System.out.println(s);
        Circle CI = new Circle(GREEN,z);
        CI.setBoundingBox(17,8);
        System.out.println(CI);
    }
}
