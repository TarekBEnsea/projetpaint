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
    protected void setBoundingBox(point prem, point sec) {
        if(sec.getX()>prem.getX() & sec.getY() > prem.getX()){// en bas à droite
            premb = new point(prem.getX(),prem.getY());
            secb = new point(sec.getX(),sec.getY());

        }
        else if(sec.getX() > prem.getX() & sec.getY() < prem.getY()){// en haut à droite
            premb = new point(prem.getX(),sec.getY());
            secb = new point(sec.getX(),prem.getY());

        }
        else if(sec.getX() < prem.getX() & sec.getY() < prem.getY()){//en haut à gauche
            premb = new point(sec.getX(),sec.getY());
            secb = new point(prem.getX(),prem.getY());
        }
        else if(sec.getX() < prem.getX() & sec.getY() > prem.getY()){// en bas à gauche
            premb = new point(sec.getX(),prem.getY());
            secb = new point(prem.getX(),sec.getY());
        }
        super.O = premb;
        SemiAxesX = secb.getX()- premb.getX();
        SemiAxesY = secb.getY()- premb.getY();
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(c);
        g.fillOval(O.getX(), O.getY(), SemiAxesX,SemiAxesY);
    }

    @Override
    public String toString() {
        return "Ellipse{" +
                "SemiAxesX=" + SemiAxesX +
                ", SemiAxesY=" + SemiAxesY +
                '}';
    }
}
