import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class EjercicioLayout extends JFrame{
    
    public EjercicioLayout(){
        initComponents();
    }

    public void initComponents(){
        setTitle("BorderLayout || BoxLayout || FlowLayout");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        JPanel contenedor = new JPanel();
        BorderLayout capa = new BorderLayout();
        contenedor.setLayout(capa);
        
        //Proceso Para la Parte Superior
        JPanel contenedor_superior = new JPanel();
        FlowLayout capa_superior = new FlowLayout();
        contenedor_superior.setLayout(capa_superior);
        contenedor_superior.setOpaque(true);
        contenedor_superior.setBackground(Color.blue);

        JButton btn1_sup = new JButton("Sup.1");
        JButton btn2_sup = new JButton("Sup.2");
        JButton btn3_sup = new JButton("Sup.3");
        JButton btn4_sup = new JButton("Sup.4");

        contenedor_superior.add(btn1_sup);
        contenedor_superior.add(btn2_sup);
        contenedor_superior.add(btn3_sup);
        contenedor_superior.add(btn4_sup);



        //Proceso para la Parte Inferior
        JPanel contenedor_inferior = new JPanel();
        FlowLayout capa_inferior = new FlowLayout();
        contenedor_inferior.setLayout(capa_inferior);
        contenedor_inferior.setOpaque(true);
        contenedor_inferior.setBackground(Color.yellow);

        JLabel label_inferior = new JLabel("Pon Texto: ");
        JTextField input_inferior = new JTextField();
        input_inferior.setColumns(30);
        JButton btn_inferior = new JButton("Listo");

        contenedor_inferior.add(label_inferior);
        contenedor_inferior.add(input_inferior);
        contenedor_inferior.add(btn_inferior);

        

        //Proceso Para la parte Izquierda
        JPanel contenedor_izquierda = new JPanel();
        BoxLayout capa_izquierda = new BoxLayout(contenedor_izquierda, BoxLayout.Y_AXIS);
        contenedor_izquierda.setLayout(capa_izquierda);
        contenedor_izquierda.setOpaque(true);
        contenedor_izquierda.setBackground(Color.red);

        JButton btn1_izq = new JButton("1");
        JButton btn2_izq = new JButton("2");
        JButton btn3_izq = new JButton("3");

        contenedor_izquierda.add(btn1_izq);
        contenedor_izquierda.add(btn2_izq);
        contenedor_izquierda.add(btn3_izq);

        

        //Proceso Para la parte Derecha
        JPanel contenedor_derecha = new JPanel();
        BoxLayout capa_derecha = new BoxLayout(contenedor_derecha, BoxLayout.Y_AXIS);
        contenedor_derecha.setLayout(capa_derecha);

        JButton btn1_derecha = new JButton("A");
        JButton btn2_derecha = new JButton("B");
        JButton btn3_derecha = new JButton("C");
        JButton btn4_derecha = new JButton("D");


        contenedor_derecha.add(btn1_derecha);
        contenedor_derecha.add(btn2_derecha);
        contenedor_derecha.add(btn3_derecha);
        contenedor_derecha.add(btn4_derecha);



        //Posicionando los contenedores
        contenedor.add(contenedor_superior, BorderLayout.NORTH);
        contenedor.add(contenedor_inferior, BorderLayout.SOUTH);
        contenedor.add(contenedor_izquierda, BorderLayout.WEST);
        contenedor.add(contenedor_derecha, BorderLayout.EAST);

        add(contenedor);
        pack();
        revalidate();

    }
}
