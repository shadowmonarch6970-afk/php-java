<!DOCTYPE html>
<html>
<body>
    <h2>Enter the limit for printing Fibonacci Series</h2>
    <form action="" method="post">
        <input type="text" name="number" />
        <input type="submit" value="Submit Query" />
    </form>

    <?php 
    if ($_SERVER['REQUEST_METHOD'] === 'POST') {
        $number = isset($_POST['number']) ? (int)$_POST['number'] : 0;

        if ($number < 0) {
            echo "<p>Please enter a non-negative number.</p>";
        } else {
            $f1 = 0;
            $f2 = 1;

            echo "<p>Fibonacci series up to $number:</p>";
            echo "<p>$f1";

            if ($number >= 1) {
                echo " , $f2";
            }

            $f3 = $f1 + $f2;
            while ($f3 <= $number) {
                echo " , $f3";
                $f1 = $f2;
                $f2 = $f3;
                $f3 = $f1 + $f2;
            }

            echo "</p>";
        }
    }
    ?>
</body>
</html>
