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
    private JFrame fenster3;
    private JLabel labelgesch;
    private JFrame fenster4;
    private JPanel panel4;
    private JButton bmenu;
    private JButton auswahl1;
    private JButton auswahl2;
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
        
        //fenster 3 + 4
        auswahl1 = new JButton("umblättern");
        auswahl1.addActionListener(this);
        auswahl2 = new JButton(" ");
        auswahl2.addActionListener(this);
        bmenu = new JButton("zurück zum Menu");
        bmenu.addActionListener(this);
        labelgesch = new JLabel();
        labelgesch.setText("<html>"
            +"<p>what"
            +"ever</p>"
            +"</html>");

        fenster3 = new JFrame("Fenster");
        fenster3.setSize(800,600);
        fenster3.setLocation(100,200);
        fenster3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenster3.add(labelgesch);
        fenster3.setVisible(false);

        panel4 = new JPanel(new GridLayout(3,1));
        panel4.add(auswahl1);
        panel4.add(auswahl2);
        panel4.add(bmenu);

        fenster4 = new JFrame("Fenster");
        fenster4.setSize(500,450);
        fenster4.setLocation(1000,300);
        fenster4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenster4.add(panel4);
        fenster4.setVisible(false);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1)
        {
            try {
                na = name1.getText();
                if(bank.userSuchen(na)) {
                    int chapt = bank.chapterAbfrage(na);
                    if(chapt == 0) {
                        charakterWahl();
                    }
                    else {
                        charakter(na);
                        switch (chapt){
                            //"Checkpoints"
                            case 1:
                                chapter1();
                                break;
                            case 3:
                                chapter3();
                                break;
                            case 5:
                                chapter5();
                                break;
                        }
                    }
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
                na = name2.getText();
                if(bank.userSuchen(na) == false) {
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
            bank.charakterNeu("Lyz", na);
            einleitung();
        }
        if(e.getSource() == b2)
        { 
            blubb = n;
            bank.charakterNeu("Nion", na);
            einleitung();
        }
        if(e.getSource() == auswahl1)
        {
            switch (auswahl1.getText())
            {
                case "umblättern":
                    labelgesch.setText("<html>" + blubb.einleitung(2) + "</html>");
                    auswahl1.setText("Kaffee");
                    auswahl2.setText("Tee");
                    break;
                case "Kaffee":
                    chapter1();
                    break;
                    //Spielerei
                case "NEU":
                    chapter2(1);
                    break;
                case "BLUBB":
                    einleitung();
                    break;
            } 
        }
        if(e.getSource() == auswahl2)
        {
            switch (auswahl2.getText())
            {
                case "Tee":
                    chapter1();
                    break;
                    //Spielerei
                case "neu":
                    chapter2(2);
                    break;
                case "blubb":
                    einleitung();
                    break;
            } 
        }
        if(e.getSource() == bmenu)
        {
            fenster2.setVisible(false);
            fenster.setVisible(true);
            fenster3.setVisible(false);
            fenster4.setVisible(false);
        }
    }
    
    public void charakter(String name) {
        if (bank.charakterAbfrage(name) == "Lyz") {
            blubb = l;
        }
        else if(bank.charakterAbfrage(name) == "Nion") {
            blubb = n;
        }
        else {
            System.out.println("Charakterabfrage fehlgeschlagen!");
        }
    }

    public void charakterWahl() {
        fenster.setVisible(false);
        fenster2.setVisible(true);
        fenster3.setVisible(false);
        fenster4.setVisible(false);
    }
    
    public void einleitung(){
        fenster.setVisible(false);
        fenster2.setVisible(false);
        fenster3.setVisible(true);
        fenster4.setVisible(true);
        labelgesch.setText("<html>" + blubb.einleitung(1) + ""
            +"</html>");
            auswahl1.setText("umblättern");
    }

    public void chapter1() {
        auswahl1.setText("eins");
        auswahl2.setText("EINS");
        labelgesch.setText("<html>" + blubb.chapter1() + "</html>");
        bank.chapterNeu(1, na);
    }
    
    public void chapter2(int j) {
        auswahl1.setText("zwei");
        auswahl2.setText("ZWEI");
        labelgesch.setText("<html>" + blubb.chapter2(j) + "</html>");
    }
    
    public void chapter3() {
        auswahl1.setText("drei");
        auswahl2.setText("DREI");
        labelgesch.setText("<html>" + blubb.chapter3() + "</html>");
        bank.chapterNeu(3, na);
    }
    
    public void chapter4(int j) {
        auswahl1.setText("vier");
        auswahl2.setText("VIER");
        labelgesch.setText("<html>" + blubb.chapter4(j) + "</html>");
    }
    
    public void chapter5() {
        auswahl1.setText("fünf");
        auswahl2.setText("FÜNF");
        labelgesch.setText("<html>" + blubb.chapter5() + "</html>");
        bank.chapterNeu(5, na);
    }
    
    public void chapter6(int j) {
        auswahl1.setText("sechs");
        auswahl2.setText("SECHS");
        labelgesch.setText("<html>" + blubb.chapter6(j) + "</html>");
    }
    
    public void chapter7(int j) {
        auswahl1.setText("sieben");
        auswahl2.setText("SIEBEN");
        labelgesch.setText("<html>" + blubb.chapter7(j) + "</html>");
    }
    
    public void chapter8(int j) {
        auswahl1.setText("acht");
        auswahl2.setText("ACHT");
        labelgesch.setText("<html>" + blubb.chapter8(j) + "</html>");
    }
    
    public void schluss() {
        auswahl1.setText("");
        auswahl2.setText("");
        labelgesch.setText("<html>" + blubb.schluss() + "</html>");
        bank.chapterNeu(0, na);
    }
}