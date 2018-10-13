/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papeleria;

import javax.swing.JOptionPane;

/**
 *
 * @author kevin
 */
public class Papeleria {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Articulo A1 = new Articulo(1,"Tijeras",15,1);
        Articulo A2 = new Articulo(2,"Cuaderno",20,2);
        Articulo A3 = new Articulo(3,"Resistol",10,3);
        Articulo A4 = new Articulo(4,"Calculadora",60,2);
        Articulo A5 = new Articulo(5,"Paquete Plumas",30,2);
        
       
        Provedor Pr1 = new Provedor();
        Provedor Pr2 = new Provedor();
        Provedor pr3 = new Provedor();
   
        JOptionPane.showMessageDialog(null,"\nEl Identificador es : "+A1.Id+"\nEl Nombre Del Producto Es: "+A1.Producto+"\nEl Precio Es: "+A1.Precio+"\nNumero Del Provedor Es: "+A1.N_Provedor
        +"\n\nEl Identificador es : "+A2.Id+"\nEl Nombre Del Producto Es: "+A2.Producto+"\nEl Precio Es: "+A2.Precio+"\nNumero Del Provedor Es: "+A2.N_Provedor
        +"\n\nEl Identificador es : "+A3.Id+"\nEl Nombre Del Producto Es: "+A3.Producto+"\nEl Precio Es: "+A3.Precio+"\nNumero Del Provedor Es: "+A3.N_Provedor
        +"\n\nEl Identificador es : "+A4.Id+"\nEl Nombre Del Producto Es: "+A4.Producto+"\nEl Precio Es: "+A4.Precio+"\nNumero Del Provedor Es: "+A4.N_Provedor
        +"\n\nEl Identificador es : "+A5.Id+"\nEl Nombre Del Producto Es: "+A5.Producto+"\nEl Precio Es: "+A5.Precio+"\nNumero Del Provedor Es: "+A5.N_Provedor);
        
        String Id = JOptionPane.showInputDialog("Escribe Las Cantidades De Los Productos");
        String Producto = JOptionPane.showInputDialog("Escribe El Nombre del Producto");
        
        JOptionPane.showMessageDialog(null,"Tu Pedido Es:\n "+Id+"\n"+Producto );
        int descicion = JOptionPane.showConfirmDialog(null,"Deseas Confirmar Tu Compra");
        
        if (descicion == JOptionPane.YES_OPTION){
            
            JOptionPane.showMessageDialog(null,"Gracias Por Su Compra");
        
        }
        if (descicion == JOptionPane.NO_OPTION){
            
            JOptionPane.showMessageDialog(null,"Sera Para La Proxima");
        
        }
        if (descicion == JOptionPane.CANCEL_OPTION){
            
            JOptionPane.showMessageDialog(null,"Usted Cancelo Su Compra");
        
        }
        
        
    }
    
}
 