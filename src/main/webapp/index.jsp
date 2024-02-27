<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
  <head>
    <title>JSP - Hello World</title>
  </head>


  <body>
    <h1><%= "Hello World!" %></h1>
    <br/>

    <div class="task-block">
      <h2>Task 1</h2>
      <a href="citation" style="display: block;">Цитата</a>
    </div>



    <div class="task-block">
      <h2>Task 2</h2>

      <form action="MaxNumber" method="GET">
        <p>Введите числа для сравнения:</p>
        <input type="text" name="number1"><br><br>
        <input type="text" name="number2"><br><br>
        <input type="text" name="number3"><br><br>
        <input type="submit" value="Найти максимальное">
      </form>
    </div>



    <div class="task-block">
      <h2>Task 3</h2>

      <form action="MiddleMaxMin" method="GET">
        <div class="radio">
          <p>Выберите действие:</p>
          <div class="radio-item">
            <input type="radio" id="max" name="action" value="max" checked />
            <label for="max">Maximum</label>
          </div>
          <div class="radio-item">
            <input type="radio" id="min" name="action" value="min">
            <label for="min">Minimum</label>
          </div>
          <div class="radio-item">
            <input type="radio" id="middle" name="action" value="middle">
            <label for="middle">Middle</label>
          </div>
        </div>

        <div class="number">
          <p>Введите числа:</p>
          <input type="text" name="number1"><br><br>
          <input type="text" name="number2"><br><br>
          <input type="text" name="number3"><br><br>
        </div>

        <input type="submit" value="Выполнить">
      </form>
    </div>




  </body>


</html>