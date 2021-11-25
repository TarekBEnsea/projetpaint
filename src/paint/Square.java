package paint;
import java.awt.*;

public class Square extends Rectangle{
    public Square(Color cl,int px, int py) {
        super(cl, px, py);

    }

    @Override
    public void setBoundingBox(int widthBB, int lengthBB) {
        super.setBoundingBox(widthBB, lengthBB);
        if(widthBB > lengthBB){
            length = lengthBB;
            width = lengthBB;
        }
        else{
            length = widthBB;
            width = widthBB;
        }
    }


}
