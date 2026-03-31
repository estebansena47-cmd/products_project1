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
@Table (name="producto")

public class Productos {
    
    @Id 
    @Column (name="Codigo_Barras")
     public String Codigo_Barras;
    @Column (name="Nombre_Producto")
     public String Nombre_Producto;
    @Column (name="Lote")
     public int Lote;
    @Column (name="Fecha_Vencimiento")
     public LocalDate Fecha_Vencimiento;
    @Column (name="Cantidad_Presentacion")
     public String Cantidad_Presentacion;
    @Column (name="Precio_Menudeo")
     public int Precio_Menudeo;
    @Column (name="Precio_Conjunto")
     public int Precio_Conjunto;
    @Column (name="unidadesPorConjunto")
     public int unidadesPorConjunto;
    @Column (name="Conjuntos")
     public int Conjuntos;
    @Column (name="Menudeo_Restante")
     public int Menudeo_Restante;
    @Column (name="Nombre_Proveedor")
     public String Nombre_Proveedor;
    
    public Productos () {
    }
    
      public Productos(String Codigo_Barras, String Nombre_Producto, int Lote, LocalDate Fecha_Vencimiento, String Cantidad_Presentacion, int Precio_Menudeo, int Precio_Conjunto, int unidadesPorConjunto, int Conjuntos, int Menudeo_Restante, String Nombre_Proveedor) {
            this.Codigo_Barras = Codigo_Barras;
            this.Nombre_Producto = Nombre_Producto;
            this.Lote = Lote;
            this.Fecha_Vencimiento = Fecha_Vencimiento;
            this.Cantidad_Presentacion = Cantidad_Presentacion;
            this.Precio_Menudeo = Precio_Menudeo;
            this.Precio_Conjunto = Precio_Conjunto;
            this.unidadesPorConjunto = unidadesPorConjunto;
            this.Conjuntos = Conjuntos;
            this.Menudeo_Restante = Menudeo_Restante;
            this.Nombre_Proveedor = Nombre_Proveedor;
    }
      
    
     public String getCodigo_Barras() {
            return Codigo_Barras;
        }

        @Override
        public String toString() {
            return "Productos{" + "Codigo_Barras=" + Codigo_Barras + ", Nombre_Producto=" + Nombre_Producto + ", Lote=" + Lote + ", Fecha_Vencimiento=" + Fecha_Vencimiento + ", Cantidad_Presentacion=" + Cantidad_Presentacion + ", Precio_Menudeo=" + Precio_Menudeo + ", Precio_Conjunto=" + Precio_Conjunto + ", unidadesPorConjunto=" + unidadesPorConjunto + ", Conjuntos=" + Conjuntos + '}';
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

        public int getLote() {
            return Lote;
        }

        public void setLote(int Lote) {
            this.Lote = Lote;
        }

        public LocalDate getFecha_Vencimiento() {
            return Fecha_Vencimiento;
        }

        public void setFecha_Vencimiento(LocalDate Fecha_Vencimiento) {
            this.Fecha_Vencimiento = Fecha_Vencimiento;
        }

        public String getCantidad_Presentacion() {
            return Cantidad_Presentacion;
        }

        public void setCantidad_Presentacion(String Cantidad_Presentacion) {
            this.Cantidad_Presentacion = Cantidad_Presentacion;
        }

        public int getPrecio_Menudeo() {
            return Precio_Menudeo;
        }

        public void setPrecio_Menudeo(int Precio_Menudeo) {
            this.Precio_Menudeo = Precio_Menudeo;
        }

        public int getPrecio_Conjunto() {
            return Precio_Conjunto;
        }

        public void setPrecio_Conjunto(int Precio_Conjunto) {
            this.Precio_Conjunto = Precio_Conjunto;
        }

        public int getUnidadesPorConjunto() {
            return unidadesPorConjunto;
        }

        public void setUnidadesPorConjunto(int unidadesPorConjunto) {
            this.unidadesPorConjunto = unidadesPorConjunto;
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

    public String getNombre_Proveedor() {
        return Nombre_Proveedor;
    }

    public void setNombre_Proveedor(String Nombre_Proveedor) {
        this.Nombre_Proveedor = Nombre_Proveedor;
    }
    }
