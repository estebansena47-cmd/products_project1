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
@Table (name="venta")
public class Ventas {

    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="id_venta")
     private int id_venta;
    @Column (name="Codigo_Barras")
     public String Codigo_Barras;
    @Column (name="Cantidad_Vendida")
     public int Cantidad_Vendida;
    @Column (name="Precio_Menudeo")
     public int Precio_Menudeo;
    @Column (name="Precio_segun_cantidad")
     public int Precio_segun_cantidad; 
    @Column (name="Precio_Total")
     public int Precio_Total;
    @Column (name="Fecha_Venta")
     public LocalDate Fecha_Venta;
    

   public Ventas (){ 
        
    }
    public Ventas(String Codigo_Barras, int Cantidad_Vendida, LocalDate Fecha_Venta, int Precio_Menudeo, int Precio_segun_cantidad, int Precio_Total) {
        this.Codigo_Barras = Codigo_Barras;
        this.Cantidad_Vendida = Cantidad_Vendida;
        this.Precio_Menudeo = Precio_Menudeo;
        this.Precio_segun_cantidad = Precio_segun_cantidad;
        this.Precio_Total = Precio_Total;
         this.Fecha_Venta = Fecha_Venta;
    }

    @Override
    public String toString() {
        return "Ventas{" + "id_venta=" + id_venta + ", Codigo_Barras=" + Codigo_Barras + ", Fecha_Venta=" + Fecha_Venta + ", Cantidad_Vendida=" + Cantidad_Vendida + ", Precio_Menudeo=" + Precio_Menudeo + ", Precio_segun_cantidad=" + Precio_segun_cantidad + ", Precio_Total=" + Precio_Total + '}';
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }
    
    

    public String getCodigo_Barras() {
        return Codigo_Barras;
    }

    public void setCodigo_Barras(String Codigo_Barras) {
        this.Codigo_Barras = Codigo_Barras;
    }

    public LocalDate getFecha_Venta() {
        return Fecha_Venta;
    }

    public void setFecha_Venta(LocalDate Fecha_Venta) {
        this.Fecha_Venta = Fecha_Venta;
    }

    public int getCantidad_Vendida() {
        return Cantidad_Vendida;
    }

    public void setCantidad_Vendida(int Cantidad_Vendida) {
        this.Cantidad_Vendida = Cantidad_Vendida;
    }

    public int getPrecio_Menudeo() {
        return Precio_Menudeo;
    }

    public void setPrecio_Menudeo(int Precio_Menudeo) {
        this.Precio_Menudeo = Precio_Menudeo;
    }

    public int getPrecio_segun_cantidad() {
        return Precio_segun_cantidad;
    }

    public void setPrecio_segun_cantidad(int Precio_segun_cantidad) {
        this.Precio_segun_cantidad = Precio_segun_cantidad;
    }

    public int getPrecio_Total() {
        return Precio_Total;
    }

    public void setPrecio_Total(int Precio_Total) {
        this.Precio_Total = Precio_Total;
    }
   }
