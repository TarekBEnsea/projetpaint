import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Drawing extends JPanel {


    private Color c;
    private String nameFigure;
    private ArrayList<Figure> ListFigures = null;

    public Drawing(){
        super();
        this.setBackground(Color.white);
        ListFigures = new ArrayList<Figure>();
        this.c = Color.white;
        this.nameFigure = null;
    }
}
