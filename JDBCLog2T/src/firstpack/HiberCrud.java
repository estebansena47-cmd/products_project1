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
        Usuario user= new Usuario();
        user.setNombre_Usuario("Andres");
        user.setNumero_Telefonico("00000000000");
        user.setCorreo_Electronico("losPrimos@gmail.com");
        user.setContraseña("andrew3573");
        
        session.persist(user);
        t.commit();
            System.out.println("usuario guardado con exito");
        } catch (Exception e){
        t.rollback();
        e.printStackTrace();
        } finally{
        session.close ();
        }
    }
    
}
