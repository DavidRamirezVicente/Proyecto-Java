document.getElementById("formulario").addEventListener("submit", (e) => {
    e.preventDefault();
    const Email = document.getElementById("Email").value;
    console.log(Email);
    const UserName = document.getElementById("UserName").value;
    console.log(UserName);
    const Passwd = document.getElementById("Passwd").value;
    console.log(Passwd);
    registro(Email, UserName, Passwd);
  
  });
  
  function registro(Email, UserName, Passwd) {
      const url = 'http://localhost:8080/users';
      const params = {
          headers: {
              'Accept': "application/json, text/plain, */*",
              'Content-Type': "application/json;charset=utf-8"
          },
          body: JSON.stringify({
              "UserName": UserName,
              "Email": Email,
              "Passwd": Passwd
          }),
          method: "POST"
      };
  
      alert(1);
  fetch(url, params)
      .then(data => { console.log('data', data)})
      .then(res => { console.log('res', res) })
      .catch(error => { console.log('error', error) });
   
  }
  