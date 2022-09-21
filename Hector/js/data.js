
var defaultThreads = [
    {
        id: 1,
        title: "Como combatir la depresion?",
        author: "Hector",
        date: Date.now(),
        content: "Thread content",
        comments: [
            {
                author: "Hector",
                date: Date.now(),
                content: "Mejor habla con alguna persona"
            }
        ]
    }
    
]

var threads = defaultThreads
if (localStorage && localStorage.getItem('threads')) {
    threads = JSON.parse(localStorage.getItem('threads'));
} else {
    threads = defaultThreads;
    localStorage.setItem('threads', JSON.stringify(defaultThreads));
}