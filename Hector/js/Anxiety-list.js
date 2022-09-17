async function listquestions() {
  const response = await fetch(
    "http://localhost:8080/questions/category/Anxiety"
  );
  const data = await response.json();
  return data;
}

listquestions().then((data) => {
  console.log(data);
  let body = "";

  for (var i = 0; i < data.length; i++) {
    body += `
            <div class="body">
                <div class="authors">
                    <div class="username"><a href="">${data[i].iduser}</a></div>
                    <img src="Img/983980.png">
                    </div>
                    <div class="content">
                    ${data[i].question}                   
                </div>
                
            </div>
           
            
              `;
   

      //console.log(movies); // fetched movies
  
  }

  document.getElementById("data").innerHTML = body;

  //console.log(movies); // fetched movies
});
var formulario= document.getElementById("FormularioRespuesta")

formulario.addEventListener('submit', function(){
    var TituloRespuesta = document.getElementById("addrespuesta").value;
    if (TituloRespuesta.length >= 1) {
        //setItem
        localStorage.setItem(TituloRespuesta, TituloRespuesta);
        
    } 
});
var ul = document.getElementById("listasRespuestas")
for (var i in localStorage) {

    if (typeof localStorage[i] == "string") {
        var li = document.createElement("li")
        li.append(localStorage[i])
        ul.append(li)
    }
    
}