package kk;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionPostgreSQL {


    //Connection conectar = null;
    public static final String user = "AutoFinance";
    public static final String password = "Surbitio2021*" ;
    public static final String database = "AutoFinance";
    public static final String hostname = "180.26.129.88" ;
    public static final String port = "5432" ;
    public static final String url = "jdbc:postgresql:// " + hostname +":" + port + "/" + database;

    public static void main (String[] args)  {

        try{
            Class.forName("org.postgresql.Driver");
            Connection conectar = DriverManager.getConnection("jdbc:postgresql://180.26.129.88:5432/AutoFinance", user, password);
            JOptionPane.showMessageDialog(null,"Base de datos conectada con exito");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al Conectar" + e);
        }
}
}