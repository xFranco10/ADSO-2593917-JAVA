<?php 
	header("Access-Control-Allow-Origin: * "); // Permite el acceso desde cualquier origen, o usa "http://localhost" si solo quieres permitirlo desde localhost.
	header("Access-Control-Allow-Methods: GET, POST");
	header("Access-Control-Allow-Headers: Content-Type");
    include 'Conexion.php';

    if ( (!empty($_POST["id"])) || (!empty($_GET["id"])) )  {

        $id_pregunta = (!empty($_POST["id"])) ? $_POST["id"] : $_GET["id"] ;
    
        $consulta_pregunta = $base_de_datos->prepare("SELECT *
                                                        FROM preguntas 
                                                        WHERE id = :id_pregun");
        $consulta_pregunta->bindParam(':id_pregun', $id_pregunta);
        $consulta_pregunta->execute();
        $pregunta = $consulta_pregunta->fetch(PDO::FETCH_ASSOC);
                
        if($pregunta){
            $opciones = $base_de_datos->prepare("SELECT * FROM opciones WHERE id_pregunta = :id_pregun" );
            $opciones->bindParam(':id_pregun', $id_pregunta);
            $opciones->execute();
            $opcion = $opciones->fetchAll(PDO::FETCH_ASSOC);

            $respuesta = [
                'pregunta' => $pregunta,
                'opciones' => $opcion
            ];
        }
            
        echo json_encode($respuesta);
            
    }else{
        $respuesta = [
            'status' => false,
            'mesagge' => "ERROR##DATOS##GET",
            '$_GET' => $_GET,
            '$_POST' => $_POST
        ];
        echo json_encode($respuesta);
    }



    
        
     
	
?>