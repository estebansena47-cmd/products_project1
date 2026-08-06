import React from 'react'
import '../../../backend/productslogydb/src/main/webapp/CSS/database_afterlog.css'
import logo_finalizar from "../../../backend/productslogydb/src/main/webapp/imgs/finalizar.jpg"
import {useEffect, useState} from "react";

function Ventas({verDetalle}) 

{
  const [inputCodigo, setinputCodigo] = useState("");
  const [codigoExistente, setcodigoExistente]= useState(null);
  const [detalles, setDetalles] = useState([]); 
   useEffect(() => {

    if (!codigoExistente) return;
   const obtenerDetalles = () => {
     fetch(`http://localhost:2000/productos/infoProduct/${codigoExistente}`)
     .then((res) =>res.json())
     .then((data)=>{
       
       setDetalles(Array.isArray(data) ? data:[data]);
     })
 
     .catch((err)=>console.error("Error:", err));
 };
 obtenerDetalles();
 setcodigoExistente(null);
 }, [codigoExistente]);
  
 const handleKeyDown =(e) => {
  if (e.key==='Enter'){
    e.preventDefault();
    console.log("presionaste enter. CODIGO:", inputCodigo);
    if (inputCodigo.trim() !==""){
      setcodigoExistente(inputCodigo);
    }
  }
 };
 const produ = detalles[0] || {};

  return (
<div className="subfondo_transparente">  
   <div className="headerinvency"style={{gap: '30px'}}>
        <div  className="filaDetalles" style={{background:'red', fontSize:'20px'}} >  

        <label htmlFor="imputCoDBarra"> Código de Barras: </label>
        <input type="text" className="input_barsCode" id="imputCoDBarra" 
        value={inputCodigo} onChange={(e) => setinputCodigo(e.target.value)} 
        onKeyDown={handleKeyDown}/>
        <p>Nombre: <span>{produ.Nombre_Producto}</span></p>
        <label htmlFor="imputCantidad"> Cantidad: </label>
        <input type="text" className="input_cantidad" id="imputCantidad" />
         <p>Precio Conjunto: <span>{produ.Precio_Conjunto}</span>  </p>
          <p>Precio Menudeo: <span>{produ.Precio_Menudeo} </span></p>
         {produ.Unidades_Por_Conjunto &&(
          <p> Este producto fue registrado de <span>{produ.Unidades_Por_Conjunto}</span> unidades por conjunto </p>
         )}
         </div>
         
         <div  className="sellsHeaders" style={{background:'green'}} >
           <div  className="filaDetalles" style={{background:'yellow'}} >
             <p>Conjunto: <span>{produ.Conjuntos}</span></p> 
             <p> Menudeo: <span>{produ.Menudeo_Restante}</span> </p>
             </div>
             <button type="button" className="boton_finalizar" /*</div>onClick={() => navegarHacia('???')}*/>
            <img src={logo_finalizar} alt="icono_finalizar" style={{ width: '86%', height: '76%' }} />
            <span>Finalizar</span>
          </button>  
             </div> 
         </div>
         <div className="detalles_vendiendo">
          <table className= "vencido_y_venta_table">
        <thead className="headTabla" style={{ color:'black', fontSize:'12px' }}>
          <tr>
             <th style={{padding: '10px 20px'}}>Codigo de Barras</th>
             <th style={{padding: '10px 20px'}}>Nombre</th>
             <th style={{padding: '10px 20px'}}>Precio Unitario</th>
             <th style={{padding: '10px 20px'}}> Cantidad</th> 
             <th style={{padding: '10px 20px'}}> Precio Segun Cantidad</th> 
             </tr>
             </thead>
        <tbody> 
          {detalles.map((produ,index) => (
            
            <tr key={index} className="filaDetallesTabla">
            
            <td style={{padding: '10px 20px'}}>{produ.Codigo_Barras}</td>
            <td style={{padding: '10px 20px'}}>{produ.Nombre_Producto}</td>
            <td style={{padding: '10px 20px'}}>{produ.Precio_Menudeo}</td>
            <td style={{padding: '10px 20px'}}>{produ.Nombre_Producto}</td>
            <td style={{padding: '10px 20px'}}>{produ.Nombre_Producto}</td>
            </tr>
          ))}
        </tbody> 
      </table>
          </div> 
        </div>
    
  );
}
export default Ventas;