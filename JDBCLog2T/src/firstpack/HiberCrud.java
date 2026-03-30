/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firstpack;

/**
 *
 * @author ONE
 */
import org.hibernate.Session;
import org.hibernate.Transaction;
public class HiberCrud {
    public static void main(String[] args) {
        Session session= HibernateUtil.getSessionFactory().openSession();
        Transaction t= session.beginTransaction();
        
        
        try{
            String correoEliminar = "paco@gmail.com" ;
            String correoConsulta = "zac@gmail.com" ;
            Usuario usuarioExistente = session.createQuery ("FROM Usuario WHERE Correo_Electronico = :email", Usuario.class)
                    .setParameter("email", correoConsulta)
                    .uniqueResult();
            Usuario usuarioBorrar = session.createQuery ("FROM Usuario WHERE Correo_Electronico = :emailBorra", Usuario.class)
                    .setParameter("emailBorra", correoEliminar)
                    .uniqueResult();
            
            if(usuarioBorrar != null){
        session.remove(usuarioBorrar);
        t.commit();
            System.out.println("usuario eliminado");}
           else{
            
                System.out.println("No se encontro ningun usuario para eliminar");
            }
            
            if(usuarioExistente == null){
        Usuario user= new Usuario();
        user.setNombre_Usuario("Zac");
        user.setNumero_Telefonico("00000000000");
        user.setCorreo_Electronico(correoConsulta);
        user.setContraseña("zac98765");
        
        session.persist(user);
        t.commit();
            System.out.println("usuario guardado con exito");}
           else{
            usuarioExistente.setNumero_Telefonico("999999");
            session.merge(usuarioExistente);
            t.commit();
                System.out.println("Datos Actualizados");
            }    
        } catch (Exception e){
            if(t!= null&&t.isActive()){
        t.rollback();}
        e.printStackTrace();
        } finally{
        session.close ();
        }
    }
    
}
