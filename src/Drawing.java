import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class Drawing extends JPanel implements MouseMotionListener {


    private Color c;
    private String nameFigure;
    private ArrayList<Figure> ListFigures = null;
    private point


    public Drawing(){
        super();
        this.setBackground(Color.white);
        ListFigures = new ArrayList<Figure>();
        this.c = Color.white;
        this.nameFigure = null;
        addMouseMotionListener(this);
    }

    public Color getC() {
        return c;
    }

    public void setC(Color c) {
        this.c = c;
    }

    public void setNameFigure(String nameFigure) {
        this.nameFigure = nameFigure;
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        second =
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
