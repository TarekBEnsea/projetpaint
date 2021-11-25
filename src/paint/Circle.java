package paint;
import java.awt.*;

public class Circle extends Ellipse{
    public Circle(Color cl, int px, int py) {
        super(cl, px, py);
    }

    @Override
    public void setBoundingBox(int lengthB, int widthB) {
        super.setBoundingBox(lengthB, widthB);
        SemiAxesX = lengthB;
        SemiAxesY = widthB;
        if(SemiAxesX >SemiAxesY){
            SemiAxesY = SemiAxesX;
        }
        else{
            SemiAxesX = SemiAxesY;
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