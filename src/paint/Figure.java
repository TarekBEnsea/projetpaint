package paint;
import java.awt.*;
import java.io.Serializable;

public abstract class Figure implements Serializable {
    protected Color c;
    protected point O;

    public void setC(Color c) {this.c = c;}

    public void setO(point o) {O = o;}

    public Color getC() {
        return c;
    }

    public point getO() {
        return O;
    }

    public Figure(Color cl, point pt) {
        this.c = cl;
        this.O = pt;
    }

    protected abstract void setBoundingBox(int lengthBB, int widthBB);
    protected abstract void draw(Graphics g);

    @Override
    public String toString() {
        return "Figure{" +
                ", c=" + c +
                ", p=" + O +
                '}';
    }
}
