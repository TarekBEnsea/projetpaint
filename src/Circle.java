import java.awt.*;

public class Circle extends Ellipse{
    public Circle(Color cl, point pt) {
        super(cl, pt);
    }

    @Override
    public void setBoundingBox(int lengthB, int widthB) {
        super.setBoundingBox(lengthB, widthB);
        int a = 0;
        a = lengthB;
        lengthB = widthB;
        widthB = a;
    }

}
