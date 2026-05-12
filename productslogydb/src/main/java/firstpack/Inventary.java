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
   @Column (name="Unidades_Por_Conjunto")
     public int Unidades_Por_Conjunto;
   @Column (name="Conjuntos")
     public int Conjuntos;
    @Column (name="Menudeo_Restante")
     public int Menudeo_Restante;   
    
public Inventary() {
    }

 public Inventary(String Codigo_Barras, int Unidades_Por_Conjunto, int Conjuntos, int Menudeo_Restante) {
        this.Codigo_Barras = Codigo_Barras;
        this.Unidades_Por_Conjunto = Unidades_Por_Conjunto;
        this.Conjuntos = Conjuntos;
        this.Menudeo_Restante = Menudeo_Restante;
        
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
        return "Inventary{" + "Slot=" + Slot + " Codigo_Barras=" + Codigo_Barras + ", Unidades_Por_Conjunto=" + Unidades_Por_Conjunto + ", Conjuntos=" + Conjuntos + ", Menudeo_Restante=" + Menudeo_Restante + '}';
    }

    public void setCodigo_Barras(String Codigo_Barras) {
        this.Codigo_Barras = Codigo_Barras;
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
}
