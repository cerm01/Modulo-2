package com.mycompany.archivos_secuenciales;



import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class main extends javax.swing.JFrame {
    DataOutputStream write;
    DataInputStream read;
    String path = "C:\\Proyecto\\vc.txt";

    Files f;
    contacto cto;
    contacto admin;
    
    reparaciones_File rf;
    reparaciones rep;
    
    Vehiculos_Files v;
    Vehiculos vcs;
    
    VC_File vcf;
    vehiculo_cliente vc;
    
    Cliente_File fc;
    cliente c;

    String IdUs;
    
    boolean ban = false;
    boolean ban_vehiculos = false;
    boolean ban_reparaciones = false;

    public main() throws IOException {
        initComponents();
        f = new Files();
        rf = new reparaciones_File();
        fc= new Cliente_File();
        v=new Vehiculos_Files();
        vcf=new VC_File();
        
      
        admin=new contacto();
        admin.setId(0);
        admin.setNombre("Admi");
        admin.setPaterno("Nistra");
        admin.setMaterno("Dor");
        admin.setUsername("super");
        admin.setTelefono("3359525148");
        admin.setDireccion("plata");
        admin.setPassword("123");
        admin.setPerfil("Admin");

        btn_V_Guardar.setEnabled(false);
        btn_V_Nuevo.setEnabled(true);
        btn_V_Editar.setEnabled(false);
        btn_V_Eliminar.setEnabled(false);
        btn_V_Cancelar.setEnabled(false);

        try {
            if (f.BuscarContacto(admin) == null) {
                f.Guardar(admin);
            }
        } catch (FileNotFoundException ex) {

        }
        tpane.setEnabledAt(1, false);
        tpane.setEnabledAt(2, false);
        tpane.setEnabledAt(3, false);
        tpane.setEnabledAt(4, false);
        tpane.setEnabledAt(5, false);

    }
    
    public void cb_vehiculos(){
        cb_V_SeleccioneCliente.removeAllItems();
        String us = "", cl = "";
        try {
            read = new DataInputStream(new FileInputStream(path));

            while (true) {
                us = read.readUTF();
                cl = read.readUTF();
                if (us.equals(IdUs)) {
                    cb_V_SeleccioneCliente.addItem(cl);
                }
            }
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {
        }
        try {
            read.close();
        } catch (IOException ex) {

        }
    }

    public void Habilitar() {
        txtNombre.setEditable(true);
        txtPaterno.setEditable(true);
        txtMaterno.setEditable(true);
        txtTelefono.setEditable(true);
        txtUsername.setEditable(true);
        cbPerfil.setEditable(true);
        txtDireccion.setEditable(true);
        txtPsw.setEditable(true);
    }

    public void Deshabilitar() {
        txtNombre.setEditable(false);
        txtPaterno.setEditable(false);
        txtMaterno.setEditable(false);
        txtTelefono.setEditable(false);
        txtUsername.setEditable(false);
        cbPerfil.setEditable(false);
        txtDireccion.setEditable(false);
        txtPsw.setEditable(false);

        txtNombre.setText("");
        txtTelefono.setText("");
        txtPaterno.setText("");
        txtMaterno.setText("");
        txtUsername.setText("");
        cbPerfil.setSelectedItem("");
        txtDireccion.setText("");

    }

    public void Vehiculos_Habilitar() {
        txt_V_IdVehiculo.setEditable(true);
        txt_V_Matricula.setEditable(true);
        txt_V_Marca.setEditable(true);
        txt_V_Modelo.setEditable(true);
        jdt_V_Fecha.setEnabled(true);
    }

    public void reparaciones_Habilitar() {
        cmb_R_IdVehiculo.setEditable(true);
        cmb_R_IdPieza.setEditable(true);
        txt_R_IdReparacion.setEditable(true);
        txt_R_Falla.setEditable(true);
        txt_R_ControlPiezas.setEditable(true);
        jdt_E_Fecha.setEnabled(true);
        jdt_S_Fecha.setEnabled(true);
    }

    public void Vehiculos_Deshabilitar() {
        txt_V_IdVehiculo.setEditable(false);
        txt_V_Matricula.setEditable(false);
        txt_V_Marca.setEditable(false);
        txt_V_Modelo.setEditable(false);
        jdt_V_Fecha.setEnabled(false);

        txt_V_IdVehiculo.setText("");
        txt_V_Matricula.setText("");
        txt_V_Marca.setText("");
        txt_V_Modelo.setText("");
    }

    public void reparaciones_Deshabilitar() {
        cmb_R_IdVehiculo.setEditable(false);
        cmb_R_IdPieza.setEditable(false);
        txt_R_IdReparacion.setEditable(false);
        txt_R_Falla.setEditable(false);
        txt_R_ControlPiezas.setEditable(false);
        jdt_E_Fecha.setEnabled(false);
        jdt_S_Fecha.setEnabled(false);

        cmb_R_IdVehiculo.setSelectedItem("");
        cmb_R_IdPieza.setSelectedItem("");
        txt_R_IdReparacion.setText("");
        txt_R_Falla.setText("");
        txt_R_ControlPiezas.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        tpane = new javax.swing.JTabbedPane();
        pnlLogin = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnAutentificar = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        pnlUsuarios = new javax.swing.JPanel();
        txtID = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMaterno = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        cbPerfil = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtPsw = new javax.swing.JTextField();
        btnRemover = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPaterno = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        lblPassword1 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        pnlClientes = new javax.swing.JPanel();
        lbl_C_IdUsuario = new javax.swing.JLabel();
        lbl_C_IdCliente = new javax.swing.JLabel();
        lbl_C_Id = new javax.swing.JLabel();
        lbl_C_Nombre = new javax.swing.JLabel();
        lbl_C_ApellidoPaterno = new javax.swing.JLabel();
        lbl_C_ApellidoMaterno = new javax.swing.JLabel();
        txt_C_Buscar = new javax.swing.JTextField();
        txt_C_IdCliente = new javax.swing.JTextField();
        txt_C_Nombre = new javax.swing.JTextField();
        txt_C_ApellidoPaterno = new javax.swing.JTextField();
        txt_C_ApellidoMaterno = new javax.swing.JTextField();
        btn_C_Buscar = new javax.swing.JButton();
        btn_C_Nuevo = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btn_C_Guardar = new javax.swing.JButton();
        btn_C_Cancelar = new javax.swing.JButton();
        btn_C_Editar = new javax.swing.JButton();
        btn_C_Eliminar = new javax.swing.JButton();
        btn_C_Salir = new javax.swing.JButton();
        txt_C_IdUsuario = new javax.swing.JTextField();
        pnlVehiculos = new javax.swing.JPanel();
        lbl_V_SeleccioneCliente = new javax.swing.JLabel();
        lbl_V_IdVehiculo = new javax.swing.JLabel();
        lbl_V_Matricula = new javax.swing.JLabel();
        lbl_V_Marca = new javax.swing.JLabel();
        lbl_V_Modelo = new javax.swing.JLabel();
        lbl_V_Id = new javax.swing.JLabel();
        lbl_V_Fecha = new javax.swing.JLabel();
        txt_V_Buscar = new javax.swing.JTextField();
        txt_V_IdVehiculo = new javax.swing.JTextField();
        txt_V_Matricula = new javax.swing.JTextField();
        txt_V_Marca = new javax.swing.JTextField();
        txt_V_Modelo = new javax.swing.JTextField();
        cb_V_SeleccioneCliente = new javax.swing.JComboBox<>();
        btn_V_Nuevo = new javax.swing.JButton();
        btn_V_Guardar = new javax.swing.JButton();
        btn_V_Cancelar = new javax.swing.JButton();
        btn_V_Editar = new javax.swing.JButton();
        btn_V_Eliminar = new javax.swing.JButton();
        btn_V_Buscar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jdt_V_Fecha = new com.toedter.calendar.JDateChooser();
        pnlReparaciones = new javax.swing.JPanel();
        lbl_R_Id = new javax.swing.JLabel();
        lbl_R_IdVehiculo = new javax.swing.JLabel();
        lbl_R_IdPieza = new javax.swing.JLabel();
        lbl_R_Id_Reparacion = new javax.swing.JLabel();
        lbl_R_Falla = new javax.swing.JLabel();
        lbl_R_ControlPiezas = new javax.swing.JLabel();
        lbl_R_FechaEntrada = new javax.swing.JLabel();
        lbl_R_FechaSalida = new javax.swing.JLabel();
        cmb_R_IdVehiculo = new javax.swing.JComboBox<>();
        cmb_R_IdPieza = new javax.swing.JComboBox<>();
        btn_R_Nuevo = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        txt_R_Id = new javax.swing.JTextField();
        txt_R_IdReparacion = new javax.swing.JTextField();
        txt_R_Falla = new javax.swing.JTextField();
        txt_R_ControlPiezas = new javax.swing.JTextField();
        btn_R_Guardar = new javax.swing.JButton();
        btn_R_Cancelar = new javax.swing.JButton();
        btn_R_Editar = new javax.swing.JButton();
        btn_R_Eliminar = new javax.swing.JButton();
        btn_R_Buscar = new javax.swing.JButton();
        btn_R_Salir = new javax.swing.JButton();
        jdt_E_Fecha = new com.toedter.calendar.JDateChooser();
        jdt_S_Fecha = new com.toedter.calendar.JDateChooser();
        pnlPiezas = new javax.swing.JPanel();
        lbl_P_Id = new javax.swing.JLabel();
        lbl_P_IdPieza = new javax.swing.JLabel();
        lbl_P_Descripcion = new javax.swing.JLabel();
        lbl_P_Stock = new javax.swing.JLabel();
        btn_P_Nuevo = new javax.swing.JButton();
        txt_P_Id = new javax.swing.JTextField();
        txt_P_IdPieza = new javax.swing.JTextField();
        txt_P_Descripcion = new javax.swing.JTextField();
        txt_P_Stock = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        btn_P_Buscar = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        btn_P_Salir = new javax.swing.JButton();

        jButton3.setText("Nuevo");

        jButton7.setText("jButton1");

        jButton12.setText("jButton1");

        jButton14.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblUsuario.setText("Usuario");

        jLabel2.setText("Password");

        btnAutentificar.setText("Autentificar");
        btnAutentificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutentificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAutentificar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(215, Short.MAX_VALUE))
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAutentificar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(213, Short.MAX_VALUE))
        );

        tpane.addTab("Login", pnlLogin);

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnSalvar.setText("Guardar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel3.setText("Apellido Paterno");

        jLabel4.setText("Apellido Materno");

        jLabel5.setText("Username:");

        txtMaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaternoActionPerformed(evt);
            }
        });

        cbPerfil.setEditable(true);
        cbPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Gerente", "Secretaria", "Mecánico" }));

        jLabel6.setText("Perfil:");

        lblPassword.setText("Password");

        btnRemover.setText("Eliminar");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingrese ID");

        jLabel8.setText("ID");

        jLabel9.setText("Nombre");

        txtPaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaternoActionPerformed(evt);
            }
        });

        jLabel10.setText("Telefono");

        lblPassword1.setText("Dirección");

        javax.swing.GroupLayout pnlUsuariosLayout = new javax.swing.GroupLayout(pnlUsuarios);
        pnlUsuarios.setLayout(pnlUsuariosLayout);
        pnlUsuariosLayout.setHorizontalGroup(
            pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUsuariosLayout.createSequentialGroup()
                .addGroup(pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlUsuariosLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlUsuariosLayout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUsuariosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUsuariosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnlUsuariosLayout.createSequentialGroup()
                .addGroup(pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(pnlUsuariosLayout.createSequentialGroup()
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(24, 24, 24)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlUsuariosLayout.createSequentialGroup()
                            .addGroup(pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPsw, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(lblPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlUsuariosLayout.setVerticalGroup(
            pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPsw, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tpane.addTab("Usuarios", pnlUsuarios);

        lbl_C_IdUsuario.setText("ID Usuario");

        lbl_C_IdCliente.setText("ID Cliente");

        lbl_C_Id.setText("ID");

        lbl_C_Nombre.setText("Nombre");

        lbl_C_ApellidoPaterno.setText("Apellido Paterno");

        lbl_C_ApellidoMaterno.setText("Apellido Materno");

        txt_C_IdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_C_IdClienteActionPerformed(evt);
            }
        });

        btn_C_Buscar.setText("Buscar");
        btn_C_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_C_BuscarActionPerformed(evt);
            }
        });

        btn_C_Nuevo.setText("Nuevo");
        btn_C_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_C_NuevoActionPerformed(evt);
            }
        });

        btn_C_Guardar.setText("Guardar");
        btn_C_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_C_GuardarActionPerformed(evt);
            }
        });

        btn_C_Cancelar.setText("Cancelar");
        btn_C_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_C_CancelarActionPerformed(evt);
            }
        });

        btn_C_Editar.setText("Editar");
        btn_C_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_C_EditarActionPerformed(evt);
            }
        });

        btn_C_Eliminar.setText("Eliminar");
        btn_C_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_C_EliminarActionPerformed(evt);
            }
        });

        btn_C_Salir.setText("Salir");
        btn_C_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_C_SalirActionPerformed(evt);
            }
        });

        txt_C_IdUsuario.setEditable(false);

        javax.swing.GroupLayout pnlClientesLayout = new javax.swing.GroupLayout(pnlClientes);
        pnlClientes.setLayout(pnlClientesLayout);
        pnlClientesLayout.setHorizontalGroup(
            pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlClientesLayout.createSequentialGroup()
                        .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlClientesLayout.createSequentialGroup()
                                .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlClientesLayout.createSequentialGroup()
                                        .addComponent(lbl_C_IdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_C_IdUsuario)
                                        .addGap(230, 230, 230))
                                    .addGroup(pnlClientesLayout.createSequentialGroup()
                                        .addComponent(lbl_C_IdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_C_IdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlClientesLayout.createSequentialGroup()
                                        .addComponent(lbl_C_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_C_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlClientesLayout.createSequentialGroup()
                                        .addComponent(lbl_C_ApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_C_ApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlClientesLayout.createSequentialGroup()
                                        .addComponent(lbl_C_ApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_C_ApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlClientesLayout.createSequentialGroup()
                                        .addComponent(btn_C_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_C_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_C_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_C_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_C_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jSeparator1))
                        .addContainerGap())
                    .addGroup(pnlClientesLayout.createSequentialGroup()
                        .addComponent(lbl_C_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_C_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_C_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                        .addComponent(btn_C_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );
        pnlClientesLayout.setVerticalGroup(
            pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_C_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_C_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_C_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_C_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_C_IdUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(txt_C_IdUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_C_IdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_C_IdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_C_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_C_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_C_ApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_C_ApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_C_ApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_C_ApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_C_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_C_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_C_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_C_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_C_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tpane.addTab("Clientes", pnlClientes);

        lbl_V_SeleccioneCliente.setText("Seleccione cliente");

        lbl_V_IdVehiculo.setText("ID Vehiculo");

        lbl_V_Matricula.setText("Matricula");

        lbl_V_Marca.setText("Marca");

        lbl_V_Modelo.setText("Modelo");

        lbl_V_Id.setText("ID");

        lbl_V_Fecha.setText("Fecha");

        cb_V_SeleccioneCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cb_V_SeleccioneClienteMouseClicked(evt);
            }
        });
        cb_V_SeleccioneCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_V_SeleccioneClienteActionPerformed(evt);
            }
        });

        btn_V_Nuevo.setText("Nuevo");
        btn_V_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_V_NuevoActionPerformed(evt);
            }
        });

        btn_V_Guardar.setText("Guardar");
        btn_V_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_V_GuardarActionPerformed(evt);
            }
        });

        btn_V_Cancelar.setText("Cancelar");
        btn_V_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_V_CancelarActionPerformed(evt);
            }
        });

        btn_V_Editar.setText("Editar");
        btn_V_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_V_EditarActionPerformed(evt);
            }
        });

        btn_V_Eliminar.setText("Eliminar");
        btn_V_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_V_EliminarActionPerformed(evt);
            }
        });

        btn_V_Buscar.setText("Buscar");
        btn_V_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_V_BuscarActionPerformed(evt);
            }
        });

        jdt_V_Fecha.setDateFormatString("dd-MM-yyyy");

        javax.swing.GroupLayout pnlVehiculosLayout = new javax.swing.GroupLayout(pnlVehiculos);
        pnlVehiculos.setLayout(pnlVehiculosLayout);
        pnlVehiculosLayout.setHorizontalGroup(
            pnlVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVehiculosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlVehiculosLayout.createSequentialGroup()
                        .addComponent(lbl_V_SeleccioneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cb_V_SeleccioneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlVehiculosLayout.createSequentialGroup()
                        .addComponent(lbl_V_IdVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_V_IdVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlVehiculosLayout.createSequentialGroup()
                        .addComponent(lbl_V_Matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_V_Matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlVehiculosLayout.createSequentialGroup()
                        .addComponent(lbl_V_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_V_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlVehiculosLayout.createSequentialGroup()
                        .addComponent(lbl_V_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_V_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_V_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlVehiculosLayout.createSequentialGroup()
                        .addComponent(btn_V_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_V_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_V_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_V_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_V_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlVehiculosLayout.createSequentialGroup()
                            .addComponent(lbl_V_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jdt_V_Fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlVehiculosLayout.createSequentialGroup()
                            .addComponent(lbl_V_Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txt_V_Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(96, Short.MAX_VALUE))
            .addComponent(jSeparator2)
        );
        pnlVehiculosLayout.setVerticalGroup(
            pnlVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVehiculosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_V_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_V_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_V_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_V_SeleccioneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_V_SeleccioneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_V_IdVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_V_IdVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_V_Matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_V_Matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_V_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_V_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_V_Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_V_Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_V_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdt_V_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_V_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_V_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_V_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_V_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_V_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tpane.addTab("Vehículos", pnlVehiculos);

        lbl_R_Id.setText("ID");

        lbl_R_IdVehiculo.setText("ID Vehiculo");

        lbl_R_IdPieza.setText("ID Pieza");

        lbl_R_Id_Reparacion.setText("ID Reparación");

        lbl_R_Falla.setText("Falla");

        lbl_R_ControlPiezas.setText("Control Piezas");

        lbl_R_FechaEntrada.setText("Fecha Entrada");

        lbl_R_FechaSalida.setText("Fecha Salida");

        cmb_R_IdVehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        cmb_R_IdPieza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05" }));

        btn_R_Nuevo.setText("Nuevo");
        btn_R_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_R_NuevoActionPerformed(evt);
            }
        });

        txt_R_Falla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_R_FallaActionPerformed(evt);
            }
        });

        btn_R_Guardar.setText("Guardar");
        btn_R_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_R_GuardarActionPerformed(evt);
            }
        });

        btn_R_Cancelar.setText("Cancelar");
        btn_R_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_R_CancelarActionPerformed(evt);
            }
        });

        btn_R_Editar.setText("Editar");
        btn_R_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_R_EditarActionPerformed(evt);
            }
        });

        btn_R_Eliminar.setText("Eliminar");
        btn_R_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_R_EliminarActionPerformed(evt);
            }
        });

        btn_R_Buscar.setText("Buscar");
        btn_R_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_R_BuscarActionPerformed(evt);
            }
        });

        btn_R_Salir.setText("Salir");
        btn_R_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_R_SalirActionPerformed(evt);
            }
        });

        jdt_E_Fecha.setDateFormatString("dd-MM-yyyy");

        jdt_S_Fecha.setDateFormatString("dd-MM-yyyy");

        javax.swing.GroupLayout pnlReparacionesLayout = new javax.swing.GroupLayout(pnlReparaciones);
        pnlReparaciones.setLayout(pnlReparacionesLayout);
        pnlReparacionesLayout.setHorizontalGroup(
            pnlReparacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReparacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlReparacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlReparacionesLayout.createSequentialGroup()
                        .addGroup(pnlReparacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlReparacionesLayout.createSequentialGroup()
                                .addComponent(lbl_R_IdVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmb_R_IdVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlReparacionesLayout.createSequentialGroup()
                                .addComponent(lbl_R_Id_Reparacion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_R_IdReparacion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlReparacionesLayout.createSequentialGroup()
                                .addComponent(lbl_R_IdPieza, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmb_R_IdPieza, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlReparacionesLayout.createSequentialGroup()
                                .addComponent(btn_R_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_R_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_R_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_R_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_R_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlReparacionesLayout.createSequentialGroup()
                                .addComponent(lbl_R_Falla, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_R_Falla, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlReparacionesLayout.createSequentialGroup()
                        .addGroup(pnlReparacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlReparacionesLayout.createSequentialGroup()
                                .addGroup(pnlReparacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_R_ControlPiezas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_R_FechaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_R_FechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnlReparacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_R_ControlPiezas)
                                    .addComponent(jdt_E_Fecha, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(jdt_S_Fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 295, Short.MAX_VALUE))
                            .addGroup(pnlReparacionesLayout.createSequentialGroup()
                                .addComponent(lbl_R_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_R_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_R_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_R_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31))))
            .addComponent(jSeparator3)
        );
        pnlReparacionesLayout.setVerticalGroup(
            pnlReparacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReparacionesLayout.createSequentialGroup()
                .addGroup(pnlReparacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlReparacionesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlReparacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_R_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_R_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_R_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_R_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlReparacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_R_IdVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_R_IdVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(pnlReparacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_R_IdPieza, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_R_IdPieza, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlReparacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_R_Id_Reparacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_R_IdReparacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlReparacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_R_Falla, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_R_Falla, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlReparacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_R_ControlPiezas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_R_ControlPiezas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_R_FechaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlReparacionesLayout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(jdt_E_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlReparacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_R_FechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdt_S_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlReparacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_R_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_R_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_R_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_R_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_R_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        txt_R_Id.getAccessibleContext().setAccessibleName("");

        tpane.addTab("Reparaciones", pnlReparaciones);

        lbl_P_Id.setText("ID");

        lbl_P_IdPieza.setText("ID Pieza");

        lbl_P_Descripcion.setText("Descripción");

        lbl_P_Stock.setText("Stock");

        btn_P_Nuevo.setText("Nuevo");

        jButton9.setText("Guardar");

        jButton10.setText("Cancelar");

        jButton11.setText("Editar");

        jButton13.setText("Eliminar");

        btn_P_Buscar.setText("Buscar");

        btn_P_Salir.setText("Salir");
        btn_P_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_P_SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPiezasLayout = new javax.swing.GroupLayout(pnlPiezas);
        pnlPiezas.setLayout(pnlPiezasLayout);
        pnlPiezasLayout.setHorizontalGroup(
            pnlPiezasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPiezasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPiezasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPiezasLayout.createSequentialGroup()
                        .addComponent(lbl_P_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_P_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_P_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addComponent(btn_P_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(pnlPiezasLayout.createSequentialGroup()
                        .addGroup(pnlPiezasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPiezasLayout.createSequentialGroup()
                                .addComponent(lbl_P_Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_P_Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlPiezasLayout.createSequentialGroup()
                                .addComponent(lbl_P_Stock, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_P_Stock, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlPiezasLayout.createSequentialGroup()
                                .addComponent(btn_P_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlPiezasLayout.createSequentialGroup()
                                .addComponent(lbl_P_IdPieza, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_P_IdPieza, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jSeparator4)
        );
        pnlPiezasLayout.setVerticalGroup(
            pnlPiezasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPiezasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPiezasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_P_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_P_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_P_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_P_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPiezasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_P_IdPieza, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_P_IdPieza, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPiezasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_P_Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_P_Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPiezasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_P_Stock, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_P_Stock, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 259, Short.MAX_VALUE)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlPiezasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_P_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tpane.addTab("Piezas", pnlPiezas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(tpane)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            cto = new contacto();
            cto.setId(Integer.parseInt(txtBuscar.getText()));

            cto = f.BuscarContacto(cto);

            if (cto != null) {
                if (cto.getId() == 0) {
                    btnSalvar.setEnabled(false);
                    btnNuevo.setEnabled(true);
                    btnEditar.setEnabled(false);
                    btnRemover.setEnabled(false);
                    btnCancelar.setEnabled(false);
                } else {
                    btnSalvar.setEnabled(false);
                    btnNuevo.setEnabled(true);
                    btnEditar.setEnabled(true);
                    btnRemover.setEnabled(true);
                    btnCancelar.setEnabled(false);
                }
                Deshabilitar();
                txtPsw.setVisible(false);
                lblPassword.setVisible(false);

                txtBuscar.setText("");
                txtID.setText(String.valueOf(cto.getId()));
                txtNombre.setText(cto.getNombre());
                txtTelefono.setText(cto.getTelefono());
                txtPaterno.setText(cto.getPaterno());
                txtMaterno.setText(cto.getMaterno());
                txtUsername.setText(cto.getUsername());
                cbPerfil.setSelectedItem(cto.getPerfil());
                txtDireccion.setText(cto.getDireccion());

            } else {
                JOptionPane.showMessageDialog(null, "No existe ese ID");
                txtBuscar.setText("");
            }

        } catch (FileNotFoundException ex) {

        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        /* if(band){
           contID++;
           band=false;
       }*/
        Habilitar();
        txtPsw.setVisible(true);
        lblPassword.setVisible(true);

        btnSalvar.setEnabled(true);
        btnNuevo.setEnabled(false);
        btnEditar.setEnabled(false);
        btnRemover.setEnabled(false);
        btnCancelar.setEnabled(false);

        txtID.setText("");
        txtNombre.setText("");
        txtTelefono.setText("");
        txtPaterno.setText("");
        txtMaterno.setText("");
        txtUsername.setText("");
        cbPerfil.setSelectedItem("");
        txtDireccion.setText("");
        txtPsw.setText("");

    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            cto = new contacto();
            cto.setUsername(txtUsername.getText());
            String contra;

            if (ban != true && f.BuscarUsuario(cto) != null) {
                JOptionPane.showMessageDialog(null, "Ese Nombre de Usuario ya existe");
                return;
            }

            cto.setId(Integer.parseInt(txtID.getText()));
            cto.setNombre(txtNombre.getText());
            cto.setTelefono(txtTelefono.getText());
            cto.setPaterno(txtPaterno.getText());
            cto.setMaterno(txtMaterno.getText());
            cto.setPerfil(cbPerfil.getSelectedItem().toString());
            cto.setDireccion(txtDireccion.getText());

            if (ban != true) {
                cto.setPassword(txtPsw.getText());
                f.Guardar(cto);
                JOptionPane.showMessageDialog(null, "Guardado con Éxito");
            } else {
                ban = false;
                try {
                    contra = f.BuscarUsuario(cto).getPassword();
                    System.out.println(contra);
                    cto.setPassword(contra);
                    f.Editar(cto);
                    JOptionPane.showMessageDialog(null, "Editado con Éxito");
                    System.out.println("SI");
                } catch (IOException ex) {

                }
            }
            btnSalvar.setEnabled(false);
            btnNuevo.setEnabled(true);
            btnEditar.setEnabled(false);
            btnRemover.setEnabled(false);
            btnCancelar.setEnabled(false);

            //band=true;
        } catch (FileNotFoundException ex) {

        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtMaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaternoActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        try {
            cto = new contacto();
            cto.setId(Integer.parseInt(txtID.getText()));
            cto = f.BuscarContacto(cto);

            if (cto != null) {
                try {
                    if (cto != null) {
                        f.Eliminar(cto);
                        btnSalvar.setEnabled(false);
                        btnNuevo.setEnabled(true);
                        btnEditar.setEnabled(false);
                        btnRemover.setEnabled(false);
                        btnCancelar.setEnabled(true);

                        txtID.setText("");
                        txtNombre.setText("");
                        txtTelefono.setText("");
                        txtPaterno.setText("");
                        txtMaterno.setText("");
                        txtUsername.setText("");
                        cbPerfil.setSelectedItem("");
                        txtDireccion.setText("");

                    } else {
                        JOptionPane.showMessageDialog(null, "No existe el registro");
                    }
                } catch (IOException ex) {

                }
            } else {
                JOptionPane.showMessageDialog(null, "No existe el registro");
            }
        } catch (FileNotFoundException ex) {

        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnAutentificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutentificarActionPerformed
        cto = new contacto();
        cto.setUsername(txtUsuario.getText());
       
        
        String pw;
        pw = String.valueOf(txtPassword.getPassword());

        try {
            cto = f.BuscarUsuario(cto);
        } catch (FileNotFoundException ex) {

        }
        if (cto != null) {
            if (cto.getPassword().equals(pw)) {
                
                IdUs=String.valueOf(cto.getId());
                txt_C_IdUsuario.setText(IdUs);
                
                cb_vehiculos();
        
                txtUsuario.setText("");
                txtPassword.setText("");

                if ("Admin".equals(cto.getPerfil())) {
                    tpane.setEnabledAt(0, false);
                    tpane.setEnabledAt(1, true);
                    tpane.setEnabledAt(2, true);
                    tpane.setEnabledAt(3, true);
                    tpane.setEnabledAt(4, true);
                    tpane.setEnabledAt(5, true);

                    tpane.setSelectedIndex(1);

                    btnSalvar.setEnabled(false);
                    btnNuevo.setEnabled(true);
                    btnEditar.setEnabled(false);
                    btnRemover.setEnabled(false);
                    btnCancelar.setEnabled(false);
                }
                if ("Gerente".equals(cto.getPerfil())) {

                    tpane.setEnabledAt(0, false);
                    tpane.setEnabledAt(1, false);
                    tpane.setEnabledAt(2, true);
                    tpane.setEnabledAt(3, false);
                    tpane.setEnabledAt(4, true);
                    tpane.setEnabledAt(5, false);

                    tpane.setSelectedIndex(2);
                }
                if ("Secretaria".equals(cto.getPerfil())) {

                    tpane.setEnabledAt(0, false);
                    tpane.setEnabledAt(1, false);
                    tpane.setEnabledAt(2, true);
                    tpane.setEnabledAt(3, true);
                    tpane.setEnabledAt(4, false);
                    tpane.setEnabledAt(5, false);

                    tpane.setSelectedIndex(2);
                }
                if ("Mecánico".equals(cto.getPerfil())) {

                    tpane.setEnabledAt(0, false);
                    tpane.setEnabledAt(1, false);
                    tpane.setEnabledAt(2, false);
                    tpane.setEnabledAt(3, false);
                    tpane.setEnabledAt(4, true);
                    tpane.setEnabledAt(5, false);

                    tpane.setSelectedIndex(4);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
                txtPassword.setText("");
            }

        } else {
            JOptionPane.showMessageDialog(null, "No existe ese Usuario");
            txtPassword.setText("");
        }


    }//GEN-LAST:event_btnAutentificarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        Habilitar();
        btnSalvar.setEnabled(true);
        btnNuevo.setEnabled(false);
        btnEditar.setEnabled(false);
        btnRemover.setEnabled(false);
        btnCancelar.setEnabled(true);
        ban = true;
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        tpane.setSelectedIndex(0);

        tpane.setEnabledAt(0, true);
        tpane.setEnabledAt(1, false);
        tpane.setEnabledAt(2, false);
        tpane.setEnabledAt(3, false);
        tpane.setEnabledAt(4, false);
        tpane.setEnabledAt(5, false);

        txtBuscar.setText("");

        txtID.setText("");
        txtNombre.setText("");
        txtTelefono.setText("");
        txtPaterno.setText("");
        txtMaterno.setText("");
        txtUsername.setText("");
        cbPerfil.setSelectedItem("");
        txtDireccion.setText("");

        Deshabilitar();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        Habilitar();
        btnSalvar.setEnabled(false);
        btnNuevo.setEnabled(true);
        btnEditar.setEnabled(false);
        btnRemover.setEnabled(false);
        btnCancelar.setEnabled(false);

        txtBuscar.setText("");

        txtID.setText("");
        txtNombre.setText("");
        txtTelefono.setText("");
        txtPaterno.setText("");
        txtMaterno.setText("");
        txtUsername.setText("");
        cbPerfil.setSelectedItem("");
        txtDireccion.setText("");

        ban = false;
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtPaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaternoActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void btn_C_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_C_SalirActionPerformed
    tpane.setSelectedIndex(0);
    
    cb_V_SeleccioneCliente.removeAllItems();
    
    txt_C_Buscar.setText("");
    txt_C_IdCliente.setText("");
    txt_C_Nombre.setText("");
    txt_C_ApellidoPaterno.setText("");
    txt_C_ApellidoMaterno.setText("");    
    

        tpane.setEnabledAt(0, true);
        tpane.setEnabledAt(1, false);
        tpane.setEnabledAt(2, false);
        tpane.setEnabledAt(3, false);
        tpane.setEnabledAt(4, false);
        tpane.setEnabledAt(5, false);

    }//GEN-LAST:event_btn_C_SalirActionPerformed

    private void btn_R_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_R_SalirActionPerformed
        tpane.setSelectedIndex(0);

        tpane.setEnabledAt(0, true);
        tpane.setEnabledAt(1, false);
        tpane.setEnabledAt(2, false);
        tpane.setEnabledAt(3, false);
        tpane.setEnabledAt(4, false);
        tpane.setEnabledAt(5, false);
    }//GEN-LAST:event_btn_R_SalirActionPerformed

    private void btn_P_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_P_SalirActionPerformed
        tpane.setSelectedIndex(0);

        tpane.setEnabledAt(0, true);
        tpane.setEnabledAt(1, false);
        tpane.setEnabledAt(2, false);
        tpane.setEnabledAt(3, false);
        tpane.setEnabledAt(4, false);
        tpane.setEnabledAt(5, false);
    }//GEN-LAST:event_btn_P_SalirActionPerformed

    private void btn_R_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_R_NuevoActionPerformed
        reparaciones_Habilitar();

        btn_R_Guardar.setEnabled(true);
        btn_R_Nuevo.setEnabled(false);
        btn_R_Editar.setEnabled(false);
        btn_R_Eliminar.setEnabled(false);
        btn_R_Cancelar.setEnabled(false);

        cmb_R_IdVehiculo.setSelectedItem("");
        cmb_R_IdPieza.setSelectedItem("");
        txt_R_IdReparacion.setText("");
        txt_R_Falla.setText("");
        txt_R_ControlPiezas.setText("");

    }//GEN-LAST:event_btn_R_NuevoActionPerformed

    private void btn_R_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_R_GuardarActionPerformed
        SimpleDateFormat fecha = new SimpleDateFormat("dd-MM-yyyy");
        String fecha_E = fecha.format(jdt_E_Fecha.getDate());
        String fecha_S = fecha.format(jdt_S_Fecha.getDate());
        try {
            rep = new reparaciones();
            rep.setId_re(Integer.parseInt(txt_R_IdReparacion.getText()));

            if (ban_reparaciones != true && rf.BuscarReparacion(rep) != null) {
                JOptionPane.showMessageDialog(null, "Ese Id de reparacion ya existe");
                return;
            }

            rep.setId_ve(Integer.parseInt(cmb_R_IdVehiculo.getSelectedItem().toString()));
            rep.setId_pi(Integer.parseInt(cmb_R_IdPieza.getSelectedItem().toString()));
            rep.setFalla(txt_R_Falla.getText());
            rep.setId_contrl(Integer.parseInt(txt_R_ControlPiezas.getText()));
            rep.setFecha_e(fecha_E);
            rep.setFecha_s(fecha_S);

            if (ban_reparaciones != true) {
                rf.Guardar(rep);
                JOptionPane.showMessageDialog(null, "Guardado con Éxito");
            } else {
                ban_reparaciones = false;
                try {
                    rf.Editar(rep);
                    JOptionPane.showMessageDialog(null, "Editado con Éxito");
                    System.out.println("SI");
                } catch (IOException ex) {

                }
            }
            btn_R_Guardar.setEnabled(false);
            btn_R_Nuevo.setEnabled(true);
            btn_R_Editar.setEnabled(false);
            btn_R_Eliminar.setEnabled(false);
            btn_R_Cancelar.setEnabled(false);

            //band=true;
        } catch (FileNotFoundException ex) {

        }
    }//GEN-LAST:event_btn_R_GuardarActionPerformed

    private void btn_V_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_V_NuevoActionPerformed
        Vehiculos_Habilitar();

        btn_V_Guardar.setEnabled(true);
        btn_V_Nuevo.setEnabled(false);
        btn_V_Editar.setEnabled(false);
        btn_V_Eliminar.setEnabled(false);
        btn_V_Cancelar.setEnabled(true);

        txt_V_IdVehiculo.setText("");
        txt_V_Matricula.setText("");
        txt_V_Marca.setText("");
        txt_V_Modelo.setText("");

    }//GEN-LAST:event_btn_V_NuevoActionPerformed

    private void btn_V_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_V_GuardarActionPerformed
        vcs = new Vehiculos();

        vcs.setCliente(cb_V_SeleccioneCliente.getSelectedItem().toString());
        vcs.setId_vehiculo(Integer.parseInt(txt_V_IdVehiculo.getText()));
        vcs.setMatricula(txt_V_Matricula.getText());
        vcs.setMarca(txt_V_Marca.getText());
        vcs.setModelo(txt_V_Modelo.getText());

        SimpleDateFormat dformat = new SimpleDateFormat("dd-MM-YYYY");
        String date = dformat.format(jdt_V_Fecha.getDate());
        vcs.setFecha(date);

        System.out.println("FECHA");
        System.out.println(vcs.getFecha());

        if (ban_vehiculos == false) {
            try {
                v.Guardar(vcs);
            } catch (FileNotFoundException ex) {

            }
        } else {
            try {
                v.Editar_Vehiculo(vcs);
                ban_vehiculos = false;
            } catch (IOException ex) {
            }
        }

        Vehiculos_Deshabilitar();

        btn_V_Guardar.setEnabled(false);
        btn_V_Nuevo.setEnabled(true);
        btn_V_Editar.setEnabled(false);
        btn_V_Eliminar.setEnabled(false);
        btn_V_Cancelar.setEnabled(false);
    }//GEN-LAST:event_btn_V_GuardarActionPerformed

    private void btn_V_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_V_CancelarActionPerformed
        Vehiculos_Deshabilitar();

        btn_V_Guardar.setEnabled(false);
        btn_V_Nuevo.setEnabled(true);
        btn_V_Editar.setEnabled(false);
        btn_V_Eliminar.setEnabled(false);
        btn_V_Cancelar.setEnabled(false);
    }//GEN-LAST:event_btn_V_CancelarActionPerformed

    private void btn_V_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_V_EditarActionPerformed
        Vehiculos_Habilitar();

        btn_V_Guardar.setEnabled(true);
        btn_V_Nuevo.setEnabled(false);
        btn_V_Editar.setEnabled(false);
        btn_V_Eliminar.setEnabled(false);
        btn_V_Cancelar.setEnabled(true);

        ban_vehiculos = true;
    }//GEN-LAST:event_btn_V_EditarActionPerformed

    private void btn_V_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_V_EliminarActionPerformed
        vcs.setCliente(cb_V_SeleccioneCliente.getSelectedItem().toString());
        vcs.setId_vehiculo(Integer.parseInt(txt_V_IdVehiculo.getText()));
        vcs.setMatricula(txt_V_Matricula.getText());
        vcs.setMarca(txt_V_Marca.getText());
        vcs.setModelo(txt_V_Modelo.getText());

        SimpleDateFormat dformat = new SimpleDateFormat("dd-MM-YYYY");
        String date = dformat.format(jdt_V_Fecha.getDate());
        vcs.setFecha(date);

        try {
            v.Eliminar_Vehiculos(vcs);
        } catch (IOException ex) {

        }

        Vehiculos_Habilitar();

        txt_V_IdVehiculo.setText("");
        txt_V_Matricula.setText("");
        txt_V_Marca.setText("");
        txt_V_Modelo.setText("");

        btn_V_Guardar.setEnabled(false);
        btn_V_Nuevo.setEnabled(true);
        btn_V_Editar.setEnabled(false);
        btn_V_Eliminar.setEnabled(false);
        btn_V_Cancelar.setEnabled(false);
    }//GEN-LAST:event_btn_V_EliminarActionPerformed

    private void btn_V_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_V_BuscarActionPerformed

        try {
            vcs = new Vehiculos();
            vcs.setId_vehiculo(Integer.parseInt(txt_V_Buscar.getText()));
            vcs = v.BuscarIdVehiculo(vcs);

            if (vcs != null) {
                cb_V_SeleccioneCliente.setSelectedItem(vcs.getCliente());
                txt_V_IdVehiculo.setText(String.valueOf(vcs.getId_vehiculo()));
                txt_V_Matricula.setText(vcs.getMatricula());
                txt_V_Marca.setText(vcs.getMarca());
                txt_V_Modelo.setText(vcs.getModelo());

                SimpleDateFormat fecha = new SimpleDateFormat("dd-MM-yyyy");
                Date formato = null;
                try {
                    formato = fecha.parse(vcs.getFecha());
                } catch (ParseException ex) {
                }
                jdt_V_Fecha.setDate(formato);
            } else {
                JOptionPane.showMessageDialog(null, "No existe ese ID");
            }

            btn_V_Guardar.setEnabled(false);
            btn_V_Nuevo.setEnabled(true);
            btn_V_Editar.setEnabled(true);
            btn_V_Eliminar.setEnabled(true);
            btn_V_Cancelar.setEnabled(false);
        } catch (FileNotFoundException ex) {

        }

        txt_V_Buscar.setText("");
    }//GEN-LAST:event_btn_V_BuscarActionPerformed

    private void btn_C_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_C_GuardarActionPerformed
        //Verificar que el campo txt_C_IdCliente no este vacio
  
        
        if(txt_C_IdCliente.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese el ID del cliente");
            return;
        }
        //Verificar que el campo txt_C_Nombre no este vacio
        if (txt_C_Nombre.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese el nombre del cliente");
            return;
        }
        //Verificar que el campo txt_C_ApellidoPaterno no este vacio
        if (txt_C_ApellidoPaterno.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese el apellido paterno del cliente");
            return;
        }
        //Verificar que el campo txt_C_ApellidoMaterno no este vacio
        if (txt_C_ApellidoMaterno.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese el apellido materno del cliente");
            return;
        }
        //Se crea un objeto de tipo cliente
        c = new cliente();
        //Se le asignan los valores a los atributos del objeto
        c.setIdUsuario(Integer.parseInt(txt_C_IdUsuario.getText()));
        c.setId(Integer.parseInt(txt_C_IdCliente.getText()));
        c.setNombre(txt_C_Nombre.getText());
        c.setApellidoPaterno(txt_C_ApellidoPaterno.getText());
        c.setApellidoMaterno(txt_C_ApellidoMaterno.getText());
        
        vc=new vehiculo_cliente();
        vc.setIdUsuario(txt_C_IdUsuario.getText());
        vc.setIdCliente(txt_C_IdCliente.getText());
        //Se crea un objeto de tipo archivoCliente
        //Cliente_File ac = new Cliente_File();
        //Se llama al metodo guardarCliente y se le pasa como parametro el objeto cliente
        fc.guardar(c);
        vcf.guardar(vc);
        cb_vehiculos();
        //Se muestra un mensaje de que se guardo correctamente
        JOptionPane.showMessageDialog(null, "Guardado correctamente");
        //Se limpian los campos de texto
        txt_C_IdCliente.setText("");
        txt_C_Nombre.setText("");
        txt_C_ApellidoPaterno.setText("");
        txt_C_ApellidoMaterno.setText("");

    }//GEN-LAST:event_btn_C_GuardarActionPerformed

    private void btn_C_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_C_NuevoActionPerformed
        //Cliente_File clienteFile = new Cliente_File();
        int maxId = fc.getMaxId();
        
        txt_C_Buscar.setText("");
        txt_C_IdUsuario.setText(IdUs);
        txt_C_IdCliente.setText(String.valueOf(maxId));
        txt_C_Nombre.setText("");
        txt_C_ApellidoPaterno.setText("");
        txt_C_ApellidoMaterno.setText("");

    }//GEN-LAST:event_btn_C_NuevoActionPerformed

    private void btn_C_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_C_CancelarActionPerformed


        txt_C_Buscar.setText("");
        txt_C_IdUsuario.setText(IdUs);
        txt_C_IdCliente.setText("");
        txt_C_Nombre.setText("");
        txt_C_ApellidoPaterno.setText("");
        txt_C_ApellidoMaterno.setText("");
    }//GEN-LAST:event_btn_C_CancelarActionPerformed

    private void btn_C_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_C_BuscarActionPerformed
        //Verificar que el campo txt_C_Id no este vacio
        if(txt_C_Buscar.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese el ID del cliente");
            return;
        }

        // Obtener el id 
        int id = Integer.parseInt(txt_C_Buscar.getText());

        // validar que el id si exista
        c=new cliente();
        c = fc.buscar(id);
        if(c!=null){
        txt_C_Buscar.setText("");
        txt_C_IdUsuario.setText(String.valueOf(c.getIdUsuario()));   
             // Mostrar los datos del cliente
        
        txt_C_IdCliente.setText(String.valueOf(c.getId()));
        txt_C_Nombre.setText(c.getNombre());
        txt_C_ApellidoPaterno.setText(c.getApellidoPaterno());
        txt_C_ApellidoMaterno.setText(c.getApellidoMaterno());
        }else{
            JOptionPane.showMessageDialog(null, "No existe el cliente");
            txt_C_Buscar.setText("");
        }
        
    }//GEN-LAST:event_btn_C_BuscarActionPerformed

    private void btn_C_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_C_EditarActionPerformed
       //Boton para editar
            //Verificar que el campo txt_C_IdCliente no este vacio
            
            if(txt_C_IdCliente.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Ingrese el ID del cliente");
                return;
            }
            //Verificar que el campo txt_C_Nombre no este vacio
            if(txt_C_Nombre.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Ingrese el nombre del cliente");
                return;
            }
            //Verificar que el campo txt_C_ApellidoPaterno no este vacio
            if(txt_C_ApellidoPaterno.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Ingrese el apellido paterno del cliente");
                return;
            }
            //Verificar que el campo txt_C_ApellidoMaterno no este vacio
            if(txt_C_ApellidoMaterno.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Ingrese el apellido materno del cliente");
                return;
            }
            //Se crea un objeto de tipo cliente
            c = new cliente();
            //Se le asignan los valores a los atributos del objeto
            c.setId(Integer.parseInt(txt_C_IdCliente.getText()));
            c.setNombre(txt_C_Nombre.getText());
            c.setApellidoPaterno(txt_C_ApellidoPaterno.getText());
            c.setApellidoMaterno(txt_C_ApellidoMaterno.getText());
            //Se crea un objeto de tipo archivoCliente
            //Cliente_File ac = new Cliente_File();
            //Se llama al metodo guardarCliente y se le pasa como parametro el objeto cliente
            fc.editar(c);
            //Se muestra un mensaje de que se guardo correctamente
            JOptionPane.showMessageDialog(null, "Editado correctamente");
            //Se limpian los campos de texto
            txt_C_IdUsuario.setText(IdUs);
            txt_C_IdCliente.setText("");
            txt_C_Nombre.setText("");
            txt_C_ApellidoPaterno.setText("");
            txt_C_ApellidoMaterno.setText("");  
    }//GEN-LAST:event_btn_C_EditarActionPerformed

    private void btn_C_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_C_EliminarActionPerformed
        //Verificar que el campo txt_C_Id no este vacio
        if(txt_C_Buscar.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese el ID del cliente");
            return;
        }

        // Obtener el id 
        int id = Integer.parseInt(txt_C_Buscar.getText());

        // validar que el id si exista
        c = fc.buscar(id);
        if(c == null){
       // Cliente_File clienteFile = new Cliente_File();
            JOptionPane.showMessageDialog(null, "No existe el cliente");
            return;
        }

        // Eliminar el cliente
        fc.eliminar(c);
        JOptionPane.showMessageDialog(null, "Eliminado correctamente");
       
        txt_C_Buscar.setText("");
        
        txt_C_IdUsuario.setText(IdUs);
        txt_C_IdCliente.setText("");
        txt_C_Nombre.setText("");
        txt_C_ApellidoPaterno.setText("");
        txt_C_ApellidoMaterno.setText("");
    }//GEN-LAST:event_btn_C_EliminarActionPerformed

    private void cb_V_SeleccioneClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_V_SeleccioneClienteActionPerformed
       
    }//GEN-LAST:event_cb_V_SeleccioneClienteActionPerformed

    private void cb_V_SeleccioneClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb_V_SeleccioneClienteMouseClicked
        
    }//GEN-LAST:event_cb_V_SeleccioneClienteMouseClicked

    private void txt_C_IdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_C_IdClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_C_IdClienteActionPerformed

    private void btn_R_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_R_EditarActionPerformed
        reparaciones_Habilitar();
        btn_R_Guardar.setEnabled(true);
        btn_R_Nuevo.setEnabled(false);
        btn_R_Editar.setEnabled(false);
        btn_R_Eliminar.setEnabled(false);
        btn_R_Cancelar.setEnabled(true);

        ban_reparaciones = true;
    }//GEN-LAST:event_btn_R_EditarActionPerformed

    private void btn_R_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_R_CancelarActionPerformed
        reparaciones_Deshabilitar();
        btn_R_Guardar.setEnabled(false);
        btn_R_Nuevo.setEnabled(true);
        btn_R_Editar.setEnabled(false);
        btn_R_Eliminar.setEnabled(false);
        btn_R_Cancelar.setEnabled(false);

        jdt_E_Fecha.setEnabled(false);
        jdt_S_Fecha.setEnabled(false);

        ban_reparaciones = false;

    }//GEN-LAST:event_btn_R_CancelarActionPerformed

    private void btn_R_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_R_EliminarActionPerformed
        
        rep.setId_ve(Integer.parseInt(cmb_R_IdVehiculo.getSelectedItem().toString()));
        rep.setId_pi(Integer.parseInt(cmb_R_IdPieza.getSelectedItem().toString()));
        rep.setId_re(Integer.parseInt(txt_R_IdReparacion.getText()));
        rep.setFalla(txt_R_Falla.getText());
        rep.setId_contrl(Integer.parseInt(txt_R_ControlPiezas.getText())); 

        SimpleDateFormat dformat = new SimpleDateFormat("dd-MM-yyyy");
        String date = dformat.format(jdt_E_Fecha.getDate());
        rep.setFecha_e(date);
        
        date = dformat.format(jdt_S_Fecha.getDate());
        rep.setFecha_s(date);

        try {
            rf.Eliminar_Reparacion(rep);
        } catch (IOException ex) {

        }

        reparaciones_Habilitar();

        cmb_R_IdVehiculo.setSelectedItem("");
        cmb_R_IdPieza.setSelectedItem("");
        txt_R_IdReparacion.setText("");
        txt_R_Falla.setText("");
        txt_R_ControlPiezas.setText("");

        btn_R_Guardar.setEnabled(false);
        btn_R_Nuevo.setEnabled(true);
        btn_R_Editar.setEnabled(false);
        btn_R_Eliminar.setEnabled(false);
        btn_R_Cancelar.setEnabled(false);
    }//GEN-LAST:event_btn_R_EliminarActionPerformed

    private void btn_R_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_R_BuscarActionPerformed
        try {
            rep = new reparaciones();
            rep.setId_re(Integer.parseInt((txt_R_Id.getText())));
            rep = rf.BuscarReparacion(rep);

            if (rep != null) {
                cmb_R_IdVehiculo.setSelectedItem(rep.getId_ve());
                cmb_R_IdPieza.setSelectedItem(rep.getId_pi());
                txt_R_IdReparacion.setText(String.valueOf(rep.getId_re()));
                txt_R_Falla.setText(rep.getFalla());
                txt_R_ControlPiezas.setText(String.valueOf(rep.getId_contrl()));

                SimpleDateFormat fecha = new SimpleDateFormat("dd-MM-yyyy");
                Date formato = null;
                try {
                    formato = fecha.parse(rep.getFecha_e());
                } catch (ParseException ex) {
                }

                jdt_E_Fecha.setDate(formato);

                try {
                    formato = fecha.parse(rep.getFecha_s());
                } catch (ParseException ex) {
                }

                jdt_S_Fecha.setDate(formato);

            } else {
                JOptionPane.showMessageDialog(null, "No existe ese ID");
            }
            btn_R_Guardar.setEnabled(false);
            btn_R_Nuevo.setEnabled(true);
            btn_R_Editar.setEnabled(true);
            btn_R_Eliminar.setEnabled(true);
            btn_R_Cancelar.setEnabled(false);
        } catch (FileNotFoundException ex) {

        }

        txt_R_Id.setText("");
    }//GEN-LAST:event_btn_R_BuscarActionPerformed

    private void txt_R_FallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_R_FallaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_R_FallaActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new main().setVisible(true);
                } catch (IOException ex) {
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAutentificar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btn_C_Buscar;
    private javax.swing.JButton btn_C_Cancelar;
    private javax.swing.JButton btn_C_Editar;
    private javax.swing.JButton btn_C_Eliminar;
    private javax.swing.JButton btn_C_Guardar;
    private javax.swing.JButton btn_C_Nuevo;
    private javax.swing.JButton btn_C_Salir;
    private javax.swing.JButton btn_P_Buscar;
    private javax.swing.JButton btn_P_Nuevo;
    private javax.swing.JButton btn_P_Salir;
    private javax.swing.JButton btn_R_Buscar;
    private javax.swing.JButton btn_R_Cancelar;
    private javax.swing.JButton btn_R_Editar;
    private javax.swing.JButton btn_R_Eliminar;
    private javax.swing.JButton btn_R_Guardar;
    private javax.swing.JButton btn_R_Nuevo;
    private javax.swing.JButton btn_R_Salir;
    private javax.swing.JButton btn_V_Buscar;
    private javax.swing.JButton btn_V_Cancelar;
    private javax.swing.JButton btn_V_Editar;
    private javax.swing.JButton btn_V_Eliminar;
    private javax.swing.JButton btn_V_Guardar;
    private javax.swing.JButton btn_V_Nuevo;
    private javax.swing.JComboBox<String> cbPerfil;
    private javax.swing.JComboBox<String> cb_V_SeleccioneCliente;
    private javax.swing.JComboBox<String> cmb_R_IdPieza;
    private javax.swing.JComboBox<String> cmb_R_IdVehiculo;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private com.toedter.calendar.JDateChooser jdt_E_Fecha;
    private com.toedter.calendar.JDateChooser jdt_S_Fecha;
    private com.toedter.calendar.JDateChooser jdt_V_Fecha;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPassword1;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lbl_C_ApellidoMaterno;
    private javax.swing.JLabel lbl_C_ApellidoPaterno;
    private javax.swing.JLabel lbl_C_Id;
    private javax.swing.JLabel lbl_C_IdCliente;
    private javax.swing.JLabel lbl_C_IdUsuario;
    private javax.swing.JLabel lbl_C_Nombre;
    private javax.swing.JLabel lbl_P_Descripcion;
    private javax.swing.JLabel lbl_P_Id;
    private javax.swing.JLabel lbl_P_IdPieza;
    private javax.swing.JLabel lbl_P_Stock;
    private javax.swing.JLabel lbl_R_ControlPiezas;
    private javax.swing.JLabel lbl_R_Falla;
    private javax.swing.JLabel lbl_R_FechaEntrada;
    private javax.swing.JLabel lbl_R_FechaSalida;
    private javax.swing.JLabel lbl_R_Id;
    private javax.swing.JLabel lbl_R_IdPieza;
    private javax.swing.JLabel lbl_R_IdVehiculo;
    private javax.swing.JLabel lbl_R_Id_Reparacion;
    private javax.swing.JLabel lbl_V_Fecha;
    private javax.swing.JLabel lbl_V_Id;
    private javax.swing.JLabel lbl_V_IdVehiculo;
    private javax.swing.JLabel lbl_V_Marca;
    private javax.swing.JLabel lbl_V_Matricula;
    private javax.swing.JLabel lbl_V_Modelo;
    private javax.swing.JLabel lbl_V_SeleccioneCliente;
    private javax.swing.JPanel pnlClientes;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPanel pnlPiezas;
    private javax.swing.JPanel pnlReparaciones;
    private javax.swing.JPanel pnlUsuarios;
    private javax.swing.JPanel pnlVehiculos;
    private javax.swing.JTabbedPane tpane;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMaterno;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPaterno;
    private javax.swing.JTextField txtPsw;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txt_C_ApellidoMaterno;
    private javax.swing.JTextField txt_C_ApellidoPaterno;
    private javax.swing.JTextField txt_C_Buscar;
    private javax.swing.JTextField txt_C_IdCliente;
    private javax.swing.JTextField txt_C_IdUsuario;
    private javax.swing.JTextField txt_C_Nombre;
    private javax.swing.JTextField txt_P_Descripcion;
    private javax.swing.JTextField txt_P_Id;
    private javax.swing.JTextField txt_P_IdPieza;
    private javax.swing.JTextField txt_P_Stock;
    private javax.swing.JTextField txt_R_ControlPiezas;
    private javax.swing.JTextField txt_R_Falla;
    private javax.swing.JTextField txt_R_Id;
    private javax.swing.JTextField txt_R_IdReparacion;
    private javax.swing.JTextField txt_V_Buscar;
    private javax.swing.JTextField txt_V_IdVehiculo;
    private javax.swing.JTextField txt_V_Marca;
    private javax.swing.JTextField txt_V_Matricula;
    private javax.swing.JTextField txt_V_Modelo;
    // End of variables declaration//GEN-END:variables
}
