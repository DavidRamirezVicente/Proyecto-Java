
function sesion()
{
    function leerCookie(nombre) {
        var lista = document.cookie.split(";");
        for (i in lista) {
            var busca = lista[i].search(nombre);
            if (busca > -1) {micookie=lista[i]}
            }
        var igual = micookie.indexOf("=");
        var valor = micookie.substring(igual+1);
        return valor;
        }
       
    let value = leerCookie("login");
   
    console.log(value);

    if(value == "true"){
        document.getElementById('sesion_btn').innerHTML = 'Log out'
        document.getElementById('sesion_btn').setAttribute("onclick", "cerrar_sesion()");
    }else{
        
        document.getElementById('sesion_btn').innerText = 'Log in';
        document.getElementById('sesion_btn').setAttribute("href", "login.html");
    }
}
function cerrar_sesion(){
    document.cookie = "login=false";

    location.href="index.html";
    
}
 sesion();
