import java.awt.*;

class Rectangle extends Figure{
    protected Integer width=0;
    protected Integer length=0;
    public Rectangle(Color cl,int px, int py) {
        super(cl,new point(px,py));
    }

    @Override
    public void setBoundingBox(int lengthB, int widthB) {
        length = lengthB;
        width = widthB;
    }

    public void setBoundingBox(point origin, point second) {
        //  à ton besoin d'avoir des valeurs positives ?
        if((second.getY()<origin.getY()) && (second.getX()<origin.getX())){
            length = second.getX()-origin.getX();
            width = second.getY()- origin.getY();
        }
        else if((second.getY()<origin.getY()) && (second.getX()>origin.getX())){
            length = second.getX()-origin.getX();
            width = second.getY()- origin.getY();
        }
    }

    @Override
    public void draw(Graphics g) {

    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getLength() {
        return length;
    }

}
