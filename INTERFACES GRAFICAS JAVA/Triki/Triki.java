import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class Triki extends JFrame{

    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JLabel[] arreglo1_labels = new JLabel[9];
    private JLabel[] arreglo2_labels = new JLabel[9];
    private String[] labels_texto = new String[9];





    public Triki(){
        initComponents();
    }

    public void initComponents(){
        Toolkit sistema = Toolkit.getDefaultToolkit();
		Dimension tamanio = sistema.getScreenSize();

        setTitle("Triki");
        setSize( tamanio.width/2 , tamanio.height/2 );
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel contenedor = new JPanel();
        GridBagLayout capa = new GridBagLayout();
        contenedor.setLayout(capa);

        GridBagConstraints restriccion = new GridBagConstraints();
        Font fuente = new Font("Harlow Solid Italic", Font.BOLD, 45);
        Border border = BorderFactory.createLineBorder(Color.BLACK, 3);


        label1 = new JLabel("-", SwingConstants.CENTER);
        restriccion.gridy = 0;
        restriccion.gridx = 0;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 33;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        label1.setFont(fuente);
        label1.setOpaque(true);
        label1.setBackground(Color.GRAY);
        label1.setBorder(border);
        label1.setForeground(Color.BLACK);
        contenedor.add(label1, restriccion);

        label2 = new JLabel("-", SwingConstants.CENTER);
        restriccion.gridy = 0;
        restriccion.gridx = 1;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 33;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        label2.setFont(fuente);
        label2.setOpaque(true);
        label2.setBackground(Color.GRAY);
        label2.setBorder(border);
        label2.setForeground(Color.BLACK);
        contenedor.add(label2, restriccion);

        label3 = new JLabel("-", SwingConstants.CENTER);
        restriccion.gridy = 0;
        restriccion.gridx = 2;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 33;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        label3.setFont(fuente);
        label3.setOpaque(true);
        label3.setBackground(Color.GRAY);
        label3.setBorder(border);
        label3.setForeground(Color.BLACK);
        contenedor.add(label3, restriccion);

        label4 = new JLabel("-", SwingConstants.CENTER);
        restriccion.gridy = 1;
        restriccion.gridx = 0;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 33;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        label4.setFont(fuente);
        label4.setOpaque(true);
        label4.setBackground(Color.GRAY);
        label4.setBorder(border);
        label4.setForeground(Color.BLACK);
        contenedor.add(label4, restriccion);

        label5 = new JLabel("-", SwingConstants.CENTER);
        restriccion.gridy = 1;
        restriccion.gridx = 1;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 33;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        label5.setFont(fuente);
        label5.setOpaque(true);
        label5.setBackground(Color.GRAY);
        label5.setBorder(border);
        label5.setForeground(Color.BLACK);
        contenedor.add(label5, restriccion);

        label6 = new JLabel("-", SwingConstants.CENTER);
        restriccion.gridy = 1;
        restriccion.gridx = 2;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 33;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        label6.setFont(fuente);
        label6.setOpaque(true);
        label6.setBackground(Color.GRAY);
        label6.setBorder(border);
        label6.setForeground(Color.BLACK);
        contenedor.add(label6, restriccion);

        label7 = new JLabel("-", SwingConstants.CENTER);
        restriccion.gridy = 2;
        restriccion.gridx = 0;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 33;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        label7.setFont(fuente);
        label7.setOpaque(true);
        label7.setBackground(Color.GRAY);
        label7.setBorder(border);
        label7.setForeground(Color.BLACK);
        contenedor.add(label7, restriccion);

        label8 = new JLabel("-", SwingConstants.CENTER);
        restriccion.gridy = 2;
        restriccion.gridx = 1;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 33;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        label8.setFont(fuente);
        label8.setOpaque(true);
        label8.setBackground(Color.GRAY);
        label8.setBorder(border);
        label8.setForeground(Color.BLACK);
        contenedor.add(label8, restriccion);

        label9 = new JLabel("-", SwingConstants.CENTER);
        restriccion.gridy = 2;
        restriccion.gridx = 2;
        restriccion.gridwidth = 1;
        restriccion.gridheight = 1;
        restriccion.weightx = 33;
        restriccion.weighty = 1;
        restriccion.fill = GridBagConstraints.BOTH;
        label9.setFont(fuente);
        label9.setOpaque(true);
        label9.setBackground(Color.GRAY);
        label9.setBorder(border);
        label9.setForeground(Color.BLACK);
        contenedor.add(label9, restriccion);

        
        
        
        
        arreglo1_labels[1] = label2;
        arreglo1_labels[2] = label3;
        arreglo1_labels[3] = label4;
        arreglo1_labels[4] = label5;
        arreglo1_labels[5] = label6;
        arreglo1_labels[6] = label7;
        arreglo1_labels[7] = label8;
        arreglo1_labels[8] = label9;

        arreglo2_labels[1] = label3;
        arreglo2_labels[2] = label4;
        arreglo2_labels[3] = label5;
        arreglo2_labels[4] = label6;
        arreglo2_labels[5] = label7;
        arreglo2_labels[6] = label8;
        arreglo2_labels[7] = label9;



        String texto_label1 = label1.getText();
        String texto_label2 = label2.getText();
        String texto_label3 = label3.getText();
        String texto_label4 = label4.getText();
        String texto_label5 = label5.getText();
        String texto_label6 = label6.getText();
        String texto_label7 = label7.getText();
        String texto_label8 = label8.getText();
        String texto_label9 = label9.getText();

        labels_texto[0]= texto_label1;
        labels_texto[1]= texto_label2;
        labels_texto[2]= texto_label3;
        labels_texto[3]= texto_label4;
        labels_texto[4]= texto_label5;
        labels_texto[5]= texto_label6;
        labels_texto[6]= texto_label7;
        labels_texto[7]= texto_label8;
        labels_texto[8]= texto_label9;





        MouseAdapter evento1 = new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                label1.setText("X");
                ValidarIA1();
                label1.setEnabled(false);
                
            }
        };
        label1.addMouseListener(evento1);

        MouseAdapter evento2 = new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                label2.setText("X");
                ValidarIA2();
                
            }
        };
        label2.addMouseListener(evento2);

        

        add(contenedor);
        revalidate();


    }

    public void ValidarIA1(){

        if(this.labels_texto[1].equalsIgnoreCase("-") || this.labels_texto[2].equalsIgnoreCase("-") || this.labels_texto[3].equalsIgnoreCase("-") || this.labels_texto[4].equalsIgnoreCase("-") && this.labels_texto[5].equalsIgnoreCase("-") && this.labels_texto[6].equalsIgnoreCase("-") && this.labels_texto[7].equalsIgnoreCase("-") && this.labels_texto[8].equalsIgnoreCase("-")){

            Random rand = new Random();
            int index = rand.nextInt(9);
            
            arreglo1_labels[index].setText("O");

            
           
        }

    }

    public void ValidarIA2(){

        if(this.labels_texto[2].equalsIgnoreCase("-") || this.labels_texto[3].equalsIgnoreCase("-") || this.labels_texto[4].equalsIgnoreCase("-") || this.labels_texto[5].equalsIgnoreCase("-") || this.labels_texto[6].equalsIgnoreCase("-") || this.labels_texto[7].equalsIgnoreCase("-") || this.labels_texto[8].equalsIgnoreCase("-")){

            Random rand = new Random();
            int index = rand.nextInt(8);
            
            arreglo2_labels[index].setText("O");

            
            
        }
    }
}