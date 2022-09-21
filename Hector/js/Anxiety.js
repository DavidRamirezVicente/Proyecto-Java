document.getElementById("preguntas").addEventListener("submit", (e) => {
    e.preventDefault();
    const question = document.getElementById("question").value;
    console.log(question);

    pregunta( question);
  });
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
    async function listuser(user) {
      const response = await fetch(
        "http://localhost:8080/users/user/"+user
      );
      const data = await response.json();
      return data;
    }
   
let user = leerCookie("user");

listuser(user).then((data) => {
 
  document.cookie="id="+data.iduser;
  

  //console.log(movies); // fetched movies
});
  function pregunta( question) {
    let id = leerCookie("id");
  console.log(id);
    alert(1);
  fetch('http://localhost:8080/questions/add',{
    method:"POST",
    headers: {
      'Accept': "application/json, text/plain, */*",
      'Content-Type': "application/json;charset=utf-8"
  },
  body: JSON.stringify(
    {
    "category": 'Anxiety',
    "question": question,
    "iduser": id
  }
  )
  })
  .then(res => res.json())
  .then(data => console.log(data))
  
  }
  
    
  
  