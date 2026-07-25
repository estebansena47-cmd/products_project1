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
import java.time.LocalDate;
public class HiberCrud {
    public static void main(String[] args) {
        Session session= HibernateUtil.getSessionFactory().openSession();
        Transaction t= session.beginTransaction();
        
                           //seccion de registro//
        try{
            String correoEliminar = "PAU235@gmail.com" ;
            String correoConsulta = "zac@gmail.com" ;
            Usuario usuarioExistente = session.createQuery ("FROM Usuario WHERE Correo_Electronico = :correoReg", Usuario.class)
                    .setParameter("correoReg", correoConsulta)
                    .uniqueResult();
            Usuario usuarioBorrar = session.createQuery ("FROM Usuario WHERE Correo_Electronico = :emailBorra", Usuario.class)
                    .setParameter("emailBorra", correoEliminar)
                    .uniqueResult();
            
            if(usuarioBorrar != null){
        session.remove(usuarioBorrar);
        
            System.out.println("usuario eliminado");}
           else{
            
                System.out.println("No se encontro ningun usuario para eliminar");
            }
            
            if(usuarioExistente == null){
        Usuario user= new Usuario();
        user.setNombre_Usuario("Zac");
        user.setNumero_Telefonico("00000000000");
        user.setCorreo_Electronico(correoConsulta);
         user.setClave("zac98765");
        
        session.persist(user);
        
            System.out.println("usuario guardado con exito");}
           else{
            usuarioExistente.setNumero_Telefonico("999999");
            session.merge(usuarioExistente);
            
                System.out.println("Datos Actualizados");
            } 
            t.commit();   
        } catch (Exception e){
            if(t!= null&&t.isActive()){
        t.rollback();}
        e.printStackTrace();
        } 
        
        //seccion tabla productos//
        try
        {
             t= session.beginTransaction();
            String productoEliminar = "345678909876" ; //colocar codigo de barras del producto
            String productoConsulta = "234567890876" ;  //colocar codigo de barras del producto
            Productos productoExistente = session.createQuery ("FROM Productos WHERE Codigo_Barras = :product", Productos.class)
                    .setParameter("product", productoConsulta)
                    .uniqueResult();
            Productos productoBorrar = session.createQuery ("FROM Productos WHERE Codigo_Barras = :productBorra", Productos.class)
                    .setParameter("productBorra", productoEliminar)
                    .uniqueResult();
            
            if(productoBorrar != null){
        session.remove(productoBorrar);
        
            System.out.println("producto eliminado");}
           else{
            
                System.out.println("No se encontro ningun producto para eliminar");
            }
            
            if(productoExistente == null){
         Productos prod= new Productos();
        prod.setCodigo_Barras(productoConsulta);
        prod.setNombre_Producto("blanqueador");
        prod.setLote(33333);
        prod.setFecha_Vencimiento(LocalDate.of(2032,11,30));
        prod.setPrecio_Menudeo(5000);
        prod.setPrecio_Conjunto(50000);
        prod.setNombre_Proveedor("Zoila Espinosa");
        session.persist(prod);
       
            System.out.println("productos guardado con exito");}
           else{
            productoExistente.setNombre_Producto("Clorox");
            session.merge(productoExistente);
            
                System.out.println("Datos de producto Actualizados");
            } 
            t.commit();   
        } catch (Exception e){
            if(t!= null&&t.isActive()){
        t.rollback();}
        e.printStackTrace();
        }
        
        
        //seccion tabla proveedores//
        
         try{
             t= session.beginTransaction();
            String proveedorIDEliminar = "Albert" ;
            String proveedorConsulta = "Batman Rodriguez" ; //colocar nombre de proveedor
            Proveedores proveedorExistente = session.createQuery ("FROM Proveedores WHERE Nombre_Proveedor = :prove", Proveedores.class)
                    .setParameter("prove", proveedorConsulta)
                    .uniqueResult();
            Proveedores proveBorrar = session.createQuery ("FROM Proveedores WHERE Nombre_Proveedor = :proveBorrar", Proveedores.class)
                    .setParameter("proveBorrar", proveedorIDEliminar)
                    .uniqueResult();
            
            if(proveBorrar != null){
        session.remove(proveBorrar);
        
            System.out.println("proveedor eliminado");}
           else{
            
                System.out.println("No se encontro ningun proveedor para eliminar");
            }
            
            if(proveedorExistente == null){
         Proveedores prov= new Proveedores();
        prov.setNombre_Proveedor(proveedorConsulta);
        session.persist(prov);
        
            System.out.println("proveedor guardado con exito");}
           else{
            proveedorExistente.setNombre_Proveedor("Aithor Menta");
            session.merge(proveedorExistente);
            
                System.out.println("Datos de proveedor Actualizados");
            }
            t.commit(); 
        } catch (Exception e){
            if(t!= null&&t.isActive()){
        t.rollback();}
        e.printStackTrace();
        }
        
        //seccion tabla inventario//
         
         try{
              t= session.beginTransaction();
            String inventarioEliminar = "89767564534" ; //colocar codigo de barras del producto
            String inventarioConsulta = "4565467485" ;  //colocar codigo de barras del producto
            Inventary inventarioExistente = session.createQuery ("FROM Inventary WHERE Codigo_Barras = :inve", Inventary.class)
                    .setParameter("inve", inventarioConsulta)
                    .uniqueResult();
            Inventary inventarioBorrar = session.createQuery ("FROM Inventary  WHERE Codigo_Barras = :inveBorra", Inventary.class)
                    .setParameter("inveBorra", inventarioEliminar)
                    .uniqueResult();
            
            if(inventarioBorrar != null){
        session.remove(inventarioBorrar);
       
            System.out.println("inventario eliminado");}
           else{
            
                System.out.println("No se encontro ningun inventario para eliminar");
            }
            
            if(inventarioExistente == null){
         Inventary inv= new Inventary();
        inv.setCodigo_Barras(inventarioConsulta);
        inv.setUnidadesPorConjunto(12);
        inv.setConjuntos(4);
        inv.setMenudeo_Restante(2);
        
        session.persist(inv);
        
            System.out.println("productos inventariados con exito");}
           else{
            inventarioExistente.setUnidadesPorConjunto(10);
            session.merge(inventarioExistente);
            
                System.out.println("Datos de inventario Actualizados");
            }  
            t.commit();  
        } catch (Exception e){
            if(t!= null&&t.isActive()){
        t.rollback();}
        e.printStackTrace();
        }

         
        //seccion tabla venta//
         
         try{
              t= session.beginTransaction();
            int ventaEliminar = 3; //colocar id de la venta
            int ventaConsulta = 1;  //colocar id de la venta
            Ventas ventaExistente = session.createQuery ("FROM Ventas WHERE id_venta = :sell", Ventas.class)
                    .setParameter("sell", ventaConsulta)
                    .uniqueResult();
            Ventas ventaBorrar = session.createQuery ("FROM Ventas WHERE id_venta = :ventaBorrar", Ventas.class)
                    .setParameter("ventaBorrar", ventaEliminar)
                    .uniqueResult();
            
            if(ventaBorrar != null){
        session.remove(ventaBorrar);
       
            System.out.println("venta eliminada");}
           else{
            
                System.out.println("No se encontro ninguna venta para eliminar");
            }
            
            if(ventaExistente == null){
         Ventas venta= new Ventas();
        venta.setCodigo_Barras("111111");  			
        venta.setCantidad_Vendida(3);
        venta.setPrecio_Menudeo(3300);
        venta.setPrecio_segun_cantidad(9900);
        venta.setPrecio_Total(9900);
        venta.setFecha_Venta(LocalDate.of(2026,05,30));
        session.persist(venta);

        
            System.out.println("venta guardada con exito");}
           else{
            ventaExistente.setCantidad_Vendida(55);
            session.merge(ventaExistente);
            
                System.out.println("Datos de venta Actualizados");
            }   
            t.commit(); 
        } catch (Exception e){
            if(t!= null&&t.isActive()){
        t.rollback();}
        e.printStackTrace();
        }
 
        finally{
            if (session != null) session.close();
        }
    }
   // VALIDACION (CON SERVLET Y POSTMAN) 
    public boolean ValidarDatos(String usuario, String Clave) {
    Session session=null;
        System.out.println("DEBUG:LOG de USUARIO[" +usuario+ "]Y CLAVE[" +Clave+ "]");
    try{
        session=HibernateUtil.getSessionFactory().openSession();
        String consultacion = "FROM Usuario WHERE Nombre_Usuario = :user AND contrasena=:pass";
        Usuario resultado= (Usuario)session.createQuery(consultacion,Usuario.class)
                .setParameter("user",usuario)
                .setParameter("pass",Clave)
                .uniqueResult();
        return resultado!= null;
                
    }catch(Exception e){
        e.printStackTrace();
        return false;
      }  finally{
            if (session != null) session.close();
        }
        
    }
    
}
