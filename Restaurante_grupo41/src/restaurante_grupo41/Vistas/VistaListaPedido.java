/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package restaurante_grupo41.Vistas;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import restaurante_grupo41.Datos.MesaData;
import restaurante_grupo41.Datos.PedidoData;
import restaurante_grupo41.Datos.PedidoProductoData;
import restaurante_grupo41.Entidades.Mesa;
import restaurante_grupo41.Entidades.Pedido;
import restaurante_grupo41.Entidades.PedidoProducto;

/**
 *
 * @author CLAY
 */
public class VistaListaPedido extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaListaPedido
     */
    public VistaListaPedido() {
        initComponents();
        cargarCombo ();
        armarTabla ();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLTotal = new javax.swing.JLabel();
        jcbMesas = new javax.swing.JComboBox<>();
        jLmesero = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jBVolver = new javax.swing.JButton();
        jBCobrar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setText("Mesero:");

        jcbMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMesasActionPerformed(evt);
            }
        });

        jLabel3.setText("Total");

        jBVolver.setText("Volver");
        jBVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVolverActionPerformed(evt);
            }
        });

        jBCobrar.setText("Cobrar");
        jBCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCobrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jcbMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159))
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLmesero, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jBVolver))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBCobrar)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jcbMesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLmesero, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBVolver)
                    .addComponent(jBCobrar))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMesasActionPerformed
        
      if (jcbMesas.getSelectedItem()!= null){
          
          Mesa mesa=  (Mesa) jcbMesas.getSelectedItem();
          cargarDatos(mesa);
      }  
        
    }//GEN-LAST:event_jcbMesasActionPerformed

    private void jBVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVolverActionPerformed
      dispose ();
    }//GEN-LAST:event_jBVolverActionPerformed

    private void jBCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCobrarActionPerformed
      
        PedidoData pd = new PedidoData();
        
        if (jcbMesas.getSelectedItem()!=null){
         Mesa mesa= (Mesa) jcbMesas.getSelectedItem();
         int nro=mesa.getNumero();
         Pedido pedido = pd.buscarPedidoMesa(nro);
          pd.cobrarPedido(pedido.getIdpedido());
        }
        
             
    }//GEN-LAST:event_jBCobrarActionPerformed
    public void cargarCombo (){
     
        MesaData medat= new MesaData();
        
        ArrayList <Mesa> mesas = medat.listaMesasCobrar();
     
        for (Mesa mesa: mesas){
                    
           jcbMesas.addItem(mesa);
        }
    }
        
    private DefaultTableModel modelo = new DefaultTableModel();
    
    public void armarTabla () {
     
     modelo.addColumn("nombre");
     modelo.addColumn("cantidad");
     modelo.addColumn("$/U");
     modelo.addColumn("total");
     jTable1.setModel(modelo);
     
    }
    public void cargarDatos (Mesa mesa){
        
     jTable1.getModel();
     modelo.setRowCount(0);
     jTable1.repaint();
     
     PedidoProductoData pp= new PedidoProductoData ();
     
     if (mesa != null){
         
         ArrayList <PedidoProducto> ppro= pp.listaPedidos(mesa.getNumero());
         
      for (PedidoProducto pepro: ppro){
          double subtotal= pepro.getProducto().getPrecio()* pepro.getCantidad();
          
        modelo.addRow(new Object [] {pepro.getProducto().getNombre(), pepro.getCantidad(), pepro.getProducto().getPrecio(), subtotal});
      }  
    PedidoData pedat= new PedidoData ();
    Pedido ped= pedat.buscarPedidoMesa(mesa.getNumero());
    
    if (ped != null){
    jLmesero.setText(ped.getMesero().getNombre());
     
     Double total= ped.getTotal();
     jLTotal.setText(total.toString());
    }
     
      
     }
    
     
     
    }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCobrar;
    private javax.swing.JButton jBVolver;
    private javax.swing.JLabel jLTotal;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLmesero;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<Mesa> jcbMesas;
    // End of variables declaration//GEN-END:variables
}
