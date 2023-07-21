
package Modelo;

import Conexion.ConexionMysql;
import java.sql.Connection;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//se crea una clase para la tabla 
public class ListarProductos {
    //se crea las conexiones
    ConexionMysql con = new ConexionMysql();
    Connection cn = con.conectar();
    //se crea un metodo para poder colocar los nombres de los espacios de la tabla
    public void MostrarTabla(JTable tabla) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Cantidad");
        modelo.addColumn("FechaVencimiento");
        modelo.addColumn("Precio");
        modelo.addColumn("Total");
        String consultasql = "SELECT*FROM producto";
        Statement st;
        //se crea un try para la consulta de sql y poder alamacenar los datos.
        try {
            st = cn.createStatement();
            var rs = st.executeQuery(consultasql);
            while (rs.next()){
                Object [] lista={rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getDouble(5), rs.getDouble(6)};
                modelo.addRow(lista);
            }
            tabla.setModel(modelo);
        } catch (Exception e) {
            System.out.println("ERROR AL LISTAR LOS DATOS" + e);
        }
    }
}
