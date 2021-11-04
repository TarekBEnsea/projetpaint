import java.awt.*;

public abstract class Figure {
    private Color c;
    private point p;


    public Color getC() {
        return c;
    }

    public point getP() {
        return p;
    }

    public Figure(Color cl, point pt) {
        this.c = cl;
        this.p = pt;
    }

    protected abstract void setBoundingBox(int lengthBB, int widthBB);
    protected abstract void draw(Graphics g);

    @Override
    public String toString() {
        return "Figure{" +
                ", c=" + c +
                ", p=" + p +
                '}';
    }
}
