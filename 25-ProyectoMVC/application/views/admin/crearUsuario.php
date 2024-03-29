<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>AdminLTE 3 | Dashboard</title>

    <!-- Google Font: Source Sans Pro -->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="<?= base_url('plugins/fontawesome-free/css/all.min.css') ?>">
    <!-- Ionicons -->
    <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
    <!-- Tempusdominus Bootstrap 4 -->
    <link rel="stylesheet" href="<?= base_url('plugins/tempusdominus-bootstrap-4/css/tempusdominus-bootstrap-4.min.css') ?>">
    <!-- Theme style -->
    <link rel="stylesheet" href="<?= base_url('dist/css/adminlte.min.css') ?>">
    
  </head>
  <body class="hold-transition sidebar-mini layout-fixed">
    <div class="wrapper">

      <!-- Navbar -->
      <nav class="main-header navbar navbar-expand navbar-white navbar-light">
        <!-- Left navbar links -->
        <ul class="navbar-nav">
          <li class="nav-item">
            <a class="nav-link" data-widget="pushmenu" href="#" role="button"><i class="fas fa-bars"></i></a>
          </li>
        </ul>
      </nav>
      <!-- /.navbar -->

      <!-- Main Sidebar Container -->
      <aside class="main-sidebar sidebar-dark-primary elevation-4">
        <!-- Brand Logo -->
        <a href="index3.html" class="brand-link">
          <img src="<?= base_url('dist/img/AdminLTELogo.png') ?>" alt="AdminLTE Logo" class="brand-image img-circle elevation-3" style="opacity: .8">
          <span class="brand-text font-weight-light">Proyecto MVC</span>
        </a>

        <!-- Sidebar -->
        <div class="sidebar">
          <!-- Sidebar user panel (optional) -->
          <div class="user-panel mt-3 pb-3 mb-3 d-flex">
            <div class="image">
              <img src="<?= base_url('dist/img/users/'.$session['foto']) ?>" class="img-circle elevation-2" alt="User Image">
            </div>
            <div class="info">
              <a href="#" class="d-block"><?= explode(" ", $session['nombres'])[0]." ".explode(" ", $session['apellidos'])[0] ?></a>
            </div>
          </div>

          <!-- Sidebar Menu -->
          <nav class="mt-2">
            <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
              <li class="nav-header">MENU ADMIN</li>
              <li class="nav-item">
                <a href="<?= base_url('index.php/admin/Inicio/openCreateUser') ?>" class="nav-link">
                  <i class="nav-icon far fa-calendar-alt"></i>
                  <p>
                    Crear Usuario
                  </p>
                </a>
              </li>
              <li class="nav-item">
                <a href="<?= base_url('index.php/admin/Inicio/listUsers') ?>" class="nav-link">
                  <i class="nav-icon far fa-image"></i>
                  <p>
                    Ver Usuarios
                  </p>
                </a>
              </li>
              <li class="nav-item">
                <a href="<?= base_url('index.php/Login/cerrarSession') ?>" class="nav-link">
                  <i class="nav-icon fas fa-columns"></i>
                  <p>
                    Cerrar Sesion
                  </p>
                </a>
              </li>

            </ul>
          </nav>
          <!-- /.sidebar-menu -->
        </div>
        <!-- /.sidebar -->
      </aside>

      <!-- Content Wrapper. Contains page content -->
      <div class="content-wrapper">
        <div class="col-12 m-0 p-3">
          <?php echo form_open(''); ?>
          <h1 class="text-primary text-center">FORMULARIO PARA CREAR USUARIO</h1>

          <div class="form-group mb-2">
            <?php
            echo form_label('Cedula:');
            $data2 = [
                'name'      => 'cedula',
                'value'     => '',
                'class'     => 'form-control input-lg',
            ];
            echo form_input($data2);
            ?>
          </div>

          <div class="form-group mb-2">
            <?php
            echo form_label('Nombres:');
            $data2 = [
                'name'      => 'nombres',
                'value'     => '',
                'class'     => 'form-control input-lg',
            ];
            echo form_input($data2);
            ?>
          </div>

          <div class="form-group mb-2">
            <?php
            echo form_label('Apellidos:');
            $data2 = [
                'name'      => 'apellidos',
                'value'     => '',
                'class'     => 'form-control input-lg',
            ];
            echo form_input($data2);
            ?>
          </div>

          <div class="form-group mb-2">
            <?php
            echo form_label('Telefono:');
            $data2 = [
                'name'      => 'telefono',
                'value'     => '',
                'class'     => 'form-control input-lg',
            ];
            echo form_input($data2);
            ?>
          </div>

          <div class="form-group mb-2">
            <?php
            echo form_label('Direccion:');
            $data2 = [
                'name'      => 'direccion',
                'value'     => '',
                'class'     => 'form-control input-lg',
            ];
            echo form_input($data2);
            ?>
          </div>

          <div class="form-group mb-2">
            <?php
            echo form_label('Email:');
            $data2 = [
                'name'      => 'email',
                'value'     => '',
                'class'     => 'form-control input-lg',
            ];
            echo form_input($data2);
            ?>
          </div>

          <div class="form-group mb-2">
            <?php
            echo form_label('Contraseña:');
            $data2 = [
                'name'      => 'password',
                'value'     => '',
                'class'     => 'form-control input-lg',
            ];
            echo form_input($data2);
            ?>
          </div>

          <div class="form-group mb-2">
            <?php
            echo form_label('TIPO:', 'tipo');
            $options = [
                'seleccione'  => 'Seleccione...',
                'ADMIN'  => 'ADMIN',
                'VENDEDOR'    => 'VENDEDOR',
            ];
            echo form_dropdown('tipo', $options, 'seleccione');
            ?>
          </div>

          <div class="form-group mb-2">
            <?php
            echo form_label('Estado:');
            $data2 = [
                'name'      => 'estado',
                'readonly'      => 'TRUE',
                'value'     => 'ACTIVO',
                'class'     => 'form-control input-lg',
            ];
            echo form_input($data2);
            ?>
          </div>

          <div class="form-group mb-2">
            <?php
            echo form_label('Foto:');
            $data2 = [
                'name'      => 'foto',
                'readonly'      => 'TRUE',
                'value'     => 'default.png',
                'class'     => 'form-control input-lg',
            ];
            echo form_input($data2);
            ?>
          </div>

          <div class="text-center mt-2 mb-2">
            <?php echo form_submit('mysubmit', 'Enviar',"class='btn btn-outline-primary' " ); ?>
          </div>

          <?php echo form_close(''); ?>
        </div>
      </div>
      
      <!-- /.content-wrapper -->
      <footer class="main-footer">
        <strong>Copyright &copy; 2023 <a href="https://adminlte.io">ADSO 2593917</a>.</strong>
        All rights reserved.
        <div class="float-right d-none d-sm-inline-block">
          <b>Version</b> 3.2.0
        </div>
      </footer>
    </div>
    <!-- ./wrapper -->

    <!-- jQuery -->
    <script src="<?= base_url('plugins/jquery/jquery.min.js') ?>"></script>
    <!-- Bootstrap 4 -->
    <script src="<?= base_url('plugins/bootstrap/js/bootstrap.bundle.min.js') ?>"></script>
    <!-- AdminLTE App -->
    <script src="<?= base_url('dist/js/adminlte.js') ?>"></script>

  </body>
</html>
