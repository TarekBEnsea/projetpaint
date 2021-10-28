import java.awt.*;

abstract class Rectangle extends Figure{
    protected Integer width=0;
    protected Integer length=0;
    public Rectangle(Color cl, point pt) {
        super(cl, pt);
    }

    @Override
    public void setBoundingBox(int lengthB, int widthB) {
        length = lengthB;
        width = widthB;
    }

    @Override
    public void draw(Graphics g) {

    }
}
