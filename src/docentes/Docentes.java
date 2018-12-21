package docentes;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import principal.nuevoPrincipal;
import rojerusan.RSNotifyAnimated;

/**
 *
 * @author Gustavo
 */
public class Docentes extends javax.swing.JInternalFrame {

    public Docentes() {
        
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        FuncionesDocentes.iscargarTabla("");
        jPopupMenuDOc.add(menuDoc);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuDoc = new javax.swing.JPanel();
        btnEditarDOc = new javax.swing.JButton();
        btnCloseDocc = new javax.swing.JButton();
        btnAgregarCurso = new javax.swing.JButton();
        btnVerCursos = new javax.swing.JButton();
        jPopupMenuDOc = new javax.swing.JPopupMenu();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDocente = new rojerusan.RSTableMetro();
        btnNuevoDocente = new rojerusan.RSButtonIconI();
        txtBuscarDocente = new rojerusan.RSMetroTextFullPlaceHolder();
        jButton1 = new javax.swing.JButton();
        jcbFiltroDocente = new rojerusan.RSComboMetro();
        separador = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();

        menuDoc.setBackground(new java.awt.Color(255, 255, 255));

        btnEditarDOc.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnEditarDOc.setText("Editar");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder1 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder1.setShowLeftShadow(true);
        dropShadowBorder1.setShowTopShadow(true);
        btnEditarDOc.setBorder(dropShadowBorder1);
        btnEditarDOc.setContentAreaFilled(false);
        btnEditarDOc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarDOcActionPerformed(evt);
            }
        });

        btnCloseDocc.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnCloseDocc.setText("Eliminar");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder2 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder2.setShowLeftShadow(true);
        dropShadowBorder2.setShowTopShadow(true);
        btnCloseDocc.setBorder(dropShadowBorder2);
        btnCloseDocc.setContentAreaFilled(false);
        btnCloseDocc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseDoccActionPerformed(evt);
            }
        });

        btnAgregarCurso.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnAgregarCurso.setText("Agregar Curso");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder3 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder3.setShowLeftShadow(true);
        dropShadowBorder3.setShowTopShadow(true);
        btnAgregarCurso.setBorder(dropShadowBorder3);
        btnAgregarCurso.setContentAreaFilled(false);
        btnAgregarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCursoActionPerformed(evt);
            }
        });

        btnVerCursos.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnVerCursos.setText("Ver Sus Cursos");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder4 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder4.setShowLeftShadow(true);
        dropShadowBorder4.setShowTopShadow(true);
        btnVerCursos.setBorder(dropShadowBorder4);
        btnVerCursos.setContentAreaFilled(false);
        btnVerCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerCursosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuDocLayout = new javax.swing.GroupLayout(menuDoc);
        menuDoc.setLayout(menuDocLayout);
        menuDocLayout.setHorizontalGroup(
            menuDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuDocLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditarDOc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCloseDocc, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(btnAgregarCurso, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(btnVerCursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        menuDocLayout.setVerticalGroup(
            menuDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuDocLayout.createSequentialGroup()
                .addComponent(btnEditarDOc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCloseDocc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVerCursos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregarCurso))
        );

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setMaximumSize(new java.awt.Dimension(910, 650));
        setMinimumSize(new java.awt.Dimension(910, 650));
        setPreferredSize(new java.awt.Dimension(910, 650));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder5 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder5.setShowLeftShadow(true);
        dropShadowBorder5.setShowTopShadow(true);
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(dropShadowBorder5, "Información de los Docentes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Gadugi", 1, 24))); // NOI18N

        tablaDocente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "  ", "Ciudad", "Nombre", "Apellido", "N° Cedula", "Dirección", "Email", "N° Celular"
            }
        ));
        tablaDocente.setColorBackgoundHead(new java.awt.Color(69, 167, 154));
        tablaDocente.setColorBordeFilas(new java.awt.Color(69, 167, 154));
        tablaDocente.setColorBordeHead(new java.awt.Color(69, 167, 154));
        tablaDocente.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tablaDocente.setColorFilasForeground1(new java.awt.Color(102, 102, 102));
        tablaDocente.setColorFilasForeground2(new java.awt.Color(102, 102, 102));
        tablaDocente.setColorSelBackgound(new java.awt.Color(69, 167, 154));
        tablaDocente.setComponentPopupMenu(jPopupMenuDOc);
        tablaDocente.setFuenteFilas(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        tablaDocente.setFuenteFilasSelect(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        tablaDocente.setFuenteHead(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        tablaDocente.setGridColor(new java.awt.Color(153, 153, 153));
        tablaDocente.setGrosorBordeFilas(0);
        tablaDocente.setSelectionBackground(new java.awt.Color(69, 167, 154));
        jScrollPane1.setViewportView(tablaDocente);
        tablaDocente.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tablaDocente.getColumnModel().getColumnCount() > 0) {
            tablaDocente.getColumnModel().getColumn(0).setMinWidth(10);
            tablaDocente.getColumnModel().getColumn(0).setMaxWidth(40);
        }

        btnNuevoDocente.setBackground(new java.awt.Color(69, 167, 154));
        btnNuevoDocente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Add.png"))); // NOI18N
        btnNuevoDocente.setText("Nuevo");
        btnNuevoDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoDocenteActionPerformed(evt);
            }
        });

        txtBuscarDocente.setForeground(new java.awt.Color(69, 167, 154));
        txtBuscarDocente.setBorderColor(new java.awt.Color(255, 255, 255));
        txtBuscarDocente.setBotonColor(new java.awt.Color(69, 167, 154));
        txtBuscarDocente.setPhColor(new java.awt.Color(69, 167, 154));
        txtBuscarDocente.setPlaceholder("Buscar....");
        txtBuscarDocente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarDocenteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarDocenteKeyTyped(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editfind_104370.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);

        jcbFiltroDocente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Buscar Por:", "Nombre", "Apellido", "Cedula", "Ciudad" }));
        jcbFiltroDocente.setColorArrow(new java.awt.Color(69, 167, 154));
        jcbFiltroDocente.setColorBorde(new java.awt.Color(69, 167, 154));
        jcbFiltroDocente.setColorFondo(new java.awt.Color(69, 167, 154));
        jcbFiltroDocente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbFiltroDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbFiltroDocenteActionPerformed(evt);
            }
        });

        separador.setBackground(new java.awt.Color(69, 167, 154));
        separador.setForeground(new java.awt.Color(69, 167, 154));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(btnNuevoDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 419, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(txtBuscarDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)))
                        .addComponent(jcbFiltroDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jButton1))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnNuevoDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBuscarDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jcbFiltroDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(69, 167, 154));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder6 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder6.setShowLeftShadow(true);
        dropShadowBorder6.setShowTopShadow(true);
        jPanel2.setBorder(dropShadowBorder6);

        btnCerrar.setForeground(new java.awt.Color(255, 0, 0));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/closeWhite.png"))); // NOI18N
        btnCerrar.setToolTipText("Cerrar");
        btnCerrar.setBorder(null);
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnNuevoDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoDocenteActionPerformed
       registroDocente redo = new registroDocente(new JFrame(), true);
       redo.setVisible(true);          
    }//GEN-LAST:event_btnNuevoDocenteActionPerformed

    private void txtBuscarDocenteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarDocenteKeyTyped
        char letras = evt.getKeyChar();
        if (Character.isLowerCase(letras)) {
            String cad = ("" + letras).toUpperCase();
            letras = cad.charAt(0);
            evt.setKeyChar(letras);
        }
    }//GEN-LAST:event_txtBuscarDocenteKeyTyped

    private void txtBuscarDocenteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarDocenteKeyReleased
        FuncionesDocentes.isBuscarDatos(txtBuscarDocente.getText(), jcbFiltroDocente.getSelectedItem().toString());
    }//GEN-LAST:event_txtBuscarDocenteKeyReleased

    private void btnEditarDOcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarDOcActionPerformed
        int fila = tablaDocente.getSelectedRow();
         updateDocentes upF = new updateDocentes(new JFrame(), true);
         upF.jcbCiudadDocUp.setSelectedItem(tablaDocente.getValueAt(fila, 1).toString());
         upF.txtNomDocUp.setText(tablaDocente.getValueAt(fila, 2).toString());
         upF.txtApeDocUp.setText(tablaDocente.getValueAt(fila, 3).toString());
         upF.txtCeduDocUp.setText(tablaDocente.getValueAt(fila, 4).toString());
         upF.txtDirecDocUp.setText(tablaDocente.getValueAt(fila, 5).toString());
         upF.txtEmailDocUp.setText(tablaDocente.getValueAt(fila, 6).toString());
         upF.txtCeluDocUp.setText(tablaDocente.getValueAt(fila, 7).toString());
         upF.lblIdDocUp.setText(tablaDocente.getValueAt(fila, 0).toString());
         FuncionesDocentes.iscargarTabla("");
         jPopupMenuDOc.setVisible(false);
         upF.setVisible(true);
    }//GEN-LAST:event_btnEditarDOcActionPerformed

    private void btnCloseDoccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseDoccActionPerformed
        jPopupMenuDOc.setVisible(false);
        int fila = tablaDocente.getSelectedRow();
        SentenciasDocentes s = new SentenciasDocentes();
        s.setID_DOCENTE(this.tablaDocente.getValueAt(fila, 0).toString());
        if(JOptionPane.showConfirmDialog(this, "¿Desea Eliminar el Registro?","",
            JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION){
            if (FuncionesDocentes.isDelete(s)){
                FuncionesDocentes.iscargarTabla("");
                 registroDocente.lblIdDoc.setText(FuncionesDocentes.extraerIDMax());
                JOptionPane.showMessageDialog(this, "Registro Eliminado con exito.", "Información", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Error al intentar eliminar el registro.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnCloseDoccActionPerformed

    private void jcbFiltroDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbFiltroDocenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbFiltroDocenteActionPerformed

    private void btnAgregarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCursoActionPerformed
        registroDocentesCurso regIns = new registroDocentesCurso(new JFrame(), true);
        String name = "", id = "", nom="", ape="";
        int fila = tablaDocente.getSelectedRow();
        if(fila==-1){
            JOptionPane.showMessageDialog(null, "No ha seleccionado ningun dato");         
        }
         id =  (String)tablaDocente.getValueAt(fila, 0);
         nom = (String) tablaDocente.getValueAt(fila, 2);
         ape = (String) tablaDocente.getValueAt(fila, 3);
         name = nom+" "+ape;
         registroDocentesCurso.txtNameDocCurso.setText(name);
         registroDocentesCurso.idDoc.setText(id);
         jPopupMenuDOc.setVisible(false);
         regIns.setVisible(true);
    }//GEN-LAST:event_btnAgregarCursoActionPerformed

    private void btnVerCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerCursosActionPerformed
       listDocentesCursos mo = new listDocentesCursos();
       String name = "", id = "", nom="", ape="";
       int fila = tablaDocente.getSelectedRow();
       if(fila==-1){
           new rojerusan.RSNotifyAnimated("Error!", "NO ha seleccionado el Docente", 5, RSNotifyAnimated.PositionNotify.BottomRight, RSNotifyAnimated.AnimationNotify.UpBottom, RSNotifyAnimated.TypeNotify.ERROR).setVisible(true);
       }
       id =  (String)tablaDocente.getValueAt(fila, 0);
       nom = (String) tablaDocente.getValueAt(fila, 2);
       ape = (String) tablaDocente.getValueAt(fila, 3);
       name = nom+" "+ape;
       principal.FuncionesPrincipal.CentrarVentanaInterna(mo);
       FuncionesDocentes.filtrarCursosdeDOcentes(name, id);
       jPopupMenuDOc.setVisible(false);
       mo.setVisible(true);
    }//GEN-LAST:event_btnVerCursosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCurso;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnCloseDocc;
    private javax.swing.JButton btnEditarDOc;
    private rojerusan.RSButtonIconI btnNuevoDocente;
    private javax.swing.JButton btnVerCursos;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenuDOc;
    private javax.swing.JScrollPane jScrollPane1;
    private rojerusan.RSComboMetro jcbFiltroDocente;
    private javax.swing.JPanel menuDoc;
    private javax.swing.JSeparator separador;
    public static rojerusan.RSTableMetro tablaDocente;
    private rojerusan.RSMetroTextFullPlaceHolder txtBuscarDocente;
    // End of variables declaration//GEN-END:variables
}
