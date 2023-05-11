import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EjemploFlowBorderLayout extends JFrame{

    public EjemploFlowBorderLayout(){
        initComponents();
    }

    public void initComponents(){
        setTitle("FlowLayout y BorderLayout");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        JPanel contenedor = new JPanel();
        BorderLayout capa = new BorderLayout();
        contenedor.setLayout(capa);

        JButton btn_1 = new JButton("Boton 1");
        JButton btn_2 = new JButton("Boton 2");
        JButton btn_3 = new JButton("Boton 3");

        JPanel contenedor_centro = new JPanel();
        FlowLayout capa_centro = new FlowLayout();
        contenedor_centro.setLayout(capa_centro); 
        contenedor_centro.add(btn_1);
        contenedor_centro.add(btn_2);

        contenedor.add(contenedor_centro, BorderLayout.CENTER);
        contenedor.add(btn_3, BorderLayout.SOUTH);

        add(contenedor);
        pack();
        revalidate();

    }
    
}