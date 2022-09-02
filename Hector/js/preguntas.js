fetch('http://localhost:8080/all')
.then(res => res.json())
.then(data => {

    // console.log(data);
    let str = '';
    data.map(item => {
        str += `
            

                <p>${item.preguntas}</p>
              
        `
    });

    document.getElementById('preguntas').innerHTML = str;


});