package paint;
import java.awt.*;

class Ellipse extends Figure{
    protected int SemiAxesX = 0, SemiAxesY = 0;
    protected int indX=0, indY=0;


    public Ellipse(Color cl,int px, int py) {
        super(cl,new point(px, py));


    }

    @Override
    public void setBoundingBox(int widthB, int lengthB) {
        if(widthB > 0 ){indX=1;}else{indX = 0;}
        if(lengthB > 0 ){indY=1;}else{indY = 0;}
        SemiAxesX = widthB;
        SemiAxesY = lengthB;
    }


    @Override
    public void draw(Graphics g) {
        g.setColor(c);
        int x = O.getX();
        int y = O.getY();
        if (indX == 1 & indY == 0) {// en haut à droite
            y += SemiAxesY;
        }
        else if (indX == 0 & indY == 0) {// en haut à gauche
            x += SemiAxesX;
            y += SemiAxesY;
        }
        if (indX == 0 & indY == 1) {// en bas à gauche
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
