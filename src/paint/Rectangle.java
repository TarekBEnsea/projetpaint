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

    public void setBoundingBox(point prem, point sec) {
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
        width = secb.getX()- premb.getX();
        length = secb.getY()- premb.getY();
    }

    @Override
    protected void draw(Graphics g) {
        g.setColor(c);
        g.fillRect(O.getX(), O.getY(), width,length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }


}
