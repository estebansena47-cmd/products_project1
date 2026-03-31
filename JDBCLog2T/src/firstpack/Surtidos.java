/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firstpack;

/**
 *
 * @author ONE
 */
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

    @Entity
@Table (name="Surtido")
public class Surtidos {
     @Id 
    @Column (name="id_surtido")
     private int id_surtido;
     @Column (name="Codigo_Barras")
     public String Codigo_Barras;
    @Column (name="Nombre_Proveedor")
     public String Nombre_Proveedor;
    @Column (name="Cantidad_inventario")
     public int Cantidad_inventario;
public Surtidos (){
}

    @Override
    public String toString() {
        return "Surtidos{" + "id_surtido=" + id_surtido + "Codigo_Barras=" + Codigo_Barras +", Nombre_Proveedor=" + Nombre_Proveedor + ", Cantidad_inventario=" + Cantidad_inventario + '}';
    }
 
public Surtidos(String Nombre_Proveedor, int Cantidad_inventario, String Codigo_Barras) {
        this.Nombre_Proveedor = Nombre_Proveedor;
        this.Cantidad_inventario = Cantidad_inventario;
        this.Codigo_Barras = Codigo_Barras;
    }
    public int getId_surtido() {
        return id_surtido;
    }

    public void setId_surtido(int id_surtido) {
        this.id_surtido = id_surtido;
    }
     public String getCodigo_Barras() {
            return Codigo_Barras;
        }
     public void setCodigo_Barras(String Codigo_Barras) {
            this.Codigo_Barras = Codigo_Barras;
        }

    public String getNombre_Proveedor() {
        return Nombre_Proveedor;
    }

    public void setNombre_Proveedor(String Nombre_Proveedor) {
        this.Nombre_Proveedor = Nombre_Proveedor;
    }

    public int getCantidad_inventario() {
        return Cantidad_inventario;
    }

    public void setCantidad_inventario(int Cantidad_inventario) {
        this.Cantidad_inventario = Cantidad_inventario;
    }
    


    
}
