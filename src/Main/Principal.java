/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Controlador.Controlador_Frm_RegistrarProducto;
import Modelo.ListarProductos;
import interfaz.frm_RegistrarProducto;


public class Principal {
        
    public static frm_RegistrarProducto frm_rp;
    public static Controlador.Controlador_Frm_RegistrarProducto c_frm_rp;
    public static ListarProductos lp;
    
        public static void main(String[] args) {
            
            
            frm_rp = new frm_RegistrarProducto();
            frm_rp.setVisible(true);
            frm_rp.setLocationRelativeTo(null);
            
            c_frm_rp = new Controlador_Frm_RegistrarProducto(frm_rp);
            lp=new ListarProductos();
            lp.MostrarTabla(frm_rp.tblProducto);
            
        }
}
