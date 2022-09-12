document.getElementById("formulario").addEventListener("submit", (e) => {
  e.preventDefault();
  const Email = document.getElementById("Email").value;
  console.log(Email);
  const Username = document.getElementById("Username").value;
  console.log(Username);
  const Pass = document.getElementById("Pass").value;
  console.log(Pass);
  registro(Email, Username, Pass);
});

function registro(Email, Username, Pass) {
  

  alert(1);
fetch('http://localhost:8080/users/add',{
  method:"POST",
  headers: {
    'Accept': "application/json, text/plain, */*",
    'Content-Type': "application/json;charset=utf-8"
},
body: JSON.stringify(
  {
  "email": Email,
  "username": Username,
  "pass": Pass
}
)
})
.then(res => res.json())
.then(data => console.log(data))

}

  

