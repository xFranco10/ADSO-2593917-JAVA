
package Principal;

import javax.swing.BoxLayout;
import javax.swing.JLabel;


public class ListarUsuario extends javax.swing.JFrame {

    Menu ventanaMenu;
    JLabel etq_temporal;
    
    public ListarUsuario(Menu ventanaMenu) {
        this.ventanaMenu= ventanaMenu;
        initComponents();
        initAlternComponents();
    }
    
    public void initAlternComponents(){
        contentPrincipal.setLayout(new BoxLayout(contentPrincipal, BoxLayout.Y_AXIS));
        
        for (int i=0; i<this.ventanaMenu.listaPersonas.length; i++) {
            if (this.ventanaMenu.listaPersonas[i]!=null) {
                etq_temporal = new JLabel(i+" / "+this.ventanaMenu.listaPersonas[i].getCedula()+" / "+this.ventanaMenu.listaPersonas[i].getNombres()+" / "+this.ventanaMenu.listaPersonas[i].getApellidos()+" / "+this.ventanaMenu.listaPersonas[i].getTelefono()+" / "+this.ventanaMenu.listaPersonas[i].getDireccion()+" / "+this.ventanaMenu.listaPersonas[i].getEmail());
                etq_temporal.setFont(new java.awt.Font("Arial", 3, 16)); 
                etq_temporal.setForeground(new java.awt.Color(255, 255, 255));
                contentPrincipal.add(etq_temporal);
            }
        }
        revalidate();
    }
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentMenu = new javax.swing.JPanel();
        etqMenu = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        contentPrincipal = new javax.swing.JPanel();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contentMenu.setBackground(new java.awt.Color(0, 255, 255));
        contentMenu.setForeground(new java.awt.Color(0, 0, 0));

        etqMenu.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        etqMenu.setForeground(new java.awt.Color(0, 0, 0));
        etqMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqMenu.setText("LISTADO USUARIOS");

        javax.swing.GroupLayout contentMenuLayout = new javax.swing.GroupLayout(contentMenu);
        contentMenu.setLayout(contentMenuLayout);
        contentMenuLayout.setHorizontalGroup(
            contentMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
        );
        contentMenuLayout.setVerticalGroup(
            contentMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        contentPrincipal.setBackground(new java.awt.Color(0, 0, 0));
        contentPrincipal.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentPrincipalLayout = new javax.swing.GroupLayout(contentPrincipal);
        contentPrincipal.setLayout(contentPrincipalLayout);
        contentPrincipalLayout.setHorizontalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 689, Short.MAX_VALUE)
        );
        contentPrincipalLayout.setVerticalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 559, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(contentPrincipal);

        btnAtras.setBackground(new java.awt.Color(0, 255, 255));
        btnAtras.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(0, 0, 0));
        btnAtras.setText("ATRAS");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contentMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed

        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JPanel contentMenu;
    private javax.swing.JPanel contentPrincipal;
    private javax.swing.JLabel etqMenu;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
