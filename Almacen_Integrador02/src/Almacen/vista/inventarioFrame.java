/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Almacen.vista;

import Almacen.DaoImpl.ClientesDaoImpl;
import Almacen.DaoImpl.ProductoDaoImpl;
import Almacen.dao.IClientes;
import Almacen.dao.IProductos;
import Almacen.dto.Clientes;
import Almacen.dto.Productos;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class inventarioFrame extends javax.swing.JFrame {

    private DefaultTableModel model;
    private int fila = -1;
    private Connection conex;
    private String nombreUsuario;
    ProductoDaoImpl pd = new ProductoDaoImpl();
    ClientesDaoImpl cp = new ClientesDaoImpl();

    private IProductos pc = new ProductoDaoImpl();
    private IClientes Idao = new ClientesDaoImpl();

    
    double totalventa=0.00;

     int item;
    public inventarioFrame() {
        initComponents();

        this.setLocationRelativeTo(null);

        listarProductos();
        listarClientes();
    }

    public inventarioFrame(String nombreUsuario) {
        initComponents();
        this.nombreUsuario = nombreUsuario;
        lbluser.setText(nombreUsuario);
    }

    
     public void setNombreUsuario(String nombre) {
        this.nombreUsuario = nombre;
    } 
    
    
   public void habilitarBotonesSegunCargo(String cargo) {
        if (cargo.equalsIgnoreCase("Empleado")) {
            btnProveedoresFrame.setEnabled(false);            
            lbluser.setText(nombreUsuario);
            // Aquí deshabilitas los botones que no debe tener acceso el vendedor
        } else if (cargo.equalsIgnoreCase("Admin")) {
            lbluser.setText(nombreUsuario);
        }        
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbluser = new javax.swing.JLabel();
        btncerrarsesion = new javax.swing.JButton();
        btnVentasFrame = new javax.swing.JButton();
        btnInventarioFrame = new javax.swing.JButton();
        btnProveedoresFrame = new javax.swing.JButton();
        btnClientesFrame = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tbpanneinv = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProductos = new javax.swing.JTable();
        btninsertar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        btnBusqueda = new javax.swing.JButton();
        txtbusqueda = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIdProductos = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtnombreP = new javax.swing.JTextField();
        txtprecioP = new javax.swing.JTextField();
        txtcantidadP = new javax.swing.JTextField();
        txtCategoriaP = new javax.swing.JTextField();
        txtcodigoP = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbProveedores = new javax.swing.JTable();
        txtRUC = new javax.swing.JTextField();
        txtProducto = new javax.swing.JTextField();
        txtProveedor = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        btnEliminarPorveedores = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        btnAgregarProveedores = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();
        btnBusacarEmpleados = new javax.swing.JButton();
        txtbuscarEmpleados = new javax.swing.JTextField();
        btnAgregarClientes = new javax.swing.JButton();
        btneliminarClientes = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        btnactualizarClientes = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtIdClientes = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtnombClientes = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtDNIClientes = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtCorreoClientes = new javax.swing.JTextField();
        txttelefonosClientes = new javax.swing.JTextField();
        txtApellidosClientes = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbVENTA = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        txtCodigoVenta = new javax.swing.JTextField();
        txtnombreVenta = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtPrecioVenta = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtCantidadVenta = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txtDniVenta = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        txtApellidoClienteVenta = new javax.swing.JTextField();
        txtnombreclienteVenta = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        lbltotalVenta = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        txtDestinodst1 = new javax.swing.JTextField();
        txtStockVenta = new javax.swing.JTextField();
        btnEliminarPila = new javax.swing.JPanel();
        btnGuardarordendeDespacho = new javax.swing.JButton();
        btnEliminarOrdendeDespacho = new javax.swing.JButton();
        btnImprimirenPdf = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(35, 35, 35));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(27, 27, 27));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(56, 56, 56));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/3177440 (1) (1).png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Usuario:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        lbluser.setBackground(new java.awt.Color(204, 204, 204));
        lbluser.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        lbluser.setForeground(new java.awt.Color(204, 204, 204));
        lbluser.setText("Admin");
        jPanel3.add(lbluser, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 80, -1));

        btncerrarsesion.setBackground(new java.awt.Color(255, 51, 51));
        btncerrarsesion.setText("CERRAR SESION");
        btncerrarsesion.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btncerrarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarsesionActionPerformed(evt);
            }
        });
        jPanel3.add(btncerrarsesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 120, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 210, 110));

        btnVentasFrame.setBackground(new java.awt.Color(27, 27, 27));
        btnVentasFrame.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnVentasFrame.setForeground(new java.awt.Color(0, 235, 247));
        btnVentasFrame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/almacenar (1).png"))); // NOI18N
        btnVentasFrame.setText("VENTAS");
        btnVentasFrame.setBorder(javax.swing.BorderFactory.createEmptyBorder(27, 27, 27, 27));
        btnVentasFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasFrameActionPerformed(evt);
            }
        });
        jPanel2.add(btnVentasFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 230, 40));

        btnInventarioFrame.setBackground(new java.awt.Color(27, 27, 27));
        btnInventarioFrame.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnInventarioFrame.setForeground(new java.awt.Color(0, 235, 247));
        btnInventarioFrame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/almacenar (1).png"))); // NOI18N
        btnInventarioFrame.setText("INVENTARIO");
        btnInventarioFrame.setBorder(null);
        btnInventarioFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioFrameActionPerformed(evt);
            }
        });
        jPanel2.add(btnInventarioFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 230, 40));

        btnProveedoresFrame.setBackground(new java.awt.Color(27, 27, 27));
        btnProveedoresFrame.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnProveedoresFrame.setForeground(new java.awt.Color(0, 235, 247));
        btnProveedoresFrame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/almacenar (1).png"))); // NOI18N
        btnProveedoresFrame.setText("PROVEEDORES");
        btnProveedoresFrame.setBorder(javax.swing.BorderFactory.createEmptyBorder(27, 27, 27, 27));
        btnProveedoresFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedoresFrameActionPerformed(evt);
            }
        });
        jPanel2.add(btnProveedoresFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 230, 40));

        btnClientesFrame.setBackground(new java.awt.Color(27, 27, 27));
        btnClientesFrame.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnClientesFrame.setForeground(new java.awt.Color(0, 235, 247));
        btnClientesFrame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/almacenar (1).png"))); // NOI18N
        btnClientesFrame.setText("CLIENTES");
        btnClientesFrame.setBorder(javax.swing.BorderFactory.createEmptyBorder(27, 27, 27, 27));
        btnClientesFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesFrameActionPerformed(evt);
            }
        });
        jPanel2.add(btnClientesFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 230, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGO-CARLEY (1).png"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 190, 120));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 229, 690));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1078 (1).jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 940, 170));

        jPanel4.setBackground(new java.awt.Color(255, 74, 88));

        jPanel9.setBackground(new java.awt.Color(255, 204, 204));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("REGISTRAR PRODUCTOS\n"));

        tbProductos.setBackground(new java.awt.Color(153, 255, 153));
        tbProductos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tbProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Codigo", "Nombre", "Cantidad ", "Precio", "Categoria"
            }
        ));
        tbProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbProductos);
        if (tbProductos.getColumnModel().getColumnCount() > 0) {
            tbProductos.getColumnModel().getColumn(0).setMinWidth(50);
            tbProductos.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbProductos.getColumnModel().getColumn(0).setMaxWidth(50);
            tbProductos.getColumnModel().getColumn(1).setMinWidth(100);
            tbProductos.getColumnModel().getColumn(1).setPreferredWidth(100);
            tbProductos.getColumnModel().getColumn(1).setMaxWidth(100);
            tbProductos.getColumnModel().getColumn(3).setMinWidth(100);
            tbProductos.getColumnModel().getColumn(3).setPreferredWidth(100);
            tbProductos.getColumnModel().getColumn(3).setMaxWidth(100);
            tbProductos.getColumnModel().getColumn(4).setMinWidth(70);
            tbProductos.getColumnModel().getColumn(4).setPreferredWidth(70);
            tbProductos.getColumnModel().getColumn(4).setMaxWidth(70);
        }

        btninsertar.setBackground(new java.awt.Color(27, 27, 27));
        btninsertar.setForeground(new java.awt.Color(0, 235, 247));
        btninsertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/insert (1).png"))); // NOI18N
        btninsertar.setText("INSERTAR ");
        btninsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(27, 27, 27));
        btnEliminar.setForeground(new java.awt.Color(0, 235, 247));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1486564399-close_81512.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(27, 27, 27));
        jButton9.setForeground(new java.awt.Color(0, 235, 247));
        jButton9.setText("LIMPIAR");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        btnBusqueda.setBackground(new java.awt.Color(27, 27, 27));
        btnBusqueda.setForeground(new java.awt.Color(0, 235, 247));
        btnBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/seo-social-web-network-internet_340_icon-icons.com_61497.png"))); // NOI18N
        btnBusqueda.setText("BUSCAR");
        btnBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusquedaActionPerformed(evt);
            }
        });

        txtbusqueda.setBackground(new java.awt.Color(204, 204, 204));

        btnActualizar.setBackground(new java.awt.Color(27, 27, 27));
        btnActualizar.setForeground(new java.awt.Color(0, 235, 247));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/loop (1).png"))); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btninsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(69, 69, 69)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBusqueda))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btninsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        jPanel10.setBackground(new java.awt.Color(255, 204, 204));
        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(27, 27, 27));
        jLabel5.setText("DATOS DEL PRODUCTO");

        jLabel6.setText("ID");

        txtIdProductos.setEditable(false);
        txtIdProductos.setBackground(new java.awt.Color(204, 204, 204));

        jLabel7.setText("NOMBRE DEL PRODUCTO");

        jLabel8.setText("PRECIO DEL PRODUCTO");

        jLabel9.setText("CANTIDAD ");

        jLabel10.setText("CATEGORIA");

        txtnombreP.setBackground(new java.awt.Color(204, 204, 204));

        txtprecioP.setBackground(new java.awt.Color(204, 204, 204));

        txtcantidadP.setBackground(new java.awt.Color(204, 204, 204));

        txtCategoriaP.setBackground(new java.awt.Color(204, 204, 204));

        txtcodigoP.setBackground(new java.awt.Color(204, 204, 204));

        jLabel11.setText("CODIGO DEL PRODUCTO");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel10))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel8))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel9))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel7))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel11)))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtIdProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtcantidadP)
                        .addComponent(txtnombreP)
                        .addComponent(txtprecioP)
                        .addComponent(txtCategoriaP)
                        .addComponent(txtcodigoP, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)))
                .addGap(33, 33, 33))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(32, 32, 32)
                .addComponent(jLabel11)
                .addGap(8, 8, 8)
                .addComponent(txtcodigoP, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtnombreP, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtcantidadP, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtprecioP, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCategoriaP, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        tbpanneinv.addTab("tab1", jPanel4);

        jPanel7.setBackground(new java.awt.Color(255, 74, 88));

        jPanel11.setBackground(new java.awt.Color(153, 255, 255));

        tbProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RUC", "PROVEEDOR", "PRODUCTO", "CANTIDAD"
            }
        ));
        tbProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProveedoresMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbProveedores);
        if (tbProveedores.getColumnModel().getColumnCount() > 0) {
            tbProveedores.getColumnModel().getColumn(0).setMinWidth(50);
            tbProveedores.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbProveedores.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        txtRUC.setEditable(false);

        jLabel25.setText("RUC:");

        jLabel26.setText("PRODUCTO:");

        jLabel28.setText("CANTIDAD");

        jLabel29.setText("PROVEEDOR");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(30, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel28)
                        .addGap(205, 205, 205))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25)
                            .addComponent(txtRUC, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtProducto)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)))
                        .addGap(52, 52, 52))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtProducto)
                    .addComponent(txtRUC))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jPanel12.setBackground(new java.awt.Color(153, 255, 255));

        btnEliminarPorveedores.setBackground(new java.awt.Color(27, 27, 27));
        btnEliminarPorveedores.setForeground(new java.awt.Color(0, 235, 247));
        btnEliminarPorveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1486564399-close_81512.png"))); // NOI18N
        btnEliminarPorveedores.setText("ELIMINAR");
        btnEliminarPorveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPorveedoresActionPerformed(evt);
            }
        });

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1486505376-folder-paper-storage-office-file-storage-data-storage-report_81411.png"))); // NOI18N
        jButton11.setText("REPORTE");

        jButton13.setText("jButton13");

        btnAgregarProveedores.setBackground(new java.awt.Color(27, 27, 27));
        btnAgregarProveedores.setForeground(new java.awt.Color(0, 235, 247));
        btnAgregarProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1486564407-plus-green_81521.png"))); // NOI18N
        btnAgregarProveedores.setText("INSERTAR");
        btnAgregarProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProveedoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAgregarProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarPorveedores, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jButton13)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnAgregarProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32)
                .addComponent(btnEliminarPorveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jButton13)
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        tbpanneinv.addTab("tab4", jPanel7);

        jPanel6.setBackground(new java.awt.Color(255, 74, 88));

        jPanel15.setBackground(new java.awt.Color(153, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder("REGISTRAR CLIENTES\n"));

        tbClientes.setBackground(new java.awt.Color(255, 255, 102));
        tbClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DNI", "NOMBRE", "APELLIDO", "TELEFONO", "CORREO"
            }
        ));
        tbClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbClientesMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbClientes);
        if (tbClientes.getColumnModel().getColumnCount() > 0) {
            tbClientes.getColumnModel().getColumn(0).setMinWidth(50);
            tbClientes.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbClientes.getColumnModel().getColumn(0).setMaxWidth(50);
            tbClientes.getColumnModel().getColumn(1).setMinWidth(85);
            tbClientes.getColumnModel().getColumn(1).setPreferredWidth(85);
            tbClientes.getColumnModel().getColumn(1).setMaxWidth(85);
            tbClientes.getColumnModel().getColumn(2).setMinWidth(110);
            tbClientes.getColumnModel().getColumn(2).setPreferredWidth(110);
            tbClientes.getColumnModel().getColumn(2).setMaxWidth(110);
            tbClientes.getColumnModel().getColumn(3).setMinWidth(110);
            tbClientes.getColumnModel().getColumn(3).setPreferredWidth(110);
            tbClientes.getColumnModel().getColumn(3).setMaxWidth(110);
            tbClientes.getColumnModel().getColumn(4).setMinWidth(85);
            tbClientes.getColumnModel().getColumn(4).setPreferredWidth(85);
            tbClientes.getColumnModel().getColumn(4).setMaxWidth(85);
        }

        btnBusacarEmpleados.setBackground(new java.awt.Color(27, 27, 27));
        btnBusacarEmpleados.setForeground(new java.awt.Color(0, 235, 247));
        btnBusacarEmpleados.setText("BUSCAR");
        btnBusacarEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusacarEmpleadosActionPerformed(evt);
            }
        });

        btnAgregarClientes.setBackground(new java.awt.Color(27, 27, 27));
        btnAgregarClientes.setForeground(new java.awt.Color(0, 235, 247));
        btnAgregarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1486564407-plus-green_81521.png"))); // NOI18N
        btnAgregarClientes.setText("AGREGAR");
        btnAgregarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClientesActionPerformed(evt);
            }
        });

        btneliminarClientes.setBackground(new java.awt.Color(27, 27, 27));
        btneliminarClientes.setForeground(new java.awt.Color(0, 235, 247));
        btneliminarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1486564399-close_81512.png"))); // NOI18N
        btneliminarClientes.setText("ELMINAR");
        btneliminarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarClientesActionPerformed(evt);
            }
        });

        jButton21.setBackground(new java.awt.Color(27, 27, 27));
        jButton21.setForeground(new java.awt.Color(0, 235, 247));
        jButton21.setText("LIMPIAR");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        btnactualizarClientes.setBackground(new java.awt.Color(27, 27, 27));
        btnactualizarClientes.setForeground(new java.awt.Color(0, 235, 247));
        btnactualizarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/loop (1).png"))); // NOI18N
        btnactualizarClientes.setText("ACTUALIZAR");
        btnactualizarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(btnBusacarEmpleados)
                                .addGap(18, 18, 18)
                                .addComponent(txtbuscarEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAgregarClientes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                                .addGap(39, 39, 39)
                                .addComponent(btneliminarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(btnactualizarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBusacarEmpleados)
                    .addComponent(txtbuscarEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton21)
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarClientes)
                    .addComponent(btneliminarClientes)
                    .addComponent(btnactualizarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jPanel16.setBackground(new java.awt.Color(153, 255, 255));

        jLabel15.setText("DATOS DE LOS CLIENTES");

        jLabel16.setText("ID:");

        txtIdClientes.setEditable(false);

        jLabel17.setText("NOMBRE");

        jLabel18.setText("TELEFONO");

        jLabel19.setText("DNI");

        jLabel20.setText("CORREO");

        jLabel31.setText("APELLIDO");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnombClientes)
                    .addComponent(txtDNIClientes)
                    .addComponent(txtCorreoClientes)
                    .addComponent(txttelefonosClientes, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtApellidosClientes)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(txtIdClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel31))
                        .addGap(0, 54, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtIdClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(txtDNIClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(txtnombClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel31)
                .addGap(18, 18, 18)
                .addComponent(txtApellidosClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addComponent(txttelefonosClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addComponent(txtCorreoClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39))
        );

        tbpanneinv.addTab("tab3", jPanel6);

        jPanel8.setBackground(new java.awt.Color(255, 74, 88));

        jPanel17.setBackground(new java.awt.Color(255, 166, 52));
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder("REGISTRO DE VENTA"));

        tbVENTA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE", "PRECIO", "CANTIDAD", "TOTAL"
            }
        ));
        jScrollPane5.setViewportView(tbVENTA);
        if (tbVENTA.getColumnModel().getColumnCount() > 0) {
            tbVENTA.getColumnModel().getColumn(0).setMinWidth(70);
            tbVENTA.getColumnModel().getColumn(0).setPreferredWidth(70);
            tbVENTA.getColumnModel().getColumn(0).setMaxWidth(70);
            tbVENTA.getColumnModel().getColumn(2).setMinWidth(100);
            tbVENTA.getColumnModel().getColumn(2).setPreferredWidth(100);
            tbVENTA.getColumnModel().getColumn(2).setMaxWidth(100);
            tbVENTA.getColumnModel().getColumn(3).setMinWidth(130);
            tbVENTA.getColumnModel().getColumn(3).setPreferredWidth(130);
            tbVENTA.getColumnModel().getColumn(3).setMaxWidth(130);
        }

        jLabel21.setText("CODIGO");

        txtCodigoVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoVentaKeyPressed(evt);
            }
        });

        txtnombreVenta.setEditable(false);

        jLabel22.setText("NOMBRE:");

        txtPrecioVenta.setEditable(false);

        jLabel23.setText("PRECIO");

        txtCantidadVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadVentaKeyPressed(evt);
            }
        });

        jLabel30.setText("CANTIDAD");

        jLabel32.setText("DNI:");

        txtDniVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDniVentaKeyPressed(evt);
            }
        });

        jLabel33.setText("APELLIDO:");

        txtApellidoClienteVenta.setEditable(false);
        txtApellidoClienteVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtApellidoClienteVentaKeyPressed(evt);
            }
        });

        txtnombreclienteVenta.setEditable(false);
        txtnombreclienteVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnombreclienteVentaKeyPressed(evt);
            }
        });

        jLabel34.setText("NOMBRE:");

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel35.setText("TOTAL DE LA VENTA:");

        lbltotalVenta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbltotalVenta.setText("-----------");

        jLabel37.setText("STOCK:");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnombreVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCantidadVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(txtStockVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(txtDestinodst1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86))
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDniVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addGap(39, 39, 39)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnombreclienteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(txtApellidoClienteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbltotalVenta))
                    .addComponent(jLabel33))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel30)
                    .addComponent(jLabel37))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnombreVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidadVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDestinodst1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStockVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jLabel34)
                    .addComponent(jLabel33))
                .addGap(15, 15, 15)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDniVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnombreclienteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidoClienteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35)
                    .addComponent(lbltotalVenta))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnEliminarPila.setBackground(new java.awt.Color(255, 166, 52));

        btnGuardarordendeDespacho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/floppy-disk 2.png"))); // NOI18N
        btnGuardarordendeDespacho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarordendeDespachoActionPerformed(evt);
            }
        });

        btnEliminarOrdendeDespacho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete (5).png"))); // NOI18N
        btnEliminarOrdendeDespacho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarOrdendeDespachoActionPerformed(evt);
            }
        });

        btnImprimirenPdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/printer (1).png"))); // NOI18N
        btnImprimirenPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirenPdfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout btnEliminarPilaLayout = new javax.swing.GroupLayout(btnEliminarPila);
        btnEliminarPila.setLayout(btnEliminarPilaLayout);
        btnEliminarPilaLayout.setHorizontalGroup(
            btnEliminarPilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEliminarPilaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(btnEliminarPilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardarordendeDespacho)
                    .addComponent(btnEliminarOrdendeDespacho)
                    .addComponent(btnImprimirenPdf))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        btnEliminarPilaLayout.setVerticalGroup(
            btnEliminarPilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEliminarPilaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnGuardarordendeDespacho)
                .addGap(46, 46, 46)
                .addComponent(btnEliminarOrdendeDespacho)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(btnImprimirenPdf)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarPila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnEliminarPila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        tbpanneinv.addTab("tab5", jPanel8);

        jPanel1.add(tbpanneinv, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 940, 550));

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


    private void btninsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertarActionPerformed

        int codigo = Integer.parseInt(txtcodigoP.getText());
        String nombre = txtnombreP.getText();
        int cantidad = Integer.parseInt(txtcantidadP.getText());
        double precio = Double.parseDouble(txtprecioP.getText());
        String categoria = txtCategoriaP.getText();
        int confirmacion = JOptionPane.showConfirmDialog(rootPane, "¿Deseas guardar los datos del producto seleccionado?", "Confirmar guardado", JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
            pc.create(new Productos(0, codigo, nombre, cantidad, precio, categoria));
        }

        limpiartableProductos();
        listarProductos();

    }//GEN-LAST:event_btninsertarActionPerformed

    private void tbProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProductosMouseClicked
        // TODO add your handling code here:

        fila = tbProductos.getSelectedRow();
        txtIdProductos.setText("" + tbProductos.getValueAt(fila, 0));
        txtcodigoP.setText("" + tbProductos.getValueAt(fila, 1));
        txtnombreP.setText("" + tbProductos.getValueAt(fila, 2));
        txtcantidadP.setText("" + tbProductos.getValueAt(fila, 3));
        txtprecioP.setText("" + tbProductos.getValueAt(fila, 4));
        txtCategoriaP.setText("" + tbProductos.getValueAt(fila, 5));

    }//GEN-LAST:event_tbProductosMouseClicked

    private void btncerrarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarsesionActionPerformed
        // TODO add your handling code here:
        Login lg = new Login();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btncerrarsesionActionPerformed

    private void btnInventarioFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioFrameActionPerformed
        // TODO add your handling code here:
        tbpanneinv.setSelectedIndex(0);
    }//GEN-LAST:event_btnInventarioFrameActionPerformed

    private void btnProveedoresFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresFrameActionPerformed
        // TODO add your handling code here:
        tbpanneinv.setSelectedIndex(1);
    }//GEN-LAST:event_btnProveedoresFrameActionPerformed

    private void btnClientesFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesFrameActionPerformed
        // TODO add your handling code here:
        tbpanneinv.setSelectedIndex(2);
    }//GEN-LAST:event_btnClientesFrameActionPerformed

    private void btnVentasFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasFrameActionPerformed
        // TODO add your handling code here:
        tbpanneinv.setSelectedIndex(3);
    }//GEN-LAST:event_btnVentasFrameActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here
        LimpiarProductos();

    }//GEN-LAST:event_jButton9ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        // Obtener el código del producto a eliminar desde algún componente de la interfaz,        

        if (fila >= 0) {
            int id = Integer.parseInt(txtIdProductos.getText());
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "¿Deseas eliminar los valores del producto seleccionado?", "Confirmar la eliminacion", JOptionPane.YES_NO_OPTION);
            if (confirmacion == JOptionPane.YES_OPTION) {
                pc.delete(id);
            }
            limpiartableProductos();
            listarProductos();
        } else {
            JOptionPane.showConfirmDialog(rootPane, "seleccionar fila");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedaActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_btnBusquedaActionPerformed

    //---------------CLIENTES------------------------------------------------------------------------------------------------------------  

    private void btnAgregarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClientesActionPerformed
        // TODO add your handling code here:        

        int dni = Integer.parseInt(txtDNIClientes.getText());
        String nombre = txtnombClientes.getText();
        String apellido = txtApellidosClientes.getText();
        int telefono = Integer.parseInt(txttelefonosClientes.getText());
        String correo = txtCorreoClientes.getText();

        int confirmacion = JOptionPane.showConfirmDialog(rootPane, "¿Deseas guardar los datos del cliente seleccionado?", "Confirmar guardado", JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
            Idao.create(new Clientes(0, dni, nombre, apellido, telefono, correo));
        }
        limpiartableClientes();
        listarClientes();

    }//GEN-LAST:event_btnAgregarClientesActionPerformed

    private void tbClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbClientesMouseClicked
        // TODO add your handling code here:

        fila = tbClientes.getSelectedRow();
        txtIdClientes.setText("" + tbClientes.getValueAt(fila, 0));
        txtDNIClientes.setText("" + tbClientes.getValueAt(fila, 1));
        txtnombClientes.setText("" + tbClientes.getValueAt(fila, 2));
        txtApellidosClientes.setText("" + tbClientes.getValueAt(fila, 3));
        txttelefonosClientes.setText("" + tbClientes.getValueAt(fila, 4));
        txtCorreoClientes.setText("" + tbClientes.getValueAt(fila, 5));
    }//GEN-LAST:event_tbClientesMouseClicked

    private void btneliminarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarClientesActionPerformed
        // TODO add your handling code here:

        if (fila >= 0) {
            int id = Integer.parseInt(txtIdClientes.getText());
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "¿Deseas eliminar los valores del cliente seleccionado?", "Confirmar la eliminacion", JOptionPane.YES_NO_OPTION);
            if (confirmacion == JOptionPane.YES_OPTION) {
                Idao.delete(id);
            }
            limpiartableClientes();
            listarClientes();
        } else {
            JOptionPane.showConfirmDialog(rootPane, "seleccionar fila");
        }
    }//GEN-LAST:event_btneliminarClientesActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        LimpiarClientes();
    }//GEN-LAST:event_jButton21ActionPerformed

    private void btnBusacarEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusacarEmpleadosActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_btnBusacarEmpleadosActionPerformed

    private void txtCodigoVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoVentaKeyPressed
        // TODO add your handling code here:
if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
            if (!"".equals(txtCodigoVenta.getText())) {
                String codigo=txtCodigoVenta.getText();
                Productos producto = pd.buscarpro(codigo);
                if (producto.getNombre() !=null) {
                    txtnombreVenta.setText(""+producto.getNombre());
                    txtPrecioVenta.setText(""+producto.getPrecio());
                    txtStockVenta.setText(""+producto.getCantidad());
                    txtCantidadVenta.requestFocus();
                }else{
                    limpiarventa();
                    txtCodigoVenta.requestFocus(); 
                    JOptionPane.showMessageDialog(null, "El código del producto no existe.");
                }
            }else{
                JOptionPane.showMessageDialog(null, "introduzca el codigo del producto ");
                txtCodigoVenta.requestFocus(); 
            }
        }

    }//GEN-LAST:event_txtCodigoVentaKeyPressed

    private void btnGuardarordendeDespachoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarordendeDespachoActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_btnGuardarordendeDespachoActionPerformed

    private void btnAgregarProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProveedoresActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnAgregarProveedoresActionPerformed

    private void btnEliminarPorveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPorveedoresActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnEliminarPorveedoresActionPerformed

    private void tbProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProveedoresMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_tbProveedoresMouseClicked

    private void btnEliminarOrdendeDespachoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarOrdendeDespachoActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_btnEliminarOrdendeDespachoActionPerformed

    private void btnImprimirenPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirenPdfActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_btnImprimirenPdfActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        fila = tbProductos.getSelectedRow();
        if (fila >= 0) {
            int id = Integer.parseInt(txtIdProductos.getText());
            int codigo = Integer.parseInt(txtcodigoP.getText());
            String nombre = txtnombreP.getText();
            int cantidad = Integer.parseInt(txtcantidadP.getText());
            double precio = Double.parseDouble(txtprecioP.getText());
            String categoria = txtCategoriaP.getText();
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "¿Deseas actualizar los valores del producto seleccionado?", "Confirmar actualización", JOptionPane.YES_NO_OPTION);
            if (confirmacion == JOptionPane.YES_OPTION) {
                pc.update(new Productos(id, codigo, nombre, cantidad, precio, categoria));
            }
            limpiartableProductos();
            listarProductos();
        } else {
            JOptionPane.showConfirmDialog(rootPane, "seleccionar fila");
        }


    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnactualizarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarClientesActionPerformed
        // TODO add your handling code here:

        fila = tbClientes.getSelectedRow();
        if (fila >= 0) {
            int id = Integer.parseInt(txtIdClientes.getText());
            int dni = Integer.parseInt(txtDNIClientes.getText());
            String nombre = txtnombClientes.getText();
            String apellido = txtApellidosClientes.getText();
            int telefono = Integer.parseInt(txttelefonosClientes.getText());
            String correo = txtCorreoClientes.getText();
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "¿Deseas actualizar los valores del cliente seleccionado?", "Confirmar actualización", JOptionPane.YES_NO_OPTION);
            if (confirmacion == JOptionPane.YES_OPTION) {
                Idao.update(new Clientes(id, dni, nombre, apellido, telefono, correo));
            }
            limpiartableClientes();
            listarClientes();
        } else {
            JOptionPane.showConfirmDialog(rootPane, "seleccionar fila");
        }
    }//GEN-LAST:event_btnactualizarClientesActionPerformed

    private void txtDniVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniVentaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
             if(!"".equals(txtDniVenta.getText())){
                 int dni = Integer.parseInt(txtDniVenta.getText());
                 Clientes cliente = cp.buscarcli(dni);
                   if (cliente.getNombre()!=null) {
                     txtnombreclienteVenta.setText(""+cliente.getNombre());
                     txtApellidoClienteVenta.setText(""+cliente.getApellido());
                 }else{
                       txtDniVenta.setText("");
                       JOptionPane.showMessageDialog(null, "el cliente no existe");
                   }
             }
         }
    }//GEN-LAST:event_txtDniVentaKeyPressed

    private void txtApellidoClienteVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoClienteVentaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoClienteVentaKeyPressed

    private void txtnombreclienteVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreclienteVentaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreclienteVentaKeyPressed

    private void txtCantidadVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadVentaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
             if(!"".equals(txtCantidadVenta.getText())){
                 String codigo = txtCodigoVenta.getText();
                 String nombre = txtnombreVenta.getText();
                 double precio = Double.parseDouble(txtPrecioVenta.getText());
                 int cantidad =Integer.parseInt(txtCantidadVenta.getText());
                 double total = cantidad * precio;
                 int stock =Integer.parseInt(txtStockVenta.getText());
                 if (stock >= cantidad){
                     item =item + 1;
                     model =(DefaultTableModel) tbVENTA.getModel();
                     for (int i = 0; i < tbVENTA.getRowCount(); i++) {
                         if(tbVENTA.getValueAt(i, 1).equals(txtnombreVenta  .getText())){
                             JOptionPane.showMessageDialog(null, "el producto ya fue vendido");
                             return;
                         }
                     }
                     ArrayList lista = new ArrayList();
                     lista.add(item);
                     lista.add(codigo);
                     lista.add(nombre);
                     lista.add(precio);
                     lista.add(cantidad);
                      lista.add(total);
                      Object[] v = new Object[5];
                        v[0]=lista.get(1);
                        v[1]=lista.get(2);
                        v[2]=lista.get(3);
                        v[3]=lista.get(4);
                        v[4]=lista.get(5);
                        model.addRow(v);
                        tbVENTA.setModel(model);                      
                        totalventa();  
                        limpiarventa();
                        txtCodigoVenta.requestFocus();
                 }else{
                     JOptionPane.showMessageDialog(null, "stock no disponible");
                 }
             }else{
              JOptionPane.showMessageDialog(null, "ingrese cantidad");

             }
         }
    }//GEN-LAST:event_txtCantidadVentaKeyPressed

    void listarProductos() {
        List<Productos> lista = new ArrayList<>();
        model = (DefaultTableModel) tbProductos.getModel();
        lista = pc.readAll();
        Object[] datos = new Object[6];
        for (int i = 0; i < lista.size(); i++) {
            datos[0] = lista.get(i).getId_Productos();
            datos[1] = lista.get(i).getCodigo();
            datos[2] = lista.get(i).getNombre();
            datos[3] = lista.get(i).getCantidad();
            datos[4] = lista.get(i).getPrecio();
            datos[5] = lista.get(i).getCategoria();
            model.addRow(datos);
        }
        tbProductos.setModel(model);

    }

    void limpiartableProductos() {
        DefaultTableModel model = (DefaultTableModel) tbProductos.getModel();
        model.setRowCount(0);

    }

    void LimpiarProductos() {
        txtIdProductos.setText("");
        txtcodigoP.setText("");
        txtnombreP.setText("");
        txtcantidadP.setText("");
        txtprecioP.setText("");
        txtCategoriaP.setText("");
    }

    void listarClientes() {
        List<Clientes> lista = new ArrayList<>();
        model = (DefaultTableModel) tbClientes.getModel();
        lista = Idao.readAll();
        Object[] datos = new Object[6];
        for (int i = 0; i < lista.size(); i++) {
            datos[0] = lista.get(i).getIdcliente();
            datos[1] = lista.get(i).getDni();
            datos[2] = lista.get(i).getNombre();
            datos[3] = lista.get(i).getApellido();
            datos[4] = lista.get(i).getTelefono();
            datos[5] = lista.get(i).getCorreo();
            model.addRow(datos);
        }
        tbClientes.setModel(model);
    }

    void limpiartableClientes() {
        DefaultTableModel model = (DefaultTableModel) tbClientes.getModel();
        model.setRowCount(0);
    }

    void LimpiarClientes() {
        txtIdClientes.setText("");
        txtDNIClientes.setText("");
        txtnombClientes.setText("");
        txtApellidosClientes.setText("");
        txttelefonosClientes.setText("");
        txtCorreoClientes.setText("");
    }
    
    
    void limpiarventa(){
        txtCodigoVenta.setText("");
        txtnombreVenta.setText("");
        txtPrecioVenta.setText("");
        txtCantidadVenta.setText("");
        txtStockVenta.setText("");
        
    }
    
    
     private  void totalventa(){
          totalventa=0.00;
          int posicionfila = tbVENTA.getRowCount();
          for (int i = 0; i < posicionfila; i++) {
              double operacion = Double.parseDouble(String.valueOf(tbVENTA.getModel().getValueAt(i, 4)));
              totalventa = totalventa + operacion;
          }
          lbltotalVenta.setText(String.format("%.2f",totalventa));
      }
     
     

    /**
     * @param args the command line arguments
     *
     *
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
            java.util.logging.Logger.getLogger(inventarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inventarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inventarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inventarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new inventarioFrame().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregarClientes;
    private javax.swing.JButton btnAgregarProveedores;
    private javax.swing.JButton btnBusacarEmpleados;
    private javax.swing.JButton btnBusqueda;
    private javax.swing.JButton btnClientesFrame;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarOrdendeDespacho;
    private javax.swing.JPanel btnEliminarPila;
    private javax.swing.JButton btnEliminarPorveedores;
    private javax.swing.JButton btnGuardarordendeDespacho;
    private javax.swing.JButton btnImprimirenPdf;
    private javax.swing.JButton btnInventarioFrame;
    private javax.swing.JButton btnProveedoresFrame;
    private javax.swing.JButton btnVentasFrame;
    private javax.swing.JButton btnactualizarClientes;
    private javax.swing.JButton btncerrarsesion;
    private javax.swing.JButton btneliminarClientes;
    private javax.swing.JButton btninsertar;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lbltotalVenta;
    private javax.swing.JLabel lbluser;
    private javax.swing.JTable tbClientes;
    private javax.swing.JTable tbProductos;
    private javax.swing.JTable tbProveedores;
    private javax.swing.JTable tbVENTA;
    private javax.swing.JTabbedPane tbpanneinv;
    private javax.swing.JTextField txtApellidoClienteVenta;
    private javax.swing.JTextField txtApellidosClientes;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCantidadVenta;
    private javax.swing.JTextField txtCategoriaP;
    private javax.swing.JTextField txtCodigoVenta;
    private javax.swing.JTextField txtCorreoClientes;
    private javax.swing.JTextField txtDNIClientes;
    private javax.swing.JTextField txtDestinodst1;
    private javax.swing.JTextField txtDniVenta;
    private javax.swing.JTextField txtIdClientes;
    private javax.swing.JTextField txtIdProductos;
    private javax.swing.JTextField txtPrecioVenta;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtProveedor;
    private javax.swing.JTextField txtRUC;
    private javax.swing.JTextField txtStockVenta;
    private javax.swing.JTextField txtbuscarEmpleados;
    private javax.swing.JTextField txtbusqueda;
    private javax.swing.JTextField txtcantidadP;
    private javax.swing.JTextField txtcodigoP;
    private javax.swing.JTextField txtnombClientes;
    private javax.swing.JTextField txtnombreP;
    private javax.swing.JTextField txtnombreVenta;
    private javax.swing.JTextField txtnombreclienteVenta;
    private javax.swing.JTextField txtprecioP;
    private javax.swing.JTextField txttelefonosClientes;
    // End of variables declaration//GEN-END:variables
}
