const miForm= document.getElementById('miFormulario');
const recuperar= document.getElementById('formularioRecuperacion');
const registrar= document.getElementById('formularioRegistro');
const botonA= document.getElementById('boton1');
const botonRecup= document.getElementById('boton2');
const botonReg= document.getElementById('boton3');
const inputusuario =
document.getElementById('usuario');
const inputcontra=
document.getElementById('contraseña');
const botonback = 
document.getElementById('buttback');
const user_Recu =
document.getElementById('usuarioRec');
const correo_NumeroRecu =
document.getElementById('correo_o_numero');

const nombre_Apellido = 
document.getElementById('nombreReg');
const numero_Tel =
document.getElementById('numeroReg');
const correo_Registro =
document.getElementById('correoReg');
const usuario_Reg = 
document.getElementById('usuarioReg');
const clave_Reg =
document.getElementById('contraseñaReg');
const clave_Admin =
document.getElementById('contraseña_admReg');


if(botonA){
    
botonA.addEventListener('click',(e) => {
    e.preventDefault();
  const user= inputusuario.value;
 const contra= inputcontra.value; 

//if(user=== "beck" && contra==="there_egg") {
  document.getElementById('miFormulario').submit();  
/*}
else{
    alert("intenta de nuevo");
       }*/
   });
}

if (botonback) {

    botonback.addEventListener('click', () => {
     window.location.href="index.html";
    });
}

if(botonRecup){
    
botonRecup.addEventListener('click',(e) => {
    e.preventDefault();
  const userRecu= user_Recu.value;
 const correoONumeroRecu= correo_NumeroRecu.value; 
  document.getElementById('formularioRecuperacion').submit();
});
}

if(botonReg){
   botonRecup.addEventListener('click',(e) => {
    e.preventDefault();
  
const nombreApellido = nombre_Apellido.value;
const numeroTel =numero_Tel.value;
const correoRegistro =correo_Registro.value;
const usuarioReg = usuario_Reg.value;
const claveReg = clave_Reg.value;
const claveAdmin = clave_Admin.value;
document.getElementById('formularioRegistro').submit();
});
}