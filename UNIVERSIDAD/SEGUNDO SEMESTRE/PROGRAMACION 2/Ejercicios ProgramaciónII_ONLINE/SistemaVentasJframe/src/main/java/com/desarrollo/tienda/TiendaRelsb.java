package com.desarrollo.tienda;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TiendaRelsb extends javax.swing.JFrame {

    DefaultTableModel model = new DefaultTableModel();

    public TiendaRelsb() {
        initComponents();
        //CENTRAR VENTANA
        setLocationRelativeTo(null);
        //CONFIGURACIÓN TABLA
        jTableDetalleCompra.setModel(model);
        //COLUMNAS TABLA
        model.addColumn("GÉNERO");
        model.addColumn("TALLA");
        model.addColumn("COLOR");
        model.addColumn("CANTIDAD");
        model.addColumn("PRECIO UNITARIO");
        model.addColumn("PRECIO TOTAL");
    }

    //VALIDAD INGRESO
    public boolean validarCampos() {
        if ((jRadioBHombre.isSelected() != true //true F
                && jRadioBMujer.isSelected() != true) // V
                || jComboBTalla.getSelectedIndex() == 0 //F
                || jTxtFieldColor.getText().equals("") //F
                || jTxtFieldPrecio.getText().equals("")) {  //F
            return true;  //algún campo incompleto
        } else {
            return false;  //todos los campos completos
        }
    }

    //LIMPIAR CAMPOS
    public void limpiarCampos() {
        //limpiar radioButtons
        buttonGGenero.clearSelection();
        jComboBTalla.setSelectedIndex(0);
        jTxtFieldColor.setText("");
        jSpinnerCantidad.setValue(1);
        jTxtFieldPrecio.setText("");
        jLabelTotalPagar.setText("");
    }

    public void totalPagar() {
        double descuento = 0, precioUnitario, totalPagar;
        int cantProducto;

        if (jRadioBHombre.isSelected()) {
            //género hombre
            if (jComboBTalla.getSelectedIndex() == 1) {
                descuento = 0.05;
            } else if (jComboBTalla.getSelectedIndex() == 2) {
                descuento = 0.07;
            } else if (jComboBTalla.getSelectedIndex() == 3) {
                descuento = 0.09;
            } else if (jComboBTalla.getSelectedIndex() == 4) {
                descuento = 0.12;
            } else if (jComboBTalla.getSelectedIndex() == 5) {
                descuento = 0.15;
            }
        } else if (jRadioBMujer.isSelected()) {
            //género mujer
            if (jComboBTalla.getSelectedIndex() == 1) {
                descuento = 0.07;
            } else if (jComboBTalla.getSelectedIndex() == 2) {
                descuento = 0.09;
            } else if (jComboBTalla.getSelectedIndex() == 3) {
                descuento = 0.15;
            } else if (jComboBTalla.getSelectedIndex() == 4) {
                descuento = 0.18;
            } else if (jComboBTalla.getSelectedIndex() == 5) {
                descuento = 0.22;
            }
        }

        precioUnitario = Double.parseDouble(jTxtFieldPrecio.getText());
        cantProducto = (int) jSpinnerCantidad.getValue();
        totalPagar = (cantProducto * precioUnitario) - ((cantProducto * precioUnitario) * descuento);
        jLabelTotalPagar.setText(Double.toString(totalPagar));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGGenero = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jRadioBHombre = new javax.swing.JRadioButton();
        jRadioBMujer = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jComboBTalla = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jTxtFieldColor = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jSpinnerCantidad = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        jTxtFieldPrecio = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabelTotalPagar = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        JBtnAgregarCompra = new javax.swing.JButton();
        jBtnLimpiarCompra = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDetalleCompra = new javax.swing.JTable();
        jBtnLimpiarTodo = new javax.swing.JButton();
        jBtnQuitarCompra = new javax.swing.JButton();
        jBtnNetoPagar = new javax.swing.JButton();
        jLabelNetoPagar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tienda de Chompas Relsb");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Promociones"));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("MÁRATON");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 13)); // NOI18N
        jLabel3.setText("Hombres");

        jLabel4.setText("XS -> 5%  -  S - > 7%  - M -> 9%  -  L -> 12%  - XL -> 15%    ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 13)); // NOI18N
        jLabel5.setText("Mujeres");

        jLabel6.setText("XS -> 7%  -  S - > 9%  - M -> 15%  -  L -> 18%  - XL -> 22%    ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(23, 23, 23)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Compra"));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("GÉNERO");

        buttonGGenero.add(jRadioBHombre);
        jRadioBHombre.setText("Hombre");

        buttonGGenero.add(jRadioBMujer);
        jRadioBMujer.setText("Mujer");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("TALLA CHOMPA");

        jComboBTalla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "XS", "S", "M", "L", "XL" }));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("COLOR:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("CANTIDAD: ");

        jSpinnerCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("PRECIO UNITARIO:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("TOTAL A PAGAR:  $");

        jLabelTotalPagar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N

        JBtnAgregarCompra.setBackground(new java.awt.Color(153, 255, 153));
        JBtnAgregarCompra.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        JBtnAgregarCompra.setText("AGREGAR COMPRA");
        JBtnAgregarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnAgregarCompraActionPerformed(evt);
            }
        });

        jBtnLimpiarCompra.setBackground(new java.awt.Color(255, 153, 153));
        jBtnLimpiarCompra.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jBtnLimpiarCompra.setText("LIMPIAR COMPRA");
        jBtnLimpiarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLimpiarCompraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jRadioBHombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioBMujer))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTxtFieldColor, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8)
                                .addComponent(jComboBTalla, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTxtFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
            .addComponent(jSeparator1)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(JBtnAgregarCompra)
                .addGap(31, 31, 31)
                .addComponent(jBtnLimpiarCompra)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBTalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioBHombre)
                        .addComponent(jRadioBMujer)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtFieldColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTotalPagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSpinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBtnAgregarCompra)
                    .addComponent(jBtnLimpiarCompra))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle de Compra"));

        jTableDetalleCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableDetalleCompra);

        jBtnLimpiarTodo.setBackground(new java.awt.Color(153, 255, 255));
        jBtnLimpiarTodo.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jBtnLimpiarTodo.setText("LIMPIAR TODO");
        jBtnLimpiarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLimpiarTodoActionPerformed(evt);
            }
        });

        jBtnQuitarCompra.setBackground(new java.awt.Color(153, 255, 255));
        jBtnQuitarCompra.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jBtnQuitarCompra.setText("QUITAR COMPRA");
        jBtnQuitarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnQuitarCompraActionPerformed(evt);
            }
        });

        jBtnNetoPagar.setBackground(new java.awt.Color(153, 255, 255));
        jBtnNetoPagar.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jBtnNetoPagar.setText("NETO A PAGAR: ");
        jBtnNetoPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNetoPagarActionPerformed(evt);
            }
        });

        jLabelNetoPagar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jBtnLimpiarTodo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnQuitarCompra)
                        .addGap(144, 144, 144)
                        .addComponent(jBtnNetoPagar)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelNetoPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNetoPagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnLimpiarTodo)
                        .addComponent(jBtnQuitarCompra)
                        .addComponent(jBtnNetoPagar)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(327, 327, 327))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 5, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBtnAgregarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnAgregarCompraActionPerformed
        String genero;
        if (validarCampos()) {
            JOptionPane.showMessageDialog(null, "CAMPOS INCOMPLETOS");
        } else {
            totalPagar();
            //AGREGAR COMPRA EN LA TABLA
            if (jRadioBHombre.isSelected()) {
                genero = "Hombre";
            } else {
                genero = "Mujer";
            }
            model.addRow(new Object[]{
                genero,
                jComboBTalla.getSelectedItem(),
                jTxtFieldColor.getText(),
                jSpinnerCantidad.getValue(),
                jTxtFieldPrecio.getText(),
                jLabelTotalPagar.getText()
            });
        }
    }//GEN-LAST:event_JBtnAgregarCompraActionPerformed

    private void jBtnLimpiarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLimpiarCompraActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
    }//GEN-LAST:event_jBtnLimpiarCompraActionPerformed

    private void jBtnQuitarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnQuitarCompraActionPerformed

        int filaSeleccionada = jTableDetalleCompra.getSelectedRow();

        if (filaSeleccionada >= 0) {
            model.removeRow(filaSeleccionada);
            JOptionPane.showMessageDialog(null, "SE HA RETIRADO LA COMPRA!");
        } else {
            JOptionPane.showMessageDialog(null, "SELECCIONE UNA COMPRA!");

        }

    }//GEN-LAST:event_jBtnQuitarCompraActionPerformed

    private void jBtnLimpiarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLimpiarTodoActionPerformed
        for (int i = 0; i < model.getRowCount(); i++) {  //0<2
            model.removeRow(i);
            i = i - 1; //i--;  //i=0-1=-1
        }
        limpiarCampos();
        JOptionPane.showMessageDialog(null, "SE HA CANCELADO TODA LA COMPRA!");
    }//GEN-LAST:event_jBtnLimpiarTodoActionPerformed

    private void jBtnNetoPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNetoPagarActionPerformed
        double netoPagar = 0;
        for (int i = 0; i < model.getRowCount(); i++) {
            netoPagar = netoPagar + Double.parseDouble(jTableDetalleCompra.getValueAt(i, 5).toString()) ;
        }
        jLabelNetoPagar.setText("$ "+String.format("%.2f", netoPagar));
    }//GEN-LAST:event_jBtnNetoPagarActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TiendaRelsb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TiendaRelsb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TiendaRelsb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TiendaRelsb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TiendaRelsb().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBtnAgregarCompra;
    private javax.swing.ButtonGroup buttonGGenero;
    private javax.swing.JButton jBtnLimpiarCompra;
    private javax.swing.JButton jBtnLimpiarTodo;
    private javax.swing.JButton jBtnNetoPagar;
    private javax.swing.JButton jBtnQuitarCompra;
    private javax.swing.JComboBox<String> jComboBTalla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelNetoPagar;
    private javax.swing.JLabel jLabelTotalPagar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioBHombre;
    private javax.swing.JRadioButton jRadioBMujer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinnerCantidad;
    private javax.swing.JTable jTableDetalleCompra;
    private javax.swing.JTextField jTxtFieldColor;
    private javax.swing.JTextField jTxtFieldPrecio;
    // End of variables declaration//GEN-END:variables
}
