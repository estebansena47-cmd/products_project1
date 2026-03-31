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
        
                           //seccion del login//
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
        prod.setCantidad_Presentacion("2 lts");
        prod.setPrecio_Menudeo(5000);
        prod.setPrecio_Conjunto(50000);
        prod.setUnidadesPorConjunto(10);
        prod.setConjuntos((int)3);
        prod.setMenudeo_Restante(3);
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
        inv.setNombre_Producto("Aromatel");
        inv.setCantidad_Presentacion("1.5 lts");
        inv.setLote(435543);
        inv.setUnidadesPorConjunto(12);
        inv.setConjuntos(4);
        inv.setMenudeo_Restante(2);
        inv.setFecha_Vencimiento(LocalDate.of(2032,11,30));
        session.persist(inv);
        
            System.out.println("productos inventariados con exito");}
           else{
            inventarioExistente.setLote(99999);
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
        venta.setNombre_Producto ("limpiavidrios");
        venta.setCantidad_Vendida(3);
        venta.setPrecio_Menudeo(3300);
        venta.setPrecio_segun_cantidad(9900);
        venta.setPrecio_Total(9900);
       
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

         
        //seccion tabla surtido//
         
         try{
              t= session.beginTransaction();
            String surtidoEliminar = "67653422" ; //colocar codigo de barras del producto
            String surtidoConsulta = "949530" ;  //colocar codigo de barras del producto
            Surtidos surtidoExistente = session.createQuery ("FROM Surtidos WHERE Codigo_Barras = :buy", Surtidos.class)
                    .setParameter("buy", surtidoConsulta)
                    .uniqueResult();
            Surtidos surtidoBorrar = session.createQuery ("FROM Surtidos WHERE Codigo_Barras = :surtidoBorrar", Surtidos.class)
                    .setParameter("surtidoBorrar", surtidoEliminar)
                    .uniqueResult();
            
            if(surtidoBorrar != null){
        session.remove(surtidoBorrar);
        
            System.out.println("producto eliminado");}
           else{
            
                System.out.println("No se encontro ningun producto para eliminar");
            }
            
            if(surtidoExistente == null){
         Surtidos surt = new Surtidos();
        surt.setCodigo_Barras(surtidoConsulta);
        surt.setCantidad_inventario(2);
        surt.setNombre_Proveedor("Armando Casas");
        session.persist(surt);
        
            System.out.println("productos guardados con exito");}
           else{
            surtidoExistente.setCantidad_inventario(4);
            session.merge(surtidoExistente);
           
                System.out.println("Datos de surtido Actualizados");
            } 
            t.commit();   
        } catch (Exception e){
            if(t!= null&&t.isActive()){
        t.rollback();}
        e.printStackTrace();
        }

         
        //seccion tabla vencimientos//
        
        try{
              t= session.beginTransaction();
            String vencimientosEliminar = "76345678" ; //colocar codigo de barras del producto
            String vencimientosConsulta = "8765434567" ;  //colocar codigo de barras del producto
            Vencimientos vencimientosExistente = session.createQuery ("FROM Vencimientos WHERE Codigo_Barras = :vencido", Vencimientos.class)
                    .setParameter("vencido", vencimientosConsulta)
                    .uniqueResult();
            Vencimientos vencimientosBorrar = session.createQuery ("FROM Vencimientos WHERE Codigo_Barras = :vencimientosBorrar", Vencimientos.class)
                    .setParameter("vencimientosBorrar", vencimientosEliminar)
                    .uniqueResult();
            
            if(vencimientosBorrar != null){
        session.remove(vencimientosBorrar);
        
            System.out.println("vencimientos eliminado");}
           else{
            
                System.out.println("No se encontro ninguna vencimientos para eliminar");
            }
            
            if(vencimientosExistente == null){
         Vencimientos venci = new Vencimientos();
        venci.setCodigo_Barras(vencimientosConsulta);
        venci.setNombre_Producto("Alcohol"); 
        venci.setCantidad_Presentacion("300 ml");
        venci.setLote(435543);
        venci.setCantidad_inventario(7);
        venci.setFecha_Vencimiento(LocalDate.of(2022,11,30));	
        session.persist(venci);
       
            System.out.println("vencimientos guardada con exito");}
           else{
            vencimientosExistente.setLote(222222);
            session.merge(vencimientosExistente);
            
                System.out.println("Datos de vencimientos Actualizados");
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
    
}
