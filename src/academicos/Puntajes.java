/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academicos;

import javax.swing.JFrame;
import academicos.registroPuntajes;
import calificaciones.FuncionesCalificaiones;
import calificaciones.registroCalificacion;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import principal.FuncionesPrincipal;
import principal.nuevoPrincipal;
/**
 * @author Gustavo
 */
public class Puntajes extends javax.swing.JInternalFrame {

    /**
     * Creates new form Puntajes
     */
    public Puntajes() {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        FuncionesPuntajes.isCargarTabla("");
        jPopupMenu1.add(menuPuntaje);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPuntaje = new javax.swing.JPanel();
        btnEdiat = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAgregarNota = new javax.swing.JButton();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPuntajes = new rojerusan.RSTableMetro();
        txtBuscarPuntajes = new rojerusan.RSMetroTextFullPlaceHolder();
        jLabel1 = new javax.swing.JLabel();
        jcbFiltroPuntajes = new rojerusan.RSComboMetro();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();

        menuPuntaje.setBackground(new java.awt.Color(255, 255, 255));

        btnEdiat.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnEdiat.setText("Editar");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder1 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder1.setShowLeftShadow(true);
        dropShadowBorder1.setShowTopShadow(true);
        btnEdiat.setBorder(dropShadowBorder1);
        btnEdiat.setContentAreaFilled(false);
        btnEdiat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdiatActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
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

        btnAgregarNota.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnAgregarNota.setText("Nota Final");
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder3 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder3.setShowLeftShadow(true);
        dropShadowBorder3.setShowTopShadow(true);
        btnAgregarNota.setBorder(dropShadowBorder3);
        btnAgregarNota.setContentAreaFilled(false);
        btnAgregarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarNotaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPuntajeLayout = new javax.swing.GroupLayout(menuPuntaje);
        menuPuntaje.setLayout(menuPuntajeLayout);
        menuPuntajeLayout.setHorizontalGroup(
            menuPuntajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPuntajeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuPuntajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEdiat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(btnAgregarNota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        menuPuntajeLayout.setVerticalGroup(
            menuPuntajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPuntajeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEdiat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregarNota)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(dropShadowBorder4, "Información sobre los Puntajes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Century Schoolbook", 3, 24))); // NOI18N

        tablaPuntajes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "   ", "Alumnos", "Tipo de Puntaje", "Modulo", "Puntajes", "Total Puntaje", "Observación"
            }
        ));
        tablaPuntajes.setColorBackgoundHead(new java.awt.Color(69, 167, 154));
        tablaPuntajes.setColorBordeFilas(new java.awt.Color(69, 167, 154));
        tablaPuntajes.setColorBordeHead(new java.awt.Color(69, 167, 154));
        tablaPuntajes.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tablaPuntajes.setColorFilasForeground1(new java.awt.Color(102, 102, 102));
        tablaPuntajes.setColorFilasForeground2(new java.awt.Color(102, 102, 102));
        tablaPuntajes.setColorSelBackgound(new java.awt.Color(69, 167, 154));
        tablaPuntajes.setComponentPopupMenu(jPopupMenu1);
        tablaPuntajes.setGrosorBordeFilas(0);
        jScrollPane1.setViewportView(tablaPuntajes);
        if (tablaPuntajes.getColumnModel().getColumnCount() > 0) {
            tablaPuntajes.getColumnModel().getColumn(0).setMinWidth(10);
            tablaPuntajes.getColumnModel().getColumn(0).setMaxWidth(50);
            tablaPuntajes.getColumnModel().getColumn(6).setResizable(false);
        }

        txtBuscarPuntajes.setForeground(new java.awt.Color(69, 167, 154));
        txtBuscarPuntajes.setBorderColor(new java.awt.Color(255, 255, 255));
        txtBuscarPuntajes.setBotonColor(new java.awt.Color(69, 167, 154));
        txtBuscarPuntajes.setPhColor(new java.awt.Color(69, 167, 154));
        txtBuscarPuntajes.setPlaceholder("Buscar");
        txtBuscarPuntajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarPuntajesActionPerformed(evt);
            }
        });
        txtBuscarPuntajes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarPuntajesKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarPuntajesKeyTyped(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editfind_104370.png"))); // NOI18N

        jcbFiltroPuntajes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Buscar Por:", "Alumno", "Modulo", "Tipo Puntaje", "Puntaje" }));
        jcbFiltroPuntajes.setColorArrow(new java.awt.Color(69, 167, 154));
        jcbFiltroPuntajes.setColorBorde(new java.awt.Color(69, 167, 154));
        jcbFiltroPuntajes.setColorFondo(new java.awt.Color(69, 167, 154));
        jcbFiltroPuntajes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jSeparator1.setBackground(new java.awt.Color(69, 167, 154));
        jSeparator1.setForeground(new java.awt.Color(69, 167, 154));
        jSeparator1.setToolTipText("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 408, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(txtBuscarPuntajes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jcbFiltroPuntajes, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscarPuntajes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbFiltroPuntajes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(69, 167, 154));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder5 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder5.setShowLeftShadow(true);
        dropShadowBorder5.setShowTopShadow(true);
        jPanel2.setBorder(dropShadowBorder5);
        jPanel2.setEnabled(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(920, 89));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/closeWhite.png"))); // NOI18N
        btnCerrar.setBorderPainted(false);
        btnCerrar.setContentAreaFilled(false);
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
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarPuntajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarPuntajesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarPuntajesActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
      this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void txtBuscarPuntajesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarPuntajesKeyTyped
         char letras = evt.getKeyChar();
        if (Character.isLowerCase(letras)) {
            String cad = ("" + letras).toUpperCase();
            letras = cad.charAt(0);
            evt.setKeyChar(letras);
        }
    }//GEN-LAST:event_txtBuscarPuntajesKeyTyped

    private void txtBuscarPuntajesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarPuntajesKeyReleased
        if(jcbFiltroPuntajes.getSelectedIndex()==0){
            JOptionPane.showConfirmDialog(null, "Falta Selecionar el filtro");
            
        }else{
             FuncionesPuntajes.isBuscarDatos(txtBuscarPuntajes.getText(), jcbFiltroPuntajes.getSelectedItem().toString());
        }
       
    }//GEN-LAST:event_txtBuscarPuntajesKeyReleased

    private void btnEdiatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdiatActionPerformed
        // jPopupMenu1.setEnabled(false);
        int fila = tablaPuntajes.getSelectedRow();
         updatePuntajes upF = new updatePuntajes(new JFrame(), true);
         upF.jcbAlumno.setSelectedItem(tablaPuntajes.getValueAt(fila, 1).toString());
         upF.jcbTipoPuntajeUp.setSelectedItem(tablaPuntajes.getValueAt(fila, 2).toString());
         upF.txtPuntajeUP.setText(tablaPuntajes.getValueAt(fila, 4).toString());
         upF.txtObsUp.setText(tablaPuntajes.getValueAt(fila, 5).toString());
         upF.lblIdUp.setText(tablaPuntajes.getValueAt(fila, 0).toString());
         FuncionesPuntajes.isCargarTabla("");
         upF.setVisible(true);
    }//GEN-LAST:event_btnEdiatActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       jPopupMenu1.setEnabled(false);
        String tabla="PUNTAJES", evento="DELETE", hora=nuevoPrincipal.lblHora.getText(), fecha=nuevoPrincipal.lblFechaAc.getText();
        int fila = tablaPuntajes.getSelectedRow();
        SentenciasPuntajes s = new SentenciasPuntajes();
        s.setID_PUNTAJE(tablaPuntajes.getValueAt(fila, 0).toString());
        if(JOptionPane.showConfirmDialog(this, "¿Desea Eliminar el Registro?","",
            JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION){
            if (FuncionesPuntajes.isDelete(s)){
                FuncionesPuntajes.isCargarTabla("");
                 registroPuntajes.lblIdPuntaje.setText(FuncionesPuntajes.extraerIDMax());
                 FuncionesPrincipal.auditorias(login.Login.idUsu, hora, evento, tabla, fecha);
              //  JOptionPane.showMessageDialog(this, "Registro Eliminado con exito.", "Información", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Error al intentar eliminar el registro.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarNotaActionPerformed
        registroCalificacion regIns = new registroCalificacion(new JFrame(), true);
        DefaultTableModel model = (DefaultTableModel) registroCalificacion.tablaPuntajeSuma.getModel();
        String[] filas = new String[2];
        int fila[] = tablaPuntajes.getSelectedRows();//Recoge todas las filas Seleccionadas
        String tipo = "", puntaje = "", nomAlumno="", modu="";
        int cont = tablaPuntajes.getRowCount(), i;
        System.out.println(cont);
   
        try {
            for(i=0;i<fila.length;i++) { //Recoge todas las filas Seleccionadas para cargar los datos
                int j = fila[i];
                System.out.println("Datos Selecionados: "+fila[i]);
                tipo = (String) tablaPuntajes.getValueAt(j, 2);
                puntaje =  (String) tablaPuntajes.getValueAt(j, 4);
                nomAlumno = (String) tablaPuntajes.getValueAt(j, 1);
                modu = (String) tablaPuntajes.getValueAt(j, 3);
                System.out.println(tipo);
                System.out.println(puntaje);
                filas[0] = tipo;
                filas[1] = puntaje;
                model.addRow(filas);
            }
            FuncionesCalificaiones.isModulo(modu);
            registroCalificacion.lblNameAlumno.setText(nomAlumno);
         //   System.out.println("Datos Selecionados: "+i);
          //  System.out.println("Alumno Selecionado: "+nomAlumno);
            registroCalificacion.tablaPuntajeSuma.setModel(model);
            regIns.setVisible(true);
        } catch (Exception e) {
            System.err.println("error al enviar puntos"+e.getMessage());
        }
    }//GEN-LAST:event_btnAgregarNotaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarNota;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEdiat;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private rojerusan.RSComboMetro jcbFiltroPuntajes;
    private javax.swing.JPanel menuPuntaje;
    public static rojerusan.RSTableMetro tablaPuntajes;
    private rojerusan.RSMetroTextFullPlaceHolder txtBuscarPuntajes;
    // End of variables declaration//GEN-END:variables
}
