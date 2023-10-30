/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package restaurante_grupo41.Vistas;

import javax.swing.JOptionPane;
import restaurante_grupo41.Datos.ProductoData;
import restaurante_grupo41.Entidades.Producto;

/**
 *
 * @author CLAY
 */
public class VistaProducto extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaProducto
     */
    public VistaProducto() {
        initComponents();
        cargarCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBBuscar = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBAgregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtf_Id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTf_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTf_precio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTf_stock = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jCb_tipo = new javax.swing.JComboBox<>();
        jBVolver = new javax.swing.JButton();

        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jBModificar.setText("Modificar");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBAgregar.setText("Agregar");
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });

        jLabel1.setText("ID");

        jLabel2.setText("Nombre");

        jLabel3.setText("Precio");

        jLabel4.setText("Stock");

        jLabel5.setText("Tipo");

        jBVolver.setText("Volver");
        jBVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel4))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTf_nombre)
                            .addComponent(jtf_Id)
                            .addComponent(jTf_precio, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(jCb_tipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTf_stock))))
                .addContainerGap(301, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jBBuscar)
                                    .addComponent(jtf_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jBAgregar))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jTf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jBModificar))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jTf_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBEliminar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTf_stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jCb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jBVolver)
                .addContainerGap(190, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        ProductoData prodat = new ProductoData();
    
    String idText = jtf_Id.getText().trim();
    
    try {
        int id = Integer.parseInt(idText);
        Producto producto = prodat.buscarProducto(id);
        
        jTf_nombre.setText(producto.getNombre());
        Double precio = producto.getPrecio();
        jTf_precio.setText(precio.toString());
        Integer stock = producto.getStock();
        jTf_stock.setText(stock.toString());
        String tipo = producto.getTipo();
        
        for (int i = 0; i < 4; i++) {
            if (jCb_tipo.getItemAt(i).toString().contains(tipo)) {
                jCb_tipo.setSelectedIndex(i);
            }
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "El ID debe ser un número entero.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
            ProductoData prodat = new ProductoData();
    String nombre = jTf_nombre.getText().trim();
    String precioText = jTf_precio.getText().trim();
    String stockText = jTf_stock.getText().trim();

    if (nombre.matches(".*\\d+.*")) {
        JOptionPane.showMessageDialog(null, "El nombre no debe contener números.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    double precio;
    int stock;

    try {
        precio = Double.parseDouble(precioText);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "El precio debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        stock = Integer.parseInt(stockText);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "El stock debe ser un número entero válido.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    int valor = valorTipo(jCb_tipo.getSelectedItem().toString());
    String tipo = jCb_tipo.getItemAt(valor);

    Producto producto = new Producto(nombre, tipo, precio, stock, true);
    prodat.agregarProducto(producto);
    }//GEN-LAST:event_jBAgregarActionPerformed

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
         ProductoData prodat = new ProductoData();
    int id;

    try {
        id = Integer.parseInt(jtf_Id.getText().trim());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "El ID debe ser un número entero válido.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String nombre = jTf_nombre.getText().trim();
    String precioText = jTf_precio.getText().trim();
    String stockText = jTf_stock.getText().trim();

    if (nombre.matches(".*\\d+.*")) {
        JOptionPane.showMessageDialog(null, "El nombre no debe contener números.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    double precio;
    int stock;

    try {
        precio = Double.parseDouble(precioText);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "El precio debe ser un número decimal válido.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        stock = Integer.parseInt(stockText);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "El stock debe ser un número entero válido.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    int valor = valorTipo(jCb_tipo.getSelectedItem().toString());
    String tipo = jCb_tipo.getItemAt(valor);

    Producto producto = new Producto(id, nombre, tipo, precio, stock, true);
    prodat.modificarProducto(producto);
    }//GEN-LAST:event_jBModificarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        ProductoData prodat = new ProductoData();
        int id= Integer.parseInt(jtf_Id.getText().trim());
        String nombre=jTf_nombre.getText().trim();
        double precio = Double.parseDouble(jTf_precio.getText().trim());
        int stock= Integer.parseInt(jTf_stock.getText().trim());
        int valor = valorTipo(jCb_tipo.getSelectedItem().toString());
        String tipo = jCb_tipo.getItemAt(valor);
        
        Producto producto=new Producto(id,nombre, tipo, precio, stock, true);
        
        prodat.eliminarProducto(producto);
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVolverActionPerformed
        dispose();
    }//GEN-LAST:event_jBVolverActionPerformed

public void cargarCombo(){
    for (EnumCB opcion : EnumCB.values()) {
        jCb_tipo.addItem(opcion.getLabel());
    }
   }

private int valorTipo(String tipo){
     
    for (int i = 0; i<4;i++){
      if (jCb_tipo.getItemAt(i).toString().contains (tipo)){
          
       jCb_tipo.setSelectedIndex(i);
       return i;
        }       
    
}
    return 0;
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBVolver;
    private javax.swing.JComboBox<String> jCb_tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTf_nombre;
    private javax.swing.JTextField jTf_precio;
    private javax.swing.JTextField jTf_stock;
    private javax.swing.JTextField jtf_Id;
    // End of variables declaration//GEN-END:variables
}
