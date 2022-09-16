async function listquestions() {
    const response = await fetch('http://localhost:8080/questions/category/Anxiety');
    const data = await response.json();
    return data;
  }

  var variable1;
  listquestions().then(data => {
    console.log(data)
            let body = ""

            for (var i = 0; i < data.length; i++) { 
            
              
               body+=`
               <div class="body">
                <div class="authors">
                    <div class="username"><a href="">${data[i].iduser}</a></div>
                    <img src="Img/983980.png">
                    </div>
                <div class="content">
                ${data[i].question}
                   
                    <br>
                   
                    <br>
                    <div class="comment">
                        <button onclick="showComment()">Comment</button>
                    </div>
                </div>
                
            </div>
           
            <div class="comment-area hide" id="comment-area">
            <textarea name="comment" id="" placeholder="comment here ... "></textarea>
            <input type="submit" value="submit">
        </div>
            
              `
             
            }
           
            document.getElementById('data').innerHTML = body
            
    
    //console.log(movies); // fetched movies
  });

       
  