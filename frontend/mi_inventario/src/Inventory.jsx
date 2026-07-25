import React from 'react'
import '../../../backend/productslogydb/src/main/webapp/CSS/database_afterlog.css'
import logo_casa from "../../../backend/productslogydb/src/main/webapp/imgs/casa_icon.png"
import logo_lupa from "../../../backend/productslogydb/src/main/webapp/imgs/Lupa.png"
import {useEffect, useState} from "react";
//import { RouterProviderProps } from 'react-router-dom';
function Inventario({verDetalle,irInicio}) {
  
  const [productos, setProductos] = useState([]);
   const [busqueda, setBusqueda]= useState(""); 
   useEffect(()=>{
    fetch("http://localhost:2000/productos")
    .then((res) =>res.json())
    .then((data)=>{
      console.log("¿que llego?", data);
      setProductos(data);
    })
    //.then((data)=> setProductos(data))
    .catch((err)=>console.error("Error:", err));},[]);
  
  const productosFiltrados=productos.filter((prod)=>{
    const digitado=busqueda.toLowerCase();
    const nombre= prod.Nombre_Producto?
    prod.Nombre_Producto.toLowerCase():"";
    const codigo= prod.Codigo_Barras?
    prod.Codigo_Barras.toString() : "";

    return nombre.includes(digitado) || codigo.includes(digitado);

  });

  return (
           
    <div className="subfondo_transparente">
    <div className="headerinvency">
       <div className="invency_searcher">
       <img src={logo_lupa}  alt="buscar"  style={{width: '35px', height: '35px'}}/>
       <input type= "text" placeholder= "Buscar Producto" className='input_buscador'
       value={busqueda} onChange={(e)=>setBusqueda(e.target.value)}/>
       </div>
    <button type="submit" className="boton_inicio" onClick={irInicio}> 
  <img src={logo_casa}  alt="inicio"  style={{width: '50px', height: '50px'}}/> 
</button>
</div>
{productosFiltrados.length===0 && (<p style={{textAlign:'center',color: 'gray'}}> No se encontro el producto. </p>)}
      <table className= "inventory_table">
        <tbody> 
          {productosFiltrados.map((prod) => (
            <tr key={prod.Codigo_Barras} 
            className={prod.stock > 0 ? 'disponible':' agotado'}>
              
              <td onClick={()=> verDetalle(prod.Codigo_Barras)} style={{cursor:'pointer'}}>
              {prod.Nombre_Producto}</td>
              
            </tr>
          ))}
        </tbody> 
      </table> 
    </div> 
   
  );
}
export default Inventario;