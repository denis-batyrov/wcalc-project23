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
                        <label for="laba_info">Варианты створок:</label>
                        <select name="frameType" id="frameType" value="${frameType}">
                              <option value="s1">Одностворчатое</option>
                              <option value="s2" selected>Двухстворчатое</option>
                              <option value="s3">Трёхстворчатое</option>
                              <option value="s3" label="Двухстворчатое с фрамугой">Поворотно-откидная</option>
                              <option value="s4">Трёхстворчатое с фрамугой</option>
                        </select>
                        <br><br>

                        <label for="height">Высота:</label>
                        <input type="text" name="height" id="height" value="${height}">
                        <label for="height">мм<br><br></label>

                        <label for="width">Ширина:</label>
                        <input type="width" name="third" id="width" value="${width}">
                        <label for="width">мм<br><br></label>
                        
                        <label for="color">Цвет створок:</label>
                        <form>
                              <select name="frameColor" id="frameColor" value="${frameColor}">
                                    <option value="s1">Бесцветный</option>
                                    <option value="s2" selected>Цветной</option>
                              </select>
                        </form>
                        <br>

                        <label for="material">Материал створок:</label>
                        <select name="frameMaterial" id="frameMaterial" value="${frameMaterial}">
                              <option value="s1">ПВХ</option>
                              <option value="s2" selected>Дерево</option>
                              <option value="s3">Металл</option>
                        </select>

                        <br><br>
                        <label for="dgw">Стеклопакет:</label>
                        <select name="glassUnit" id="glassUnit" value="${glassUnit}">
                              <option value="s1">Двухкамерный</option>
                              <option value="s2" selected>Трёхкамерный</option>
                              <option value="s3">Поворотная</option>
                              <option value="s3" label="не знаю что написать">Поворотно-откидная</option>
                        </select>
                        <br><br>

                        <label for="accessories">Аксессуары:</label>
                        <select name="accessory" id="accessory" value="${accessory}">
                              <option value="s1">Подоконник</option>
                              <option value="s2" selected>Карниз</option>
                              <option value="s3">Подоконник и карниз</option>
                        </select>

                        <br><br>
                        <label for="mechanism">Механизм открывания:<br><br></label>
                        <label for="type1">Тип открытия 1 створки:</label>
                        <select name="type1" id="type1" value="${type1}">
                              <option value="s1">Глухая</option>
                              <option value="s2" selected>Откидная</option>
                              <option value="s3">Поворотная</option>
                              <option value="s3" label="не знаю что написать">Поворотно-откидная</option>
                        </select>

                        <br><br>
                        <label for="type2">Тип открытия 2 створки:</label>
                        <select name="type2" id="type2" value="${type2}">
                              <option value="s1">Глухая</option>
                              <option value="s2" selected>Откидная</option>
                              <option value="s3">Поворотная</option>
                              <option value="s3" label="не знаю что написать">Поворотно-откидная</option>
                        </select>

                        <br><br>
                        <label for="type3">Тип открытия 3 створки:</label>
                        <select name="type3" id="type3" value="${type3}">
                              <option value="s1">Глухая</option>
                              <option value="s2" selected>Откидная</option>
                              <option value="s3">Поворотная</option>
                              <option value="s3" label="не знаю что написать">Поворотно-откидная</option>
                        </select>
                        <br><br>

                        <label for="promocode">Промокод:</label>
                        <input type="text" name="promocode" id="promocode" value="${promocode}">

                        <br><br>

                        <input type="submit" name="sign" value="Расчёт стоимости">
                        <!--<input type="submit" name="sign" value="Об авторах">-->
                  </form>
                  <br>
                  <br>



                  <div id="footer">&copy; Выполнили студенты группы ПИ-223:</div>
                  <div id="footer">Батыров Д., Мингареев Р., Насыров А. и Погудина М.</div>
            </div>
</body>

</html>
