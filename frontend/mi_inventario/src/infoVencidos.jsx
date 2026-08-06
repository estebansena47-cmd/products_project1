import React from 'react'
import '../../../backend/productslogydb/src/main/webapp/CSS/database_afterlog.css'
import logo_x  from "../../../backend/productslogydb/src/main/webapp/imgs/botonx.PNG"
import {useEffect, useState} from "react";
//import { useParams } from 'react-router-dom';

function infoVencidos(props) {
  
  const [detalles, setDetalles] = useState([]); 
  useEffect(() => {
  const obtenerDetalles = () => {
    fetch(`http://localhost:2000/productos/infoVencidos/${props.codigo}`)
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
<h2 className='tituloProductos'> {detalles[0].Nombre_Producto} </h2>

      <table className= "vencido_y_venta_table">
        <thead className="headTabla" >
          
             <th style={{padding: '10px 30px'}}>Codigo de Barras</th>
             <th style={{padding: '10px 30px'}}>lote</th>
             <th style={{padding: '10px 30px'}}>Fecha de Vencimiento</th>
             <th style={{padding: '10px 30px'}}>stock</th> 
             </thead>
        <tbody> 
          {detalles.map((produ,index) => (
            
            <tr key={index} className="filaDetallesTabla">
            
            <td style={{padding: '10px 30px'}}>{produ.Codigo_Barras}</td>
            <td style={{padding: '10px 30px'}}>{produ.lote}</td>
            <td style={{padding: '10px 30px'}}>{produ.Fecha_Vencimiento ? produ.Fecha_Vencimiento.split('T')[0]:''}</td>
            <td style={{padding: '10px 30px'}}>{produ.stockXLote}</td>
            
            </tr>
          ))}
        </tbody> 
      </table> 
    </div> 
    )};
    </div> 
  );
}
export default infoVencidos;