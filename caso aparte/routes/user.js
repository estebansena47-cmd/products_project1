const express = require('express');
const router = express.Router();
const User= require('../models/User');
const bcrypt = require ('bcryptjs');

router.post ('/register',async(req,res)=>{
    try{
        const salt= await bcrypt.genSalt(10);
        const hashedPassword= await bcrypt.hash(req.body.password, salt);
    
    const usuario= new User({
       username: req.body.username,
        password: hashedPassword
    });
        const savedUser= await usuario.save();
        res.json(savedUser);
    } catch(error){
        console.log( error)
        res.status(500).json({error: error.message});
    }

});
router.post ('/login',async(req,res)=>{
    if (!req.body){ return res.status(400).json({error:'no recibio info del cuerpo de peticion'});
    }
    try{
        const user= await User.findOne({username: req.body.username});
        if (!user) return res.status(400).json({error:'datos ingresados incorrectamente'});
        const verfificlave= await bcrypt.compare(req.body.password, user.password);
            if (!verfificlave) return res.status(400).json({error:'datos ingresados incorrectamente'});
    
    
        res.json({message: 'inicio de Seccion Exitoso'});
    } catch(error){
        res.status(500).json({error: error.message});
    }

});

module.exports = router;
