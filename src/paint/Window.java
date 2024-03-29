package paint;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.util.ArrayList;
import javax.swing.JPanel;


public class Window extends JFrame implements ActionListener {
    Drawing Draw = new Drawing();
    public ArrayList<Window> ListWin;
    public int i;
    private Window win;
    public Window(String Title, int x, int y)
    {
        super(Title);
        this.setSize(x,y);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPanel = this.getContentPane();
        JMenuBar m = new JMenuBar();

        JMenu menu1 = new JMenu("File");
        JMenu menu2 = new JMenu("A propos");
        JMenuItem info = new JMenuItem("Information");
        JMenuItem open = new JMenuItem("Open");
        JMenuItem New = new JMenuItem("New");
        JMenuItem Save = new JMenuItem("Save");
        JMenuItem Quit = new JMenuItem("Quit");
        menu1.add(New);
        menu1.add(open);
        menu1.add(Save);
        menu1.add(Quit);
        menu2.add(info);
        m.add(menu1);
        m.add(menu2);


        JPanel southPanel = new JPanel();
        southPanel.setLayout(new GridLayout(2,1));
        JButton ButtonNo = new JButton("Noir");
        ButtonNo.setBackground(Color.BLACK);
        ButtonNo.setForeground(Color.WHITE);
        southPanel.add(ButtonNo);
        JButton ButtonRo = new JButton("Rouge");
        ButtonRo.setBackground(Color.RED);
        southPanel.add(ButtonRo);
        JButton ButtonVe = new JButton("Vert");
        ButtonVe.setBackground(Color.GREEN);
        southPanel.add(ButtonVe);
        JButton ButtonBl = new JButton("Bleu");
        ButtonBl.setBackground(Color.BLUE);
        southPanel.add(ButtonBl);
        JButton ButtonEll = new JButton("Ellipse");
        southPanel.add(ButtonEll);
        JButton ButtonCe = new JButton("Cercle");
        southPanel.add(ButtonCe);
        JButton ButtonJau = new JButton("Jaune");
        ButtonJau.setBackground(Color.YELLOW);
        southPanel.add(ButtonJau);
        JButton ButtonRose = new JButton("Rose");
        ButtonRose.setBackground(Color.PINK);
        southPanel.add(ButtonRose);
        JButton ButtonMa = new JButton("Magenta");
        ButtonMa.setBackground(Color.MAGENTA);
        southPanel.add(ButtonMa);
        JButton ButtonOr = new JButton("Orange");
        ButtonOr.setBackground(Color.ORANGE);
        southPanel.add(ButtonOr);
        JButton ButtonRec = new JButton("Rectangle");
        southPanel.add(ButtonRec);
        JButton ButtonCa = new JButton("Carre");
        southPanel.add(ButtonCa);

        ButtonNo.addActionListener(this);
        ButtonCa.addActionListener(this);
        ButtonBl.addActionListener(this);
        ButtonMa.addActionListener(this);
        ButtonJau.addActionListener(this);
        ButtonCe.addActionListener(this);
        ButtonEll.addActionListener(this);
        ButtonOr.addActionListener(this);
        ButtonRec.addActionListener(this);
        ButtonRo.addActionListener(this);
        ButtonRose.addActionListener(this);
        ButtonVe.addActionListener(this);
        info.addActionListener(this);
        open.addActionListener(this);
        Save.addActionListener(this);
        Quit.addActionListener(this);
        New.addActionListener(this);


        contentPanel.add(southPanel,"South");
        contentPanel.add(Draw);
        this.setJMenuBar(m);
        this.setVisible(true);



    }

    public static void main (String args[]){
        Window win = new Window("Paint",800,600);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String cmd = e.getActionCommand();
        switch(cmd)
        {
            case "Noir" :
                System.out.println("color is black");
                Draw.setC(Color.black);
                break;
            case "Rouge" :
                System.out.println("color is red");
                Draw.setC(Color.red);
                break;
            case "Vert" :
                System.out.println("color is green");
                Draw.setC(Color.green);
                break;
            case "Bleu" :
                System.out.println("color is blue");
                Draw.setC(Color.blue);
                break;
            case "Ellipse" :
                System.out.println("figure is an ellipse");
                Draw.setNameFigure("Ellipse");
                break;
            case "Cercle" :
                System.out.println("figure is a circle");
                Draw.setNameFigure("Circle");
                break;
            case "Jaune" :
                System.out.println("color is yellow");
                Draw.setC(Color.yellow);
                break;
            case "Rose" :
                System.out.println("color is pink");
                Draw.setC(Color.pink);
                break;
            case "Magenta" :
                System.out.println("color is magenta");
                Draw.setC(Color.magenta);
                break;
            case "Orange" :
                System.out.println("color is orange");
                Draw.setC(Color.orange);
                break;
            case "Rectangle" :
                System.out.println("figure is a rectangle");
                Draw.setNameFigure("Rectangle");
                break;
            case "Carre" :
                System.out.println("figure is a square");
                Draw.setNameFigure("Square");
                break;
            case "Information" :
                System.out.println("Information has been selected");
                JOptionPane info = new JOptionPane();
                info.showInternalMessageDialog(info, "Autor: Tarek Bache", "information", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "New":
                System.out.println("New has been selected");
                i++;
                System.out.println(i);
                ListWin.add(win = new Window("Paint"+i,800,600));
                break;
            case "Quit" :
                System.out.println("Quit has been selected");
                System.exit(0);
            case "Save" :
                    Draw.save();
                System.out.println("save selected");
                break;
            case "Open" :
                    Draw.open();
                System.out.println("open selected");
                break;
        }

    }
}
