import java.awt.FlowLayout;


import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//Este flow Layout ubica los elementos de forma horizontal y de izquierda a derecha los lee

public class EjemploFlowLayout extends JFrame{

    public EjemploFlowLayout(){
        initComponents();
    }

    public void initComponents(){
        setTitle("FlowLayout");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        JPanel contenedor = new JPanel();
        FlowLayout capa = new FlowLayout();
        contenedor.setLayout(capa);

        JButton btn = new JButton("Boton");
        JTextField campo = new JTextField();
        campo.setColumns(15);
        JCheckBox check = new JCheckBox("Checkbox");
        JLabel etiqueta = new JLabel("Etiqueta");

        contenedor.add(btn);
        contenedor.add(campo);
        contenedor.add(check);
        contenedor.add(etiqueta);

        add(contenedor);
        revalidate();


    }
}
