<!DOCTYPE html>
<html>
<head>
<title> COOKIE EXAMPLE </title>
</head>
<body>
<?php
echo "<h3>WELCOME</h3>";
if(isset($_COOKIE['lastvisit']))
    echo "<h3>HI $_COOKIE[username]! WELCOME BACK!<br> YOU LAST VISITED ON $_COOKIE[lastvisit]</h3>";
else {
    setcookie('username','User',time()+30*24*60*60);
    setcookie('lastvisit',date('M, D, Y, h:m a'),time()+30*24*60*60);
}
?>
</body>
</html>