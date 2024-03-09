<?php 
    include 'Conexion.php';

    if (!empty($_POST['id_cuestionario']) || !empty($_POST['id_pregunta']) ) {

        $id_cuestionario = $_POST['id_cuestionario'];
        $id_pregunta = $_POST['id_pregunta'];
        $respuesta = $_POST['respuesta'];
        $estado = $_POST['estado'];
        $fecha = $_POST['fecha'];
        $cant_preguntas = $_POST['cant_preguntas'];
        $cant_ok = $_POST['cant_ok'];
        $cant_error = $_POST['cant_error'];

        try {
            $consulta = $base_de_datos->prepare("INSERT INTO respuestas (id_cuestionario, id_pregunta, respuesta, estado, fecha) VALUES(:id_cues, :id_pre, :res, :est, :fecha) ");
            $consulta->bindParam(':id_cues', $id_cuestionario);
            $consulta->bindParam(':id_pre', $id_pregunta);
            $consulta->bindParam(':res', $respuesta);
            $consulta->bindParam(':est', $estado);
            $consulta->bindParam(':fecha', $fecha);
            $proceso = $consulta->execute();

            $consulta_update_cuest = $base_de_datos->prepare("UPDATE cuestionarios SET cant_preguntas = :cant_pre, cant_ok = :cant_ok, cant_error = :cant_err WHERE id = :id_cues ");
            $consulta_update_cuest->bindParam(':id_cues', $id_cuestionario);
            $consulta_update_cuest->bindParam(':cant_pre', $cant_preguntas);
            $consulta_update_cuest->bindParam(':cant_ok', $cant_ok);
            $consulta_update_cuest->bindParam(':cant_err', $cant_error);
            $proceso2 = $consulta_update_cuest->execute();



            
            if( $proceso && $proceso2 ){ 

                $respuesta = [
                                'status' => true,
                                'mesagge' => "OK##RESPUESTAS##INSERT",
                                'message' => "OK##CUESTIONARIOS##UPDATE"
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
