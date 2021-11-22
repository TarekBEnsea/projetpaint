import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class Drawing extends JPanel implements MouseMotionListener, MouseListener {


    private Color c;
    private String nameFigure;
    private ArrayList<Figure> ListFigures = null;
    Figure figure;




    public Drawing(){
        super();
        this.setBackground(Color.white);
        this.ListFigures = new ArrayList<Figure>();
        this.c = Color.white;
        this.nameFigure = null;
        addMouseMotionListener(this);
        addMouseListener(this);
    }

    @Override
    protected void printComponent(Graphics g) {
        super.printComponent(g);
        this.setBackground(Color.white);
        for(Figure f : ListFigures){
            f.draw(g);
        }
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
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        figure.setBoundingBox(e.getX()-figure.getO().getX(),getY()-figure.getO().getY());
        this.repaint();
        System.out.println(figure);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        switch(nameFigure){
            case "Rectangle" :
                ListFigures.add(figure = new Rectangle(c,e.getX(),e.getY()));
                break;
            case "Ellipse" :
                ListFigures.add(figure = new Ellipse(c,e.getX(),e.getY()));
                break;
            case "Square" :
                ListFigures.add(figure = new Square(c,e.getX(),e.getY()));
                break;
            case "Circle" :
                ListFigures.add(figure = new Circle(c,e.getX(),e.getY()));
                break;
        }
        System.out.println(ListFigures);
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
