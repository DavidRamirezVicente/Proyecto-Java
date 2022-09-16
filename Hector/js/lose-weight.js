document.getElementById("preguntas").addEventListener("submit", (e) => {
    e.preventDefault();

    const question = document.getElementById("question").value;
    console.log(question);
    const iduser = document.getElementById("iduser").value;
    console.log(iduser);
    pregunta( question, iduser);
  });
  
  function pregunta( question, iduser) {
    
  
    alert(1);
  fetch('http://localhost:8080/questions/add',{
    method:"POST",
    headers: {
      'Accept': "application/json, text/plain, */*",
      'Content-Type': "application/json;charset=utf-8"
  },
  body: JSON.stringify(
    {
    "category": 'lose-weight',
    "question": question,
    "iduser": iduser
  }
  )
  })
  .then(res => res.json())
  .then(data => console.log(data))
  
  }
  
    
  
  