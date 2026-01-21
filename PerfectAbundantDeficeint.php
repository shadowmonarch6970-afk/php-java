<html>
<head>
<title>Find perfect number</title>
</head>
<body>
ENTER A NUMBER
<form method="post">
<input type="text" name="number"/>
<button type="submit">Check</button>
</form>
</body>
</html>

<?php
if($_POST)
{
    $num = $_POST['number'];
    $i = 1;
    $sum = 0;
    while($i < $num)
    {
        if($num % $i == 0)
        {
            $sum = $sum + $i;
        }
        $i++;
    }
    if($num == $sum)
    {
        echo "The number is Perfect Number!";
    }
    else if($num < $sum)
    {
        echo "The number is Abundant Number!";
    }
    else
    {
        echo "The number is Deficient Number!";
    }
}
?>