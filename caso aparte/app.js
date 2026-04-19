 require('dotenv').config();
  const express =require('express');
  const app = express();
  const mongoose = require('mongoose');
  //endpoints
  app.get('/',(req,res)=> { 
    res.send('prueba del servidor');
  });
  mongoose.connect(process.env.MONGO_URI)
  .then(()=> console.log("Conexion Establecida"))
  .catch(err=> console.log("Conexion Fallida",err)
  );
const PORT = process.env.PORT || 3000;
app.listen(PORT,()=>{
    console.log('Servidor en http://localhost:${PORT}'); 
});
