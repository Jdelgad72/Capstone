<?php

if ($_SERVER['REQUEST_METHOD'] == 'POST'){

    $name = $_POST['name'];
    $password = $_POST['password'];

    $password = password_hash($password, PASSWORD_DEFAULT);

    require_once 'connect.php';

    $sql = "INSERT INTO users_table (name, password) VALUES ('$name','$password')";

    if (mysql_query($conn, $sql)) {
        $result["success"] = "1";
        $result["message"] = "success";

        echo json_encode($result);
        mysqli_close($conn);
    } else {
        $result["success"] = "0";
        $result["message"] = "error";

        echo json_encode($result);
        mysqli_close($conn);
    }

}

?>