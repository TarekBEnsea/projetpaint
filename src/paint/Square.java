package paint;
import java.awt.*;

public class Square extends Rectangle{
    public Square(Color cl,int px, int py) {
        super(cl, px, py);

    }

    @Override
    public void setBoundingBox(int lengthBB, int widthBB) {
        super.setBoundingBox(lengthBB, widthBB);
        length = lengthBB;
        width = widthBB;
        if(length >width){
            width = length;
        }
        else{
            length = width;
        }
    }


    @Override
    public void setBoundingBox(point prem, point sec) {
        super.setBoundingBox(prem, sec);
        if(sec.getX()>prem.getX() & sec.getY() > prem.getX()){// en bas à droite
            width = sec.getX()- prem.getX();
            length = sec.getY()- prem.getY();
        }
        else if(sec.getX() > prem.getX() & sec.getY() < prem.getY()){// en haut à droite
            point premb = new point(prem.getX(),sec.getY());
            point secb = new point(sec.getX(),prem.getY());
            super.O = premb;
            width = secb.getX()- premb.getX();
            length = secb.getY()- premb.getY();
        }
        else if(sec.getX() < prem.getX() & sec.getY() < prem.getY()){//en haut à gauche
            point premb = new point(sec.getX(),sec.getY());
            point secb = new point(prem.getX(),prem.getY());
            super.O = premb;
            width = secb.getX()- premb.getX();
            length = secb.getY()- premb.getY();
        }
        else if(sec.getX() < prem.getX() & sec.getY() > prem.getY()){// en bas à gauche
            point premb = new point(sec.getX(),prem.getY());
            point secb = new point(prem.getX(),sec.getY());
            super.O = premb;
            width = secb.getX()- premb.getX();
            length = secb.getY()- premb.getY();
        }
        if(length >width){
            width = length;
        }
        else{
            length = width;
        }
    }
}
