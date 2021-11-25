package paint;
import java.awt.*;

class Rectangle extends Figure{
    protected Integer width=0;
    protected Integer length=0;
    protected point premb = null;
    protected point secb = null;

    public Rectangle(Color cl,int px, int py) {
        super(cl,new point(px,py));
        secb = new point();
        premb =new point();
    }

    @Override
    protected void setBoundingBox(int widthBB,int lengthBB ) {
        length = lengthBB;
        width = widthBB;
    }


    @Override
    protected void draw(Graphics g) {
        g.setColor(c);
        int x = O.getX();
        int y = O.getY();
        if (width > 0 & length < 0) {// en haut à droite

            y += length;
        }
        else if (width <  0 & length < 0) {// en haut à gauche
            x += width;
            y += length;
        }
        if (width <  0 & length > 0) {// en bas à gauche
            x += width;
        }
        g.fillRect(x, y, Math.abs(width), Math.abs(length));
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }


}
