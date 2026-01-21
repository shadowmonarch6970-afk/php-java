<!DOCTYPE html>
<html>
<head>
    <title>Reverse Of String</title>
</head>
<body>
    <h2>String Reverse</h2>
    <form method="POST" action="">
        Enter The String: <input type="text" name="str" required />
        <input type="submit" value="Reverse" name="submit" />
    </form>

<?php
if (isset($_POST['submit'])) {
    $string = $_POST['str'];
    $len = strlen($string);
    echo "<p>Reverse of <strong>$string</strong> is <strong>";
    for ($i = $len - 1; $i >= 0; $i--) {
        echo htmlspecialchars($string[$i]);
    }
    echo "</strong></p>";
}
?>
</body>
</html>

