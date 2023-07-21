/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.DriverManager;
import java.sql.Connection;

//SE CREA LA FUNCION PARA PODER CONECTAR LA BASE DE DATOS


public class ConexionMysql {
    
    
    Connection cn;
    
   
    public Connection conectar (){
       
       try{
           Class.forName("com.mysql.jdbc.Driver");
           cn =DriverManager.getConnection("jdbc:mysql://localhost/inventario","root","");
           System.out.println("Base de datos conectada");
       }catch (Exception e){
           System.out.println("ERROR DE CONEXION " + e);
       }
        return cn;
   }
   
}
