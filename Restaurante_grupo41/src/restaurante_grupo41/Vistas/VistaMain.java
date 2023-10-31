package restaurante_grupo41.Vistas;

import java.awt.CardLayout;
import java.awt.Dimension;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import restaurante_grupo41.Datos.MeseroData;
import restaurante_grupo41.Entidades.Mesero;

public class VistaMain extends javax.swing.JFrame {

    private CardLayout cardLayout;

    private VistaMesero vistaMesero;
    private VistaPedido vpe;

    public VistaMain() {
        initComponents();
        jPanelOpciones.setVisible(false);
        vistaMesero = null;
        m = null;
        vpe = null;
//        VistaMain vm= new VistaMain ();
        this.setLocationRelativeTo(null);
//         centrarVentana (vpe);

    }
   
    
    
     public static void centrarVentana(JInternalFrame frame) {
        Dimension desktopSize = frame.getDesktopPane().getSize();
        Dimension jInternalFrameSize = frame.getSize();
        int width = (desktopSize.width - jInternalFrameSize.width) / 1;
        int height = (desktopSize.height - jInternalFrameSize.height) / 2;
        frame.setLocation(width, height);
        
     }
    
    
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane = new javax.swing.JDesktopPane();
        jPanelOpciones = new javax.swing.JPanel();
        jBMesa = new javax.swing.JButton();
        jBMesero = new javax.swing.JButton();
        jBPedido = new javax.swing.JButton();
        jBProducto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLNombre = new javax.swing.JLabel();
        jBSalir = new javax.swing.JButton();
        jbListaPedido = new javax.swing.JButton();
        jBFactura = new javax.swing.JButton();
        login = new javax.swing.JPanel();
        jLUsuario = new javax.swing.JLabel();
        jLPass = new javax.swing.JLabel();
        jTUsuario = new javax.swing.JTextField();
        jPPass = new javax.swing.JPasswordField();
        jLogo = new javax.swing.JLabel();
        jBIngresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane.setBackground(new java.awt.Color(246, 245, 243));

        jPanelOpciones.setBackground(new java.awt.Color(236, 178, 45));

        jBMesa.setBackground(new java.awt.Color(246, 245, 243));
        jBMesa.setText("Mesa");
        jBMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMesaActionPerformed(evt);
            }
        });

        jBMesero.setBackground(new java.awt.Color(246, 245, 243));
        jBMesero.setText("Mesero");
        jBMesero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMeseroActionPerformed(evt);
            }
        });

        jBPedido.setBackground(new java.awt.Color(246, 245, 243));
        jBPedido.setText("Pedido");
        jBPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPedidoActionPerformed(evt);
            }
        });

        jBProducto.setBackground(new java.awt.Color(246, 245, 243));
        jBProducto.setText("Producto");
        jBProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBProductoActionPerformed(evt);
            }
        });

        jLabel1.setText("Usuario:");

        jBSalir.setBackground(new java.awt.Color(246, 245, 243));
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jbListaPedido.setBackground(new java.awt.Color(246, 245, 243));
        jbListaPedido.setText("Lista Pedidos");
        jbListaPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbListaPedidoActionPerformed(evt);
            }
        });

        jBFactura.setBackground(new java.awt.Color(246, 245, 243));
        jBFactura.setText("Factura");
        jBFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFacturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelOpcionesLayout = new javax.swing.GroupLayout(jPanelOpciones);
        jPanelOpciones.setLayout(jPanelOpcionesLayout);
        jPanelOpcionesLayout.setHorizontalGroup(
            jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOpcionesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
            .addGroup(jPanelOpcionesLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jbListaPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                        .addComponent(jBMesero, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                        .addComponent(jBMesa, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                        .addComponent(jBProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanelOpcionesLayout.setVerticalGroup(
            jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOpcionesLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jBMesa)
                .addGap(18, 18, 18)
                .addComponent(jBMesero)
                .addGap(18, 18, 18)
                .addComponent(jBPedido)
                .addGap(24, 24, 24)
                .addComponent(jbListaPedido)
                .addGap(18, 18, 18)
                .addComponent(jBProducto)
                .addGap(18, 18, 18)
                .addComponent(jBFactura)
                .addGap(64, 64, 64)
                .addComponent(jBSalir)
                .addContainerGap(202, Short.MAX_VALUE))
        );

        login.setBackground(new java.awt.Color(246, 245, 243));

        jLUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLUsuario.setText("Usuario");

        jLPass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLPass.setText("Contraseña");

        jTUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTUsuarioActionPerformed(evt);
            }
        });

        jLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurante_grupo41/imagenes/1.jpg"))); // NOI18N

        jBIngresar.setBackground(new java.awt.Color(236, 178, 45));
        jBIngresar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBIngresar.setText("Ingresar");
        jBIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIngresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addContainerGap(225, Short.MAX_VALUE)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginLayout.createSequentialGroup()
                            .addGap(81, 81, 81)
                            .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLPass))
                            .addGap(103, 103, 103)
                            .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPPass, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(174, 174, 174)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginLayout.createSequentialGroup()
                        .addComponent(jBIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(274, 274, 274))))
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addComponent(jLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLUsuario)
                    .addComponent(jTUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLPass)
                    .addComponent(jPPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jBIngresar)
                .addGap(40, 40, 40))
        );

        jDesktopPane.setLayer(jPanelOpciones, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(login, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPaneLayout = new javax.swing.GroupLayout(jDesktopPane);
        jDesktopPane.setLayout(jDesktopPaneLayout);
        jDesktopPaneLayout.setHorizontalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPaneLayout.createSequentialGroup()
                .addComponent(jPanelOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jDesktopPaneLayout.setVerticalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPaneLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jPanelOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTUsuarioActionPerformed


    private void jBIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIngresarActionPerformed

        String usuario = jTUsuario.getText().trim();
        String pass = jPPass.getText().trim();
        Mesero mesero = new Mesero(usuario, pass);
        MeseroData medat = new MeseroData();
        this.m = medat.ingreso(mesero);

        if (m != null) {
            jPanelOpciones.setVisible(true);
            login.setVisible(false);

            jLNombre.setText(m.getUsuario());

        }

    }//GEN-LAST:event_jBIngresarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        jTUsuario.setText("");
        jPPass.setText("");
        jLNombre.setText("");
        jPanelOpciones.setVisible(false);
        login.setVisible(true);
        this.m = null;
        vistaMesero.dispose();

    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMesaActionPerformed

        VistaMesa vm = new VistaMesa();
        vm.setVisible(true);
        jDesktopPane.add(vm);
        centrarVentana (vm);
    }//GEN-LAST:event_jBMesaActionPerformed

    private void jBMeseroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMeseroActionPerformed

//        VistaMesero vme= new VistaMesero (m); // CORREGIR REVISAR
//        if (vistaMesero == null) {
            vistaMesero = new VistaMesero(m);
             vistaMesero.setVisible(true);
            jDesktopPane.add(vistaMesero);
            centrarVentana (vistaMesero);
       
    }//GEN-LAST:event_jBMeseroActionPerformed

    private void jBProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBProductoActionPerformed
        VistaProducto vp = new VistaProducto();
        vp.setVisible(true);
        jDesktopPane.add(vp);
        centrarVentana (vp);
    }//GEN-LAST:event_jBProductoActionPerformed

    private void jbListaPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbListaPedidoActionPerformed
        VistaListaPedido vlp = new VistaListaPedido();
        vlp.setVisible(true);
        jDesktopPane.add(vlp);
        centrarVentana (vlp);

    }//GEN-LAST:event_jbListaPedidoActionPerformed

    private void jBPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPedidoActionPerformed
        if (vpe == null) {
            vpe = new VistaPedido(m);
//            jDesktopPane.add(vpe);
        }
        
        vpe.setVisible (true);
        jDesktopPane.add(vpe);  // agregamos esta linea el 30/10 para que la ventana pedido vuelva a cargar
         centrarVentana (vpe);
          vpe.toFront();
         
    }//GEN-LAST:event_jBPedidoActionPerformed

    private void jBFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFacturaActionPerformed
        VistaListaPedido vlp = new VistaListaPedido();
        vlp.setVisible(true);
        jDesktopPane.add(vlp);
        centrarVentana (vlp);
    }//GEN-LAST:event_jBFacturaActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaMain().setVisible(true);
            }
        });
    }

    private Mesero m = new Mesero();


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBFactura;
    private javax.swing.JButton jBIngresar;
    private javax.swing.JButton jBMesa;
    private javax.swing.JButton jBMesero;
    private javax.swing.JButton jBPedido;
    private javax.swing.JButton jBProducto;
    private javax.swing.JButton jBSalir;
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLPass;
    private javax.swing.JLabel jLUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLogo;
    private javax.swing.JPasswordField jPPass;
    private javax.swing.JPanel jPanelOpciones;
    private javax.swing.JTextField jTUsuario;
    private javax.swing.JButton jbListaPedido;
    private javax.swing.JPanel login;
    // End of variables declaration//GEN-END:variables
}
