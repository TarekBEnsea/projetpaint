import java.awt.*;

public class Square extends Rectangle{
    public Square(Color cl, point pt) {
        super(cl, pt);

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
