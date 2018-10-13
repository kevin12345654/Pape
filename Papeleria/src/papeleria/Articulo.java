/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package papeleria;

/**
 *
 * @author kevin
 */
class Articulo {
    int Id;
    String Producto;
    int Precio;
    int N_Provedor;

    Articulo(int id, String producto, int precio, int n_provedor) {
            Id=id;
            Producto=producto;
            Precio=precio;
            N_Provedor=n_provedor;
        
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

    public int getN_Provedor() {
        return N_Provedor;
    }

    public void setN_Provedor(int N_Provedor) {
        this.N_Provedor = N_Provedor;
    }
    
    
    
}
