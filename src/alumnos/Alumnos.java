
package alumnos;

import informacion.registroInscrip;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import principal.FuncionesPrincipal;
import principal.nuevoPrincipal;

/**
 *
 * @author Gustavo
 */
public class Alumnos extends javax.swing.JInternalFrame {

    
    public Alumnos() {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        FuncionesAlumnos.iscargarTabla("");
        jPopupMenuAlum.add(menuAlum);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuAlum = new javax.swing.JPanel();
        btnAgregaINs = new javax.swing.JButton();
        btnEdiaAlum = new javax.swing.JButton();
        btnEliminarAlum = new javax.swing.JButton();
        jPopupMenuAlum = new javax.swing.JPopupMenu();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAlumno = new rojerusan.RSTableMetro();
        btnNuevoAlumn = new rojerusan.RSButtonIconI();
        txtBuscarAlumn = new rojerusan.RSMetroTextFullPlaceHolder();
        jButton1 = new javax.swing.JButton();
        jcbFiltroAlum = new rojerusan.RSComboMetro();
        separador = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();

        menuAlum.setBackground(new java.awt.Color(255, 255, 255));

        btnAgregaINs.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        btnAgregaINs.setText("Agregar Inscripción");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder1 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder1.setShowLeftShadow(true);
        dropShadowBorder1.setShowTopShadow(true);
        btnAgregaINs.setBorder(dropShadowBorder1);
        btnAgregaINs.setContentAreaFilled(false);
        btnAgregaINs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregaINsActionPerformed(evt);
            }
        });

        btnEdiaAlum.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        btnEdiaAlum.setText("Editar");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder2 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder2.setShowLeftShadow(true);
        dropShadowBorder2.setShowTopShadow(true);
        btnEdiaAlum.setBorder(dropShadowBorder2);
        btnEdiaAlum.setContentAreaFilled(false);
        btnEdiaAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdiaAlumActionPerformed(evt);
            }
        });

        btnEliminarAlum.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        btnEliminarAlum.setText("Eliminar");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder3 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder3.setShowLeftShadow(true);
        dropShadowBorder3.setShowTopShadow(true);
        btnEliminarAlum.setBorder(dropShadowBorder3);
        btnEliminarAlum.setContentAreaFilled(false);
        btnEliminarAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAlumActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuAlumLayout = new javax.swing.GroupLayout(menuAlum);
        menuAlum.setLayout(menuAlumLayout);
        menuAlumLayout.setHorizontalGroup(
            menuAlumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuAlumLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuAlumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminarAlum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEdiaAlum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregaINs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        menuAlumLayout.setVerticalGroup(
            menuAlumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuAlumLayout.createSequentialGroup()
                .addComponent(btnAgregaINs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEdiaAlum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(btnEliminarAlum)
                .addContainerGap())
        );

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setMaximumSize(new java.awt.Dimension(910, 650));
        setMinimumSize(new java.awt.Dimension(910, 650));
        setPreferredSize(new java.awt.Dimension(910, 650));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder4 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder4.setShowLeftShadow(true);
        dropShadowBorder4.setShowTopShadow(true);
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(dropShadowBorder4, "Información de los Alumnos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Gadugi", 1, 24))); // NOI18N

        tablaAlumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "   ", "Ciudad", "Nombre", "Apellido", "N° Cedula", "Dirección", "Email", "N° Celular"
            }
        ));
        tablaAlumno.setColorBackgoundHead(new java.awt.Color(69, 167, 154));
        tablaAlumno.setColorBordeFilas(new java.awt.Color(69, 167, 154));
        tablaAlumno.setColorBordeHead(new java.awt.Color(69, 167, 154));
        tablaAlumno.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tablaAlumno.setColorFilasForeground1(new java.awt.Color(102, 102, 102));
        tablaAlumno.setColorFilasForeground2(new java.awt.Color(102, 102, 102));
        tablaAlumno.setColorSelBackgound(new java.awt.Color(69, 167, 154));
        tablaAlumno.setComponentPopupMenu(jPopupMenuAlum);
        tablaAlumno.setFuenteFilas(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        tablaAlumno.setFuenteFilasSelect(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        tablaAlumno.setFuenteHead(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        tablaAlumno.setGridColor(new java.awt.Color(153, 153, 153));
        tablaAlumno.setGrosorBordeFilas(0);
        tablaAlumno.setSelectionBackground(new java.awt.Color(69, 167, 154));
        jScrollPane1.setViewportView(tablaAlumno);
        tablaAlumno.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tablaAlumno.getColumnModel().getColumnCount() > 0) {
            tablaAlumno.getColumnModel().getColumn(0).setMinWidth(10);
            tablaAlumno.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        btnNuevoAlumn.setBackground(new java.awt.Color(69, 167, 154));
        btnNuevoAlumn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(69, 167, 154), new java.awt.Color(69, 167, 154), new java.awt.Color(69, 167, 154), new java.awt.Color(69, 167, 154)));
        btnNuevoAlumn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Add.png"))); // NOI18N
        btnNuevoAlumn.setText("Nuevo");
        btnNuevoAlumn.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btnNuevoAlumn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevoAlumn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoAlumnActionPerformed(evt);
            }
        });

        txtBuscarAlumn.setForeground(new java.awt.Color(69, 167, 154));
        txtBuscarAlumn.setBorderColor(new java.awt.Color(255, 255, 255));
        txtBuscarAlumn.setBotonColor(new java.awt.Color(69, 167, 154));
        txtBuscarAlumn.setPhColor(new java.awt.Color(69, 167, 154));
        txtBuscarAlumn.setPlaceholder("Buscar....");
        txtBuscarAlumn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarAlumnActionPerformed(evt);
            }
        });
        txtBuscarAlumn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarAlumnKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarAlumnKeyTyped(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editfind_104370.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);

        jcbFiltroAlum.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Buscar Por:", "Nombre", "Apellido", "Cedula", "Ciudad" }));
        jcbFiltroAlum.setColorArrow(new java.awt.Color(69, 167, 154));
        jcbFiltroAlum.setColorBorde(new java.awt.Color(69, 167, 154));
        jcbFiltroAlum.setColorFondo(new java.awt.Color(69, 167, 154));
        jcbFiltroAlum.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        separador.setBackground(new java.awt.Color(69, 167, 154));
        separador.setForeground(new java.awt.Color(69, 167, 154));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnNuevoAlumn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(289, 289, 289)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtBuscarAlumn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jcbFiltroAlum, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnNuevoAlumn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jcbFiltroAlum, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtBuscarAlumn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(69, 167, 154));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder5 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder5.setShowLeftShadow(true);
        dropShadowBorder5.setShowTopShadow(true);
        jPanel2.setBorder(dropShadowBorder5);
        jPanel2.setMaximumSize(new java.awt.Dimension(272, 77));
        jPanel2.setMinimumSize(new java.awt.Dimension(272, 77));
        jPanel2.setName(""); // NOI18N

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
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(862, Short.MAX_VALUE)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnNuevoAlumnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoAlumnActionPerformed
       registroAlumnos realu = new registroAlumnos(new JFrame(), true);
       realu.setVisible(true);
    }//GEN-LAST:event_btnNuevoAlumnActionPerformed

    private void txtBuscarAlumnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarAlumnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarAlumnActionPerformed

    private void txtBuscarAlumnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarAlumnKeyTyped
        char letras = evt.getKeyChar();
        if (Character.isLowerCase(letras)) {
            String cad = ("" + letras).toUpperCase();
            letras = cad.charAt(0);
            evt.setKeyChar(letras);
        }
    }//GEN-LAST:event_txtBuscarAlumnKeyTyped

    private void txtBuscarAlumnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarAlumnKeyReleased
        FuncionesAlumnos.BuscarDatos(txtBuscarAlumn.getText(), jcbFiltroAlum.getSelectedItem().toString());
    }//GEN-LAST:event_txtBuscarAlumnKeyReleased

    private void btnEdiaAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdiaAlumActionPerformed
          int fila = tablaAlumno.getSelectedRow();
         updateAlumno upA = new updateAlumno(new JFrame(), true);
         upA.txtNomAlumUp.setText(tablaAlumno.getValueAt(fila, 1).toString());
         upA.txtApeAlumUp.setText(tablaAlumno.getValueAt(fila, 2).toString());
         upA.jcbCiudadesAlumUp.setSelectedItem(tablaAlumno.getValueAt(fila, 3).toString());
         upA.txtCiAlumnUp.setText(tablaAlumno.getValueAt(fila, 4).toString());
         upA.txtDirecAlumUp.setText(tablaAlumno.getValueAt(fila, 5).toString());
         upA.txtEmailAlumUp.setText(tablaAlumno.getValueAt(fila, 6).toString());
         upA.txtCeluAlumUp.setText(tablaAlumno.getValueAt(fila, 7).toString());
         upA.lblIdAlumUp.setText(tablaAlumno.getValueAt(fila, 0).toString());
         FuncionesAlumnos.iscargarTabla("");
         upA.setVisible(true);
    }//GEN-LAST:event_btnEdiaAlumActionPerformed

    private void btnEliminarAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAlumActionPerformed
        int fila = tablaAlumno.getSelectedRow();
         String tabla="ALUMNOS", evento="DELETE", hora=nuevoPrincipal.lblHora.getText(), fecha=nuevoPrincipal.lblFechaAc.getText();
        SentenciasAlumnos s = new SentenciasAlumnos();
        s.setID_ALUMNO(this.tablaAlumno.getValueAt(fila, 0).toString());
        if(JOptionPane.showConfirmDialog(this, "¿Desea Eliminar el Registro?","",
            JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION){
            if (FuncionesAlumnos.isDelete(s)){
                FuncionesAlumnos.iscargarTabla("");
                FuncionesPrincipal.auditorias(login.Login.idUsu, hora, evento, tabla, fecha);
                JOptionPane.showMessageDialog(this, "Registro Eliminado con exito.", "Información", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Error al intentar eliminar el registro.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnEliminarAlumActionPerformed

    private void btnAgregaINsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregaINsActionPerformed
        informacion.registroInscrip regIns = new registroInscrip(new JFrame(), true);
         String name = "", id = "", nom="", ape="";
        int fila = tablaAlumno.getSelectedRow();
        if(fila==-1){
            JOptionPane.showMessageDialog(null, "No ha seleccionado ningun dato");         
        }
         id =  (String)tablaAlumno.getValueAt(fila, 0);
         nom = (String) tablaAlumno.getValueAt(fila, 2);
         ape = (String) tablaAlumno.getValueAt(fila, 3);
         name = nom+" "+ape;
         registroInscrip.txtNameAlum.setText(name);
         registroInscrip.lblIdAlum.setText(id);
         jPopupMenuAlum.setVisible(false);
        regIns.setVisible(true);
    }//GEN-LAST:event_btnAgregaINsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregaINs;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEdiaAlum;
    private javax.swing.JButton btnEliminarAlum;
    private rojerusan.RSButtonIconI btnNuevoAlumn;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenuAlum;
    private javax.swing.JScrollPane jScrollPane1;
    private rojerusan.RSComboMetro jcbFiltroAlum;
    private javax.swing.JPanel menuAlum;
    private javax.swing.JSeparator separador;
    public static rojerusan.RSTableMetro tablaAlumno;
    private rojerusan.RSMetroTextFullPlaceHolder txtBuscarAlumn;
    // End of variables declaration//GEN-END:variables
}
