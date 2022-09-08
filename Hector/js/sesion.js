
function sesion()
{
    let value = document.cookie;
    console.log(value);
    if(value == "login=true"){
        alert("Sesion Iniciada");
        document.getElementById('sesion_btn').innerHTML = 'Log out'
        document.getElementById('sesion_btn').setAttribute("onclick", "cerrar_sesion()");
    }else{
        
        document.getElementById('sesion_btn').innerText = 'Log in';
        document.getElementById('sesion_btn').setAttribute("href", "login.html");
    }
}
function cerrar_sesion(){
    document.cookie = "login=false";
    location.href="../index.html";
    
}
 sesion();
