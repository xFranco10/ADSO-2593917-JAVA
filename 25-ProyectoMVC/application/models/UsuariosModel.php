<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class UsuariosModel extends CI_Model {

	public $table = 'usuarios';
	public $table_id = 'personas_id';

	public function __construct()
	{
        $this->load->database();
	}

	public function validarIngreso($email, $password){
		$this->db->select('cedula, email, tipo');
		$this->db->where('email', $email);
		$this->db->where('password', md5($password) );
		$this->db->where('estado', 'ACTIVO');
		$registros = $this->db->get('usuarios')->result();

		if (sizeof($registros)==0) {
			return false;
		}else{
			return true;
		}
	}

	public function getUsuarioByEmail($email){
		$this->db->select("cedula, tipo, estado");
		$this->db->where('email', $email);
		$registros = $this->db->get('usuarios')->result();

		if (sizeof($registros)!=0) {
			return $registros[0];
		}else{
			return null;
		}
	}

	public function insert($usuarios){
		$this->db->insert($this->table, $usuarios);
        return $this->db->insert_id();
	}



}
