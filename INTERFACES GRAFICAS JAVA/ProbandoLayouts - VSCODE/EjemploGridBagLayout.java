import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class EjemploGridBagLayout extends JFrame{
    

    public EjemploGridBagLayout(){
        initComponents();
    }

    public void initComponents(){
        setTitle("GridBagLayout");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null); 

        JPanel contenedor_principal = new JPanel();
        GridBagLayout capa_principal = new GridBagLayout();
        contenedor_principal.setLayout(capa_principal);

        GridBagConstraints restriccion = new GridBagConstraints();

        JTextArea area_texto = new JTextArea("Area Texto");
        restriccion.gridy = 0;
        restriccion.gridx = 0;
        restriccion.gridwidth = 2;
        restriccion.gridheight = 2;
        restriccion.weightx = 1;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor_principal.add(area_texto, restriccion);


        JButton btn_1 = new JButton("Boton 1");
        restriccion.gridy = 0;
        restriccion.gridx = 2;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 0;
        restriccion.weighty = 0;
        restriccion.fill = GridBagConstraints.NORTH;
        contenedor_principal.add(btn_1, restriccion);

        
        JButton btn_2 = new JButton("Boton 2");
        //Arranca en la fila 1
        restriccion.gridy = 1;
        //Arranca en la columna 2
        restriccion.gridx = 2;
        //Ocupa una celda de ancho
        restriccion.gridwidth = 1;
        //Ocupa una celda de alto
        restriccion.gridheight = 1;
        //No se estira en X
        restriccion.weightx = 0;
        //No se estira en Y
        restriccion.weighty = 0;
        restriccion.fill = GridBagConstraints.NORTH;
        contenedor_principal.add(btn_2, restriccion);

        JButton btn_3 = new JButton("Boton 3");
        restriccion.gridy = 2;
        restriccion.gridx = 0;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 0;
        restriccion.weighty = 0;
        restriccion.fill = GridBagConstraints.NORTH;
        contenedor_principal.add(btn_3, restriccion);

        JButton btn_4 = new JButton("Boton 4");
        restriccion.gridy = 2;
        restriccion.gridx = 2;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 0;
        restriccion.weighty = 0;
        restriccion.fill = GridBagConstraints.NORTH;
        contenedor_principal.add(btn_4, restriccion);

        JTextField campo = new JTextField("Campo Texto");
        restriccion.gridy = 2;
        restriccion.gridx = 1;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 1;
        restriccion.weighty = 0;
        restriccion.fill = GridBagConstraints.BOTH;
        contenedor_principal.add(campo, restriccion);

        


        add(contenedor_principal);
        revalidate();




    }
}
