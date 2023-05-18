
package Principal;


public class CrearUsuario extends javax.swing.JFrame {

    Menu ventanaMenu;
    
    public CrearUsuario(Menu ventanaMenu) {
        this.ventanaMenu = ventanaMenu;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentMenu = new javax.swing.JPanel();
        etqMenu = new javax.swing.JLabel();
        contentPrincipal = new javax.swing.JPanel();
        etqCedula = new javax.swing.JLabel();
        inputCedula = new javax.swing.JTextField();
        etqNombres = new javax.swing.JLabel();
        inputNombres = new javax.swing.JTextField();
        etqApellidos = new javax.swing.JLabel();
        inputApellidos = new javax.swing.JTextField();
        etqTelefono = new javax.swing.JLabel();
        inputTelefono = new javax.swing.JTextField();
        etqDireccion = new javax.swing.JLabel();
        inputDireccion = new javax.swing.JTextField();
        etqEmail = new javax.swing.JLabel();
        inputEmail = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        contentMenu.setBackground(new java.awt.Color(0, 255, 255));

        etqMenu.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        etqMenu.setForeground(new java.awt.Color(0, 0, 0));
        etqMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqMenu.setText("CREAR USUARIO");

        javax.swing.GroupLayout contentMenuLayout = new javax.swing.GroupLayout(contentMenu);
        contentMenu.setLayout(contentMenuLayout);
        contentMenuLayout.setHorizontalGroup(
            contentMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentMenuLayout.setVerticalGroup(
            contentMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentMenuLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(etqMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        contentPrincipal.setBackground(new java.awt.Color(0, 0, 0));

        etqCedula.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        etqCedula.setForeground(new java.awt.Color(255, 255, 255));
        etqCedula.setText("Cedula:");

        inputCedula.setBackground(new java.awt.Color(255, 255, 255));
        inputCedula.setForeground(new java.awt.Color(0, 0, 0));
        inputCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCedulaActionPerformed(evt);
            }
        });

        etqNombres.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        etqNombres.setForeground(new java.awt.Color(255, 255, 255));
        etqNombres.setText("Nombres:");

        inputNombres.setBackground(new java.awt.Color(255, 255, 255));
        inputNombres.setForeground(new java.awt.Color(0, 0, 0));

        etqApellidos.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        etqApellidos.setForeground(new java.awt.Color(255, 255, 255));
        etqApellidos.setText("Apellidos:");

        inputApellidos.setBackground(new java.awt.Color(255, 255, 255));
        inputApellidos.setForeground(new java.awt.Color(0, 0, 0));
        inputApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputApellidosActionPerformed(evt);
            }
        });

        etqTelefono.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        etqTelefono.setForeground(new java.awt.Color(255, 255, 255));
        etqTelefono.setText("Telefono:");

        inputTelefono.setBackground(new java.awt.Color(255, 255, 255));
        inputTelefono.setForeground(new java.awt.Color(0, 0, 0));

        etqDireccion.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        etqDireccion.setForeground(new java.awt.Color(255, 255, 255));
        etqDireccion.setText("Direccion:");

        inputDireccion.setBackground(new java.awt.Color(255, 255, 255));
        inputDireccion.setForeground(new java.awt.Color(0, 0, 0));

        etqEmail.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        etqEmail.setForeground(new java.awt.Color(255, 255, 255));
        etqEmail.setText("Email:");

        inputEmail.setBackground(new java.awt.Color(255, 255, 255));
        inputEmail.setForeground(new java.awt.Color(0, 0, 0));

        btnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnRegistrar.setBackground(new java.awt.Color(0, 255, 255));
        btnRegistrar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentPrincipalLayout = new javax.swing.GroupLayout(contentPrincipal);
        contentPrincipal.setLayout(contentPrincipalLayout);
        contentPrincipalLayout.setHorizontalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(etqTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(etqNombres, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                .addComponent(etqCedula, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(etqApellidos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(etqDireccion)
                            .addComponent(etqEmail))
                        .addGap(12, 12, 12)
                        .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(inputNombres, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputCedula, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputApellidos)
                            .addComponent(inputTelefono)
                            .addComponent(inputDireccion)
                            .addComponent(inputEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)))
                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contentPrincipalLayout.setVerticalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(etqCedula))
                    .addComponent(inputCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqNombres))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqApellidos)
                    .addComponent(inputApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqTelefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqDireccion, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqEmail))
                .addGap(63, 63, 63)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contentPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contentMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contentPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCedulaActionPerformed

    private void inputApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputApellidosActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String cedula = inputCedula.getText();
        String nombres = inputNombres.getText();
        String apellidos = inputApellidos.getText();
        String direccion = inputDireccion.getText();
        String telefono = inputTelefono.getText();
        String email = inputEmail.getText();
        
        
        
        if(!cedula.equals("") && !nombres.equals("") && !apellidos.equals("") && !direccion.equals("") && !telefono.equals("") && !email.equals("")){
            
            Persona temporal = new Persona(cedula, nombres, apellidos, direccion, telefono, email);
            
           for(int i=0;i<ventanaMenu.listaPersonas.length;i++){
               if(this.ventanaMenu.listaPersonas[i]==null){
                   this.ventanaMenu.listaPersonas[i]= temporal;
                   break;
                }  
            }  
        }
        
        
        this.ventanaMenu.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnRegistrarActionPerformed
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JPanel contentMenu;
    private javax.swing.JPanel contentPrincipal;
    private javax.swing.JLabel etqApellidos;
    private javax.swing.JLabel etqCedula;
    private javax.swing.JLabel etqDireccion;
    private javax.swing.JLabel etqEmail;
    private javax.swing.JLabel etqMenu;
    private javax.swing.JLabel etqNombres;
    private javax.swing.JLabel etqTelefono;
    private javax.swing.JTextField inputApellidos;
    private javax.swing.JTextField inputCedula;
    private javax.swing.JTextField inputDireccion;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JTextField inputNombres;
    private javax.swing.JTextField inputTelefono;
    // End of variables declaration//GEN-END:variables
}
