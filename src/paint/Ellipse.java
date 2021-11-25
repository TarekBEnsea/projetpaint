package paint;
import java.awt.*;

class Ellipse extends Figure{
    protected int SemiAxesX = 0, SemiAxesY = 0;
    protected point premb, secb;

    public Ellipse(Color cl,int px, int py) {
        super(cl,new point(px, py));
        premb = new point();
        secb = new point();

    }

    @Override
    public void setBoundingBox(int lengthB, int widthB) {
        SemiAxesX = widthB;
        SemiAxesY = lengthB;
    }


    @Override
    public void draw(Graphics g) {
        g.setColor(c);
        int x = O.getX();
        int y = O.getY();
        if (SemiAxesX > 0 & SemiAxesY < 0) {// en haut à droite
            y += SemiAxesY;
        }
        else if (SemiAxesX <  0 & SemiAxesY < 0) {// en haut à gauche
            x += SemiAxesX;
            y += SemiAxesY;
        }
        if (SemiAxesX <  0 & SemiAxesY > 0) {// en bas à gauche
            x += SemiAxesX;
        }
        g.fillOval(x, y, Math.abs(SemiAxesX), Math.abs(SemiAxesY));
    }

    @Override
    public String toString() {
        return "Ellipse{" +
                "SemiAxesX=" + SemiAxesX +
                ", SemiAxesY=" + SemiAxesY +
                '}';
    }
}
