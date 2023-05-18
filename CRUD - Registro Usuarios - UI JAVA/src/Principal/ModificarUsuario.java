
package Principal;

import java.awt.Color;
import javax.swing.JTextField;


public class ModificarUsuario extends javax.swing.JFrame {
    
    Menu ventanaMenu;
    
            
    public ModificarUsuario(Menu ventanaMenu) {
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
        btnBuscar = new javax.swing.JButton();
        etqSeparamiento = new javax.swing.JLabel();
        etqUsuarioEnc = new javax.swing.JLabel();
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
        btnModificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contentMenu.setBackground(new java.awt.Color(0, 255, 255));
        contentMenu.setForeground(new java.awt.Color(0, 0, 0));

        etqMenu.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        etqMenu.setForeground(new java.awt.Color(0, 0, 0));
        etqMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqMenu.setText("MODIFICAR USUARIO");

        javax.swing.GroupLayout contentMenuLayout = new javax.swing.GroupLayout(contentMenu);
        contentMenu.setLayout(contentMenuLayout);
        contentMenuLayout.setHorizontalGroup(
            contentMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentMenuLayout.setVerticalGroup(
            contentMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        btnBuscar.setBackground(new java.awt.Color(0, 255, 255));
        btnBuscar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        etqSeparamiento.setText("_________________________________________________________________________________________________________________________________");

        etqUsuarioEnc.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        etqUsuarioEnc.setForeground(new java.awt.Color(255, 255, 255));
        etqUsuarioEnc.setText("Usuario Encontrado:");

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
        etqEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqEmail.setText("Email:");

        inputEmail.setBackground(new java.awt.Color(255, 255, 255));
        inputEmail.setForeground(new java.awt.Color(0, 0, 0));

        btnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(0, 255, 255));
        btnModificar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(0, 0, 0));
        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentPrincipalLayout = new javax.swing.GroupLayout(contentPrincipal);
        contentPrincipal.setLayout(contentPrincipalLayout);
        contentPrincipalLayout.setHorizontalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(etqSeparamiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                        .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contentPrincipalLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(etqCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar))
                            .addGroup(contentPrincipalLayout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                                        .addComponent(etqApellidos)
                                        .addGap(26, 26, 26)
                                        .addComponent(inputApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                                        .addComponent(etqNombres)
                                        .addGap(26, 26, 26)
                                        .addComponent(inputNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                                        .addComponent(etqTelefono)
                                        .addGap(26, 26, 26)
                                        .addComponent(inputTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                                        .addComponent(etqDireccion)
                                        .addGap(26, 26, 26)
                                        .addComponent(inputDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(contentPrincipalLayout.createSequentialGroup()
                                        .addComponent(etqEmail)
                                        .addGap(39, 39, 39)
                                        .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(contentPrincipalLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(etqUsuarioEnc))
                            .addGroup(contentPrincipalLayout.createSequentialGroup()
                                .addGap(163, 163, 163)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        contentPrincipalLayout.setVerticalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etqCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(inputCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqSeparamiento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqUsuarioEnc)
                .addGap(27, 27, 27)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqNombres)
                    .addComponent(inputNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqApellidos)
                    .addComponent(inputApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqTelefono)
                    .addComponent(inputTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqDireccion)
                    .addComponent(inputDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqEmail)
                    .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        String campoCedula = inputCedula.getText();
        
        for(int i=0; i<this.ventanaMenu.listaPersonas.length;i++){
    
            if(this.ventanaMenu.listaPersonas[i]!=null){
                if(this.ventanaMenu.listaPersonas[i].getCedula().equals(campoCedula)){
                    etqUsuarioEnc.setText("Usuario Encontrado");
                    inputNombres.setText(this.ventanaMenu.listaPersonas[i].getNombres());
                    inputApellidos.setText(this.ventanaMenu.listaPersonas[i].getApellidos());
                    inputTelefono.setText(this.ventanaMenu.listaPersonas[i].getTelefono());
                    inputDireccion.setText(this.ventanaMenu.listaPersonas[i].getDireccion());
                    inputEmail.setText(this.ventanaMenu.listaPersonas[i].getEmail());
                    
                    habilitarInput(inputNombres);
                    habilitarInput(inputApellidos);
                    habilitarInput(inputTelefono);
                    habilitarInput(inputDireccion);
                    habilitarInput(inputEmail);
                     
                }else{
                    etqUsuarioEnc.setText("Usuario NO Encontrado");
                    deshabilitarInput(inputNombres);
                    deshabilitarInput(inputApellidos);
                    deshabilitarInput(inputTelefono);
                    deshabilitarInput(inputDireccion);
                    deshabilitarInput(inputEmail);
                }
            }  
        }
    }//GEN-LAST:event_btnBuscarActionPerformed
    
    public void deshabilitarInput(JTextField input){
        input.setEditable(false);
        input.setEnabled(false);
        input.setDisabledTextColor(Color.BLACK);
        input.setBackground(Color.GRAY);
    }
    
    public void habilitarInput(JTextField input){
        input.setEditable(true);
        input.setEnabled(true);
        input.setBackground(Color.WHITE);
    }
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        String nombres = inputNombres.getText();
        String apellidos = inputApellidos.getText();
        String direccion = inputDireccion.getText();
        String telefono = inputTelefono.getText();
        String email = inputEmail.getText();
        
        for(int i=0; i<this.ventanaMenu.listaPersonas.length;i++){
    
            if(this.ventanaMenu.listaPersonas[i]!=null){
                this.ventanaMenu.listaPersonas[i].setNombres(nombres);
                this.ventanaMenu.listaPersonas[i].setApellidos(apellidos);
                this.ventanaMenu.listaPersonas[i].setDireccion(direccion);
                this.ventanaMenu.listaPersonas[i].setTelefono(telefono);
                this.ventanaMenu.listaPersonas[i].setEmail(email);
            }  
        }
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnModificarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JPanel contentMenu;
    private javax.swing.JPanel contentPrincipal;
    private javax.swing.JLabel etqApellidos;
    private javax.swing.JLabel etqCedula;
    private javax.swing.JLabel etqDireccion;
    private javax.swing.JLabel etqEmail;
    private javax.swing.JLabel etqMenu;
    private javax.swing.JLabel etqNombres;
    private javax.swing.JLabel etqSeparamiento;
    private javax.swing.JLabel etqTelefono;
    private javax.swing.JLabel etqUsuarioEnc;
    private javax.swing.JTextField inputApellidos;
    private javax.swing.JTextField inputCedula;
    private javax.swing.JTextField inputDireccion;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JTextField inputNombres;
    private javax.swing.JTextField inputTelefono;
    // End of variables declaration//GEN-END:variables
}
