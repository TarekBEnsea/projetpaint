package paint;
import java.awt.*;

public class Circle extends Ellipse{


    public Circle(Color cl, int px, int py) {
        super(cl, px, py);
    }

    @Override
    public void setBoundingBox(int widthB, int lengthB) {
        super.setBoundingBox(widthB, lengthB);
        if(widthB > lengthB){
            SemiAxesX = lengthB;
            SemiAxesY = lengthB;
        }
        else{
            SemiAxesX = widthB;
            SemiAxesY = widthB;
        }
    }


    @Override
    public String toString() {
        return "Circle{" +
                "SemiAxesX=" + SemiAxesX +
                ", SemiAxesY=" + SemiAxesY +
                '}';
    }
}
