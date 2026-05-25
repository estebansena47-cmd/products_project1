import React, { useState } from 'react';
import Inventario from './Inventory';
import Vencimientos from './Vencidos';
import InfoProduct from './infoProduct';
import InfoVencidos from './infoVencidos';
import '../../../productslogydb/src/main/webapp/CSS/database_afterlog.css'
import logo_ventas from "../../../productslogydb/src/main/webapp/imgs/1impro.png"
import logo_inventory from "../../../productslogydb/src/main/webapp/imgs/2impro.png"
import logo_vencidos from "../../../productslogydb/src/main/webapp/imgs/3impro.png"
import logo_admin from "../../../productslogydb/src/main/webapp/imgs/4impro.png"
import avatar from "../../../productslogydb/src/main/webapp/imgs/avatar_ini.PNG"
import campanita from "../../../productslogydb/src/main/webapp/imgs/1e.png"

function App() {
  const [seccion, setSeccion] = useState('inicio');
  const [codigoelecto, setcodigoelecto] = useState(null);
  const navegarHacia= nuevaSeccion => {setSeccion(nuevaSeccion);
  setcodigoelecto(null);
};
const colorPulsado = (pulso)=>{
  if (seccion===pulso){
    return  '#658EE7';}
    return '#6DAFF9';
};
 
  return (
    <div className="container2">
      {/* BARRA LATERAL */}
      <aside className="menu_lateral">
        
          <button type="button" className="boton_menu" onClick={() => navegarHacia('ventas')} style={{backgroundColor: colorPulsado('ventas') }}>
            <img src={logo_ventas} alt="icono_ventas" style={{ width: '120px', height: '90px' }} />
            <span>Ventas</span>
          </button>

          <button type="button" className="boton_menu" onClick={() => navegarHacia('inventario')} style={{backgroundColor: colorPulsado('inventario') }}>
            <img src={logo_inventory} alt="icono_inventario" style={{ width: '90px', height: '90px' }} />
            <span>Inventario</span>
          </button>

          <button type="button" className="boton_menu" onClick={() => navegarHacia('vencimientos')} style={{backgroundColor: colorPulsado('vencimientos') }}>
            <img src={logo_vencidos} alt="img" style={{ width: '60px', height: '60px' }} />
            <span>Vencimientos<br />Devoluciones</span>
          </button>

          <button type="button" className="boton_menu"onClick={() => navegarHacia('admin')}style={{backgroundColor: colorPulsado('admin') }}>
            <img src={logo_admin} alt="img" style={{ width: '90px', height: '90px' }} />
            <span>Administración</span>
          </button> 
          </aside>
         
         {/* Header */}
          <div className="subfondo_i1">
  
      

      {/* ÁREA DE CONTENIDO DINÁMICO */}

      {seccion === 'inicio' && (
      
  <aside className="subfondo_i2">
      <h1>Inicio</h1> 

      <div className="grupo-iconos">
      <button type="submit" className='boton_menu2'>
  <img src={campanita} alt="icono_bell"/> 
</button>
    

 <button type="submit" className='boton_menu2'>
  <img src={avatar} alt="icono_avatar" style={{width: '80px', height: '75px'}}/>
</button> </div> 
</aside>
)}
        {seccion === 'inventario' && (
          codigoelecto  === null ? (<Inventario verDetalle={(cod)=>setcodigoelecto(cod)}
          irInicio={()=>setSeccion('inicio')}/>

          ):( <InfoProduct codigo={codigoelecto}
          volver={()=> setcodigoelecto(null)} />
        )) }
        {seccion === 'vencimientos' && (
          codigoelecto  === null ? (<Vencimientos verDetalle={(cod)=>setcodigoelecto(cod)}
          irInicio={()=>setSeccion('inicio')}/>

          ):( <InfoVencidos codigo={codigoelecto}
          volver={()=> setcodigoelecto(null)} />
        )) }
        {seccion === 'ventas' && (
          <div style={{ color: 'black', padding: '20px' }}>
            <h2>Interfaz de Ventas</h2>
            <p>Próximamente disponible...</p>
            </div>
            )}
          {seccion === 'admin' && (
          <div style={{ color: 'black', padding: '20px' }}>
            <h2>Interfaz Administracion</h2>
            <p>Próximamente disponible...</p>
            </div> 
          
        )}
      </div>
    </div> 
    
  );
}

export default App;