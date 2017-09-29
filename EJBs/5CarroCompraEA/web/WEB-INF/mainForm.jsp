<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Formulario principal</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
</head>
<body>
   <form method="post">
       <div class="form-group">
            <p>Introduzca el nombre del elemento</p>
            <input type="text" class="form-control" placeholder="Nombre elemento" name="elementName">
            <p>Introduzca cantidad</p>
            <input type="number" class="form-control" placeholder="cantidad" name="amount">
            <input type="submit" class="form-control" value="Enviar">     
     
       </div>
      </form>
    <div>
        <br>
        ${elements}
    </div>
       
</body>
</html>