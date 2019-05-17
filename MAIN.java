import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MAIN extends JFrame {
    private Lyz l; 
    private Nion n;
    private BANK bank;
    private STORY blubb;
    private JTextField name;
    private JButton button1;
    private JButton button2;
    private JPanel panel1;
    private JPanel panel2;
    private JLabel oben;
    private JLabel anzeige;
    
    public MAIN(){
        super("Fenster");
        start();
        setSize(300,300);
        setLocation(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
        Anmelden();
        name = new JTextField("Dein Name");
    }
    
    public void AnmeldenRegistrieren() {
        setLayout(new GridLayout(3,1));
        panel1 = new JPanel(new GridLayout(1,1));
        panel2 = new JPanel(new GridLayout(1,1));
        button1 = new JButton("Anmelden");
        button2 = new JButton("Registrieren");
        panel1.add(button1);
        panel2.add(button2);
        addButtonListener(button1);
        addButtonListener(button2);
        oben = new JLabel("aaaaaaaaaaaaaaaaaa");
        anzeige = new JLabel();
        oben.setHorizontalAlignment(JLabel.CENTER);
        getContentPane().add(anzeige);
        getContentPane().add(panel1);
        getContentPane().add(panel2);
        setVisible(true);
    } 
    public void Anmelden()
    {
        
    }
    
    public void start()
    {
        MAIN g = new MAIN();   
    }
    
    public void auswählen() {
    }
}