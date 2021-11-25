package paint;
import java.awt.*;

public class Square extends Rectangle{
    public Square(Color cl,int px, int py) {
        super(cl, px, py);

    }

    @Override
    public void setBoundingBox(int lengthBB, int widthBB) {
        super.setBoundingBox(lengthBB, widthBB);
        if(lengthBB > widthBB){
            length = widthBB;
            width = widthBB;
        }
        else{
            length = lengthBB;
            width = lengthBB;
        }
    }


}
