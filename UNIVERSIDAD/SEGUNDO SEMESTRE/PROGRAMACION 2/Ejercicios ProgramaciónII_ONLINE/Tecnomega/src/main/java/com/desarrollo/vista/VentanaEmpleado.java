package com.desarrollo.vista;

import com.desarrollo.controlador.GestionEmpleados;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.desarrollo.componentes.Validaciones;
import java.util.Date;

public class VentanaEmpleado extends javax.swing.JFrame {

    private GestionEmpleados gestionEmpleado = new GestionEmpleados();
    private DefaultTableModel model = new DefaultTableModel();
    private int filaSeleccionada = -1;

    public VentanaEmpleado() {
        initComponents();
        setLocationRelativeTo(null);
        jTableEmpleados.setModel(model);
        model.addColumn("ID");
        model.addColumn("NOMBRE");
        model.addColumn("APELLIDO");
        model.addColumn("CÉDULA");
        model.addColumn("SUELDO");
        model.addColumn("TIPO EMPLEADO");
        model.addColumn("DIRECCIÓN");
        //llamar método
        listarEmpleado();
    }

    public void listarEmpleado() {
        gestionEmpleado.listarEmpleados(model);
    }

    public void refrescarTabla() {
        for (int i = 0; i < jTableEmpleados.getRowCount(); i++) {
            model.removeRow(i);
            i--;
        }
        listarEmpleado();
    }

    public void limpiarCampos() {
        jTxtFieldId.setText("");
        jTxtFieldNombre.setText("");
        jTxtFieldApellido.setText("");
        jTxtFieldCedula.setText("");
        //jTxtFieldSueldo.setText("");
        jComboBTipoEmpleado.setSelectedIndex(0);
        jTxtAreaDireccion.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelMinimizar = new javax.swing.JLabel();
        jLabelCerrar = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTxtFieldId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTxtFieldNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTxtFieldApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTxtFieldCedula = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBTipoEmpleado = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtAreaDireccion = new javax.swing.JTextArea();
        jDateChooserFecha = new com.toedter.calendar.JDateChooser();
        jPanel5 = new javax.swing.JPanel();
        jBtnAgregarEmpleado = new javax.swing.JButton();
        jBtnEditarEmpleado = new javax.swing.JButton();
        jBtnEliminar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableEmpleados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(35, 155, 86));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tecnomega");

        jLabelMinimizar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelMinimizar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMinimizar.setText("-");
        jLabelMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinimizarMouseClicked(evt);
            }
        });

        jLabelCerrar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelCerrar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCerrar.setText("X");
        jLabelCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCerrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCerrar)
                    .addComponent(jLabelMinimizar)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(21, 67, 96));

        jPanel4.setBackground(new java.awt.Color(21, 67, 96));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CREAR EMPLEADO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID:");

        jTxtFieldId.setEditable(false);
        jTxtFieldId.setBackground(new java.awt.Color(153, 153, 153));
        jTxtFieldId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTxtFieldId.setForeground(new java.awt.Color(247, 220, 111));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NOMBRE:");

        jTxtFieldNombre.setBackground(new java.awt.Color(153, 153, 153));
        jTxtFieldNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTxtFieldNombre.setForeground(new java.awt.Color(247, 220, 111));
        jTxtFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtFieldNombreActionPerformed(evt);
            }
        });
        jTxtFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtFieldNombreKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("APELLIDO:");

        jTxtFieldApellido.setBackground(new java.awt.Color(153, 153, 153));
        jTxtFieldApellido.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTxtFieldApellido.setForeground(new java.awt.Color(247, 220, 111));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CÉDULA:");

        jTxtFieldCedula.setBackground(new java.awt.Color(153, 153, 153));
        jTxtFieldCedula.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTxtFieldCedula.setForeground(new java.awt.Color(247, 220, 111));
        jTxtFieldCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtFieldCedulaKeyTyped(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("FECHA");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("TIPO EMPLEADO:");

        jComboBTipoEmpleado.setBackground(new java.awt.Color(153, 153, 153));
        jComboBTipoEmpleado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBTipoEmpleado.setForeground(new java.awt.Color(247, 220, 111));
        jComboBTipoEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Obrero A", "Obrero B", "Obrero C", "Obrero D" }));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("DIRECCIÓN:");

        jTxtAreaDireccion.setBackground(new java.awt.Color(153, 153, 153));
        jTxtAreaDireccion.setColumns(20);
        jTxtAreaDireccion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTxtAreaDireccion.setForeground(new java.awt.Color(247, 220, 111));
        jTxtAreaDireccion.setRows(5);
        jScrollPane1.setViewportView(jTxtAreaDireccion);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtFieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(46, 46, 46)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jDateChooserFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBTipoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtFieldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooserFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBTipoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(21, 67, 96));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ACCIONES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jBtnAgregarEmpleado.setBackground(new java.awt.Color(153, 255, 153));
        jBtnAgregarEmpleado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBtnAgregarEmpleado.setText("AGREGAR EMPLEADO");
        jBtnAgregarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAgregarEmpleadoActionPerformed(evt);
            }
        });

        jBtnEditarEmpleado.setBackground(new java.awt.Color(255, 255, 153));
        jBtnEditarEmpleado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBtnEditarEmpleado.setText("EDITAR EMPLEADO");
        jBtnEditarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEditarEmpleadoActionPerformed(evt);
            }
        });

        jBtnEliminar.setBackground(new java.awt.Color(255, 204, 204));
        jBtnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBtnEliminar.setText("ELIMINAR EMPLEADO");
        jBtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jBtnAgregarEmpleado)
                .addGap(29, 29, 29)
                .addComponent(jBtnEditarEmpleado)
                .addGap(28, 28, 28)
                .addComponent(jBtnEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnAgregarEmpleado)
                    .addComponent(jBtnEditarEmpleado)
                    .addComponent(jBtnEliminar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(21, 67, 96));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EMPLEADOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jTableEmpleados.setBackground(new java.awt.Color(153, 153, 153));
        jTableEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableEmpleados);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(304, 304, 304))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCerrarMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabelCerrarMouseClicked

    private void jLabelMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizarMouseClicked
        // TODO add your handling code here:
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinimizarMouseClicked

    private void jTxtFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtFieldNombreActionPerformed

    private void jBtnAgregarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAgregarEmpleadoActionPerformed
        // TODO add your handling code here:
        String nombre = jTxtFieldNombre.getText();
        String apellido = jTxtFieldApellido.getText();
        String cedula = jTxtFieldCedula.getText();
        //double sueldo = Double.parseDouble(jTxtFieldSueldo.getText());
        String tipoEmpleado = jComboBTipoEmpleado.getSelectedItem().toString();
        String direccion = jTxtAreaDireccion.getText();
        Date fecha=jDateChooserFecha.getDate();
        long fecha2=fecha.getTime();
        java.sql.Date fechaActual=new java.sql.Date(fecha2);
        int insertarEmpleado = gestionEmpleado.insertarEmpleado(nombre, apellido, cedula, tipoEmpleado, direccion, fechaActual);
        if (insertarEmpleado != 0) {
            JOptionPane.showMessageDialog(null, "SE HA INSERTADO CORRECTAMENTE!");
            refrescarTabla();
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(null, "NO SE HA INSERTADO CORRECTAMENTE!");

        }
    }//GEN-LAST:event_jBtnAgregarEmpleadoActionPerformed

    private void jTableEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEmpleadosMouseClicked
        // TODO add your handling code here:

        //identificado la fila seleccionada
        filaSeleccionada = jTableEmpleados.getSelectedRow();
        //Mostrar los datos de la fila en los campos de la parte superior
        jTxtFieldId.setText(jTableEmpleados.getValueAt(filaSeleccionada, 0).toString());
        jTxtFieldNombre.setText(jTableEmpleados.getValueAt(filaSeleccionada, 1).toString());
        jTxtFieldApellido.setText(jTableEmpleados.getValueAt(filaSeleccionada, 2).toString());
        jTxtFieldCedula.setText(jTableEmpleados.getValueAt(filaSeleccionada, 3).toString());
        //jTxtFieldSueldo.setText(jTableEmpleados.getValueAt(filaSeleccionada, 4).toString());
        jComboBTipoEmpleado.setSelectedItem(jTableEmpleados.getValueAt(filaSeleccionada, 5));
        jTxtAreaDireccion.setText(jTableEmpleados.getValueAt(filaSeleccionada, 6).toString());


    }//GEN-LAST:event_jTableEmpleadosMouseClicked

    private void jBtnEditarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditarEmpleadoActionPerformed
        // TODO add your handling code here:
        if (filaSeleccionada >= 0) {
            int id = Integer.parseInt(jTxtFieldId.getText());
            String nombre = jTxtFieldNombre.getText();
            String apellido = jTxtFieldApellido.getText();
            String cedula = jTxtFieldCedula.getText();
            //double sueldo = Double.parseDouble(jTxtFieldSueldo.getText());
            String tipoEmpleado = jComboBTipoEmpleado.getSelectedItem().toString();
            String direccion = jTxtAreaDireccion.getText();

            //int editarEmpleado = gestionEmpleado.actualizarEmpleado(id, nombre, apellido, cedula, sueldo, tipoEmpleado, direccion);
//            if (editarEmpleado != 0) {
//                JOptionPane.showMessageDialog(null, "SE HA ACTUALIZADO CORRECTAMENTE!");
//                refrescarTabla();
//                limpiarCampos();
//            } else {
//                JOptionPane.showMessageDialog(null, "NO SE HA ACTUALIZADO CORRECTAMENTE!");
//
//            }
        } else {
            JOptionPane.showMessageDialog(null, "NO HA SELECCIONADO LA FILA A EDITAR");

        }
    }//GEN-LAST:event_jBtnEditarEmpleadoActionPerformed

    private void jBtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEliminarActionPerformed
        // TODO add your handling code here:
        if (filaSeleccionada >= 0) {
            int id = Integer.parseInt(jTxtFieldId.getText());
            int eliminarEmpleado = gestionEmpleado.eliminarEmpleado(id);
            if (eliminarEmpleado != 0) {
                JOptionPane.showMessageDialog(null, "SE HA ELIMINADO CORRECTAMENTE!");
                refrescarTabla();
                limpiarCampos();
            } else {
                JOptionPane.showMessageDialog(null, "NO SE HA ELIMINADO CORRECTAMENTE!");

            }
        } else {
            JOptionPane.showMessageDialog(null, "NO HA SELECCIONADO LA FILA A ELIMINAR");

        }
    }//GEN-LAST:event_jBtnEliminarActionPerformed

    private void jTxtFieldCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtFieldCedulaKeyTyped
        // TODO add your handling code here:
        Validaciones.validarNumeros(evt);
    }//GEN-LAST:event_jTxtFieldCedulaKeyTyped

    private void jTxtFieldNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtFieldNombreKeyTyped
        // TODO add your handling code here:
        Validaciones.validarLetras(evt);
    }//GEN-LAST:event_jTxtFieldNombreKeyTyped

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
            java.util.logging.Logger.getLogger(VentanaEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAgregarEmpleado;
    private javax.swing.JButton jBtnEditarEmpleado;
    private javax.swing.JButton jBtnEliminar;
    private javax.swing.JComboBox<String> jComboBTipoEmpleado;
    private com.toedter.calendar.JDateChooser jDateChooserFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelCerrar;
    private javax.swing.JLabel jLabelMinimizar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableEmpleados;
    private javax.swing.JTextArea jTxtAreaDireccion;
    private javax.swing.JTextField jTxtFieldApellido;
    private javax.swing.JTextField jTxtFieldCedula;
    private javax.swing.JTextField jTxtFieldId;
    private javax.swing.JTextField jTxtFieldNombre;
    // End of variables declaration//GEN-END:variables
}
