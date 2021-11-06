import java.awt.*;

public abstract class Figure {
    private Color c;
    private point O;


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
