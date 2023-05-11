import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;

public class Login extends JFrame{

    JPanel contenedor;
    GridLayout capa;
    JLabel label_cedula;
    JLabel label_nombre;
    JLabel label_password;
    JTextField campo_cedula;
    JTextField campo_nombre;
    JPasswordField campo_password;
    JButton btn_guardar;
    JButton btn_cancelar;

    public Login(){
        initComponents();
    }

    public void initComponents(){
        setVisible(true);
        setTitle("NUEVO LOGIN");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        contenedor = new JPanel();
        capa = new GridLayout(4, 3);
        contenedor.setLayout(capa);
        contenedor.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        label_cedula = new JLabel("Cedula : ");
        label_nombre = new JLabel("Nombre :");
        label_password = new JLabel("Password: ");
        campo_cedula = new JTextField();
        campo_nombre = new JTextField();
        campo_password = new JPasswordField();
        btn_guardar = new JButton("GUARDAR");
        btn_cancelar = new JButton("CANCELAR");


        contenedor.add(label_cedula);
        contenedor.add(campo_cedula);
        contenedor.add(label_nombre);
        contenedor.add(campo_nombre);
        contenedor.add(label_password);
        contenedor.add(campo_password);
        contenedor.add(btn_guardar);
        contenedor.add(btn_cancelar);

        ActionListener evento_guardar = new ActionListener(){
			public void actionPerformed(ActionEvent e) {
        		System.out.println("Se ha dado click en el boton GUARDAR");
				String texto_cedula = campo_cedula.getText();
				String texto_nombres = campo_nombre.getText();
                char[] texto_password = campo_password.getPassword();
				System.out.println("Cedula => "+texto_cedula);
				System.out.println("Nombres => "+texto_nombres);
                System.out.println("Pass: "+texto_password);
			}
    	};
		ActionListener evento_cancelar = new ActionListener(){
			public void actionPerformed(ActionEvent e) {
        		System.out.println(" -- APLICACION CERRADA -- ");
				dispose();
			}
    	};
		btn_guardar.addActionListener(evento_guardar);
		btn_cancelar.addActionListener(evento_cancelar);

        add(contenedor);
        pack();
        revalidate();





        





    }
    
}
