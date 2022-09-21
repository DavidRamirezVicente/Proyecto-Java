var id = window.location.search.slice(1);
        var thread = threads.find(t => t.id == id);
        var header = document.querySelector('.header');
        var headerHtml = `
            <h4 class="title">
                ${thread.title}
            </h4>
            <div class="bottom">
                <p class="timestamp">
                    ${new Date(thread.date).toLocaleString()}
                </p>
                <p class="comment-count">
                    ${thread.comments.length} comments
                </p>
            </div>
        `
        header.insertAdjacentHTML('beforeend', headerHtml)

        function addComment(comment) {
            var commentHtml = `
                <div class="comment">
                    <div class="top-comment">
                        <p class="user">
                            ${comment.author}
                        </p>
                        <p class="comment-ts">
                            ${new Date(comment.date).toLocaleString()}
                        </p>
                    </div>
                    <div class="comment-content">
                        ${comment.content}
                    </div>
                </div>
            `
            comments.insertAdjacentHTML('beforeend', commentHtml);
        }

        var comments = document.querySelector('.comments');
        for (let comment of thread.comments) {
            addComment(comment);
        }

        var btn = document.querySelector('button');
        
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
        console.log(leerCookie("user"));
        btn.addEventListener('click',  function () {
            
            var username=leerCookie("user");
            var txt = document.querySelector('textarea');
            
            console.log(username)
            var comment = {
                content: txt.value,
                date: Date.now(),
                author: username
            }
            addComment(comment);
            txt.value = '';
            thread.comments.push(comment);
            localStorage.setItem('threads', JSON.stringify(threads));
        })