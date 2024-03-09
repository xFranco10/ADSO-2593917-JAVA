<?php 
    include 'Conexion.php';

    if (!empty($_POST['respuesta']) || !empty($_GET['respuesta'])) {

        $respuesta = $_POST['respuesta'];

        try {

            $consulta_id = $base_de_datos->prepare("SELECT id FROM opciones WHERE descripcion = :res");
            $consulta_id->bindParam(":res", $respuesta);
            $consulta_id->execute();
            $id = $consulta_id->fetch(PDO::FETCH_ASSOC);
            



            if( $consulta_id ){ 

                $respuesta = [
                                'status' => true,
                                'mesagge' => "##OK##",
                                'id_opcion' => $id
                              ];
                echo json_encode($respuesta);
            }else{
                $respuesta = [
                                'status' => false,
                                'mesagge' => "##ERROR##"
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
