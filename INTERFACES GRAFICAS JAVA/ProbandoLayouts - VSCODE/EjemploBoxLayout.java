

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//Este BoxLayout ubica los elementos de forma vertical y tambien de forma horizontal pero lo mas recomendable se usa es vertical y los lee de arriba hacia abajo
public class EjemploBoxLayout extends JFrame{

    public EjemploBoxLayout(){
        initComponents();
    }

    public void initComponents(){
        setTitle("BoxLayout");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        JPanel contenedor = new JPanel();
        BoxLayout capa = new BoxLayout(contenedor, BoxLayout.Y_AXIS);
        contenedor.setLayout(capa);

        JLabel etiqueta_01 = new JLabel("Etiqueta 01");
        JLabel etiqueta_02 = new JLabel("Etiqueta 02");
        JLabel etiqueta_03 = new JLabel("Etiqueta 03");
        JLabel etiqueta_04 = new JLabel("Etiqueta 04");
        JLabel etiqueta_05 = new JLabel("Etiqueta 05");

        contenedor.add(etiqueta_01);
        contenedor.add(etiqueta_02);
        contenedor.add(etiqueta_03);
        contenedor.add(etiqueta_04);
        contenedor.add(etiqueta_05);

        add(contenedor);
        revalidate();


    }

}
