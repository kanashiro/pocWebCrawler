<%-- 
    Document   : index
    Created on : 28/09/2014, 22:11:19
    Author     : WillianKanashiro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
     
        <title>JSP Page</title>
    </head>
    <body>
        <h1 id="texto">Hello World!</h1>
        <form method="get" action="/buscarProduto">
            <input type="text" name="produto"/>
            <input type="submit" value="pegarProduto" />
        </form>
    </body>
</html>
