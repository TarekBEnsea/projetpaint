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
        JMenuItem open = new JMenuItem("open");
        menu1.add(open);


        JPanel southPanel = new JPanel();
        southPanel.setLayout(new GridLayout(2,1));
        JButton ButtonNo = new JButton("Noir");
        ButtonNo.setBackground(Color.BLACK);
        southPanel.add(ButtonNo);
        JButton ButtonRo = new JButton("Rouge");
        southPanel.add(ButtonRo);
        JButton ButtonVe = new JButton("Vert");
        southPanel.add(ButtonVe);
        JButton ButtonBl = new JButton("Bleu");
        southPanel.add(ButtonBl);
        JButton ButtonJau = new JButton("Jaune");
        southPanel.add(ButtonJau);
        JButton ButtonRose = new JButton("Rose");
        southPanel.add(ButtonRose);
        JButton ButtonMa = new JButton("Magenta");
        southPanel.add(ButtonMa);
        JButton ButtonOr = new JButton("Orange");
        southPanel.add(ButtonOr);
        contentPanel.add(southPanel,"South");
        this.setVisible(true);



    }

    public static void main (String args[]){
        Window win = new Window("Paint it black",800,600);
    }
}
