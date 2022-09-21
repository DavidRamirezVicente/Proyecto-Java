console.log(threads);
        var container = document.querySelector('ol');
        for (let thread of threads) {
            var html = `
            
                <a href="/Depresion.html?${thread.id}">
                
                    <h4 class="title">
                    Como combatir la depresion?
                    </h4>
                   
                </a>
                <div class="bottom">
                <p class="timestamp">
                    ${new Date(thread.date).toLocaleString()}
                </p>
                
            </div>
            
            `
            container.insertAdjacentHTML('beforeend', html);
        }