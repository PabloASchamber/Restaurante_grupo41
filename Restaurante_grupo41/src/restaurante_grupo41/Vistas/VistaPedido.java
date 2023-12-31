package restaurante_grupo41.Vistas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import restaurante_grupo41.Datos.MesaData;
import restaurante_grupo41.Datos.PedidoData;
import restaurante_grupo41.Datos.PedidoProductoData;
import restaurante_grupo41.Datos.ProductoData;
import restaurante_grupo41.Entidades.Mesa;
import restaurante_grupo41.Entidades.Mesero;
import restaurante_grupo41.Entidades.Pedido;
import restaurante_grupo41.Entidades.PedidoProducto;
import restaurante_grupo41.Entidades.Producto;

public class VistaPedido extends javax.swing.JInternalFrame {

    private Mesero m = null;

    public VistaPedido(Mesero mesero) {
        initComponents();
        cargarCombo();
        cargarMenu();
        cargarPedido();
        cargarComboMesa();
//        Pedido pedido=new Pedido();
        m = mesero;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpfondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTPedido = new javax.swing.JTable();
        jBOrdenar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTMenu = new javax.swing.JTable();
        jBQuitar = new javax.swing.JButton();
        jBVolver = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jcbTipo = new javax.swing.JComboBox<>();
        jBAgregar = new javax.swing.JButton();
        jCBMesa = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(246, 245, 243));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Mesa Nro");

        jTPedido.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "nombre", "cantidad", "precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTPedido);

        jBOrdenar.setBackground(new java.awt.Color(236, 178, 46));
        jBOrdenar.setText("Ordenar");
        jBOrdenar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOrdenarActionPerformed(evt);
            }
        });

        jLabel2.setText("Menú");

        jTMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "nombre", "precio", "stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTMenu);

        jBQuitar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBQuitar.setText("<<");
        jBQuitar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBQuitarActionPerformed(evt);
            }
        });

        jBVolver.setBackground(new java.awt.Color(236, 178, 46));
        jBVolver.setText("Volver");
        jBVolver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVolverActionPerformed(evt);
            }
        });

        jLabel3.setText("Pedido");

        jcbTipo.setBackground(new java.awt.Color(246, 245, 243));
        jcbTipo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jcbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoActionPerformed(evt);
            }
        });

        jBAgregar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBAgregar.setText(">>");
        jBAgregar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });

        jCBMesa.setBackground(new java.awt.Color(246, 245, 243));
        jCBMesa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jCBMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBMesaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpfondoLayout = new javax.swing.GroupLayout(jpfondo);
        jpfondo.setLayout(jpfondoLayout);
        jpfondoLayout.setHorizontalGroup(
            jpfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpfondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpfondoLayout.createSequentialGroup()
                        .addGroup(jpfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpfondoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 405, Short.MAX_VALUE)
                                .addComponent(jBQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpfondoLayout.createSequentialGroup()
                                .addComponent(jBVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29))
                    .addGroup(jpfondoLayout.createSequentialGroup()
                        .addGroup(jpfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpfondoLayout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpfondoLayout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addComponent(jcbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(226, 226, 226)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jCBMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(204, 217, Short.MAX_VALUE))))
            .addGroup(jpfondoLayout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(235, 235, 235))
        );
        jpfondoLayout.setVerticalGroup(
            jpfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpfondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGroup(jpfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpfondoLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jpfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jcbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpfondoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jpfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpfondoLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jBAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(jBQuitar))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jpfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBOrdenar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(82, 82, 82))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpfondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpfondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVolverActionPerformed
        dispose();
    }//GEN-LAST:event_jBVolverActionPerformed

    private void jcbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipoActionPerformed

        if (jcbTipo.getSelectedItem() != null) {
            String tipo = (String) jcbTipo.getSelectedItem().toString();
            cargarTablaMenu(tipo);
        }

    }//GEN-LAST:event_jcbTipoActionPerformed

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
        ProductoData prodat = new ProductoData();
 
        validarPedido();
        int filas = jTMenu.getSelectedRow();
        if (filas != -1) {
            Integer id = Integer.valueOf(modelo.getValueAt(filas, 2).toString().trim());
            Producto producto = prodat.buscarProducto(id);
           Pedido pedido = validarPedido();
            boolean productoEnLista = false;

            for (PedidoProducto pd : ListaPedido) {
                if (pd.getProducto().getNombre().equals(producto.getNombre())) {
                    // Si el producto ya está en la lista, actualiza la cantidad
                    pd.setCantidad(pd.getCantidad() + 1);
                 
                    productoEnLista = true;
                    break;
                }
            }

            if (!productoEnLista) {
                // Si el producto no está en la lista, agrégalo con cantidad 1
                PedidoProducto pp = new PedidoProducto(pedido, producto, 1);
                ListaPedido.add(pp);
            }
            cargarTablaPedido();
            jTPedido.repaint();
        }


    }//GEN-LAST:event_jBAgregarActionPerformed

    private void jBQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBQuitarActionPerformed

//        int filas = jTPedido.getSelectedRow();
//        if (filas != -1) {
//            modeloped.removeRow(filas);
//            jTPedido.repaint();
//        }
 int filaSeleccionada = jTPedido.getSelectedRow();
    if (filaSeleccionada != -1) {
        // Obtén el nombre del producto en la fila seleccionada
        String nombreProducto = (String) jTPedido.getValueAt(filaSeleccionada, 0);

        // Itera sobre la lista de pedidos para encontrar el producto y eliminarlo
        Iterator<PedidoProducto> iter = ListaPedido.iterator();
        while (iter.hasNext()) {
            PedidoProducto pd = iter.next();
            if (pd.getProducto().getNombre().equals(nombreProducto)) {
                iter.remove();
            }
        }

        // Actualiza la tabla de pedido
        cargarTablaPedido();
        jTPedido.repaint();
    }

    }//GEN-LAST:event_jBQuitarActionPerformed

    private void jCBMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBMesaActionPerformed

        if (jCBMesa.getSelectedItem() != null) {
            Mesa mesa = (Mesa) jCBMesa.getSelectedItem();
       // Borra los elementos de la lista de pedidos
        ListaPedido.clear();
        
        // Actualiza la tabla de pedido
        cargarTablaPedido();
        jTPedido.repaint();
        }
    }//GEN-LAST:event_jCBMesaActionPerformed


    private void jBOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOrdenarActionPerformed
        PedidoProductoData ppdata = new PedidoProductoData();
        PedidoData pdata=new PedidoData();
        Pedido pedido  = validarPedido();
        double total=0;
        for (PedidoProducto p : ListaPedido) {
     
            ppdata.NuevoPedidoProducto(p);
            double subtotal = p.getProducto().getPrecio() * p.getCantidad();
            total += subtotal;
         
        }
       
          pedido.setTotal(pedido.getTotal()+ total);
        System.out.println("total " + total);
       pdata.actualizarTotal(pedido);
    }//GEN-LAST:event_jBOrdenarActionPerformed

    public void cargarCombo() {
        for (EnumCB opcion : EnumCB.values()) {
            jcbTipo.addItem(opcion.getLabel());
        }
    }

    private DefaultTableModel modelo = new DefaultTableModel();

    public void cargarMenu() {
        modelo.addColumn("nombre");
        modelo.addColumn("precio");
        modelo.addColumn("id");
        jTMenu.setModel(modelo);

    }
    private DefaultTableModel modeloped = new DefaultTableModel();

    public void cargarPedido() {
        modeloped.addColumn("nombre");
        modeloped.addColumn("cantidad");
        modeloped.addColumn("precio");
        jTPedido.setModel(modeloped);
    }
    
    private ArrayList<PedidoProducto> ListaPedido = new ArrayList<>();

    public void cargarTablaPedido() {
        jTPedido.getModel();
        modeloped.setRowCount(0);
        jTPedido.repaint();

        for (PedidoProducto pd : ListaPedido) {
            modeloped.addRow(new Object[]{pd.getProducto().getNombre(), pd.getCantidad(), pd.getProducto().getPrecio()});
          
        }
        
        jTPedido.repaint();

    }

    public Pedido validarPedido() {
        PedidoData pdata = new PedidoData();
        Mesa mesa = (Mesa) jCBMesa.getSelectedItem();
        Pedido pedido = pdata.buscarPedidoMesa(mesa.getNumero());
        System.out.println("validar pedido antes del if"+pedido);
        if (pedido.getIdpedido() == 0) {
            LocalDate fecha = LocalDate.now();
            pedido = new Pedido();
            pedido.setMesero(this.m);
            pedido.setMesa(mesa);
            pedido.setTotal(0);
            pedido.setFechaHora(fecha);
            pdata.agregarPedido(pedido);
            System.out.println("id pedido"+pedido.getIdpedido());
            Pedido p= pdata.buscarPedidoMesa(mesa.getNumero());
            int id=p.getIdpedido();
            System.out.println("id "+id);
            pedido.setIdpedido(id);
            System.out.println("pedido pots id "+pedido.getIdpedido());
            
        }
        return pedido;

    }

    public void cargarTablaMenu(String tipo) {

        jTMenu.getModel();
        modelo.setRowCount(0);
        jTMenu.repaint();
        ProductoData prodat = new ProductoData();
        if (jcbTipo.getSelectedItem() != null) {

            ArrayList<Producto> ListaMenu = prodat.listaTipo(tipo);

            for (Producto p : ListaMenu) {

                modelo.addRow(new Object[]{p.getNombre(), p.getPrecio(), p.getIdProducto()});
            }

        }

    }

    public void cargarComboMesa() {

        MesaData medat = new MesaData();
        ArrayList<Mesa> mesas = medat.listaMesasOcupadas();
        for (Mesa mesa : mesas) {
            jCBMesa.addItem(mesa);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBOrdenar;
    private javax.swing.JButton jBQuitar;
    private javax.swing.JButton jBVolver;
    private javax.swing.JComboBox<Mesa> jCBMesa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTMenu;
    private javax.swing.JTable jTPedido;
    private javax.swing.JComboBox<String> jcbTipo;
    private javax.swing.JPanel jpfondo;
    // End of variables declaration//GEN-END:variables
}
