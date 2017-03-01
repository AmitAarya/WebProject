<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>

    <head>
        <title>*******GREETINGS!!!***********</title>
    </head>

    <body>
        <h3>********** Server Response ***********</h3>
        <p>   <h2>
            <%
             String name = request.getParameter("name");
            out.print(name);
             %>
        </h2>          
            </br>
            </br>
              Your are sucesfully Redistered:<br/><br/>     
            
        </p>

    </body>

