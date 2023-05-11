import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FormRegistro extends JFrame{

	public FormRegistro(String titulo){

		
		Toolkit sistema = Toolkit.getDefaultToolkit();
		Dimension tamanio = sistema.getScreenSize();
		
		setVisible( true );
		setSize( tamanio.width/2 , tamanio.height/2 );
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setLocationRelativeTo( null );
		setTitle( titulo );

		Font fuente = new Font("Arial", Font.BOLD, 15);

		JPanel contenedor = new JPanel();
		contenedor.setBackground( Color.white );
		contenedor.setLayout(new GridLayout(4,2) );
		contenedor.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20) );

		JLabel label_cedula = new JLabel("Cedula:");
		label_cedula.setFont(fuente);

		JTextField campo_cedula = new JTextField();
		campo_cedula.setColumns(20);

		JLabel label_nombres = new JLabel("Nombres: ");
		label_nombres.setFont( fuente );
		JTextField campo_nombres = new JTextField();

		JLabel label_apellidos = new JLabel("Apellidos: ");
		label_apellidos.setFont( fuente );
		JTextField campo_apellidos = new JTextField();
		
		JButton btn_limpiar = new JButton("LIMPIAR");
		JButton btn_guardar = new JButton("GUARDAR");

		// Agregar elementos visuales al contenedor
		contenedor.add(label_cedula);
		contenedor.add(campo_cedula);
		contenedor.add(label_nombres);
		contenedor.add(campo_nombres);
		contenedor.add(label_apellidos);
		contenedor.add(campo_apellidos);
		contenedor.add(btn_limpiar);
		contenedor.add(btn_guardar);

		ActionListener evento_guardar = new ActionListener(){
			public void actionPerformed(ActionEvent e) {
        		System.out.println("Se ha dado click en el boton GUARDAR");
				String texto_cedula = campo_cedula.getText();
				String texto_nombres = campo_nombres.getText();
				String texto_apellidos = campo_apellidos.getText();
				System.out.println("Cedula => "+texto_cedula);
				System.out.println("Nombres => "+texto_nombres);
				System.out.println("Apellidos => "+texto_apellidos);
			}
    	};
		ActionListener evento_limpiar = new ActionListener(){
			public void actionPerformed(ActionEvent e) {
        		System.out.println(" -- APLICACION CERRADA -- ");
				dispose();
			}
    	};
		
		btn_guardar.addActionListener(evento_guardar);
		btn_limpiar.addActionListener(evento_limpiar);


		// Agregar el contenedor a la ventana
		add( contenedor );
		revalidate();
		pack();
	}

		
}
