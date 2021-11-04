import javax.swing.*;
import java.awt.*;

public class Window extends JFrame{

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
        JMenuItem open = new JMenuItem("Open");
        JMenuItem New = new JMenuItem("New");
        JMenuItem Save = new JMenuItem("Save");
        JMenuItem Quit = new JMenuItem("Quit");
        menu1.add(New);
        menu1.add(open);
        menu1.add(Save);
        menu1.add(Quit);
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


        contentPanel.add(southPanel,"South");
        this.setJMenuBar(m);
        this.setVisible(true);



    }

    public static void main (String args[]){
        Window win = new Window("Paint",800,600);
    }
}
