/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria;

import conexion.conectarBD;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Admin_Empleados extends javax.swing.JFrame {
    
    conectarBD con = new conectarBD();
    Connection cn=con.conectar();
    PreparedStatement pss;
    ResultSet rs;
       
    public Admin_Empleados() {
        initComponents();
        setLocationRelativeTo(null);
       TablaEmpleados();
    }
    
    private void limpiarcajas()
    {
        txtid.setText(null);
       // txtInfoEmp.setText(null);
    }
  
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        min = new javax.swing.JLabel();
        PanelAlta = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtFecNac = new javax.swing.JTextField();
        radMujer = new javax.swing.JRadioButton();
        radHombre = new javax.swing.JRadioButton();
        radCajero = new javax.swing.JRadioButton();
        radGerente = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        btnAltaUsuarios = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVista = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        PanelBaja = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnBaja = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        MAlta = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        MBaja = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 252, 242));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 252, 242));

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/x.png"))); // NOI18N
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        min.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/menos.png"))); // NOI18N
        min.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minMouseClicked(evt);
            }
        });

        PanelAlta.setBackground(new java.awt.Color(255, 252, 242));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Fecha de Nacimiento");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Sexo");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Puesto");

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtFecNac.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        radMujer.setBackground(new java.awt.Color(255, 252, 242));
        buttonGroup1.add(radMujer);
        radMujer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        radMujer.setText("Mujer");

        radHombre.setBackground(new java.awt.Color(255, 252, 242));
        buttonGroup1.add(radHombre);
        radHombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        radHombre.setText("Hombre");

        radCajero.setBackground(new java.awt.Color(255, 252, 242));
        buttonGroup2.add(radCajero);
        radCajero.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        radCajero.setText("Cajero");

        radGerente.setBackground(new java.awt.Color(255, 252, 242));
        buttonGroup2.add(radGerente);
        radGerente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        radGerente.setText("Gerente");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setText("ALTA EMPLEADOS");

        btnAltaUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btnAlta.png"))); // NOI18N
        btnAltaUsuarios.setContentAreaFilled(false);
        btnAltaUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaUsuariosActionPerformed(evt);
            }
        });

        tblVista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "id Creado", "Nombre", "Fecha de Nacimiento", "Sexo", "Puesto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVista);

        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("DD/MM/AAAA");

        jLabel15.setText("Vista general");

        javax.swing.GroupLayout PanelAltaLayout = new javax.swing.GroupLayout(PanelAlta);
        PanelAlta.setLayout(PanelAltaLayout);
        PanelAltaLayout.setHorizontalGroup(
            PanelAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAltaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(326, 326, 326))
            .addGroup(PanelAltaLayout.createSequentialGroup()
                .addGroup(PanelAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAltaLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(PanelAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelAltaLayout.createSequentialGroup()
                                .addComponent(txtFecNac, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel14))
                            .addGroup(PanelAltaLayout.createSequentialGroup()
                                .addComponent(radMujer)
                                .addGap(18, 18, 18)
                                .addComponent(radHombre))
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelAltaLayout.createSequentialGroup()
                                .addComponent(radCajero)
                                .addGap(18, 18, 18)
                                .addComponent(radGerente))
                            .addComponent(jLabel8)))
                    .addGroup(PanelAltaLayout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(btnAltaUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelAltaLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelAltaLayout.setVerticalGroup(
            PanelAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAltaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(PanelAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(PanelAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFecNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel5))
                .addGap(11, 11, 11)
                .addGroup(PanelAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(radMujer)
                    .addComponent(radHombre))
                .addGap(18, 18, 18)
                .addGroup(PanelAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(radCajero)
                    .addComponent(radGerente))
                .addGap(19, 19, 19)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnAltaUsuarios)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        PanelBaja.setBackground(new java.awt.Color(255, 252, 242));
        PanelBaja.setPreferredSize(new java.awt.Dimension(710, 476));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Id empleado");

        txtid.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel13.setText("BAJA EMPLEADOS");

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/buscar.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Informacion de empleados");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idUsuarios", "Nombre", "FecNac", "Sexo", "Puesto"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        btnBaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btnBaja.png"))); // NOI18N
        btnBaja.setContentAreaFilled(false);
        btnBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBajaLayout = new javax.swing.GroupLayout(PanelBaja);
        PanelBaja.setLayout(PanelBajaLayout);
        PanelBajaLayout.setHorizontalGroup(
            PanelBajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBajaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(263, 263, 263))
            .addGroup(PanelBajaLayout.createSequentialGroup()
                .addGroup(PanelBajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBajaLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelBajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelBajaLayout.createSequentialGroup()
                                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscar))))
                    .addGroup(PanelBajaLayout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(btnBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelBajaLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        PanelBajaLayout.setVerticalGroup(
            PanelBajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBajaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(30, 30, 30)
                .addGroup(PanelBajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBaja)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBaja, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(min)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(close)
                .addContainerGap())
            .addComponent(PanelAlta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(min)
                    .addComponent(close))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelBaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 730, 480));

        jPanel2.setBackground(new java.awt.Color(164, 113, 72));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MAlta.setBackground(new java.awt.Color(164, 113, 72));
        MAlta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MAlta.setPreferredSize(new java.awt.Dimension(217, 45));
        MAlta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MAltaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MAltaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MAltaMouseExited(evt);
            }
        });
        MAlta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Alta empleados");
        MAlta.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/granos-blancoS.png"))); // NOI18N
        MAlta.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel2.add(MAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 240, 50));

        MBaja.setBackground(new java.awt.Color(164, 113, 72));
        MBaja.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MBaja.setPreferredSize(new java.awt.Dimension(217, 45));
        MBaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MBajaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MBajaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MBajaMouseExited(evt);
            }
        });
        MBaja.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Baja empleados");
        MBaja.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/granos-blancoS.png"))); // NOI18N
        MBaja.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel2.add(MBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 212, 240, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logos.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MAltaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MAltaMouseClicked
        MAlta.setBackground(new Color(174,123,82));
        MBaja.setBackground(new Color(164,113,72));
        
        PanelAlta.setVisible(true);
        PanelBaja.setVisible(false);
    }//GEN-LAST:event_MAltaMouseClicked

    private void MBajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MBajaMouseClicked
        MAlta.setBackground(new Color(164,113,72));
        MBaja.setBackground(new Color(174,123,82));
        
        PanelAlta.setVisible(false);
        PanelBaja.setVisible(true);
    }//GEN-LAST:event_MBajaMouseClicked

    private void MAltaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MAltaMouseEntered
        MAlta.setBackground(new Color(174,123,82));
    }//GEN-LAST:event_MAltaMouseEntered

    private void MBajaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MBajaMouseEntered
        MBaja.setBackground(new Color(174,123,82));
    }//GEN-LAST:event_MBajaMouseEntered

    private void MAltaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MAltaMouseExited
        MAlta.setBackground(new Color(164,113,72));
    }//GEN-LAST:event_MAltaMouseExited

    private void MBajaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MBajaMouseExited
        MBaja.setBackground(new Color(164,113,72));
    }//GEN-LAST:event_MBajaMouseExited

    private void btnBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaActionPerformed

        try {
            pss = cn.prepareStatement("DELETE FROM usuarios WHERE idUsuarios= ?");
            pss.setString(1, txtid.getText());

            pss.executeUpdate();

            JOptionPane.showMessageDialog(null, "Usuario eliminado");
            limpiarcajas();

        } catch (SQLException ex) {
            Logger.getLogger(Admin_Empleados.class.getName()).log(Level.SEVERE, null, ex);
        }

        TablaEmpleados();
    }//GEN-LAST:event_btnBajaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        String[] titu= {"idUsuarios", "Nombre", "FecNac", "Sexo", "Puesto"};
        String[] registros;
        registros = new String[5];

        DefaultTableModel modelo= new DefaultTableModel(null,titu);

        String sql = "select * FROM usuarios";

        try {

            pss = cn.prepareStatement("SELECT * from usuarios WHERE idUsuarios = ?");
            pss.setString(1, txtid.getText());

            rs = pss.executeQuery();

            while(rs.next())
            {
                JOptionPane.showMessageDialog(null, "UsuarIO encontrado");
                registros[0]= rs.getString("idUsuarios");
                registros[1]= rs.getString("Nombre");
                registros[2]= rs.getString("FecNac");
                registros[3]= rs.getString("Sexo");
                registros[4]= rs.getString("Puesto");
                modelo.addRow(registros);

            }
            jTable1.setModel(modelo);

            // txtInfoEmp.setText("id: "+rs.getString("idUsuarios")+"\nNombre: "+rs.getString("Nombre")+"\nFechaN: "+rs.getString("FecNac")+"\nSexo:"+rs.getString("Sexo")+"\nPuesto: "+rs.getString("Puesto"));

            /*else
            {
                JOptionPane.showMessageDialog(null, "No existe empleado con esa clave");
            }*/

        } catch (SQLException e) {
            System.err.print(e);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void btnAltaUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaUsuariosActionPerformed
        int fila=0;
        
        DefaultTableModel modelo = (DefaultTableModel) tblVista.getModel();
        
        modelo.addRow(new Object[fila]);
        
        String puesto = null, sexo = null, usuario = null, nombre, FecNac, n=null;

        if(radCajero.isSelected())
        {
            puesto="Cajero";
        }else if (radGerente.isSelected())
        {
            puesto="Gerente";
        }

        if(radMujer.isSelected())
        {
            sexo="M";
        }else if (radHombre.isSelected())
        {
            sexo="H";
        }

        n = txtNombre.getText();
        FecNac = txtFecNac.getText();

        nombre=n.toUpperCase();

        if("Cajero".equals(puesto))
        {
            usuario=nombre.substring(0, 3)+"C"+FecNac.split("/")[0]+FecNac.split("/")[2];
        }else if("Gerente".equals(puesto))
        {
            usuario=nombre.substring(0, 3)+"G"+FecNac.split("/")[0]+FecNac.split("/")[2];
        }

        tblVista.setValueAt(usuario, fila,0);
        tblVista.setValueAt(nombre, fila, 1);
        tblVista.setValueAt(FecNac, fila, 2);
        tblVista.setValueAt(sexo, fila, 3);
        tblVista.setValueAt(puesto, fila, 4);

        try {
            pss = cn.prepareStatement("insert into usuarios(idUsuarios,Nombre,FecNac,Sexo,Puesto)  values(?, ?, ?, ?, ?)");
            pss.setString(1, usuario);
            pss.setString(2, txtNombre.getText());
            pss.setString(3, txtFecNac.getText());
            pss.setString(4, sexo);
            pss.setString(5, puesto);

            pss.executeUpdate();

            JOptionPane.showMessageDialog(null, "Usuario creado y guardado");
        } catch (SQLException ex) {
            Logger.getLogger(Admin_Empleados.class.getName()).log(Level.SEVERE, null, ex);
        }

        TablaEmpleados();
    }//GEN-LAST:event_btnAltaUsuariosActionPerformed

    private void minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseClicked
        this.setState(Menu_Administrador.ICONIFIED);
    }//GEN-LAST:event_minMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        Menu_Administrador obj = new Menu_Administrador();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_closeMouseClicked

    void TablaEmpleados(){   
     String[] titu= {"idUsuarios", "Nombre", "FecNac", "Sexo", "Puesto"};
     String[] registros;
        registros = new String[5];
     
     DefaultTableModel modelo= new DefaultTableModel(null,titu);
     
     String sql = "select * FROM usuarios";
     
        try {
           Statement st= cn.createStatement();
           rs= st.executeQuery(sql);
           
           while(rs.next())
           {
               registros[0]= rs.getString("idUsuarios");
               registros[1]= rs.getString("Nombre");
               registros[2]= rs.getString("FecNac");
               registros[3]= rs.getString("Sexo");
               registros[4]= rs.getString("Puesto");
               
               modelo.addRow(registros);
           }
           
          jTable1.setModel(modelo);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar datos"+e.getMessage());
        }
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin_Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Empleados().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MAlta;
    private javax.swing.JPanel MBaja;
    private javax.swing.JPanel PanelAlta;
    private javax.swing.JPanel PanelBaja;
    private javax.swing.JButton btnAltaUsuarios;
    private javax.swing.JButton btnBaja;
    private javax.swing.JButton btnBuscar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel min;
    private javax.swing.JRadioButton radCajero;
    private javax.swing.JRadioButton radGerente;
    private javax.swing.JRadioButton radHombre;
    private javax.swing.JRadioButton radMujer;
    private javax.swing.JTable tblVista;
    private javax.swing.JTextField txtFecNac;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables

    private Connection getConection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
