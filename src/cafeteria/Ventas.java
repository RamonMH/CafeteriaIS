/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria;

import conexion.conectarBD;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.Buffer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ramon
 */
public class Ventas extends javax.swing.JFrame {
    
    conectarBD con = new conectarBD();
    Connection cn=con.conectar();
    
    PreparedStatement ps=null;
    ResultSet rs=null;
    DefaultTableModel modelo;
 
    
    
    int Total, fila, SubT;
    
    private void limpiar()
    {
       cmbBebida.setSelectedIndex(0);
       cmbTamanio.setSelectedIndex(0);
       cmbLeche.setSelectedIndex(0);
       cmbExtras.setSelectedIndex(0);
       txtCant.setText(null);
       txtNomCliente.setText(null);
       lblSubT.setText(null);
       lblTotal.setText(null);
       modelo.getDataVector().removeAllElements();
       tblOrden.updateUI();
    }
    
    
    public Ventas() {
        initComponents();
        setLocationRelativeTo(null);
        System.out.println(fecha());
        
        String tipo, disp;
        //DefaultTableModel modelo = (DefaultTableModel) tblOrden.getModel();        
        //modelo.addRow(new Object[fila]);
        modelo=new DefaultTableModel();
        modelo.addColumn("Producto");
        modelo.addColumn("Tamaño");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio");
        tblOrden.setModel(modelo);
        
        
        PreparedStatement ps=null;
        ResultSet rs=null;
        
        try {
            String sql="select * from productos";
            ps=cn.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next())
            {
                disp=rs.getString("Disponibilidad");
                
                if(disp.equals("Si"))
                {
                    cmbBebida.addItem(rs.getString("NombreProd"));
                }                
            }
        } catch (Exception e) {
        }
        
        try {
            String sql="select * from inventario";
            ps=cn.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next())
            {
                tipo=rs.getString("Tipo");
                
                if(tipo.equals("LACTEOS"))
                {
                   cmbLeche.addItem(rs.getString("Nombre")); 
                }
            }
        } catch (Exception e) {
        }
        
        try{
            String sql="select * from tamanios";
            ps=cn.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next())
            {
                cmbTamanio.addItem(rs.getString("NombreTam"));
            }
        } catch (Exception e){
        }
        
        try{
            String sql="Select * from inventario";
            ps=cn.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next())
            {
                tipo=rs.getString("Tipo");
                
                if(tipo.equals("COMPLEMENTOS"))
                {
                   cmbExtras.addItem(rs.getString("Nombre")); 
                } 
            }        
        } catch (Exception e){
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        min = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblNomCajero = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cmbBebida = new javax.swing.JComboBox<>();
        cmbTamanio = new javax.swing.JComboBox<>();
        cmbLeche = new javax.swing.JComboBox<>();
        cmbExtras = new javax.swing.JComboBox<>();
        txtNomCliente = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrden = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblSubT = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        RadEfectivo = new javax.swing.JRadioButton();
        RadTarjeta = new javax.swing.JRadioButton();
        RadCupon = new javax.swing.JRadioButton();
        txtCupon = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        chkFactura = new javax.swing.JCheckBox();
        btnApCupon = new javax.swing.JButton();
        btnFinalizarPedido = new javax.swing.JButton();
        txtCant = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 252, 242));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/x.png"))); // NOI18N
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        jPanel2.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 20, -1, -1));

        min.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/menos.png"))); // NOI18N
        min.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minMouseClicked(evt);
            }
        });
        jPanel2.add(min, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 20, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/granosv.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 13, -1, 511));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logos.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 555, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Atiende: ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 36, -1, -1));

        lblNomCajero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNomCajero.setText("Nombre del cajero");
        jPanel2.add(lblNomCajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 36, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setText("Seleccionar bebida");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Bebida");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Tamaño");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Leche");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Extras");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Cantidad");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Nombre del cliente");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, -1, -1));

        cmbBebida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbBebida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..." }));
        jPanel2.add(cmbBebida, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 266, -1));

        cmbTamanio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbTamanio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..." }));
        jPanel2.add(cmbTamanio, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 266, -1));

        cmbLeche.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbLeche.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..." }));
        jPanel2.add(cmbLeche, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 266, -1));

        cmbExtras.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbExtras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..." }));
        jPanel2.add(cmbExtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 266, -1));

        txtNomCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(txtNomCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 206, -1));

        btnAgregar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAgregar.setText("Agregar producto");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 186, 32));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("Productos agregados");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, -1, -1));

        tblOrden.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Tamaño", "Cantidad", "Costo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrden);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, -1, 105));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("Subtotal: ");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText("Total: ");

        lblSubT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSubT.setText("$$$$");

        lblTotal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(255, 0, 0));
        lblTotal.setText("$$$$");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSubT)
                    .addComponent(lblTotal))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(lblSubT))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(lblTotal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, 230, 110));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Formas de pago", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        RadEfectivo.setBackground(new java.awt.Color(255, 252, 242));
        buttonGroup1.add(RadEfectivo);
        RadEfectivo.setText("Efectivo");

        RadTarjeta.setBackground(new java.awt.Color(255, 252, 242));
        buttonGroup1.add(RadTarjeta);
        RadTarjeta.setText("Tarjeta");

        RadCupon.setBackground(new java.awt.Color(255, 252, 242));
        buttonGroup1.add(RadCupon);
        RadCupon.setText("Cupon");
        RadCupon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RadCuponMouseClicked(evt);
            }
        });

        txtCupon.setEnabled(false);

        jLabel19.setText("Cupon");

        chkFactura.setBackground(new java.awt.Color(255, 252, 242));
        chkFactura.setText("Facturar compra");

        btnApCupon.setText("Aplicar");
        btnApCupon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApCuponActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(RadEfectivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RadTarjeta)
                .addGap(31, 31, 31)
                .addComponent(RadCupon)
                .addGap(17, 17, 17))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCupon, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(chkFactura))
                .addGap(11, 11, 11)
                .addComponent(btnApCupon)
                .addGap(19, 19, 19))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadEfectivo)
                    .addComponent(RadTarjeta)
                    .addComponent(RadCupon))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCupon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(btnApCupon))
                .addGap(18, 18, 18)
                .addComponent(chkFactura)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 400, -1, -1));

        btnFinalizarPedido.setBackground(new java.awt.Color(164, 113, 72));
        btnFinalizarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/btnFinalizar.png"))); // NOI18N
        btnFinalizarPedido.setContentAreaFilled(false);
        btnFinalizarPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnFinalizarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarPedidoActionPerformed(evt);
            }
        });
        jPanel2.add(btnFinalizarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 570, 265, 54));

        txtCant.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(txtCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 63, -1));

        btnEliminar.setText("ELIMINAR PRODUCTO");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton2.setText("Para llevar");

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton1.setText("En susursal");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Lugar de consumo");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jRadioButton2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(43, 43, 43))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton1))
                .addGap(22, 22, 22))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, 210, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1067, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        login obj = new login();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseClicked
        this.setState(Ventas.ICONIFIED);
    }//GEN-LAST:event_minMouseClicked

    private void btnFinalizarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarPedidoActionPerformed
        int prod=tblOrden.getColumnCount();
        int pago = 0, cambio = 0;
        String MPag = null, productos, cantidad, fichero;
       
        File archivo;
        FileWriter w;
        PrintWriter wr;
        
        archivo = new File("Ticket.txt");
        
        do{
            if(RadEfectivo.isSelected())
            {
                MPag="Efectivo";
                pago=Integer.parseInt(JOptionPane.showInputDialog(null, "Total a pagar: "+Total+"\nMonto a pagar: "));
                cambio=pago-Total;
                //SubT=Total-pago;
                JOptionPane.showMessageDialog(null, "Cambio: "+cambio);
                
                /*lblSubT.setText("$ "+String.valueOf(SubT));
                lblTotal.setText("$ "+String.valueOf(Total));*/
            }else if (RadTarjeta.isSelected())
            {
                MPag="Tarjeta";
                pago=Integer.parseInt(JOptionPane.showInputDialog(null, "Total a pagar: "+Total+"\nMonto a pagar con tarjeta: "));
                cambio=pago-Total;
                /*SubT=Total-pago;
                lblSubT.setText("$ "+String.valueOf(SubT));
                lblTotal.setText("$ "+String.valueOf(Total));*/
            }else if (RadCupon.isSelected())
            {
                MPag="Cupon";               
            }else
            {
                JOptionPane.showMessageDialog(null, "SELECCIONA UNA FORMA DE PAGO");
            }

            if(chkFactura.isSelected())
            {
                Facturacion obj=new Facturacion();
                obj.setVisible(true);
            }
        }while(cambio<0);
        
        productos=(String) tblOrden.getValueAt(0, 0);
        cantidad=(String) tblOrden.getValueAt(2, 2);
     
        String sql="insert into ventas (FecVenta, ProducVendidos, CantProductos, MetPago, TotalVenta) values( ?, ?, ?, ?, ?)";
        
        try {
            ps=cn.prepareStatement(sql);
            ps.setString(1, String.valueOf(fecha()));
            ps.setString(2, (String) tblOrden.getValueAt(0, 0));
            ps.setString(3, String.valueOf(prod));
            ps.setString(4, MPag);
            ps.setString(5, String.valueOf(Total));
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "COMPRA FINALIZADA");
                        
            limpiar();
        } catch (SQLException ex) {
             Logger.getLogger(Ventas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnFinalizarPedidoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String prec = null;
        String []info=new String[4];
        int pb = 0, pt = 0, cant = Integer.parseInt(txtCant.getText());
        
        String bebida="select * from productos where NombreProd='"+cmbBebida.getSelectedItem()+"'";
        String tam="select * from tamanios where NombreTam='"+cmbTamanio.getSelectedItem()+"'";
        
        try {
            ps=cn.prepareStatement(bebida);
            rs=ps.executeQuery();
            
            while(rs.next())
            {
                pb=Integer.parseInt(rs.getString("Precio"));
            }
            System.out.println("Precio: "+pb);
        } catch (Exception e) {
        }
        
        try {
            ps=cn.prepareStatement(tam);
            rs=ps.executeQuery();
            
            while(rs.next())
            {
                pt=Integer.parseInt(rs.getString("Costo"));
            }
            System.out.println("Precio Tam: "+pt);
        } catch (Exception e) {
        }
        
        SubT=(pb+pt)*cant;
        Total+=SubT;
        System.out.println("TOTAL = " +Total);
        lblSubT.setText("$ "+String.valueOf(Total));
        lblTotal.setText("$ "+String.valueOf(Total));
        
        info[0]=cmbBebida.getSelectedItem()+"/ LECHE: "+cmbLeche.getSelectedItem()+"/  EXTRAS: "+cmbExtras.getSelectedItem();
        info[1]=(String) cmbTamanio.getSelectedItem();
        info[2]= String.valueOf(cant);
        info[3]=String.valueOf(SubT);
        modelo.addRow(info);
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int f=tblOrden.getSelectedRow();
        
        if(f>=0)
        {
            modelo.removeRow(fila);
        }else
        {
            JOptionPane.showMessageDialog(null, "Selecciona el producto a eliminar");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void RadCuponMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RadCuponMouseClicked
        txtCupon.setEnabled(true);
    }//GEN-LAST:event_RadCuponMouseClicked

    private void btnApCuponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApCuponActionPerformed
        String cup="select * from cupones";
        int des = 0;
                
        try {
            ps=cn.prepareStatement(cup);
            rs=ps.executeQuery();
            
            while(rs.next())
            {
                des=Integer.parseInt(rs.getString("Descuento"));
            }
        } catch (Exception e) {
        }
        Total-=des;
        
        lblSubT.setText("$ "+String.valueOf(Total));
        lblTotal.setText("$ "+String.valueOf(Total));
    }//GEN-LAST:event_btnApCuponActionPerformed

    public static String fecha()
    {
        Date fecha=new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");
        return formato.format(fecha);
        
    }
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RadCupon;
    private javax.swing.JRadioButton RadEfectivo;
    private javax.swing.JRadioButton RadTarjeta;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnApCupon;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnFinalizarPedido;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox chkFactura;
    private javax.swing.JLabel close;
    private javax.swing.JComboBox<String> cmbBebida;
    private javax.swing.JComboBox<String> cmbExtras;
    private javax.swing.JComboBox<String> cmbLeche;
    private javax.swing.JComboBox<String> cmbTamanio;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    public static javax.swing.JLabel lblNomCajero;
    private javax.swing.JLabel lblSubT;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel min;
    private javax.swing.JTable tblOrden;
    private javax.swing.JTextField txtCant;
    private javax.swing.JTextField txtCupon;
    private javax.swing.JTextField txtNomCliente;
    // End of variables declaration//GEN-END:variables
}
