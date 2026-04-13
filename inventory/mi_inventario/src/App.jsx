import React, { useState } from 'react';
import Inventario from './Inventory';
import Vencimientos from './Vencidos';
import '../../../productslogydb/src/main/webapp/CSS/database_afterlog.css'
import logo_ventas from "../../../productslogydb/src/main/webapp/imgs/1impro.png"
import logo_inventory from "../../../productslogydb/src/main/webapp/imgs/2impro.png"
import logo_vencidos from "../../../productslogydb/src/main/webapp/imgs/3impro.png"
import logo_admin from "../../../productslogydb/src/main/webapp/imgs/4impro.png"


function App() {
  const [seccion, setSeccion] = useState('inventario');

  const productosIniciales = [
    { id: 1, nombre: "Acondicionador pantene 100ml", stock: 15, precio: 1200 },
    { id: 2, nombre: "Acondicionador Savital 120ml", stock: 0, precio: 25 },
    { id: 3, nombre: "Acondicionador Sedal 100ml", stock: 5, precio: 180 },
    { id: 4, nombre: "Ambientador Glade 250ml", stock: 8, precio: 75 },
    { id: 5, nombre: "Balde 3lts", stock: 15, precio: 1200 },
    { id: 6, nombre: "Blanqueador Blancox 1.5Lts", stock: 5, precio: 25 },
    { id: 7, nombre: "Blanqueador Blancox 3.5Lts", stock: 0, precio: 180 },
    { id: 8, nombre: "Bicarbonato de Sodio 135mg", stock: 0, precio: 180 },
    { id: 9, nombre: "Bicarbonato de Sodio 500mg", stock: 8, precio: 75 }
  ];

  return (
    <div className="container2">
      {/* BARRA LATERAL */}
      <aside className="menu_lateral">
        
          <button type="button" className="boton_menu" onClick={() => setSeccion('ventas')}>
            <img src={logo_ventas} alt="icono_ventas" style={{ width: '120px', height: '90px' }} />
            <span>Ventas</span>
          </button>

          <button type="button" className="boton_menuinv" onClick={() => setSeccion('inventario')}>
            <img src={logo_inventory} alt="icono_inventario" style={{ width: '90px', height: '90px' }} />
            <span>Inventario</span>
          </button>

          <button type="button" className="boton_menu" onClick={() => setSeccion('vencimientos')}>
            <img src={logo_vencidos} alt="img" style={{ width: '60px', height: '60px' }} />
            <span>Vencimientos<br />Devoluciones</span>
          </button>

          <button type="button" className="boton_menu">
            <img src={logo_admin} alt="img" style={{ width: '90px', height: '90px' }} />
            <span>Administración</span>
          </button>
       
      </aside>

      {/* ÁREA DE CONTENIDO DINÁMICO */}
      
        {seccion === 'inventario' && <Inventario productos={productosIniciales} />}
        {seccion === 'vencimientos' && <Vencimientos />}
        {seccion === 'ventas' && (
          <div style={{ color: 'black', padding: '20px' }}>
            <h2>Interfaz de Ventas</h2>
            <p>Próximamente disponible...</p>
          </div>
        )}
      
    </div>
  );
}

export default App;