public class point {

    private Integer X=0;
    private Integer Y=0;

    public point() {
        this.X = 0;
        this.Y = 0;
    }

    public point(int a, int b) {
        this.X = a;
        this.Y = b;
    }

    public Integer getY() {
        return Y;
    }

    public void setY(Integer y) {
        Y = y;
    }

    public Integer getX() {
        return X;
    }

    public void setX(Integer x) {
        X = x;
    }

    @Override
    public String toString() {
        return X+" "+Y;
    }
}
