
package demo_acl_crud.trabajadorBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class conexion {
    //preparamos los datos para conectarnos
    String ConexionBD = "jdbc:sqlite:C:/Users/carli/Documents/base_de_datos/bd_trabajador.s3db";
    Connection conn = null;
    
    //constructor para conectarnos apenas inicie
    public conexion(){
        try
        {
           //nos conectamos a la bd
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(ConexionBD);
            
            System.out.println("Conexion exitosa");
            
        }
        catch(Exception ex)
        {
            System.out.println("Error de conexion: " + ex);
        }
    }
    
    //metodo insertar, devuelve 1 si se inserto, y 0 si no se inserto, para testear 
    public int Insertar (String strInstertar){
        
        try {
            PreparedStatement pstm  = conn.prepareStatement(strInstertar);
            pstm.execute();
            System.out.println("operacion exitosa");
            return 1;
            
        } catch (SQLException ex) {
            System.out.println("error desconocido: " + ex);
            return 0;
        }
        
    }
    // consultar registros
    public ResultSet consultarRegistro(String strConsultar){
        
        try {
            PreparedStatement pstm  = conn.prepareStatement(strConsultar);
            ResultSet respuesta = pstm.executeQuery();
            return respuesta;
            
        } catch (Exception e) {
            System.out.println("error de consulta: " + e);
            return null;
        }
    }
}
