import java.awt.*;

public class Square extends Rectangle{
    public Square(Color cl,int px, int py) {
        super(cl, px, py);

    }

    @Override
    public void setBoundingBox(int lengthB, int widthB) {
        super.setBoundingBox(lengthB, widthB);
        length = lengthB;
        width = widthB;
        if(length >width){
            width = length;
        }
        else{
            length = width;
        }
    }
}
