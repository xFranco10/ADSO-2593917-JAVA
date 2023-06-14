import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EjemploGridLayout extends JFrame{

    public EjemploGridLayout(){
        initComponents();
    }

    public void initComponents(){
        setTitle("GridLayout");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        JPanel contenedor = new JPanel();
        GridLayout capa = new GridLayout(3,4);
        contenedor.setLayout(capa);

        //Creando el arreglo de JTextField
        JTextField arreglo_inputs [] = new JTextField [12];

        //Instanciar cada posicion del arreglo con un objeto JTextField
        for (int i = 0; i < arreglo_inputs.length; i++) {
            arreglo_inputs[i] = new JTextField();
        }

        //Asignar o llenar cada input en el contenedor
        for (int i = 0; i < arreglo_inputs.length; i++) {
            contenedor.add(arreglo_inputs[i]);
        }

        add(contenedor);
        revalidate();

    }

}