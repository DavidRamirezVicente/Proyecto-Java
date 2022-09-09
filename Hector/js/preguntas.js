document.getElementById("preguntas").addEventListener("submit", (e) => {
    e.preventDefault();
    const categoria = document.getElementById("categoria").value;
    console.log(categoria);
    const pregunta = document.getElementById("pregunta").value;
    console.log(pregunta);

    preguntas(categoria, pregunta);
  
  });
  
  function preguntas(categoria, pregunta) {
      const url = 'http://localhost:8080/questions';
      const params = {
          headers: {
              'Accept': "application/json, text/plain, */*",
              'Content-Type': "application/json;charset=utf-8"
          },
          body: JSON.stringify({
              "categoria": categoria,
              "pregunta": pregunta
          }),
          method: "POST"
      };
  
      alert(1);
  fetch(url, params)
      .then(data => { console.log('data', data)})
      .then(res => { console.log('res', res) })
      .catch(error => { console.log('error', error) });
   
  }
  