import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MAIN extends JFrame {
    private Lyz l; 
    private Nion n;
    private BANK bank;
    private STORY blubb;
    private JTextField name1;
    private JTextField name2;
    private JButton button1;
    private JButton button2;
    private JPanel panel;
    private JLabel oben;
    private JLabel anzeige;

    public MAIN(){
       AnmeldenRegistrieren();
    }

    public void addButtonListener(JButton b)
    {
            b.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent ae)
                {
                    eingabe(ae.getActionCommand());
                }
            });
    }

    private void eingabe(String a)
    {
        anzeige.setText(a);
    }

    public void AnmeldenRegistrieren() {
        setSize(300,300);
        setLocation(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(1,1));
        panel = new JPanel(new GridLayout(2,1));
        button1 = new JButton("Anmelden");
        button2 = new JButton("Registrieren");
        name1 = new JTextField("name");
        name2 = new JTextField("name");
        panel.add(button1);
        panel.add(name1);
        panel.add(button2);
        panel.add(name2);
        addButtonListener(button1);
        addButtonListener(button2);
        anzeige = new JLabel();
        getContentPane().add(panel);
        setVisible(true);
    } 
}