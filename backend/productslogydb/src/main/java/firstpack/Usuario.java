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
/**
 *
 * @author ONE
 */
@Entity
@Table (name="usuarios")

public class Usuario {
    @Id 
    @Column (name="codigo")
    private int codigo;
    @Column (name="Nombre_Usuario")
     private String Nombre_Usuario;
    @Column (name="Numero_Telefonico")
private String Numero_Telefonico;
    @Column (name="Correo_Electronico")
private String Correo_Electronico;
    @Column (name="Clave")
private String contrasena;
    

public Usuario (){
 }

    public Usuario(String Nombre_Usuario, String Numero_Telefonico, String Correo_Electronico, String Clave) {
        this.Nombre_Usuario = Nombre_Usuario;
        this.Numero_Telefonico = Numero_Telefonico;
        this.Correo_Electronico = Correo_Electronico;
        this.contrasena = Clave;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre_Usuario() {
        return Nombre_Usuario;
    }

    @Override
    public String toString() {
        return "Usuario{" + "codigo=" + codigo + ", Nombre_Usuario=" + Nombre_Usuario + ", Numero_Telefonico=" + Numero_Telefonico + ", Correo_Electronico=" + Correo_Electronico + ", Clave=" + contrasena + '}';
    }

    public void setNombre_Usuario(String Nombre_Usuario) {
        this.Nombre_Usuario = Nombre_Usuario;
    }

    public String getNumero_Telefonico() {
        return Numero_Telefonico;
    }

    public void setNumero_Telefonico(String Numero_Telefonico) {
        this.Numero_Telefonico = Numero_Telefonico;
    }

    public String getCorreo_Electronico() {
        return Correo_Electronico;
    }

    public void setCorreo_Electronico(String Correo_Electronico) {
        this.Correo_Electronico = Correo_Electronico;
    }

    public String getClave() {
        return contrasena;
    }

    public void setClave(String Clave) {
        this.contrasena = Clave;
    }

    


 
}
