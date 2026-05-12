import React from 'react'
import '../../../productslogydb/src/main/webapp/CSS/database_afterlog.css'
import logo_x  from "../../../productslogydb/src/main/webapp/imgs/logo_x"

import {useEffect, useState} from "react";
function App() {
  
  const [productos, setProductos] = useState([]);
    
   useEffect(()=>{
    fetch("http://localhost:2000/productos/infoProduct")
    .then((res) =>res.json())
    .then((data)=>{
      console.log("¿que llego?", data);
      setProductos(data);
    })
    
    .catch((err)=>console.error("Error:", err));},[]);
  
  
  return (
    <div className="container2">
             
    <div className="subfondo_transparente">
       <div className="subfondoDetalles">
    
       
      
    <button type="submit" className="boton_cerrar">    
    <img src={logo_x}  alt="cerrar"  style={{width: '35px', height: '35px'}}/>
</button>
 </div>
      <table className= "vencimiento_table">
        <tbody> 
          {productos.map((prod) => (
            <tr key={prod.Codigo_Barras}>

              <td>{prod.lote}</td>
              <td>{prod.Fecha_Vencimiento}</td>
              <td>{stockXlote}</td>
            
            </tr>
          ))}
        </tbody> 
      </table> 
    </div> 
    </div> 
  );
}
export default App;