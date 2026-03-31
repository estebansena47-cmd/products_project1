/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firstpack;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import java.time.LocalDate;
/**
 *
 * @author ONE
 */
@Entity
@Table (name="inventario")

public class Inventary {
   @Id 
    @Column (name="Slot")
     private int Slot;
   @Column (name="Codigo_Barras")
     public String Codigo_Barras; 
    @Column (name="Nombre_Producto")
     public String Nombre_Producto;
    @Column (name="Cantidad_Presentacion")
     public String Cantidad_Presentacion;
    @Column (name="Lote")
     public int Lote;
   @Column (name="Unidades_Por_Conjunto")
     public int Unidades_Por_Conjunto;
   @Column (name="Conjuntos")
     public int Conjuntos;
    @Column (name="Menudeo_Restante")
     public int Menudeo_Restante;   
    @Column (name="Fecha_Vencimiento")
     public LocalDate Fecha_Vencimiento;


public Inventary() {
    }

 public Inventary(String Codigo_Barras, String Nombre_Producto, String Cantidad_Presentacion, int Lote, int Unidades_Por_Conjunto, int Conjuntos, int Menudeo_Restante, LocalDate Fecha_Vencimiento) {
        this.Codigo_Barras = Codigo_Barras;
        this.Nombre_Producto = Nombre_Producto;
        this.Cantidad_Presentacion = Cantidad_Presentacion;
        this.Lote = Lote;
        this.Unidades_Por_Conjunto = Unidades_Por_Conjunto;
        this.Conjuntos = Conjuntos;
        this.Menudeo_Restante = Menudeo_Restante;
        this.Fecha_Vencimiento = Fecha_Vencimiento;
    }

public int getSlot() {
        return Slot;
    }

    public void setSlot(int Slot) {
        this.Slot = Slot;
    }

    public String getCodigo_Barras() {
        return Codigo_Barras;
    }

    @Override
    public String toString() {
        return "Inventary{" + "Slot=" + Slot + " Codigo_Barras=" + Codigo_Barras + "Nombre_Producto=" + Nombre_Producto + ", Cantidad_Presentacion=" + Cantidad_Presentacion + ", Lote=" + Lote + ", Unidades_Por_Conjunto=" + Unidades_Por_Conjunto + ", Conjuntos=" + Conjuntos + ", Menudeo_Restante=" + Menudeo_Restante + ", Fecha_Vencimiento=" + Fecha_Vencimiento + '}';
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

    public int getUnidadesPorConjunto() {
        return Unidades_Por_Conjunto;
    }

    public void setUnidadesPorConjunto(int unidadesPorConjunto) {
        this.Unidades_Por_Conjunto = unidadesPorConjunto;
    }

    public int getConjuntos() {
        return Conjuntos;
    }

    public void setConjuntos(int Conjuntos) {
        this.Conjuntos = Conjuntos;
    }

    public int getMenudeo_Restante() {
        return Menudeo_Restante;
    }

    public void setMenudeo_Restante(int Menudeo_Restante) {
        this.Menudeo_Restante = Menudeo_Restante;
    }

    public LocalDate getFecha_Vencimiento() {
        return Fecha_Vencimiento;
    }

    public void setFecha_Vencimiento(LocalDate Fecha_Vencimiento) {
        this.Fecha_Vencimiento = Fecha_Vencimiento;
    }


}
