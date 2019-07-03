public class Nion extends STORY {
    
    public Nion(){
    }
    
    public String einleitung( int i ) {
        String l = null;
        if (i == 1) {
            String s1 = "Das Jahr 0 des neuen Zeitalters: Zwei Jahrhunderte lang herrscht Frieden im Königreich Oxia,bis sich eine Gruppe Rebellen zusammenschließt, um ihren Anührer auf den Thron zu bringen.";
            String s2 = "32 Jahre gibt es Krieg. Soldaten kämpfen verbittert für ihren Herrscher, dem sie die Treue schwörten.";
            String s3 = "Trotz vieler Verluste auf beiden Seiten endet der Krieg erst, als Sunora, die Königin desalten Königreichs, im Kampf schwer verwundet wird und verschwindet.";
            String s4 = "Das bedeutet den Untergang des alten Zeitalters, das sich durch Güte und Gerechtigkeit auszeichnet, und den Beginn eines neuen, von Hass und Gier beherrschten Königreiches.";
            String s5 = "Bald darauf gehören Gewalt, Demütigung und Unterdrückung zum alltäglichen Leben. Doch die Anhänger Sunoras verlieren trotz der Niederlage und fehlender Führung nicht den Mut.";
            String s6 = "Sie bauen im Untergrund eine Organsition auf, die, sobald der richtige Zeitpunkt kommt, den neuen König stürzen und die rechtmäßige Herrscherin zurückbringen wird.";
            String s7 = "Die Anhänger  des Königs aber feiern ihren Sieg und ebenso ihren Herrscher, nicht erkennend, dass dies lediglich der Anfang ihres Untergangs ist.";
            String s8 = "Denn eine Gruppe von Helden wird kommen, die Welt von der Schreckensherrschaft des neuen Königs zu befreien.";
            l = s1 + " " + s2 + " " + s3 + " " + s4 + " " + s5 + " " + s6 + " " + s7 + " " + s8;
        }
        if (i == 2) {
            String s1 = "hiof ";
            String s2 = "fis";
            String s3 = "nfs";
            String s4 = "fnjks";
            l = "einleitung2";
        }
        return l;
    }
    
    public String chapter1(){
        String l = "chapter 1";
        return l;
    }
    
    public String chapter2(int i){
        String l = null;
        if (i == 1) {
            l = "chapter 2.1";
        }
        if (i == 2) {
            l= "chapter 2.2";
        }
        return l;
    }
    
    public String chapter3(){
        String l = "chapter 3 nion";
        return l;
    }

    public String chapter4(int i){
        String l = null;
        if (i == 1) {
            l = "chapter 4.1";
        }
        if (i == 2) {
            l= "chapter 4.2";
        }
        return l;
    }

    public String chapter5(){
        String l = "chapter 5";
        return l;
    }

    public String chapter6(int i){
        String l = null;
        if (i == 1) {
            l = "chapter 6.1";
        }
        if (i == 2) {
            l= "chapter 6.2";
        }
        return l;
    }

    public String chapter7(int i){
        String l = null;
        if (i == 1) {
            l = "chapter 7.1";
        }
        if (i == 2) {
            l= "chapter 7.2";
        }
        return l;
    }

    public String schluss(){
        String l = "Fortsetzung folgt...";
        return l;
    }
}