import java.sql.*; 

public class BANK {
    Connection con;
    Statement stmt;
    ResultSet rs;
    
    public BANK(){
        connectDB("db4free.net", "dbname", "username", "password");
    }
    
    public void userSuchen() {
        
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
            System.out.println("Verbindung hergestellt.");

        }
        catch (Exception e) 
        {
            System.out.println("Verbindung fehlgeschlagen."); 
            System.out.println(e.getMessage());
            e.printStackTrace();
        } 
    }

    /**
     * Methode disconnectDB
     * Trennt die Verbindung zur Datenbank
     * 
     */
    public void disconnectDB()
    {
        try
        {
            con.close();
            System.out.println("Verbindung getrennt.");
        }
        catch (Exception e)
        {
            System.out.println("Trennen fehlgeschlagen.");
        }
    }
    
    /**
     * Methode BeispielErzeugen
     * Erzeugt eine Tabelle in der Datenbank und füllt sie mit Beispieldaten
     * 
     */
    public void BeispielErzeugen()
    {
        try
        {
            stmt = con.createStatement();
            stmt.execute("CREATE TABLE test ( zahl INT, text VARCHAR(20))");
            stmt.execute("ALTER TABLE test ADD PRIMARY KEY(zahl)");
            stmt.execute("INSERT INTO test (zahl, text) VALUES (1, 'adam'), (2, 'berta')");
            System.out.println("Tabelle erzeugt.");
        }
        catch (Exception e)
        {
            System.out.println("Erzeugen fehlgeschlagen.");
        }
    }
    
    /**
     * Methode BeispielAbfrage
     * Macht eine Datenbankabfrage und gibt das Ergebnis aus
     * 
     */
    public void BeispielAbfrage()
    {
        try
        {
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM test");
            while (rs.next())
            {
                int z = rs.getInt("zahl");
                String t = rs.getString("text");
                System.out.println(z+" "+t);
            }
        }
        catch (Exception e)
        {
            System.out.println("Abfrage fehlgeschlagen.");
        }
    }
    
    /**
     * Methode BeispielAendern
     * Führt eine Änderung in der Datenbank aus
     * 
     */
    public void BesipielAendern()
    {
        try
        {
            stmt = con.createStatement();
            int anz = stmt.executeUpdate("UPDATE test SET text = 'chris' WHERE zahl=2");
            System.out.println(anz+" Datensätze geändert.");
        }
        catch (Exception e)
        {
            System.out.println("Ändern fehlgeschlagen.");
        }
    }
    
    /**
     * Methode BeispielLoeschen
     * Löscht die Tabelle, die mit der Methode BeispielErzeugen angelegt wurde
     * 
     */
    public void BeispielLoeschen()
    {
        try
        {
            stmt = con.createStatement();
            stmt.execute("DROP TABLE test");
            System.out.println("Tabelle gelöscht.");
        }
        catch (Exception e)
        {
            System.out.println("Löschen fehlgeschlagen.");
        }
    }
}
