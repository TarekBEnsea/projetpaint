package paint;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Drawing extends JPanel implements MouseMotionListener, MouseListener {


    private Color col;
    private String nameFigure;
    private ArrayList<Figure> ListFigures;
    private point premier, second;
    Figure fig;


    public Drawing() {
        super();
        this.setBackground(Color.white);
        this.ListFigures = new ArrayList<>();
        this.col = Color.white;
        this.nameFigure = null;
        this.premier = new point();
        this.second = new point();
        addMouseMotionListener(this);
        addMouseListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.white);
        for (Figure f : ListFigures) {
            f.draw(g);
            System.out.println(f);
        }
    }


    public void setC(Color col) {
        this.col = col;
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
        second = new point(e.getX(), e.getY());
        fig = ListFigures.get(ListFigures.size() - 1);
        fig.setBoundingBox(second.getX()-premier.getX(), second.getY()-premier.getY());
        repaint();

    }

    @Override
    public void mousePressed(MouseEvent e) {
        premier = new point(e.getX(), e.getY());
        switch (nameFigure) {
            case "Rectangle":
                ListFigures.add(fig = new Rectangle(col, premier.getX(), premier.getY()));
                break;
            case "Ellipse":
                ListFigures.add(fig = new Ellipse(col, premier.getX(), premier.getY()));
                break;
            case "Square":
                ListFigures.add(fig = new Square(col, premier.getX(), premier.getY()));
                break;
            case "Circle":
                ListFigures.add(fig = new Circle(col, premier.getX(), premier.getY()));
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

    public void save() {
        try{
            FileOutputStream fos = new FileOutputStream("sauveDessin");
        }
        catch(Exception e){

        }

    }
}
