package paint;
import java.awt.*;

class Rectangle extends Figure{
    protected Integer width=0;
    protected Integer length=0;
    protected int indX=0, indY=0;


    public Rectangle(Color cl,int px, int py) {
        super(cl,new point(px,py));
    }

    @Override
    protected void setBoundingBox(int widthBB,int lengthBB ) {
        if(widthBB > 0 ){indX=1;}else{indX = 0;}
        if(lengthBB > 0 ){indY=1;}else{indY = 0;}
        length = lengthBB;
        width = widthBB;
    }


    @Override
    protected void draw(Graphics g) {
        g.setColor(c);
        int x = O.getX();
        int y = O.getY();
        if (indX == 1 & indY == 0) {// en haut à droite
            y += length;
        }
        else if (indX == 0 & indY == 0) {// en haut à gauche
            x += width;
            y += length;
        }
        if (indX == 0 & indY == 1) {// en bas à gauche
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
