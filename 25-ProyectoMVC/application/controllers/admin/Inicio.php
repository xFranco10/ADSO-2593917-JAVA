<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class Inicio extends CI_Controller {
	
	public function __construct(){
		parent::__construct();
		$this->load->helper('form'); // Carga la librería de formularios
		$this->load->model('PersonasModel');
		$this->load->model('UsuariosModel');
		$this->load->database();
		
		$validacion = $this->session->has_userdata("session-mvc");
		if ($validacion) {
			$session = $this->session->userdata("session-mvc");
			if ($session['tipo']=="ADMIN" && $session['estado']=="ACTIVO") {
				return false;
			}else{
				redirect('Login/cerrarSession','refresh');
				die();
			}
		}else{
			redirect('Login/cerrarSession','refresh');
		}
	}

	public function index(){
		$data['session'] = $this->session->userdata("session-mvc");
		$this->load->view('admin/inicio', $data);
	}

	public function openCreateUser(){
		$data['session'] = $this->session->userdata("session-mvc");
		$this->load->view('admin/crearUsuario', $data);

		if ($this->input->server("REQUEST_METHOD") == "POST"){
            
            $data2["cedula"] = $this->input->post("cedula");
            $data2["nombres"] = $this->input->post("nombres");
            $data2["apellidos"] = $this->input->post("apellidos");
            $data2["telefono"] = $this->input->post("telefono");
            $data2["direccion"] = $this->input->post("direccion");
            $data2["email"] = $this->input->post("email");
			$data2["foto"] = $this->input->post("foto");

			$usuarios["cedula"] = $this->input->post("cedula");
			$usuarios["email"] = $this->input->post("email");
			$usuarios["password"] = $this->input->post("password");
			$usuarios["tipo"] = $this->input->post("tipo");
			$usuarios["estado"] = $this->input->post("estado");

			

			$this->PersonasModel->insert($data2);
			$this->UsuariosModel->insert($usuarios);
		}

	}

	public function listUsers(){
		$data['session'] = $this->session->userdata("session-mvc");
		$this->load->view('admin/verUsuarios', $data);
	}

}

/* End of file Inicio.php */
/* Location: ./application/controllers/admin/Inicio.php */