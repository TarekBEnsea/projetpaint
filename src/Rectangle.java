import java.awt.*;

public class Rectangle extends Figure{
    int px,py;
    public Rectangle(Color cl, point pt) {
        super(cl, pt);
        px = getP().getX();
        py = getP().getY();
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
