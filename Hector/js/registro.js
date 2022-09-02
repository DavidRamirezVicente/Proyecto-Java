document.getElementById("formulario").addEventListener("submit", (e) => {
    e.preventDefault();
    const email = document.getElementById("email").value;
    console.log(email);
    const nombre = document.getElementById("nombre").value;
    console.log(nombre);
    const password = document.getElementById("password").value;
    console.log(password);
    registro(email, nombre, password);
  
  });
  
  function registro(email, nombre, password) {
      const url = 'http://localhost:8080/all';
      const params = {
          headers: {
              'Accept': "application/json, text/plain, */*",
              'Content-Type': "application/json;charset=utf-8"
          },
          body: JSON.stringify({
              "nombre": nombre,
              "email": email,
              "password": password
          }),
          method: "POST"
      };
  
      alert(1);
  fetch(url, params)
      .then(data => { console.log('data', data)})
      .then(res => { console.log('res', res) })
      .catch(error => { console.log('error', error) });
   
  }
  