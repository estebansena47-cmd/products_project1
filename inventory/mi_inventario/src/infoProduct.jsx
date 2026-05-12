import React from 'react'
import '../../../productslogydb/src/main/webapp/CSS/database_afterlog.css'
import logo_x  from "../../../productslogydb/src/main/webapp/imgs/botonx.PNG"

import {useEffect, useState} from "react";
import { useParams } from 'react-router-dom';

function InfoProduct(props) {
  
  const [detalles, setDetalles] = useState([]); 
  useEffect(() => {
  const obtenerDetalles = () => {
    fetch(`http://localhost:2000/productos/infoProduct/${props.codigo}`)
    .then((res) =>res.json())
    .then((data)=>{
      
      setDetalles(data);
    })

    .catch((err)=>console.error("Error:", err));
};
obtenerDetalles();
},[props.codigo]);


  return (
    <div className="subfondo_transparente">  
    {detalles.length > 0 && (         
    
       <div className="subfondoDetalles">
       <div className="headerDetalles">    
    <button onClick={props.volver} className="boton_cerrar">    
    <img src={logo_x}  alt="cerrar"  style={{width: '35px', height: '35px'}}/>
</button>
</div>
<aside className="menu_lateral">
 <table>
        <tbody> 
        {detalles.map((produ,index) => (
  <tr key={index} className="filaDetalles">
 <span className='tituloProducto'>{produ.Nombre_Producto}</span>
 <br /> <br /> <br />
 <p>Unidades Por Conjunto: {produ.Unidades_Por_Conjunto}</p>
 <br />
 <p>Conjuntos: {produ.Conjuntos}</p>
 <br />
 <p>Menudeo Restante: {produ.Menudeo_Restante} </p>
 <br />
 <p>Precio_Menudeo: {produ.Precio_Menudeo}</p>
 <br />
 <p>Precio_Conjunto: {produ.Precio_Conjunto}</p> 
            
            </tr>
        ))}  
        </tbody> 
    </table></aside>
    </div> 
  )}  
 </div>
);
}
export default InfoProduct;