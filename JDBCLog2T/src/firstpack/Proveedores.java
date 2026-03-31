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
@Table (name="proveedor")
public class Proveedores {
     @Id 
    @Column (name="id_proveedor")
     private int id_proveedor;
    @Column (name="Nombre_Proveedor")
     public String Nombre_Proveedor;
public Proveedores (){
}

    public Proveedores(String Nombre_Proveedor) {
        this.Nombre_Proveedor = Nombre_Proveedor;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getNombre_Proveedor() {
        return Nombre_Proveedor;
    }

    public void setNombre_Proveedor(String Nombre_Proveedor) {
        this.Nombre_Proveedor = Nombre_Proveedor;
    }

    @Override
    public String toString() {
        return "Proveedores{" + "id_proveedor=" + id_proveedor + ", Nombre_Proveedor=" + Nombre_Proveedor + '}';
    }
    
    
    }
    
