package Principal;


public class Menu extends javax.swing.JFrame {
    
    Persona listaPersonas [];
    
    
    public Menu(){
        this.listaPersonas = new Persona [100];
        
        
        initAlternComponents();
        initComponents();
    }
    
    public void initAlternComponents(){
        setLocationRelativeTo(null);
        setIconImage(getToolkit().createImage(ClassLoader.getSystemResource("imagenes/javalogo.jpg")));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentMenu = new javax.swing.JPanel();
        etqMenu = new javax.swing.JLabel();
        contentPrincipal = new javax.swing.JPanel();
        btnCrearUsuario = new javax.swing.JButton();
        btnModificarUsuario = new javax.swing.JButton();
        btnEliminarUsuario = new javax.swing.JButton();
        btnListarUsuarios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setBackground(new java.awt.Color(0, 255, 255));
        setResizable(false);

        contentMenu.setBackground(new java.awt.Color(0, 255, 255));

        etqMenu.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        etqMenu.setForeground(new java.awt.Color(0, 0, 0));
        etqMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqMenu.setText("Menú");

        javax.swing.GroupLayout contentMenuLayout = new javax.swing.GroupLayout(contentMenu);
        contentMenu.setLayout(contentMenuLayout);
        contentMenuLayout.setHorizontalGroup(
            contentMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentMenuLayout.setVerticalGroup(
            contentMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
        );

        contentPrincipal.setBackground(new java.awt.Color(0, 0, 0));

        btnCrearUsuario.setBackground(new java.awt.Color(0, 255, 255));
        btnCrearUsuario.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnCrearUsuario.setForeground(new java.awt.Color(0, 0, 0));
        btnCrearUsuario.setText("Crear Usuario");
        btnCrearUsuario.setFocusable(false);
        btnCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearUsuarioActionPerformed(evt);
            }
        });

        btnModificarUsuario.setBackground(new java.awt.Color(0, 255, 255));
        btnModificarUsuario.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnModificarUsuario.setForeground(new java.awt.Color(0, 0, 0));
        btnModificarUsuario.setText("Modificar Usuario");
        btnModificarUsuario.setFocusable(false);
        btnModificarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarUsuarioActionPerformed(evt);
            }
        });

        btnEliminarUsuario.setBackground(new java.awt.Color(0, 255, 255));
        btnEliminarUsuario.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnEliminarUsuario.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminarUsuario.setText("Eliminar Usuario");
        btnEliminarUsuario.setFocusable(false);
        btnEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUsuarioActionPerformed(evt);
            }
        });

        btnListarUsuarios.setBackground(new java.awt.Color(0, 255, 255));
        btnListarUsuarios.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnListarUsuarios.setForeground(new java.awt.Color(0, 0, 0));
        btnListarUsuarios.setText("Listar Usuarios");
        btnListarUsuarios.setFocusable(false);
        btnListarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarUsuariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentPrincipalLayout = new javax.swing.GroupLayout(contentPrincipal);
        contentPrincipal.setLayout(contentPrincipalLayout);
        contentPrincipalLayout.setHorizontalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCrearUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                    .addComponent(btnListarUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(209, Short.MAX_VALUE))
        );
        contentPrincipalLayout.setVerticalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(btnCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnModificarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnListarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contentPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contentMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(contentPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarUsuarioActionPerformed
        ModificarUsuario ventana = new ModificarUsuario(this);
        ventana.setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_btnModificarUsuarioActionPerformed

    private void btnListarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarUsuariosActionPerformed
        
        System.out.println("Lista Personas: ");
        
        for (int i=0; i<this.listaPersonas.length; i++) {
            if (this.listaPersonas[i]!=null) {
                System.out.println(i+" => "+this.listaPersonas[i].getCedula()+" - "+this.listaPersonas[i].getNombres()+" "+this.listaPersonas[i].getApellidos()+" - "+this.listaPersonas[i].getTelefono() );
            }
        }
        
        ListarUsuario ventana = new ListarUsuario(this);
        ventana.setVisible(true);
        setVisible(false); 
    }//GEN-LAST:event_btnListarUsuariosActionPerformed

    private void btnCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearUsuarioActionPerformed
        CrearUsuario ventana = new CrearUsuario(this);
        ventana.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnCrearUsuarioActionPerformed

    private void btnEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUsuarioActionPerformed
        EliminarUsuario ventana = new EliminarUsuario(this);
        ventana.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnEliminarUsuarioActionPerformed

    
    public static void main(String args[]){
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearUsuario;
    private javax.swing.JButton btnEliminarUsuario;
    private javax.swing.JButton btnListarUsuarios;
    private javax.swing.JButton btnModificarUsuario;
    private javax.swing.JPanel contentMenu;
    private javax.swing.JPanel contentPrincipal;
    private javax.swing.JLabel etqMenu;
    // End of variables declaration//GEN-END:variables
}
