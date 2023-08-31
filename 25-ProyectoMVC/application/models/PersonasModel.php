<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class PersonasModel extends CI_Model {

	public $table = 'personas';
	public $table_id = 'personas_id';

	public function __construct()
	{
        $this->load->database();
	}

	public function getPersonaByEmail($email){
		$this->db->where('email', $email);
		$registros = $this->db->get('personas')->result();

		if (sizeof($registros)!=0) {
			return $registros[0];
		}else{
			return null;
		}
	}

	public function insert($data2){
		$this->db->insert($this->table, $data2);
        return $this->db->insert_id();
	}
	

}
