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
    private JFrame fenster2;
    private JPanel panel2;
    private JTextField LY;
    private JTextField NI;
    private JButton b1;
    private JButton b2;
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
       fenster.setVisible(false);
       
       b1 = new JButton("LYZ");
       b1.addActionListener(this);
       b2 = new JButton("NION");
       b2.addActionListener(this);
       LY = new JTextField("Lyz ist eine Kämpferin, sieht auf den ersten Blick kalt aus, ist aber eine sehr offene und schnell aufbrausende Person. Sie ist sehr vorlaut und lässt keine Gelegenheit aus, zu kämpfen. Sie hat die Fähigkeit, Blitze zu kontrollieren. Außerdem liebt sie Süßigkeiten, die sie heimlich in ihren Taschen versteckt.");
       NI = new JTextField("Nions einzige Verteidigung ist sein Dolch, da er durch seine überdurchschnittliche Intelligenz keine weiteren Waffen benötigt. Er handelt nicht vorschnell, sondern überlegt und immer nach einem Plan. Außerdem verleit ihm die Pigmentstörung Vitiligo ein besonderes Aussehen. Er liebt es, sarkastisch zu sein.");
       
       panel2 = new JPanel(new GridLayout(2,1));
       panel2.add(b1);
       panel2.add(b2);
       panel2.add(LY);
       panel2.add(NI);
       
       fenster2 = new JFrame("Fenster");
       fenster2.setSize(300,300);
       fenster2.setLocation(500,500);
       fenster2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       fenster2.add(panel2);
       fenster2.setVisible(true);
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
        fenster.setVisible(false);
        fenster2.setVisible(true);
    }
}