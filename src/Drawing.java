import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class Drawing extends JPanel implements MouseMotionListener {



    private Color c;
    private String nameFigure;
    private ArrayList<Figure> ListFigures = null;

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

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
