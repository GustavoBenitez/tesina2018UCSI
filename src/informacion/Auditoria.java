package informacion;

import com.sun.xml.internal.fastinfoset.algorithm.IntEncodingAlgorithm;
import javax.swing.JFrame;
import rojerusan.RSNotifyShadowAnimated;

/**
 *
 * @author Gustavo
 */
public class Auditoria extends javax.swing.JInternalFrame {

    /**
     * Creates new form Auditoria
     */
    public Auditoria() {
        initComponents();
         ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
         FuncionesAudi.isListarAuditoria();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAuditoria = new rojerusan.RSTableMetro();
        jPanel2 = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jCalander = new rojerusan.RSCalendar();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnFiltrarFevhas = new rojerusan.RSButtonRound();
        txtBUscar = new rojerusan.RSMetroTextFullPlaceHolder();
        rSComboMetro1 = new rojerusan.RSComboMetro();
        jButton1 = new javax.swing.JButton();
        lblFechaAudi = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder1 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder1.setShowLeftShadow(true);
        dropShadowBorder1.setShowTopShadow(true);
        jPanel3.setBorder(dropShadowBorder1);

        tablaAuditoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Evento", "Tabla"
            }
        ));
        tablaAuditoria.setColorBackgoundHead(new java.awt.Color(69, 167, 154));
        tablaAuditoria.setColorBordeFilas(new java.awt.Color(69, 167, 154));
        tablaAuditoria.setColorBordeHead(new java.awt.Color(69, 167, 154));
        tablaAuditoria.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tablaAuditoria.setColorFilasForeground1(new java.awt.Color(102, 102, 102));
        tablaAuditoria.setColorFilasForeground2(new java.awt.Color(102, 102, 102));
        tablaAuditoria.setColorSelBackgound(new java.awt.Color(69, 167, 154));
        tablaAuditoria.setFuenteFilas(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        tablaAuditoria.setFuenteFilasSelect(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        tablaAuditoria.setFuenteHead(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        tablaAuditoria.setGridColor(new java.awt.Color(153, 153, 153));
        tablaAuditoria.setGrosorBordeFilas(0);
        tablaAuditoria.setSelectionBackground(new java.awt.Color(69, 167, 154));
        tablaAuditoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaAuditoriaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaAuditoria);
        tablaAuditoria.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tablaAuditoria.getColumnModel().getColumnCount() > 0) {
            tablaAuditoria.getColumnModel().getColumn(0).setMinWidth(10);
            tablaAuditoria.getColumnModel().getColumn(0).setMaxWidth(30);
        }

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
                .addContainerGap(983, Short.MAX_VALUE)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnCerrar)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(69, 167, 154));

        jCalander.setColorBackground(new java.awt.Color(75, 167, 180));
        jCalander.setColorButtonHover(new java.awt.Color(238, 52, 73));
        jCalander.setColorDiaActual(new java.awt.Color(0, 119, 233));
        jCalander.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jCalander.setFormatoFecha("dd/MM/yyyy");
        jCalander.setFuenteFilas(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jCalander.setFuenteHead(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Auditorias.");
        jLabel1.setToolTipText("");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        btnFiltrarFevhas.setBackground(new java.awt.Color(75, 167, 180));
        btnFiltrarFevhas.setText("Filtrar");
        btnFiltrarFevhas.setColorHover(new java.awt.Color(0, 150, 209));
        btnFiltrarFevhas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarFevhasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jCalander, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(btnFiltrarFevhas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCalander, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFiltrarFevhas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
        );

        txtBUscar.setForeground(new java.awt.Color(69, 167, 154));
        txtBUscar.setBorderColor(new java.awt.Color(204, 204, 204));
        txtBUscar.setBotonColor(new java.awt.Color(69, 167, 154));
        txtBUscar.setPhColor(new java.awt.Color(71, 120, 197));
        txtBUscar.setPlaceholder("Buscar....");
        txtBUscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBUscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBUscarKeyTyped(evt);
            }
        });

        rSComboMetro1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Buscar Por:", "Tabla", "Fecha", "Usuario", "Evento" }));
        rSComboMetro1.setColorArrow(new java.awt.Color(69, 167, 154));
        rSComboMetro1.setColorBorde(new java.awt.Color(69, 167, 154));
        rSComboMetro1.setColorFondo(new java.awt.Color(69, 167, 154));
        rSComboMetro1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editfind_104370.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblFechaAudi.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(rSComboMetro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBUscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFechaAudi, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFechaAudi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBUscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rSComboMetro1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tablaAuditoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaAuditoriaMouseClicked
       int fila = tablaAuditoria.getSelectedRow();
       String id="";
       if(fila==-1){
           new rojerusan.RSNotifyShadowAnimated("Oops!", "Falta Seleccionar la Auditoria", 5, RSNotifyShadowAnimated.PositionNotify.BottomRight, RSNotifyShadowAnimated.AnimationNotify.BottomUp, RSNotifyShadowAnimated.TypeNotify.ERROR).setVisible(true);
       }else{
           id = tablaAuditoria.getValueAt(fila, 0).toString();
           FuncionesAudi.mostrarQuienHizoenlaHora(id);
       }
    }//GEN-LAST:event_tablaAuditoriaMouseClicked

    private void txtBUscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBUscarKeyReleased
    FuncionesAudi.buscarAuditoria(txtBUscar.getText());
    }//GEN-LAST:event_txtBUscarKeyReleased

    private void txtBUscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBUscarKeyTyped
         char letras = evt.getKeyChar();
        if (Character.isLowerCase(letras)) {
            String cad = ("" + letras).toUpperCase();
            letras = cad.charAt(0);
            evt.setKeyChar(letras);
        }
    }//GEN-LAST:event_txtBUscarKeyTyped

    private void btnFiltrarFevhasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarFevhasActionPerformed
        String fechas=jCalander.getFechaSeleccionada();
        System.out.println("fecha Seleccionada: "+fechas);
        FuncionesAudi.isListarAuditoriaxFecha(fechas);
    }//GEN-LAST:event_btnFiltrarFevhasActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private rojerusan.RSButtonRound btnFiltrarFevhas;
    private javax.swing.JButton jButton1;
    private rojerusan.RSCalendar jCalander;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JLabel lblFechaAudi;
    private rojerusan.RSComboMetro rSComboMetro1;
    public static rojerusan.RSTableMetro tablaAuditoria;
    private rojerusan.RSMetroTextFullPlaceHolder txtBUscar;
    // End of variables declaration//GEN-END:variables
}
