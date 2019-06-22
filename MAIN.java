import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MAIN implements ActionListener {
    public Lyz l = new Lyz(); 
    public Nion n = new Nion();
    private BANK bank;
    public STORY blubb;
    private JFrame fenster;
    private JPanel panel;
    private JTextField name1;
    private JTextField name2;
    private JButton button1;
    private JButton button2;
    private JFrame fenster2;
    private JPanel panel2;
    private JLabel LY;
    private JLabel NI;
    private JButton b1;
    private JButton b2;
    private String na;

    public MAIN(){
        blubb = l;
        bank = new BANK();
        
        //elemente + buttonsListener
        button1 = new JButton("Anmelden");
        button1.addActionListener(this);
        button2 = new JButton("Registrieren");
        button2.addActionListener(this);
        name1 = new JTextField("name");
        name2 = new JTextField("name");

        panel = new JPanel(new GridLayout(2,2));
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

        b1 = new JButton("LYZ");
        b1.addActionListener(this);
        b2 = new JButton("NION");
        b2.addActionListener(this);
        //LY = new JTextField("Lyz ist eine Kämpferin, sieht auf den ersten Blick kalt aus, ist aber eine sehr offene und schnell aufbrausende Person. Sie ist sehr vorlaut und lässt keine Gelegenheit aus, zu kämpfen. Sie hat die Fähigkeit, Blitze zu kontrollieren. Außerdem liebt sie Süßigkeiten, die sie heimlich in ihren Taschen versteckt.");
        LY = new JLabel();
        LY.setText("<html>"
            +"<p>Lyz ist eine Kämpferin, sieht auf den ersten Blick kalt aus, "
            +"ist aber eine sehr offene und schnell aufbrausende Person. "
            +"Sie ist sehr vorlaut und lässt keine Gelegenheit aus, zu kämpfen. "
            +"Lyz hat die Fähigkeit, Blitze zu kontrollieren. Außerdem liebt "
            +"sie Süßigkeiten, die sie heimlich in ihren Taschen versteckt.</p>"
            +"</html>");
        NI = new JLabel();
        NI.setText("<html>"
            +"<p>Nions einzige Verteidigung ist sein Dolch, da er durch seine "
            +"überdurchschnittliche Intelligenz keine weiteren Waffen benötigt. "
            +"Er handelt nicht vorschnell, sondern überlegt und immer nach "
            +"einem Plan. Außerdem verleit ihm die Pigmentstörung Vitiligo "
            +"ein besonderes Aussehen. Er liebt es, sarkastisch zu sein.</p>"
            +"</html>");
        //NI = new JTextField("Nions einzige Verteidigung ist sein Dolch, da er durch seine überdurchschnittliche Intelligenz keine weiteren Waffen benötigt. Er handelt nicht vorschnell, sondern überlegt und immer nach einem Plan. Außerdem verleit ihm die Pigmentstörung Vitiligo ein besonderes Aussehen. Er liebt es, sarkastisch zu sein.");

        panel2 = new JPanel(new GridLayout(2,2));
        panel2.add(LY);
        panel2.add(NI);
        panel2.add(b1);
        panel2.add(b2);

        fenster2 = new JFrame("Fenster");
        fenster2.setSize(450,450);
        fenster2.setLocation(500,500);
        fenster2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenster2.add(panel2);
        fenster2.setVisible(false);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1)
        {
            try {
                String m = name1.getText();
                if(bank.userSuchen(m)) {
                    System.out.println("yay");
                    charakterWahl();
                }
                else {
                    name1.setText("User nicht vorhanden!");
                }
            }
            catch(Exception ex)
            {
                    System.out.println("nope");
            }
        }
        if(e.getSource() == button2)
        {
            try {
                if(bank.userSuchen(name2.getText()) == false) {
                    charakterWahl();
                }
                else
                {
                    name2.setText("Name schon vorhanden!");
                }
            }
            catch(Exception ex)
            {
                System.out.println("nope");
            }
        }
        if(e.getSource() == b1)
        { 
            blubb = l;
            einleitung();
        }
        if(e.getSource() == b2)
        { 
            blubb = n;
            einleitung();
        }
    }
    
    public void einleitung(){
        LY.setText("<html>" + blubb.einleitung() + ""
            +"</html>");
    }

    public void charakterWahl() {
        fenster.setVisible(false);
        fenster2.setVisible(true);
    }
}