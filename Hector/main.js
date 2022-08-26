var mysql  = require('mysql');
var bodyParser = require('body-parser');
 // Crear análisis de codificación application /
var urlencodedParser = bodyParser.urlencoded({ extended: false })
const express = require('express');
const path = require('path');
const app = express();
var cnt = 0;
 //**** Configuración de la base de datos ***** /
var connection = mysql.createConnection({
    host     : 'localhost',
    user     : 'root',
    password : 'xxx',
    port: '3306',
    database: 'foro',
    useConnectionPooling:true
});
 var addSql = 'INSERT INTO table1 (autor, titulo, mensaje, fecha, respuestas) VALUES (?,?,?,?,?)';
var addSqlParams=new Array(5);
 // **** Visualización de la página web ***** /
app.use(express.static(path.join(__dirname, 'public')));
 // **** procesamiento de datos de envío web **** /
app.post('/posttable', urlencodedParser, function (req, res) {
    addSqlParams[0] = req.body.autor;
    addSqlParams[1] = req.body.titulo;
    addSqlParams[2] = req.body.mensaje;
    addSqlParams[3] = req.body.fecha;
    addSqlParams[4] = req.body.respuestas;
 
         // *** Conectividad de base de datos *** /
//    connection.connect();
        // Insertar datos 
   connection.query(addSql,addSqlParams,function (err, result) {
        if(err){
            console.log('[INSERT ERROR] - ',err.message);
        }
    });
   cnt = cnt + 1;
    console.log('insert success!');
    res.end('success');
});
app.listen(8000, () => {
    console.log('server listening at port 8000')
});