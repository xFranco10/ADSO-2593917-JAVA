<?php
    include "Conexion.php";

    if ( !empty($_POST["id_usuario"]) || !empty($_GET["id_usuario"])  ) {
        
        $id_usuario = (!empty($_POST["id_usuario"])) ? $_POST["id_usuario"] : $_GET["id_usuario"] ;

        $consulta = $base_de_datos->prepare("SELECT * FROM cuestionarios WHERE id_usuario = :id_usu");
        $consulta->bindParam(":id_usu", $id_usuario);
        $consulta->execute();

        $datos = $consulta->fetchAll(PDO::FETCH_ASSOC);
        $datos = mb_convert_encoding($datos, "UTF-8", "iso-8859-1");


        if ($datos) {
            
            $resumen['resumen'] = $datos;
            echo json_encode($resumen);
            
        }else{
            $respuesta =    [
                                "status" => false,
                                "message" => "CUESTIONARIO##NOT##FOUND"
                            ];
                            $resumen['resumen'] = $respuesta;
                            echo json_encode($resumen);
        }
    }else{

        $respuesta =    [
                            "status" => false,
                            "message" => "ERROR##DATA"
                        ];
                        $resumen['resumen'] = $respuesta;
                        echo json_encode($resumen);
    }


?>