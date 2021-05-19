<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <title>Калькулятор стоимости производства оконных конструкций.
            Производственное помещение.
     </title>
 
   
  <style type="text/css">
   body {
    font: 10pt Arial, Helvetica, sans-serif; /* Шрифт на веб-странице */
     background: url(https://sun9-68.userapi.com/impg/gn0ZIzuPpRvftqOCSEtxlhaEUtwWeFjZ_Bd8BQ/uD3MaMo83Z8.jpg?size=400x400&quality=96&sign=a35baedee08fe8a6d5cd04889e74d272&type=album); /* Цвет фона */
background-position: center center;
    background-repeat: repeat;
margin: 0; /* Убираем отступы */

   }
   h2 {
    font-size: 1.1em; /* Размер шрифта */
    color: #752641; /* Цвет текста */
    margin-bottom: 0; /* Отступ снизу */
   }
   #container {
    width: 900px; /* Ширина макета */
    margin: 0 auto; /* Выравниваем по центру */
    position: relative; /* Относительное позиционирование */
   }
   #header {
    background: #808080; /* Цвет фона */
    font-size: 24pt; /* Размер текста */
    font-weight: bold; /* Жирное начертание */
    color: #FFFFFF; /* Цвет текста */
    padding: 5px; /* Отступы вокруг текста */
   }
   #content {
    margin-right: 200px; /* Отступ справа */
    padding: 10px; /* Поля вокруг текста */
    border-right: 1px dashed #183533; /* Линия справа */
color: #FFFFFF;
   }
   #content p {
    margin-top: 0.3em /* Отступ сверху */
   }
   #sidebar {
    position: absolute; /* Абсолютное позиционирование */
    right: 0; /* Положение от правого края */

    top: 80px; /* Положение от верхнего края */
    width: 190px; /* Ширина */
   }
   #footer {
    background: #808080; /* Цвет фона */
    color: #fff; /* Цвет текста */
    padding: 5px; /* Отступы вокруг текста */
   }
  </style>
 </head>
 <body>
  <div id="container">
   <div id="header">Калькулятор стоимости производства оконных конструкций.
            Производственное помещение.</div>
   <div id="content">
<h1>Результат вычислений</h1>
<h2>Ваши введеные данные:</h2>
<p><strong>Итоговая стоимость:</strong> ${result}</p>
<form action="${pageContext.request.contextPath}/Form.jsp">
    <input type="submit" name="sign" value="Назад">
<p>_</p>
    </form>

   <div id="footer">&copy; Выполнили студенты группы ПИ-223:</div>
   <div id="footer">Батыров Д., Мингареев Р., Насыров А. и Погудина М.</div>
  </div>
 </body>
