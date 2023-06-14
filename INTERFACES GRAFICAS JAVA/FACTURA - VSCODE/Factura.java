import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import java.util.Set;
import java.awt.event.ActionListener;
// import java.awt.event.KeyEvent;
// import java.awt.event.KeyListener;

public class Factura extends JFrame{

    private Persona listaClientes [];
	private Vendedor listaVendedores [];
    private Productos listaProductos [];
    private JLabel label_datos_cliente;
    private JLabel label_cedula1;
    private JTextField input_cedula1;
    private JButton btn_buscar1;
    private JLabel etiqueta_nombres1;
    private JTextField input_nombres;
    private JLabel etiqueta_direccion;
    private JTextField input_direccion;
    private JLabel etiqueta_datos_vendedor; 
    private JLabel label_cedula2;
    private JTextField input_cedula2;
    private JButton btn_buscar2;
    private JLabel label_nombres2;
    private JTextField input_nombres2;
    private JLabel etiqueta_productos;
    private JLabel label_id;
    private JLabel label_nombre;
    private JLabel label_cantidad;
    private JLabel label_vacio1;
    private JTextField input_id;
    private JTextField input_nombres3;
    private JTextField input_cantidad;
    private JButton btn_agregar; 
    private JPanel espacio_grande;
    private JLabel etiqueta_total;
    private int subtotal = 0;
    private int acumulador_total = 0;




    public Factura(Persona listaClientes[], Vendedor listaVendedores[], Productos listaProductos[]){
        this.listaClientes = listaClientes;
        this.listaVendedores = listaVendedores;
        this.listaProductos = listaProductos;

        initComponents();
    }

    
    public void initComponents(){
        Toolkit sistema = Toolkit.getDefaultToolkit();
		Dimension tamanio = sistema.getScreenSize();

        setTitle("Factura");
        setSize( tamanio.width/2 , tamanio.height/2 );
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel contenedor_principal = new JPanel();
        GridBagLayout capa_principal = new GridBagLayout();
        contenedor_principal.setLayout(capa_principal);
        contenedor_principal.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10) );


        GridBagConstraints restriccion = new GridBagConstraints();

        label_datos_cliente = new JLabel("Datos Cliente: ");
        restriccion.gridy = 0;
        restriccion.gridx = 0;
        restriccion.gridwidth = 4;
        restriccion.gridheight = 1;
        restriccion.weightx = 100;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor_principal.add(label_datos_cliente, restriccion);

        label_cedula1 = new JLabel("Cedula: ");
        restriccion.gridy = 1;
        restriccion.gridx = 0;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 10;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor_principal.add(label_cedula1, restriccion);

        input_cedula1 = new JTextField();
        restriccion.gridy = 1;
        restriccion.gridx = 1;
        restriccion.gridwidth = 2;
        restriccion.gridheight = 1;
        restriccion.weightx = 80;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor_principal.add(input_cedula1, restriccion);

        btn_buscar1 = new JButton("Buscar: ");
        restriccion.gridy = 1;
        restriccion.gridx = 3;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 10;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor_principal.add(btn_buscar1, restriccion);

        etiqueta_nombres1 = new JLabel("Nombres: ");
        restriccion.gridy = 2;
        restriccion.gridx = 0;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 10;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor_principal.add(etiqueta_nombres1, restriccion);

        input_nombres = new JTextField();
        restriccion.gridy = 2;
        restriccion.gridx = 1;
        restriccion.gridwidth = 3;
        restriccion.gridheight = 1;
        restriccion.weightx = 90;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor_principal.add(input_nombres, restriccion);

        etiqueta_direccion = new JLabel("Direccion: ");
        restriccion.gridy = 3;
        restriccion.gridx = 0;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 10;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor_principal.add(etiqueta_direccion, restriccion);

        input_direccion = new JTextField();
        restriccion.gridy = 3;
        restriccion.gridx = 1;
        restriccion.gridwidth = 3;
        restriccion.gridheight = 1;
        restriccion.weightx = 90;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor_principal.add(input_direccion, restriccion);

        etiqueta_datos_vendedor = new JLabel("Datos Vendedor ");
        restriccion.gridy = 4;
        restriccion.gridx = 0;
        restriccion.gridwidth = 4;
        restriccion.gridheight = 1;
        restriccion.weightx = 100;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor_principal.add(etiqueta_datos_vendedor, restriccion);

        label_cedula2 = new JLabel("Cedula: ");
        restriccion.gridy = 5;
        restriccion.gridx = 0;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 10;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor_principal.add(label_cedula2, restriccion);

        input_cedula2 = new JTextField();
        restriccion.gridy = 5;
        restriccion.gridx = 1;
        restriccion.gridwidth = 2;
        restriccion.gridheight = 1;
        restriccion.weightx = 80;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor_principal.add(input_cedula2, restriccion);

        btn_buscar2 = new JButton("Buscar: ");
        restriccion.gridy = 5;
        restriccion.gridx = 3;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 10;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor_principal.add(btn_buscar2, restriccion);

        label_nombres2 = new JLabel("Nombres: ");
        restriccion.gridy = 6;
        restriccion.gridx = 0;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 10;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor_principal.add(label_nombres2, restriccion);

        input_nombres2 = new JTextField();
        restriccion.gridy = 6;
        restriccion.gridx = 1;
        restriccion.gridwidth = 3;
        restriccion.gridheight = 1;
        restriccion.weightx = 90;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor_principal.add(input_nombres2, restriccion);

        etiqueta_productos = new JLabel("Productos ");
        restriccion.gridy = 7;
        restriccion.gridx = 0;
        restriccion.gridwidth = 4;
        restriccion.gridheight = 1;
        restriccion.weightx = 100;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor_principal.add(etiqueta_productos, restriccion);

        label_id = new JLabel("ID ", SwingConstants.CENTER);
        restriccion.gridy = 8;
        restriccion.gridx = 0;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 10;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor_principal.add(label_id, restriccion);

        label_nombre = new JLabel("Nombre ", SwingConstants.CENTER);
        restriccion.gridy = 8;
        restriccion.gridx = 1;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 10;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor_principal.add(label_nombre, restriccion);

        label_cantidad = new JLabel("Cantidad ", SwingConstants.CENTER);
        restriccion.gridy = 8;
        restriccion.gridx = 2;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 10;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor_principal.add(label_cantidad, restriccion);

        label_vacio1 = new JLabel();
        restriccion.gridy = 8;
        restriccion.gridx = 3;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 70;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor_principal.add(label_vacio1, restriccion);

        input_id = new JTextField();
        restriccion.gridy = 9;
        restriccion.gridx = 0;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 10;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor_principal.add(input_id, restriccion);

        input_nombres3 = new JTextField();
        restriccion.gridy = 9;
        restriccion.gridx = 1;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 10;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor_principal.add(input_nombres3, restriccion);

        input_cantidad = new JTextField();
        restriccion.gridy = 9;
        restriccion.gridx = 2;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 10;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor_principal.add(input_cantidad, restriccion);

        btn_agregar = new JButton("Agregar");
        restriccion.gridy = 9;
        restriccion.gridx = 3;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 70;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor_principal.add(btn_agregar, restriccion);

        espacio_grande = new JPanel();
        espacio_grande.setLayout(new BoxLayout(espacio_grande, BoxLayout.Y_AXIS));
        espacio_grande.setOpaque(true);
        espacio_grande.setBackground(Color.lightGray);
        restriccion.gridy = 10;
        restriccion.gridx = 0;
        restriccion.gridwidth = 4;
        restriccion.gridheight = 1;
        restriccion.weightx = 100;
        restriccion.weighty = 25;
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor_principal.add(espacio_grande, restriccion);

        etiqueta_total = new JLabel("Total: $ 0");
        restriccion.gridy = 11;
        restriccion.gridx = 0;
        restriccion.gridwidth = 4;
        restriccion.gridheight = 1;
        restriccion.weightx = 100;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor_principal.add(etiqueta_total, restriccion);

        ActionListener evento_01 = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				buscarCliente();
			}
		};
		btn_buscar1.addActionListener( evento_01 );
        deshabilitarInput(input_nombres);
        deshabilitarInput(input_direccion);

        ActionListener evento_02 = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				buscarVendedor();
			}
		};
		btn_buscar2.addActionListener( evento_02 );
        deshabilitarInput(input_nombres2);

        ActionListener evento_03 = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				buscarProductos();
			}
		};
		btn_agregar.addActionListener( evento_03 );

        
        add(contenedor_principal);
        revalidate();

    }

    public void buscarCliente(){
        String texto = input_cedula1.getText();
		boolean encontrado = false;
		for (int i=0; i<this.listaClientes.length; i++) {
			if(this.listaClientes[i]!=null && this.listaClientes[i].getCedula().equalsIgnoreCase(texto)){
				this.input_nombres.setText( this.listaClientes[i].getNombres());
				this.input_direccion.setText( this.listaClientes[i].getDireccion());
				encontrado = true;
				break;
			}
		}

		if(encontrado){
			deshabilitarInput(this.input_nombres);
			deshabilitarInput(this.input_direccion);
			this.input_cedula1.requestFocus();
		}else{
			habilitarInput(this.input_nombres);
			habilitarInput(this.input_direccion);
			this.input_nombres.requestFocus();
		}

	}

    public void deshabilitarInput(JTextField input){
		input.setEditable(false);
		input.setEnabled(false);
		input.setDisabledTextColor(Color.black);
	}

	public void habilitarInput(JTextField input){
		input.setText("");
		input.setEditable(true);
		input.setEnabled(true);
	}

    public void buscarVendedor(){
        String texto = input_cedula2.getText().replaceAll(" ", "");
        input_cedula2.setText(texto);
		boolean encontrado = false;
		for (int i=0; i<this.listaVendedores.length; i++) {
			if(this.listaVendedores[i]!=null && this.listaVendedores[i].getCedula_v().equalsIgnoreCase(texto)){
				this.input_nombres2.setText( this.listaVendedores[i].getNombre_v());
				encontrado = true;
				break;
			}
		}

		if(encontrado){
			deshabilitarInput(this.input_nombres2);
		}else{
			this.input_nombres2.setText("VENDEDOR NO ENCONTRADO ");
            deshabilitarInput(this.input_nombres2);
		}
	}

    public void buscarProductos(){
        String texto_id = input_id.getText().replaceAll(" ", "");
        String texto_cant = input_cantidad.getText().replaceAll(" ", "");
        input_id.setText(texto_id);
        input_cantidad.setText(texto_cant);
		boolean encontrado = false;
		for (int i=0; i<this.listaProductos.length; i++) {
			if(this.listaProductos[i]!=null && this.listaProductos[i].getId().equalsIgnoreCase(texto_id)){
				int cantidadInt = Integer.parseInt(texto_cant);
                subtotal = this.listaProductos[i].getPrecio()*cantidadInt;
                acumulador_total = acumulador_total + subtotal;
                JLabel etq_temporal = new JLabel(this.listaProductos[i].getId()+" - "+this.listaProductos[i].getNombre()+" - "+this.listaProductos[i].getCant()+" - "+this.listaProductos[i].getPrecio()+" - "+subtotal);
				espacio_grande.add(etq_temporal);
                encontrado = true;
                etiqueta_total.setText("Total: $"+acumulador_total);
                revalidate();
				break;
			} 
		}

		if(encontrado){
			// deshabilitarInput(this.input_id);
            // deshabilitarInput(this.input_nombres3);
            // deshabilitarInput(this.input_cantidad);
		}else{
			this.input_nombres3.setText("PRODUCTO NO ENCONTRADO");
            deshabilitarInput(this.input_id);
            deshabilitarInput(this.input_nombres3);
            deshabilitarInput(this.input_cantidad);
            revalidate();
		}

	}

    // KeyListener eventoKeyBuscarVendedor = new KeyListener() {
    //     public void keyReleased(KeyEvent e){
    //         String texto = input_cedula2.getText();
    //         if (texto.equalsIgnoreCase("")){
    //             input_nombres2.setText("");
    //         }
    //     } 
    //     public void keyTyped(KeyEvent e) {
    //     }
    //     public void keyPressed(KeyEvent e) {
    //     } 
    // };
    // input_cedula2.addKeyListener(eventoKeyBuscarVendedo
}