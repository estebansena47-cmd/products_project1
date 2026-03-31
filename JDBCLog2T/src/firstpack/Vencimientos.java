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
import java.time.LocalDate;
 @Entity
@Table (name="vencimientos")
public class Vencimientos {
     @Id 
    @Column (name="id_vencimiento")
     private int id_vencimiento;
   @Column (name="Codigo_Barras")
     public String Codigo_Barras; 
    @Column (name="Nombre_Producto")
     public String Nombre_Producto;
    @Column (name="Cantidad_Presentacion")
     public String Cantidad_Presentacion;
    @Column (name="Lote")
     public int Lote;
    @Column (name="Cantidad_inventario")
     public int Cantidad_inventario;
    @Column (name="Fecha_Vencimiento")
     public LocalDate Fecha_Vencimiento;
    
   public Vencimientos() {
       
   } 
 public Vencimientos(String Codigo_Barras, String Nombre_Producto, String Cantidad_Presentacion, int Lote, int Cantidad_inventario, LocalDate Fecha_Vencimiento) {
        this.Codigo_Barras = Codigo_Barras;
        this.Nombre_Producto = Nombre_Producto;
        this.Cantidad_Presentacion = Cantidad_Presentacion;
        this.Lote = Lote;
        this.Cantidad_inventario = Cantidad_inventario;
        this.Fecha_Vencimiento = Fecha_Vencimiento;
    } 

    @Override
    public String toString() {
        return "Vencimientos{" + "id_vencimiento=" + id_vencimiento + ", Codigo_Barras=" + Codigo_Barras + ", Nombre_Producto=" + Nombre_Producto + ", Cantidad_Presentacion=" + Cantidad_Presentacion + ", Lote=" + Lote + ", Cantidad_inventario=" + Cantidad_inventario + ", Fecha_Vencimiento=" + Fecha_Vencimiento + '}';
    }
 
 public int getId_vencimiento() {
        return id_vencimiento;
    }

    public void setId_vencimiento(int id_vencimiento) {
        this.id_vencimiento = id_vencimiento;
    }

    public String getCodigo_Barras() {
        return Codigo_Barras;
    }

    public void setCodigo_Barras(String Codigo_Barras) {
        this.Codigo_Barras = Codigo_Barras;
    }

    public String getNombre_Producto() {
        return Nombre_Producto;
    }

    public void setNombre_Producto(String Nombre_Producto) {
        this.Nombre_Producto = Nombre_Producto;
    }

    public String getCantidad_Presentacion() {
        return Cantidad_Presentacion;
    }

    public void setCantidad_Presentacion(String Cantidad_Presentacion) {
        this.Cantidad_Presentacion = Cantidad_Presentacion;
    }

    public int getLote() {
        return Lote;
    }

    public void setLote(int Lote) {
        this.Lote = Lote;
    }

    public int getCantidad_inventario() {
        return Cantidad_inventario;
    }

    public void setCantidad_inventario(int Cantidad_inventario) {
        this.Cantidad_inventario = Cantidad_inventario;
    }

    public LocalDate getFecha_Vencimiento() {
        return Fecha_Vencimiento;
    }

    public void setFecha_Vencimiento(LocalDate Fecha_Vencimiento) {
        this.Fecha_Vencimiento = Fecha_Vencimiento;
    }
}

		