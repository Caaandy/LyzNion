import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MAIN implements ActionListener {
    private Lyz l; 
    private Nion n;
    private BANK bank;
    private STORY blubb;
    private JFrame fenster;
    private JPanel panel;
    private JTextField name1;
    private JTextField name2;
    private JButton button1;
    private JButton button2;
    private String na;

    public MAIN(){
       //elemente + buttonsListener
       button1 = new JButton("Anmelden");
       button1.addActionListener(this);
       button2 = new JButton("Registrieren");
       button2.addActionListener(this);
       name1 = new JTextField("name");
       name2 = new JTextField("name");
       
       //panel = new JPanel(new GridLayout(2,1));
       panel = new JPanel(new GridLayout(2,1));
       panel.add(button1);
       panel.add(name1);
       panel.add(button2);
       panel.add(name2);
       
       //fenster
       fenster = new JFrame("Fenster");
       fenster.setSize(300,300);
       fenster.setLocation(500,500);
       fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       fenster.add(panel);
       fenster.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1)
        {
            try {
                if(bank.userSuchen(name1.getText())== false) {
                    System.out.println("yay");
                    charakterWahl();
                }
                else {
                    System.out.println("nope");
                }
            }
            catch(Exception ex)
            {
                name1.setText("User nicht vorhanden!");
            }
        }
        if(e.getSource() == button2)
        {
            try {
                if(bank.userSuchen(name2.getText()) == false) {
                    charakterWahl();
                }
            }
            catch(Exception ex)
            {
                name2.setText("Name schon vorhanden!");
            }
        }
    }
    
    private void charakterWahl() {
        System.out.println("Yay! :D");
        blubb = l;
    }
}