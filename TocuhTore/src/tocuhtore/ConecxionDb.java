/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tocuhtore;

import java.sql.*;

/**
 *
 * @author ALBERTO
 */
public class ConecxionDb {
    Connection cn ;
   
    public Connection conecxion (){
        try {
        Class.forName("com.mysql.jdbc.Driver"); 
        cn = DriverManager.getConnection("jdbc:mysql://localhost/sistema","root","");
        Thread.sleep(1000);
        System.out.println("Exito al conectarse a la base de datos");
        
    }catch (Exception e){
            System.out.println(e.getMessage());
    }return cn;
   
    } Statement createStatement(){
        throw new UnsupportedOperationException("No soportado ");
    }
    
}
    
