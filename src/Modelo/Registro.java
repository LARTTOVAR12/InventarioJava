
package Modelo;

import Conexion.ConexionMysql;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;

//se cre la clase registro y la conexion 
public class Registro {
    ConexionMysql con=new ConexionMysql();
    Connection cn=con.conectar();
//se crea un try para poder guarda la informacion dentro del array ya creado
    public void registrobd(Producto p) {
        try {
            PreparedStatement ps=cn.prepareStatement("INSERT INTO producto(nombre,cantidad,fechV,precio,total) VALUES(?,?,?,?,?)");
            ps.setString(1, p.getNombre());
            ps.setInt(2, p.getCantidad());
            ps.setString(3, p.getFecha());
            ps.setDouble(4, p.getPrecio());
            ps.setDouble(5, p.gettotal());
            ps.executeUpdate();
            
            //se coloca un catch que tiene la funcion para mostrar un mensaje si se presenta un error al registrar los datos
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL REGISTRAR DATOS " + e);
        }
    }

   

    
}
