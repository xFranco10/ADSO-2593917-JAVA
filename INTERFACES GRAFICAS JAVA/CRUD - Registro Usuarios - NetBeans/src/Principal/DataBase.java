package Principal;

import java.sql.*;

public class DataBase {
    
    Statement manipularDB;
    
    public DataBase(){
        String hostname = "localhost";
        String puerto = "3306";
        String database_name = "app_java";
        String database_user = "root";
        String database_password = "";
        String url = "jdbc:mysql://"+hostname+":"+puerto+"/"+database_name;
        
        try{
            Connection conexion = DriverManager.getConnection(url, database_user, database_password);
            manipularDB = conexion.createStatement();
            System.out.println("Conexion exitosa a la base de datos: "+database_name);
        }catch(SQLException e){
            System.out.println("Error en: "+ e.getMessage());
            this.manipularDB = null;
        } 
    }
    
    public ResultSet listaPersonas(){
        //Extrayendo de la base de datos.
        try{
            ResultSet registros = manipularDB.executeQuery("SELECT * FROM personas");
            registros.next();
            
            return registros;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+ e.getMessage());
            return null;
        }
    }
}
