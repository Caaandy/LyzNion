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
            String s1 = "Nion Kindheit";
            String s2 = "";
            String s3 = "";
            String s4 = "";
            l = "einleitung2";
        }
        return l;
    }
    
    public String chapter1(){
        String l = "Trifft auf Lyz in einer Seitengasse -> Sympathie";
        return l;
    }
    
    public String chapter2(int i){
        String l = null;
        if (i == 1) {
            l = "Bringe Lyz zur Organisation";
        }
        if (i == 2) {
            l= "Lyz wird ohnmächtig, du schaffst sie zur Organisation";
        }
        return l;
    }
    
    public String chapter3(){
        String l = "1. Einsatz (Informant in Gefahr)";
        return l;
    }

    public String chapter4(int i){
        String l = null;
        if (i == 1) {
            l = "Du hast den Informanten aufgedeckt ->  wurde gefangen genommen";
        }
        if (i == 2) {
            l= "Informant zu nervös -> macht Fehler -> muss gerettet werden";
        }
        return l;
    }

    public String chapter5(){
        String l = "2. Einsatz (Informant retten)";
        return l;
    }

    public String chapter6(int i){
        String l = null;
        if (i == 1) {
            l = "Du gehst in den Raum, Wache dabei, den Informanten zu töten foltern";
        }
        if (i == 2) {
            l= "Informant erzählt den Feinden die Information";
        }
        return l;
    }

    public String chapter7(int i){
        String l = null;
        if (i == 1) {
            l = "Der Informant stirb";
        }
        if (i == 2) {
            l= "Der Informan überlebt, hat keine Informationen preisgegeben";
        }
        if (i == 3) {
            l = "Der Informant lebt, aber der Feind weiß nun bescheid";
        }
        return l;
    }

    public String schluss(){
        String l = "Fortsetzung folgt...";
        return l;
    }
}