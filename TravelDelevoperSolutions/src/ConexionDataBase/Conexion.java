/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConexionDataBase;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    static String base = "traveldelevoper";
    static String usuary="root";
    static String password="";
    static String url="jdbc:mysql://localhost/"+base;
    
      Connection conexion = null;
      {
          try{
              Class.forName("com.mysql.cj.jdbc.Driver");
              conexion = DriverManager.getConnection(url,usuary, password);
                if(conexion!=null){
                    System.out.println("Conexion Exitoso");
                }else{
                    System.out.println("Error de conexion");
                }
          } catch(Exception e){
              System.out.println(e);
          }
      } public Connection conectar(){
          return conexion;
      }
    
}
