import React from 'react'
import '../../../productslogydb/src/main/webapp/CSS/database_afterlog.css'
import logo_casa from "../../../productslogydb/src/main/webapp/imgs/casa_icon.png"
import logo_lupa from "../../../productslogydb/src/main/webapp/imgs/Lupa.png"
function App() {
  
  const productos = [
    { id: 1, nombre: "Acondicionador pantene  100ml", stock: 15, precio: 1200 },
    { id: 2, nombre: "Acondicionador Savital 120ml", stock: 0, precio: 25 },
    { id: 3, nombre: "Acondicionador Sedal 100ml", stock: 5, precio: 180 },
    { id: 4, nombre: "Ambientador Glade 250ml", stock: 8, precio: 75 },
    { id: 5, nombre: "Balde 3lts", stock: 15, precio: 1200 },
    { id: 6, nombre: "Blanqueador Blancox   1.5Lts", stock: 5, precio: 25 },
    { id: 7, nombre: "Blanqueador Blancox   3.5Lts", stock: 3, precio: 180 },
    { id: 8, nombre: "Bicarbonato de Sodio   135mg", stock: 0, precio: 180 },
    { id: 9, nombre: "Bicarbonato de Sodio   500mg", stock: 8, precio: 75 }
  ];
  
  return (
    <div className="container2">
         
     <div class="subfondo_transparente">
    <div class="headerinvency">
       <div class="invency_searcher">
       <img src={logo_lupa}  alt="img"  style={{width: '35px', height: '35px'}}/>
       </div>
    <button type="submit" button className="boton_inicio"> 
  <img src={logo_casa}  alt="img"  style={{width: '50px', height: '50px'}}/> 
  
</button>
</div>
      <table className= "inventory_table">
        <tbody> 
          {productos.map((prod) => (
            <tr key={prod.id} 
            className={prod.stock > 0 ? 'disponible':' expirado'}>
              <td>{prod.nombre}</td>
            </tr>
          ))}
        </tbody> 
      </table> 
    </div> 
    </div> 
  );
}
export default App;