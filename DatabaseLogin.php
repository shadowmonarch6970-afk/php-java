<html>
<head>
<title>PHP DB Login</title>
</head>
<body>
<form action="" method="POST">
Username:<input type="text" name="id"><br><br>
Password:<input type="password" name="PASS"><br><br>
<input type="submit" value="login">
</form>

<?php

error_reporting(E_ALL);
ini_set('display_errors', 1);

if($_POST)
{
    $user = $_POST['id'];
    $pwd = $_POST['PASS'];
    $con = pg_connect("host=localhost dbname=student_db port=5432 user=student_user1 password=student_password");
    echo "Connection Status:";
    if($con)
        echo "OK";
    else
        echo "FAILED";

    $qry = "select id, pass from login where id='$user' and pass='$pwd'";
    $result = pg_query($con, $qry);
    $nos = pg_num_rows($result);
    echo "<br>Login status:";
    if($nos)
        echo "success";
    else
        echo "failed";
}
?>
</body>
</html>
