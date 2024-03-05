<?php 
    include 'Conexion.php';

    if (!empty($_POST['id_usuario']) && !empty($_POST['fecha_inicio']) ) {

        $id_usuario = $_POST['id_usuario'];
        $cant_preguntas = 0;
        $cant_ok = 0;
        $cant_error = 0;
        $fecha_inicio = $_POST['fecha_inicio'];
        $fecha_fin = NULL;

        try {
            $consulta = $base_de_datos->prepare("INSERT INTO cuestionarios (id_usuario, cant_preguntas, cant_ok, cant_error, fecha_inicio, fecha_fin) VALUES(:id_usu, :cant_pre, :cant_ok, :cant_err, :fecha_ini, :fecha_fin) ");
            $consulta->bindParam(':id_usu', $id_usuario);
            $consulta->bindParam(':cant_pre', $cant_preguntas);
            $consulta->bindParam(':cant_ok', $cant_ok);
            $consulta->bindParam(':cant_err', $cant_error);
            $consulta->bindParam(':fecha_ini', $fecha_inicio);
            $consulta->bindParam(':fecha_fin', $fecha_fin);
            $proceso = $consulta->execute();

            $consulta_id_cuestionario = $base_de_datos->prepare("SELECT id FROM cuestionarios ORDER BY id DESC LIMIT 1");
            $consulta_id_cuestionario->execute();
            $id_cuestionario = $consulta_id_cuestionario->fetch(PDO::FETCH_ASSOC);

            if( $proceso ){ 

                $respuesta = [
                                'status' => true,
                                'mesagge' => "OK##CUESTIONARIO##INSERT",
                                'id_cuestionario' => $id_cuestionario

                              ];
                echo json_encode($respuesta);
            }else{
                $respuesta = [
                                'status' => false,
                                'mesagge' => "ERROR##CUESTIONARIO##INSERT"
                              ];
                echo json_encode($respuesta);
            }
        } catch (Exception $e) {
            $respuesta = [
                            'status' => false,
                            'mesagge' => "ERROR##SQL",
                            'exception' => $e
                          ];
            echo json_encode($respuesta);
        }
    }else{
        $respuesta = [
                        'status' => false,
                        'mesagge' => "ERROR##DATOS##POST"
                      ];
        echo json_encode($respuesta);
    }
?>
