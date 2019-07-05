import java.sql.*; 

public class BANK {
    Connection con;
    Statement stmt;
    ResultSet rs;

    public BANK(){
        connectDB("db4free.net", "lyznion", "candyli", "ZebraMatschgrün");
    }

    public boolean userSuchen(String na) {
        boolean i = false;
        try
        {
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT name FROM Member");
            while (rs.next())
            {
                String t = rs.getString("name");
                if (t.equals(na)) 
                {
                    i = true;
                }
            }
        }
        catch (Exception e) 
        {
            System.out.println("Userabfrage fehlgeschlagen."); 
        }
        return i;
    }
    
    public int chapterAbfrage(String na){
        int cha = 0;
        try{
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM Member");
            while (rs.next())
            {
                String t = rs.getString("name");
                if (t.equals(na)) 
                {
                    cha = rs.getInt("chapter");
                }
            }
        }
        catch (Exception e){
            System.out.println("Chapterabfrage fehlgeschlagen."); 
        }
        return cha;
    }
    
    public String charakterAbfrage(String na) {
        String chara = null;
        try{
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM Member");
            while (rs.next())
            {
                String t = rs.getString("name");
                if (t.equals(na)) 
                {
                    chara = rs.getString("story");
                }
            }
        }
        catch (Exception e){
            System.out.println("Chapterabfrage fehlgeschlagen."); 
        }
        return chara;
    }
    
    public void chapterNeu(int o, String na) {
        try
        {
            stmt = con.createStatement();
            stmt.executeUpdate("UPDATE Member SET chapter = "+o+" WHERE Member.name= '"+na+"';");
        }
        catch (Exception e)
        {
            System.out.println("Chapter Ändern fehlgeschlagen.");
        }
    }
    
    public void charakterNeu(String chara, String na) {
        try
        {
            stmt = con.createStatement();
            stmt.executeUpdate("UPDATE Member SET story = '"+chara+"' WHERE Member.name = '"+na+"';");
        }
        catch (Exception e)
        {
            System.out.println("Charakter Ändern fehlgeschlagen.");
        }
    }
    
    public void neuerUser(String n){
        try
        {
            stmt = con.createStatement();
            stmt.execute("INSERT INTO Member (story, name, chapter) VALUES ('Lyz', '"+n+"',0);");
        }
        catch (Exception e)
        {
            System.out.println("User hinzufügen fehlgeschlagen.");
        }
    }

    /**
     * Methode connectDB
     * Verbindet mit der Datenbank und ggf. eine Fehlermeldung aus.
     *
     * @param   ip          IP-Adresse oder URL des Servers
     * @param   db          Name der zu verwendenen Datenbank
     * @param   user        Benutzer-Name fuer Server-Zugriff
     * @param   pw          Passwort fuer Server-Zugriff
     * 
     */
    public void connectDB(String ip, String db, String user, String pw)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection( "jdbc:mysql://"+ip+":3306/"+db, user, pw);
            //System.out.println("Verbindung hergestellt.");

        }
        catch (Exception e) 
        {
            System.out.println("Verbindung fehlgeschlagen."); 
            System.out.println(e.getMessage());
            e.printStackTrace();
        } 
    }
}
