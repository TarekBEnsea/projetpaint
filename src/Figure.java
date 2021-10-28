import java.awt.*;

abstract class Figure {
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

    public abstract void setBoundingBox(int lengthB, int widthB);
    public abstract void draw(Graphics g);

    @Override
    public String toString() {
        return "Figure{" +
                ", c=" + c +
                ", p=" + p +
                '}';
    }
}
