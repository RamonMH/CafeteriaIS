/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ramon
 */
public class conectarBD {

    //String bd="cafeteria";
    String url="jdbc:oracle:thin:@//localhost:1521/XEPDB1";
    String user="usr_cafe";
    String password="PassCafe";
    String driver="oracle.jdbc.driver.OracleDriver";
    Connection con;
    
   PreparedStatement psss;
    public Connection conectar()
        {
            try {
                Class.forName(driver);
                con=DriverManager.getConnection(url, user, password);
                System.out.println("CONEXION HECHA ");
            } catch (ClassNotFoundException | SQLException ex) {
                System.out.println("NO HAY CONEXION ");
                Logger.getLogger(conectarBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        return con;
        }

    public Object getConexion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
 
}
