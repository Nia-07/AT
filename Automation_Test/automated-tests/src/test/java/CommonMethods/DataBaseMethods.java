package CommonMethods;

import java.sql.*;
import java.util.List;

public class DataBaseMethods {

    //Acceso

    private static final String user = "AutoFinance";
    private static final String password = "Surbitio2021*" ;
    private static Connection connection;

    //Conecta la base de datos

    public static void connectionAutofinance(){

        try{
            connection = DriverManager.getConnection("jdbc:postgresql://180.26.129.88:5432/AutoFinance", user, password);
            //JOptionPane.showMessageDialog(null,"Base de datos conectada con exito");
            System.out.println("Conectado");
        }catch (Exception e){
            //JOptionPane.showMessageDialog(null, "Error al Conectar" + e);
            System.out.println(e.getMessage());
        }

    }

    //Obtiene el Codigo
    public static void consultDB(String consult, String column, List<String> codeList) {
        try{
            connectionAutofinance();
            PreparedStatement stmn = connection.prepareStatement(consult);
            ResultSet result = stmn.executeQuery();
            while (result.next()){
                codeList.add(result.getString(column));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}








