document.getElementById("login").addEventListener("submit", (e) => {
  e.preventDefault();
  const email = document.getElementById("email").value;
  // console.log(email);
  const pass = document.getElementById("pass").value;
  // console.log(password);
  login(email, pass);
});

// session_start();
//         $_SESSION["email"] = email;
//         document.cookie = "loging=" + true;
async function login(email, pass){
      // var email = 'hectorgomez2312@gmail.com';
      // var password = 'root';
      // encode to scape spaces
      const esc = encodeURIComponent;
      const url = 'http://localhost:8080/users/login?';
      const params = { 
          "email": email,
          "pass": pass
      };
      // this line takes the params object and builds the query string
      const query = Object.keys(params).map(k => `${esc(k)}=${esc(params[k])}`).join('&')
      const res = await fetch(url+query, {
        method: 'GET',
        // mode: 'cors',
        headers: {
           'Accept': 'application/json'
        }});
      const LoginUser = await res.json();
      console.log(LoginUser);
      if (LoginUser==true) {
        document.cookie = "login=true";
        //document.cookie = "login=" + email;
        let x = document.cookie;
        console.log(x);
        location.href="../index.html";
        alert("Conectado correctamente");
      } else {
        alert("Datos erroneos");
        console.log("Incorrecto");
      }
}


 


