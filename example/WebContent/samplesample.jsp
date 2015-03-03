<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>お問い合わせフォーム</title>
</head>
<body>
<form action="/example/Ex2" method="post">  <!-- testenq -->

名前:<br>
<input type="text" name="name"><br>
<br>
<br>
<br>
問い合わせ:<br>
<select id="qtype" name="qtype">
<option value=""></option>
<option value="company">会社について</option>
<option value="product">製品について</option>
<option value="support">アフターサポートについて</option>
</select>
<br>
<br>
<textarea name="body" cols=40 rows=4>
</textarea>
<br>
<input type="submit" value="登録">
</form>
</body>
</html>



