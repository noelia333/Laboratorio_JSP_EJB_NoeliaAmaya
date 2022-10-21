<%-- 
    Document   : calcJsp
    Created on : 24/09/2022, 06:10:51 PM
    Author     : Noelia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><center>Laboratorio JSP-EJB</center>
            <br>
            <form name="entrada" action="./CalcServlet" method="POST">
                <center>valor 1: <input type="text" name="val1" /></center>
                <center>valor 2: <input type="text" name="val2" /></center>
                <center><input type="submit" value="SUMAR" name="action"/></center>
                <center><input type="submit" value="RESTAR" name="action" /></center>
                <center><input type="submit" value="MULTIPLICAR" name="action" /></center>
                <center><input type="submit" value="DIVIDIR" name="action"/></center>
                <center><input type="submit" value="MODULO" name="action" /></center>
                <center><input type="submit" value="ELEVAR AL CUADRADO VAL1" name="action" /></center>
                <center><input type="submit" value="ELEVAR AL CUADRADO VAL2" name="action"  /></center>            
            </form> 
        </h1>
    </body>
</html>
