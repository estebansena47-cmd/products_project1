/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*; 
import java.util.logging.Level;
import java.util.logging.Logger;
public class JDBCLog1T {

/**
 *
 * @author ONE
 */ 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String usuario= "root";
        String contraseña= "";
        String url= "jdbc:mysql://127.0.0.1:3307/loggeo?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
        Connection conexion;
        Statement st;
        ResultSet rs;
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conexion = DriverManager.getConnection(url,usuario,contraseña);
            st = conexion.createStatement();
            String eliminar= "GISELLE";
            String consulta= "GISELLE";
            ResultSet checkRs = st.executeQuery("SELECT * FROM usuarios WHERE Nombre_Usuario = '" + consulta + "'");
            if (checkRs.next()) {
            st.executeUpdate("UPDATE usuarios SET Correo_Electronico = 'GISSELITA98@gmail.com235@gmail.com' WHERE Nombre_Usuario ='" + consulta + "'"); 
            } else {
            st.executeUpdate("INSERT INTO usuarios (Nombre_Usuario, Contraseña, Numero_Telefonico, Correo_Electronico) VALUES ( '" + consulta + "' , 'GISS567', '3O76576846', 'GISELITA@gmail.com')");
           
            }
            st.executeUpdate("DELETE FROM usuarios WHERE Nombre_Usuario = '" + eliminar + "'");
            rs= st.executeQuery("SELECT * FROM usuarios"); 
            rs.next();
            do {
               System.out.println(rs.getInt("codigo")+" : " + rs.getString("Nombre_Usuario"));
            } while(rs.next());
            
            } catch (ClassNotFoundException ex) {
                System.out.println("ERROR DRIVER:"+ ex.getMessage());
            Logger.getLogger(JDBCLog1T.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex){
            System.out.println("ERROR SQL:"+ ex.getMessage());
           Logger.getLogger(JDBCLog1T.class.getName()).log(Level.SEVERE, null, ex);
        }
             
        
    }
    
}
