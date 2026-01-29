<?php
$pdo = new PDO(
    "mysql:host=localhost;dbname=ejemplo;charset=utf8",
    "root",
    "111111"
);


if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $nombre = $_POST["nombre"];
    $edad = $_POST["edad"];

    if ($nombre && $edad > 0) {
        $stmt = $pdo->prepare(
            "INSERT INTO usuarios (nombre, edad) VALUES (?, ?)"
        );

    $stmt->execute([$nombre, $edad]);

    echo "Usuario guardado correctamente<hr>";
        }

    if (empty($nombre) || empty($edad)) {
        echo "Rellena todos los campos";
    }
    if ($edad >= 18) {
        echo "Eres mayor de edad";
    } else {
        echo "Eres menor de edad";
    }
    $nombre = htmlspecialchars($_POST["nombre"]);

    echo "<h2>Resultado</h2>";
    echo "Hola $nombre, tienes $edad años <br>";
    echo"hr";

}
?>

<h2>Formulario</h2>

<form method="post">
    Nombre: <br>
    <input type="text" name="nombre"><br><br>


    Edad:<br>
    <input type="number" name="edad"><br><br>

    <input type="submit" name="Enviar">
</form>