import express from 'express';
import mysql from 'mysql2';
import cors from 'cors';

const app = express();
app.use(cors());
app.use(express.json());


const db = mysql.createConnection({
    host: 'localhost',
    port: 3307,
    user: 'root',      
    password: '',      
    database: 'loggeo' 
});

db.connect(err => {
    if (err) throw err;
    console.log('Conectado a la base de datos MySQL');
});


app.get('/productos', (req, res) => {
    const query = `SELECT 
    p.Codigo_Barras, 
    p.Nombre_Producto,
    SUM((i.Unidades_Por_Conjunto * IFNULL(i.Conjuntos, 0)) +
    IFNULL(i.Menudeo_Restante, 0)) AS stock
    FROM producto p
    JOIN inventario i ON p.Codigo_Barras= i.Codigo_Barras
    GROUP BY p.Codigo_Barras, p.Nombre_Producto`; 
    
    db.query(query, (err, results) => {
        if (err) return res.status(500).send(err);
        res.json(results);
    });
});
//interfaz de detalles
app.get('/productos/infoProduct/:codigo', (req, res) => {
    const codigo= req.params.codigo;
    const cachar=  `SELECT 
                p.id_Producto,
                p.Lote,
                p.Codigo_Barras, 
                p.Nombre_Producto,
                i.Unidades_Por_Conjunto,
                i.Conjuntos,
                i.Menudeo_Restante,
                p.Precio_Menudeo,
                p.Precio_Conjunto
                 
    FROM producto p
    JOIN inventario i ON p.Codigo_Barras= i.Codigo_Barras
    WHERE p.Codigo_Barras= ?`;
    db.query(cachar,[codigo], (err, data) => {
        if (err) return res.status(500).send(err);
        res.json(data);
    });
});

const PORT= 2000;

app.listen(PORT, () => {
    console.log(`Servidor corriendo en http://localhost:${PORT}`);
});