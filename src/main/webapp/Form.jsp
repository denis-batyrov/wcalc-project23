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
                  font: 10pt Arial, Helvetica, sans-serif;
                  /* Шрифт на веб-странице */
                  background: url(https://sun9-68.userapi.com/impg/gn0ZIzuPpRvftqOCSEtxlhaEUtwWeFjZ_Bd8BQ/uD3MaMo83Z8.jpg?size=400x400&quality=96&sign=a35baedee08fe8a6d5cd04889e74d272&type=album);
                  /* Цвет фона */
                  background-position: center center;
                  background-repeat: repeat;
                  margin: 0;
                  /* Убираем отступы */
            }
            h2 {
                  font-size: 1.1em;
                  /* Размер шрифта */
                  color: #752641;
                  /* Цвет текста */
                  margin-bottom: 0;
                  /* Отступ снизу */
            }
            #container {
                  width: 900px;
                  /* Ширина макета */
                  margin: 0 auto;
                  /* Выравниваем по центру */
                  position: relative;
                  /* Относительное позиционирование */
            }
            #header {
                  /* Цвет фона */
                  font-size: 24pt;
                  /* Размер текста */
                  font-weight: bold;
                  /* Жирное начертание */
                  color: #FFFFFF;
                  /* Цвет текста */
                  padding: 5px;
                  /* Отступы вокруг текста */
            }
            #content {
                  margin-right: 200px;
                  /* Отступ справа */
                  padding: 10px;
                  /* Поля вокруг текста */
                  border-right: 1px dashed #183533;
                  /* Линия справа */
                  color: #FFFFFF;
            }
            #content p {
                  margin-top: 0.3em
                        /* Отступ сверху */
            }
            #sidebar {
                  position: absolute;
                  /* Абсолютное позиционирование */
                  right: 0;
                  /* Положение от правого края */
                  top: 80px;
                  /* Положение от верхнего края */
                  width: 190px;
                  /* Ширина */
            }
            #footer {
                  /* Цвет фона */
                  color: #fff;
                  /* Цвет текста */
                  padding: 5px;
                  /* Отступы вокруг текста */
            }
      </style>
</head>

<body>
      <div id="container">
            <div id="header">Калькулятор стоимости производства оконных конструкций.
                  Производственное помещение.
            </div>
            <div id="content">
                  <form action="${pageContext.request.contextPath}/JavaCalc" method="post">
                        <br>
                  </form>
                  <form action="${pageContext.request.contextPath}/JavaCalc" method="post">
                        <label for="frameType">Варианты створок:</label>
                        <select type="text" name="frameType" id="frameType" value="${frameType}">
                              <option value="Одностворчатое">Одностворчатое</option>
                              <option value="Двухстворчатое" selected>Двухстворчатое</option>
                              <option value="Трёхстворчатое">Трёхстворчатое</option>
                              <option value="Двухстворчатое с фрамугой">Поворотно-откидная</option>
                              <option value="Трёхстворчатое с фрамугой">Трёхстворчатое с фрамугой</option>
                        </select>
                        <br><br>

                        <label for="height">Высота:</label>
                        <input type="text" name="height" id="height" value="${height}">
                        <label for="height">мм<br><br></label>

                        <label for="width">Ширина:</label>
                        <input type="text" name="width" id="width" value="${width}">
                        <label for="width">мм<br><br></label>
                        
                        <label for="frameColor">Цвет створок:</label>
                              <select name="frameColor" id="frameColor" value="${frameColor}">
                                    <option value="Бесцветный">Бесцветный</option>
                                    <option value="Цветной" selected>Цветной</option>
                              </select>

                        <br>

                        <label for="frameMaterial">Материал створок:</label>
                        <select type="text" name="frameMaterial" id="frameMaterial" value="${frameMaterial}">
                              <option value="ПВХ">ПВХ</option>
                              <option value="Дерево" selected>Дерево</option>
                              <option value="Металл">Металл</option>
                        </select>

                        <br><br>
                        <label for="dgw">Стеклопакет:</label>
                        <select type="text" name="glassUnit" id="glassUnit" value="${glassUnit}">
                              <option value="Двухкамерный">Двухкамерный</option>
                              <option value="Трёхкамерный" selected>Трёхкамерный</option>
                              <option value="Поворотная">Поворотная</option>
                              <option value="Поворотно-откидная">Поворотно-откидная</option>
                        </select>
                        <br><br>

                        <label for="accessory">Аксессуары:</label>
                        <select type="text" name="accessory" id="accessory" value="${accessory}">
                              <option value="Подоконник">Подоконник</option>
                              <option value="Карниз" selected>Карниз</option>
                              <option value="Подоконник и карниз">Подоконник и карниз</option>
                        </select>

                        <br><br>
                        <label for="type1">Механизм открывания:<br><br></label>
                        <label for="type1">Тип открытия 1 створки:</label>
                        <select type="text" name="type1" id="type1" value="${type1}">
                              <option value="Глухая">Глухая</option>
                              <option value="Откидная" selected>Откидная</option>
                              <option value="Поворотная">Поворотная</option>
                              <option value="Поворотно-откидная">Поворотно-откидная</option>
                        </select>

                        <br><br>
                        <label for="type2">Тип открытия 2 створки:</label>
                        <select type="text" name="type2" id="type2" value="${type2}">
                            <option value="Глухая">Глухая</option>
                            <option value="Откидная" selected>Откидная</option>
                            <option value="Поворотная">Поворотная</option>
                            <option value="Поворотно-откидная">Поворотно-откидная</option>
                        </select>

                        <br><br>
                        <label for="type3">Тип открытия 3 створки:</label>
                        <select type="text" name="type3" id="type3" value="${type3}">
                            <option value="Глухая">Глухая</option>
                            <option value="Откидная" selected>Откидная</option>
                            <option value="Поворотная">Поворотная</option>
                            <option value="Поворотно-откидная">Поворотно-откидная</option>
                        </select>
                        <br><br>

                        <label for="promocode">Промокод:</label>
                        <input type="text" name="promocode" id="promocode" value="${promocode}">

                        <br><br>

                        <input type="submit" name="sign" value="Расчёт стоимости">
                  </form>
                  <br>
                  <br>



                  <div id="footer">&copy; Выполнили студенты группы ПИ-223:</div>
                  <div id="footer">Батыров Д., Мингареев Р., Насыров А. и Погудина М.</div>
            </div>
</body>

</html>
