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
            String correoEliminar = "paco2@gmail.com" ;
            String correoConsulta = "zury723@gmail.com" ;
            Usuario usuarioExistente = session.createQuery ("FROM Usuario WHERE Correo_Electronico = :email", Usuario.class)
                    .setParameter("email", correoConsulta)
                    .uniqueResult();
            Usuario usuarioBorrar = session.createQuery ("FROM Usuario WHERE Correo_Electronico = :emailBorra", Usuario.class)
                    .setParameter("emailBorra", correoEliminar)
                    .uniqueResult();
            if(usuarioExistente == null){
        Usuario user= new Usuario();
        user.setNombre_Usuario("Zury");
        user.setNumero_Telefonico("00000000000");
        user.setCorreo_Electronico(correoConsulta);
        user.setContraseña("zurys4r41");
        
        session.persist(user);
        t.commit();
            System.out.println("usuario guardado con exito");}
           else{
            usuarioExistente.setNumero_Telefonico("3139078393");
            session.merge(usuarioExistente);
            t.commit();
                System.out.println("Datos Actualizados");
            }
            
             if(usuarioBorrar != null){
        session.remove(usuarioBorrar);
        t.commit();
            System.out.println("usuario eliminado");}
           else{
            
                System.out.println("No se encontro ningun usuario con ese correo");
            }
        } catch (Exception e){
        t.rollback();
        e.printStackTrace();
        } finally{
        session.close ();
        }
    }
    
}
