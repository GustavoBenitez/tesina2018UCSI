package insumos;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import insumos.registroInsumo;
import rojerusan.RSNotifyShadowAnimated;

/**
 *
 * @author Gustavo
 */
public class insumos extends javax.swing.JInternalFrame {
    public insumos() {
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        initComponents();
        
        jPopupMenu1.add(menuInsumo);
        FuncionesInsumo.cargarListaPRO();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuInsumo = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnVerPrecios = new javax.swing.JButton();
        btnBaja = new javax.swing.JButton();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaInsumos = new rojerusan.RSTableMetro();
        btnNuevoInsumo = new rojerusan.RSButtonIconI();
        txtBuscarInsumo = new rojerusan.RSMetroTextFullPlaceHolder();
        jButton1 = new javax.swing.JButton();
        jcbFiltroInsumo = new rojerusan.RSComboMetro();
        jPanel2 = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listProveedores = new javax.swing.JList<>();
        btntodos = new rojerusan.RSButtonRound();

        menuInsumo.setBackground(new java.awt.Color(255, 255, 255));

        btnEditar.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        btnEditar.setText("Editar");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder1 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder1.setShowLeftShadow(true);
        dropShadowBorder1.setShowTopShadow(true);
        btnEditar.setBorder(dropShadowBorder1);
        btnEditar.setContentAreaFilled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder2 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder2.setShowLeftShadow(true);
        dropShadowBorder2.setShowTopShadow(true);
        btnEliminar.setBorder(dropShadowBorder2);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnVerPrecios.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        btnVerPrecios.setText("Ver Precios");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder3 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder3.setShowLeftShadow(true);
        dropShadowBorder3.setShowTopShadow(true);
        btnVerPrecios.setBorder(dropShadowBorder3);
        btnVerPrecios.setContentAreaFilled(false);
        btnVerPrecios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVerPreciosMouseClicked(evt);
            }
        });

        btnBaja.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        btnBaja.setText("Dar de Baja");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder4 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder4.setShowLeftShadow(true);
        dropShadowBorder4.setShowTopShadow(true);
        btnBaja.setBorder(dropShadowBorder4);
        btnBaja.setContentAreaFilled(false);
        btnBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuInsumoLayout = new javax.swing.GroupLayout(menuInsumo);
        menuInsumo.setLayout(menuInsumoLayout);
        menuInsumoLayout.setHorizontalGroup(
            menuInsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuInsumoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuInsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVerPrecios, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(btnBaja, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        menuInsumoLayout.setVerticalGroup(
            menuInsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuInsumoLayout.createSequentialGroup()
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVerPrecios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBaja)
                .addContainerGap())
        );

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder5 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder5.setShowLeftShadow(true);
        dropShadowBorder5.setShowTopShadow(true);
        jPanel3.setBorder(dropShadowBorder5);

        tablaInsumos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Tipo", "Nombre", "Stock"
            }
        ));
        tablaInsumos.setColorBackgoundHead(new java.awt.Color(69, 167, 154));
        tablaInsumos.setColorBordeFilas(new java.awt.Color(69, 167, 154));
        tablaInsumos.setColorBordeHead(new java.awt.Color(69, 167, 154));
        tablaInsumos.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tablaInsumos.setColorFilasForeground1(new java.awt.Color(102, 102, 102));
        tablaInsumos.setColorFilasForeground2(new java.awt.Color(102, 102, 102));
        tablaInsumos.setColorSelBackgound(new java.awt.Color(69, 167, 154));
        tablaInsumos.setComponentPopupMenu(jPopupMenu1);
        tablaInsumos.setFuenteFilas(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        tablaInsumos.setFuenteFilasSelect(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        tablaInsumos.setFuenteHead(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        tablaInsumos.setGridColor(new java.awt.Color(153, 153, 153));
        tablaInsumos.setGrosorBordeFilas(0);
        tablaInsumos.setSelectionBackground(new java.awt.Color(69, 167, 154));
        jScrollPane1.setViewportView(tablaInsumos);

        btnNuevoInsumo.setBackground(new java.awt.Color(69, 167, 154));
        btnNuevoInsumo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Add.png"))); // NOI18N
        btnNuevoInsumo.setText("Nuevo");
        btnNuevoInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoInsumoActionPerformed(evt);
            }
        });

        txtBuscarInsumo.setForeground(new java.awt.Color(69, 167, 154));
        txtBuscarInsumo.setBorderColor(new java.awt.Color(69, 167, 154));
        txtBuscarInsumo.setBotonColor(new java.awt.Color(69, 167, 154));
        txtBuscarInsumo.setPhColor(new java.awt.Color(71, 120, 197));
        txtBuscarInsumo.setPlaceholder("Buscar....");
        txtBuscarInsumo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarInsumoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarInsumoKeyTyped(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editfind_104370.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);

        jcbFiltroInsumo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Buscar Por:", "Tipo", "Nombre" }));
        jcbFiltroInsumo.setColorArrow(new java.awt.Color(69, 167, 154));
        jcbFiltroInsumo.setColorBorde(new java.awt.Color(69, 167, 154));
        jcbFiltroInsumo.setColorFondo(new java.awt.Color(69, 167, 154));
        jcbFiltroInsumo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(69, 167, 154));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/closeWhite.png"))); // NOI18N
        btnCerrar.setToolTipText("Cerrar");
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
        });
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(69, 167, 154));

        listProveedores.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(69, 167, 154), 2, true), "Lista de Proveedores", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Century Gothic", 1, 14), new java.awt.Color(69, 167, 154))); // NOI18N
        listProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listProveedoresMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listProveedores);

        btntodos.setText("Todos");
        btntodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntodosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btntodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btntodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(226, 226, 226)
                                .addComponent(btnNuevoInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(206, 206, 206)
                                .addComponent(txtBuscarInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(467, 467, 467)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jcbFiltroInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevoInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscarInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jcbFiltroInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnNuevoInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoInsumoActionPerformed
        registroInsumo reho = new registroInsumo(new JFrame(), true);
        reho.setVisible(true);
    }//GEN-LAST:event_btnNuevoInsumoActionPerformed

    private void txtBuscarInsumoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarInsumoKeyReleased
        FuncionesI.BuscarDatosInsumos(this.txtBuscarInsumo.getText(),jcbFiltroInsumo.getSelectedItem().toString());
    }//GEN-LAST:event_txtBuscarInsumoKeyReleased

    private void txtBuscarInsumoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarInsumoKeyTyped
        char letras = evt.getKeyChar();
        if (Character.isLowerCase(letras)) {
            String cad = ("" + letras).toUpperCase();
            letras = cad.charAt(0);
            evt.setKeyChar(letras);
        }
    }//GEN-LAST:event_txtBuscarInsumoKeyTyped

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int fila = tablaInsumos.getSelectedRow();
         updateInsumo upF = new updateInsumo(new JFrame(), true);
         FuncionesInsumo.cargarDatosUpdate(tablaInsumos.getValueAt(fila, 0).toString());
         FuncionesI.isListarInsumo("");
         jPopupMenu1.setVisible(false);
         upF.setVisible(true);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       int fila = tablaInsumos.getSelectedRow();
        Sentencias s = new Sentencias();
        s.setID_INSUMO(this.tablaInsumos.getValueAt(fila, 0).toString());
        if(JOptionPane.showConfirmDialog(this, "¿Desea Eliminar el Registro?","",
            JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION){
            if (FuncionesI.isDeleteInsumos(s)){
                FuncionesI.extraerIDMaxInsumo();
                FuncionesI.isListarInsumo("");
                JOptionPane.showMessageDialog(this, "Registro Eliminado con exito.", "Información", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Error al intentar eliminar el registro.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        jPopupMenu1.setVisible(false);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void listProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listProveedoresMouseClicked
       Integer list = listProveedores.getSelectedIndex()+1;
       String name ="";
       name =  listProveedores.getSelectedValue();
       if(list==0){
           new rojerusan.RSNotifyShadowAnimated("Oops!", "Falta Seleccionar el Proveedor", 5, RSNotifyShadowAnimated.PositionNotify.TopLef, RSNotifyShadowAnimated.AnimationNotify.UpBottom, RSNotifyShadowAnimated.TypeNotify.WARNING).setVisible(true);
       }else {
           System.out.println("id Seleccionado: "+list+"el nombre es: "+name);
            FuncionesInsumo.filtroInsumoXproveedor(list, name);
       }
    }//GEN-LAST:event_listProveedoresMouseClicked

    private void btntodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntodosActionPerformed
      FuncionesI.isListarInsumo("");
    }//GEN-LAST:event_btntodosActionPerformed

    private void btnVerPreciosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerPreciosMouseClicked
        detallePrecios depre = new detallePrecios(new JFrame(), true);
        int fila = tablaInsumos.getSelectedRow();
        String  id = "";
        if(fila==-1){
             new rojerusan.RSNotifyShadowAnimated("Oops!", "Falta Seleccionar el Insumo", 5, RSNotifyShadowAnimated.PositionNotify.TopLef, RSNotifyShadowAnimated.AnimationNotify.UpBottom, RSNotifyShadowAnimated.TypeNotify.WARNING).setVisible(true);        
        }
        id =  (String)tablaInsumos.getValueAt(fila, 0);
        FuncionesInsumo.listarPrecios(id);
        jPopupMenu1.setVisible(false);
        depre.setVisible(true);
    }//GEN-LAST:event_btnVerPreciosMouseClicked

    private void btnBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaActionPerformed
       registroInventarioBaja baja = new registroInventarioBaja(new JFrame(), true);
       int fila = tablaInsumos.getSelectedRow();
       String  id = "";
       if(fila==-1){
            new rojerusan.RSNotifyShadowAnimated("Oops!", "Falta Seleccionar el Insumo", 5, RSNotifyShadowAnimated.PositionNotify.TopLef, RSNotifyShadowAnimated.AnimationNotify.UpBottom, RSNotifyShadowAnimated.TypeNotify.WARNING).setVisible(true);        
       }
       id =  (String)tablaInsumos.getValueAt(fila, 0);
       FuncionesInsumo.cargarInsumoProBaja(id);
       jPopupMenu1.setVisible(false);
       baja.lblIdInsumo.setText(id);
       baja.setVisible(true);
    }//GEN-LAST:event_btnBajaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBaja;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private rojerusan.RSButtonIconI btnNuevoInsumo;
    private javax.swing.JButton btnVerPrecios;
    private rojerusan.RSButtonRound btntodos;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public rojerusan.RSComboMetro jcbFiltroInsumo;
    public static javax.swing.JList<String> listProveedores;
    private javax.swing.JPanel menuInsumo;
    public static rojerusan.RSTableMetro tablaInsumos;
    private rojerusan.RSMetroTextFullPlaceHolder txtBuscarInsumo;
    // End of variables declaration//GEN-END:variables
}
