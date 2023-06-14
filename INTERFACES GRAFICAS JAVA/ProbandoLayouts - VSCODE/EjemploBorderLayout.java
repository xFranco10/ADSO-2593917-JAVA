import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class EjemploBorderLayout extends JFrame{
    
    public EjemploBorderLayout(){
        initComponents();
    }

    public void initComponents(){
        setTitle("BorderLayout");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        JPanel contenedor = new JPanel();
        BorderLayout capa = new BorderLayout();
        contenedor.setLayout(capa);

        JLabel etiqueta_superior = new JLabel("Superior", SwingConstants.CENTER);
        etiqueta_superior.setOpaque(true);
        etiqueta_superior.setBackground(Color.red);

        JLabel etiqueta_izquierda = new JLabel("Izquierda");
        etiqueta_izquierda.setOpaque(true);
        etiqueta_izquierda.setBackground(Color.blue);

        JLabel etiqueta_centro = new JLabel("Centro", SwingConstants.CENTER);
        etiqueta_centro.setOpaque(true);
        etiqueta_centro.setBackground(Color.white);

        JLabel etiqueta_derecha = new JLabel("Derecha");
        etiqueta_derecha.setOpaque(true);
        etiqueta_derecha.setBackground(Color.YELLOW);

        JLabel etiqueta_inferior = new JLabel("Inferior", SwingConstants.CENTER);

        contenedor.add(etiqueta_superior, BorderLayout.NORTH);
        contenedor.add(etiqueta_inferior, BorderLayout.SOUTH);
        contenedor.add(etiqueta_izquierda, BorderLayout.WEST);
        contenedor.add(etiqueta_derecha, BorderLayout.EAST);
        contenedor.add(etiqueta_centro, BorderLayout.CENTER);

        add(contenedor);
        revalidate();
    }   
}
