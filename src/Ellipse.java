import java.awt.*;

class Ellipse extends Figure{
    protected int SemiAxesX = 0, SemiAxesY = 0;

    public Ellipse(Color cl,int px, int py) {
        super(cl,new point(px, py));
    }

    @Override
    public void setBoundingBox(int lengthB, int widthB) {
        SemiAxesY = widthB/2;
        SemiAxesX = lengthB/2;
    }

    @Override
    public void draw(Graphics g) {

    }

    @Override
    public String toString() {
        return "Ellipse{" +
                "SemiAxesX=" + SemiAxesX +
                ", SemiAxesY=" + SemiAxesY +
                '}';
    }
}
