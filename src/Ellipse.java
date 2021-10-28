import java.awt.*;

abstract class Ellipse extends Figure{
    protected int SemiAxesX = 0, SemiAxesY = 0;

    public Ellipse(Color cl, point pt) {
        super(cl, pt);
    }

    @Override
    public void setBoundingBox(int lengthB, int widthB) {
        SemiAxesY = widthB/2;
        SemiAxesX = lengthB/2;
    }

    @Override
    public void draw(Graphics g) {

    }
}
