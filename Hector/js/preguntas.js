document.getElementById("preguntas").addEventListener("submit", (e) => {
    e.preventDefault();
    const category = document.getElementById("category").value;
    console.log(category);
    const question = document.getElementById("question").value;
    console.log(question);
    const iduser = document.getElementById("iduser").value;
    console.log(iduser);
    pregunta(category, question, iduser);
  });
  
  function pregunta(category, question, iduser) {
    
  
    alert(1);
  fetch('http://localhost:8080/questions/add',{
    method:"POST",
    headers: {
      'Accept': "application/json, text/plain, */*",
      'Content-Type': "application/json;charset=utf-8"
  },
  body: JSON.stringify(
    {
    "category": category,
    "question": question,
    "iduser": iduser
  }
  )
  })
  .then(res => res.json())
  .then(data => console.log(data))
  
  }
  
    
  
  