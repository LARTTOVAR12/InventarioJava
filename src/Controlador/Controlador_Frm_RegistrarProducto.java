
package Controlador;


import Modelo.ListarProductos;
import Modelo.Producto;
import Modelo.Registro;
import interfaz.frm_RegistrarProducto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

//SE CREA UNA CLASE DE JAVA PARA EL FORMULARIO DE REGISTRAR PRODUCTO

public class Controlador_Frm_RegistrarProducto implements ActionListener{
    
    frm_RegistrarProducto frm_rp;

    public Controlador_Frm_RegistrarProducto(frm_RegistrarProducto frm_rp) {
        this.frm_rp = frm_rp;
        this.frm_rp.btnGuardar.addActionListener(this);
    }

    //se crea un public void para la funcion del boton para poder guardar los datos que se valla ingresando
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //se cra un if para la funcion de poder llamar los datos solicitados para mostrarlo en la tabla
      if(e.getSource() == frm_rp.btnGuardar){
          
          String nombre = frm_rp.txtNombre.getText();
          int cantidad = Integer.parseInt(frm_rp.txtCantidad.getText());
          String fecha = frm_rp.txtFecha.getText();
          double precio = Double.parseDouble(frm_rp.txtPrecio.getText());
          
          Producto P=new Producto (nombre, cantidad, fecha, precio);
          Registro R=new Registro();
          R.registrobd(P);
          ListarProductos lp=new ListarProductos();
          lp.MostrarTabla(frm_rp.tblProducto);
          limpiarEntrada ();
      }
    }
    // se coloca una funcion para limpiar la entrada de registro.
    private void limpiarEntrada(){
        frm_rp.txtNombre.setText("");
        frm_rp.txtCantidad.setText("");
        frm_rp.txtFecha.setText("");
        frm_rp.txtPrecio.setText("");
        
    }
    
    
    
}
