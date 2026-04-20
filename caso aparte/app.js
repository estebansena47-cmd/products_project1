 require('dotenv').config();
  const express =require('express');
  const app = express();
  const mongoose = require('mongoose');
  const bodyParser = require('body-parser');


  //endpoints
  app.use(bodyParser.json());
const postRuta= require('./routes/post');
 app.use('/posts', postRuta);
const userRuta = require('./routes/user');
app.use('/users',userRuta);

  app.get('/',(req,res)=> { 
    res.send('prueba del servidor');
  });
  mongoose.connect(process.env.MONGO_URI)
  .then(()=> console.log("Conexion Establecida"))
  .catch(err=> console.log("Conexion Fallida",err)
  );
const PORT = process.env.PORT || 3000;
app.listen(PORT,()=>{
    console.log(`Servidor en http://localhost:${PORT}`); 
});
