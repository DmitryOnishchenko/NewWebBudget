<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>REST example</title>
</head>

<script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<script type="text/javascript">
    var prefix = '/myservice';
    var userPrefix = '/user';

    var RestGet = function() {
        $.ajax({
            type: 'GET',
            url:  prefix + '/' + Date.now(),
            dataType: 'json',
            async: true,
            success: function(result) {
                alert('Время: ' + result.time
                        + ', сообщение: ' + result.message);
            },
            error: function(jqXHR, textStatus, errorThrown) {
                alert(jqXHR.status + ' ' + jqXHR.responseText);
            }
        });
    }

    var RestPut = function() {
        var JSONObject= {
            'time': Date.now(),
            'message': 'Это пример вызова PUT метода'
        };

        $.ajax({
            type: 'PUT',
            url:  prefix,
            contentType: 'application/json; charset=utf-8',
            data: JSON.stringify(JSONObject),
            dataType: 'json',
            async: true,
            success: function(result) {
                alert('Время: ' + result.time
                        + ', сообщенеи: ' + result.message);
            },
            error: function(jqXHR, textStatus, errorThrown) {
                alert(jqXHR.status + ' ' + jqXHR.responseText);
            }
        });
    }

    var RestPost = function() {
        $.ajax({
            type: 'POST',
            url:  prefix,
            dataType: 'json',
            async: true,
            success: function(result) {
                alert('Время: ' + result.time
                        + ', сообщение: ' + result.message);
            },
            error: function(jqXHR, textStatus, errorThrown) {
                alert(jqXHR.status + ' ' + jqXHR.responseText);
            }
        });
    }

    var RestDelete = function() {
        $.ajax({
            type: 'DELETE',
            url:  prefix + '/' + Date.now(),
            dataType: 'json',
            async: true,
            success: function(result) {
                alert('Время: ' + result.time
                        + ', сообщение: ' + result.message);
            },
            error: function(jqXHR, textStatus, errorThrown) {
                alert(jqXHR.status + ' ' + jqXHR.responseText);
            }
        });
    }

    var RestUserGet = function() {
            $.ajax({
                type: 'GET',
                url:  userPrefix,
                data: 'id=' + $('#input1').val(),
                 dataType: 'json',
                async: true,
                success: function(result) {
                    $('#result').html(
                        'id: ' + result.id + '<br>' +
                        'username: ' + result.username + '<br>' +
                        'email: ' + result.email + '<br>'
                    )
                },
                error: function(jqXHR, textStatus, errorThrown) {
                    alert(jqXHR.status + ' ' + jqXHR.responseText);
                }
            });
        }
</script>

<body>

    <h3>Это простой пример использования REST c помощью Ajax</h3>
    <input id="input1" type="text">
    <br>
    <button type="button" onclick="RestUserGet()">Метод GET</button>
    <button type="button" onclick="RestPost()">Метод POST</button>
    <button type="button" onclick="RestDelete()">Метод DELETE</button>
    <button type="button" onclick="RestPut()">Метод PUT</button>
    <br>

    <div id="result">
    </div>

</body>
</html>