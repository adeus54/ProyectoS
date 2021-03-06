package GUI;

import BL.LInventarioProduct;
import Clases.Productos;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alexa
 */
public final class GUI_Inventario extends javax.swing.JFrame {

    /**
     * Creates new form GUI_Inventario
     */
    public GUI_Inventario() {
        initComponents();
        cargarTitulos();
        cargarcombo();
        cargarDisponibilidad();
        bloquear();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        Modificar = new javax.swing.JMenuItem();
        Eliminar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtcode = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtdescrip = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        jcomboCantidad = new javax.swing.JComboBox<>();
        txtUrlImage = new javax.swing.JTextField();
        jbSeleccionar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbinsertar = new javax.swing.JButton();
        jbmodificar = new javax.swing.JButton();
        jbeliminar = new javax.swing.JButton();
        jbConsultar = new javax.swing.JButton();
        Imagen = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jComboBox1 = new javax.swing.JComboBox<>();

        jPopupMenu1.setMaximumSize(new java.awt.Dimension(200, 50));

        Modificar.setText("MODIFICAR");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Modificar);

        Eliminar.setText("ELIMINAR");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Eliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(33, 32, 32));

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gestión de Inventario");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre Producto");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Precio");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Descripción");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Disponibilidad");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Codigo Producto");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cantidad");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Imagen");

        txtUrlImage.setEditable(false);

        jbSeleccionar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jbSeleccionar.setText("Seleccionar");
        jbSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSeleccionarActionPerformed(evt);
            }
        });

        jbNuevo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbinsertar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jbinsertar.setText("Insertar");
        jbinsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbinsertarActionPerformed(evt);
            }
        });

        jbmodificar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jbmodificar.setText("Modificar");
        jbmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbmodificarActionPerformed(evt);
            }
        });

        jbeliminar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jbeliminar.setText("Eliminar");
        jbeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbeliminarActionPerformed(evt);
            }
        });

        jbConsultar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jbConsultar.setText("Consultar");
        jbConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultarActionPerformed(evt);
            }
        });

        Imagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        table1.setComponentPopupMenu(jPopupMenu1);
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbinsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbmodificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbeliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbConsultar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel1))
                                            .addComponent(txtdescrip, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtprecio, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtname, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(txtUrlImage, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jbSeleccionar))
                                                    .addComponent(jcomboCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtcode, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addGap(36, 36, 36)))
                                .addComponent(Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(331, 331, 331))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcode, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel3)
                                .addGap(9, 9, 9))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtdescrip)
                                .addGap(13, 13, 13)
                                .addComponent(txtprecio)
                                .addGap(8, 8, 8)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jcomboCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUrlImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jbSeleccionar)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevo)
                    .addComponent(jbinsertar)
                    .addComponent(jbmodificar)
                    .addComponent(jbeliminar)
                    .addComponent(jbConsultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1219, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    DefaultTableModel modelo;
    LInventarioProduct manejadorBL = new LInventarioProduct();

    public void cargarTitulos() {
        modelo = new DefaultTableModel() {
            @Override //Redefinimos el método getColumnClass
            public Class getColumnClass(int column) {
                switch (column) {
                    case 0:
                        return Object.class;
                    case 1:
                        return Object.class;
                    case 2:
                        return Object.class;
                    case 3:
                        return Object.class;
                    case 4:
                        return Object.class;
                    case 5:
                        return Object.class;
                    case 6:
                        return Object.class;
                    case 7:
                        return Icon.class;
                    default:
                        return Object.class;
                }
            }
        };

        //Se setea el modelo a la tabla
        table1.setModel(modelo);
        //Se da nombres a las columnas
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Precio");
        modelo.addColumn("Disponibilidad");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Url");
        modelo.addColumn("Imagen");
    }

    public void cargarcombo() {
        for (int i = 1; i < 100; i++) {
            jcomboCantidad.addItem(Integer.toString(i));
        }
    }

    public void cargarDisponibilidad() {
        jComboBox1.addItem("Seleccione...");
        jComboBox1.addItem("Disponible");
        jComboBox1.addItem("Agotado");
    }

    public void bloquear() {
        jbNuevo.setEnabled(true);
        jbeliminar.setEnabled(false);
        jbinsertar.setEnabled(false);
        jbmodificar.setEnabled(false);
        txtcode.setEnabled(false);
        txtname.setEnabled(false);
        txtdescrip.setEnabled(false);
        txtprecio.setEnabled(false);
        jComboBox1.setEnabled(false);
        jcomboCantidad.setEnabled(false);
        jbSeleccionar.setEnabled(false);
        txtUrlImage.setEnabled(false);
    }

    public void desbloquear() {
        jbNuevo.setEnabled(false);
        jbeliminar.setEnabled(false);
        jbinsertar.setEnabled(true);
        jbmodificar.setEnabled(false);
        txtcode.setEnabled(true);
        txtname.setEnabled(true);
        txtdescrip.setEnabled(true);
        txtprecio.setEnabled(true);
        jComboBox1.setEnabled(true);
        jcomboCantidad.setEnabled(true);
        jbSeleccionar.setEnabled(true);
        txtUrlImage.setEnabled(true);
    }

    public void llenarCampos() {

        Object strValor[] = new Object[12];
        int row = (int) table1.getSelectedRow();

        //Se obtiene los datos de la fila
        for (int i = 0; i < 8; i++) {
            strValor[i] = table1.getModel().getValueAt(row, i);
        }
        //Se asigna los datos en los campos de llenado
        txtcode.setText(strValor[0].toString());
        txtcode.setEnabled(false);

        txtname.setText(strValor[1].toString());

        txtdescrip.setText(strValor[2].toString());

        txtprecio.setText(strValor[3].toString());

        jComboBox1.setSelectedItem(strValor[4].toString());

        jcomboCantidad.setSelectedItem(strValor[5].toString());
        
        txtUrlImage.setText(strValor[6].toString());

        ImageIcon vb = (ImageIcon) strValor[7];
        Icon icono = new ImageIcon(vb.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
        Imagen.setIcon(icono);
    }

    public void mostrarProductos() throws ClassNotFoundException, SQLException, IOException {
        ArrayList<Productos> lista = manejadorBL.ConsultarProducts();

        for (Productos actual : lista) {
            String code = String.valueOf(actual.getP_Codigo());
            String nomb = String.valueOf(actual.getP_nombre());
            String descrip = String.valueOf(actual.getP_descripcion());
            String precio = String.valueOf(actual.getP_precio());
            String dispon = String.valueOf(actual.getP_disponibilidad());
            String cantidad = String.valueOf(actual.getCantidad());
            String url = String.valueOf(actual.getP_urlImagen());
            InputStream foto = actual.getP_imge();
            BufferedImage bf = ImageIO.read(foto);

            ImageIcon img = new ImageIcon(bf);

            ImageIcon icono = new ImageIcon(img.getImage().getScaledInstance(110, 70, Image.SCALE_SMOOTH));
            String rrelleno = "";
            Object modeloTemp[] = {code, nomb, descrip, precio, dispon, cantidad, url, rrelleno};
            modeloTemp[7] = icono;
            table1.setRowHeight(70);
            modelo.addRow(modeloTemp);
        }
    }
    
    public void limpiarCampos(){
        txtcode.setText("");
        txtname.setText("");
        txtdescrip.setText("");
        txtprecio.setText("");
        txtUrlImage.setText("");
        jComboBox1.setSelectedIndex(0);
        jcomboCantidad.setSelectedIndex(0);
    }
    
    public void validarLlenado() throws ClassNotFoundException, SQLException, FileNotFoundException {
        String code = txtcode.getText();
        String nombre = txtname.getText();
        String descp = txtdescrip.getText();
        String precio = txtprecio.getText();
        String url = txtUrlImage.getText();
        int disp = jComboBox1.getSelectedIndex();
        int cant = jcomboCantidad.getSelectedIndex();

        if (code.equals("") || nombre.equals("") || descp.equals("") || precio.equals("")||url.equals("") ||disp == 0 || cant==0) {
            // Mensaje      
            JOptionPane.showMessageDialog(null, "No se puede dejar campos en blanco", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
             InsertarProduct();
        }
    }
    
    public void validarLlenado2() throws ClassNotFoundException, SQLException, FileNotFoundException {
        String code = txtcode.getText();
        String nombre = txtname.getText();
        String descp = txtdescrip.getText();
        String precio = txtprecio.getText();
        String url = txtUrlImage.getText();
        int disp = jComboBox1.getSelectedIndex();
        int cant = jcomboCantidad.getSelectedIndex();

        if (code.equals("") || nombre.equals("") || descp.equals("") || precio.equals("")||url.equals("") ||disp == 0 || cant==0) {
            // Mensaje      
            JOptionPane.showMessageDialog(null, "No se puede dejar campos en blanco", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
             ModificarProducts();
        }
    }
    
    public void InsertarProduct() throws SQLException, ClassNotFoundException, FileNotFoundException {
        int resultado;

        //Inicializacion de variables
        String cod = txtcode.getText().toUpperCase();
        String name = txtname.getText();
        String descrip = txtdescrip.getText();
        // Recoge el valor
        double valor = Double.valueOf(txtprecio.getText());
        //Aplica formato
        String p_val = String.format("%.2f", valor);
        //Almacena el valor formateado
        double precio = Double.valueOf(p_val);
        String url = txtUrlImage.getText();
        String disponibilidad = jComboBox1.getSelectedItem().toString();

        // variable para poder obtener la cantidad de bytes
        FileInputStream archivofoto;
        //la ruta de la imagen
        archivofoto = new FileInputStream(txtUrlImage.getText());

        int cantidad = Integer.parseInt(jcomboCantidad.getSelectedItem().toString());
        //Envia la nueva informacion
        Productos user = new Productos(cod, name, descrip, precio, disponibilidad, cantidad, url, archivofoto);

        resultado = manejadorBL.insertProductsObjeto(user);
        if (resultado == 1) {
            JOptionPane.showMessageDialog(null, "DATOS REGISTRADOS");

        } else {
            if (resultado == 100) {
                JOptionPane.showMessageDialog(null, "EL DATO EXISTE");
            } else {
                JOptionPane.showMessageDialog(null, "DATOS NO REGISTRADOS");
            }
        }
    }
    boolean comprobar ;
    public void ModificarProducts() throws SQLException, FileNotFoundException, ClassNotFoundException {
        int resultado;

        //Inicializacion de variables
        String cod = txtcode.getText().toUpperCase();
        String name = txtname.getText();
        String descrip = txtdescrip.getText();
        // Recoge el valor
        double valor = Double.valueOf(txtprecio.getText());
        //Aplica formato
        String p_val = String.format("%.2f", valor);
        //Almacena el valor formateado
        double precio = Double.valueOf(p_val);
        String url = txtUrlImage.getText();
        String disponibilidad = jComboBox1.getSelectedItem().toString();

        // variable para poder obtener la cantidad de bytes
        FileInputStream archivofoto;
        //la ruta de la imagen
        archivofoto = new FileInputStream(txtUrlImage.getText());

        int cantidad = Integer.parseInt(jcomboCantidad.getSelectedItem().toString());

        //Envia la nueva informacion
        Productos user = new Productos(cod, name, descrip, precio, disponibilidad, cantidad, url, archivofoto);

        resultado = manejadorBL.ModificarProducts(user);

        if (resultado == 1) {
            JOptionPane.showMessageDialog(null, "DATOS MODIFICADOS");
        } else {
            JOptionPane.showMessageDialog(null, "NO SE PUDO REGISTRAR");
        }
    }

    public void Delete_Products() throws SQLException, FileNotFoundException, ClassNotFoundException {
        int resultado;

        //Inicializacion de variables
        String cod = txtcode.getText().toUpperCase();
        //Envia el dato por el cual se borrara
        Productos prod = new Productos(cod);

        resultado = manejadorBL.DeleteProducto(prod);

        if (resultado == 1) {
            JOptionPane.showMessageDialog(null, "DATO Eliminado");
        } else {
            JOptionPane.showMessageDialog(null, "NO SE PUDO REGISTRAR LA ACCION");
        }
    }
    
    public void limpiarActualizarTabla1() {
        try {
            int filas = table1.getRowCount();
            for (int i = 0; filas > i; i++) {
                modelo.removeRow(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al limpiar la tabla.");
        }
    }

    private void jbSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSeleccionarActionPerformed
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Tipos de Archivos JPEG,PNG", "jpg", "jpeg", "pgn");
        JFileChooser archivo = new JFileChooser();
        archivo.addChoosableFileFilter(filtro);
        archivo.setDialogTitle("ABRIR ARCHIVO");
        //Ruta depende de su equipo
        File ruta = new File("C:/Users/alexa/Pictures");
        archivo.setCurrentDirectory(ruta);
        int ventana = archivo.showOpenDialog(null);
        // Indica si se ha seleccionado el boton abrir de Jfile
        if (ventana == JFileChooser.APPROVE_OPTION) {
            //Selecciona la ruta
            File file = archivo.getSelectedFile();
            txtUrlImage.setText(String.valueOf(file));
            //Asigna la url
            String url = txtUrlImage.getText();
            Image img = getToolkit().getImage(url);

            img = img.getScaledInstance(150, 150, Image.SCALE_DEFAULT);
            //Muestra la imagen
            Imagen.setIcon(new ImageIcon(img));
        }
    }//GEN-LAST:event_jbSeleccionarActionPerformed

    private void jbinsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbinsertarActionPerformed
        try {
           validarLlenado();
            
            if (this.table1.getRowCount() == 0) {
                mostrarProductos();
                limpiarCampos();
            } else {
                limpiarActualizarTabla1();
                mostrarProductos();
                limpiarCampos();
            }     
        } catch (ClassNotFoundException | SQLException | FileNotFoundException ex) {
            Logger.getLogger(GUI_Inventario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GUI_Inventario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbinsertarActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if (jComboBox1.getSelectedItem().toString().equals("Agotado")) {
            jcomboCantidad.setEnabled(false);
        } else {
            if(comprobar == false){
            jcomboCantidad.setEnabled(true);
            }else{
            jcomboCantidad.setEnabled(false);
            }
        }

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        desbloquear();
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultarActionPerformed
        try {
            if (this.table1.getRowCount() == 0) {
                mostrarProductos();
                
            } else {
                limpiarActualizarTabla1();
                mostrarProductos();
                
            }    
        } catch (ClassNotFoundException | SQLException | IOException ex) {
            Logger.getLogger(GUI_Inventario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbConsultarActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        comprobar = true;
        llenarCampos();     
    }//GEN-LAST:event_table1MouseClicked

    private void jbmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbmodificarActionPerformed
        try {
            validarLlenado2();
            
            if (this.table1.getRowCount() == 0) {
                mostrarProductos();
                limpiarCampos();
                jbmodificar.setEnabled(false);
            } else {
                limpiarActualizarTabla1();
                mostrarProductos();
                limpiarCampos();
                jbmodificar.setEnabled(false);
            }    
        } catch (SQLException | FileNotFoundException | ClassNotFoundException ex) {
            Logger.getLogger(GUI_Inventario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GUI_Inventario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbmodificarActionPerformed

    private void jbeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbeliminarActionPerformed
        try {
            Delete_Products();
            
            if (this.table1.getRowCount() == 0) {
                mostrarProductos();
                limpiarCampos();
                jbeliminar.setEnabled(false);
            } else {
                limpiarActualizarTabla1();
                mostrarProductos();
                limpiarCampos();
                jbeliminar.setEnabled(false);
            }  
        } catch (SQLException | FileNotFoundException | ClassNotFoundException ex) {
            Logger.getLogger(GUI_Inventario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GUI_Inventario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbeliminarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        jbmodificar.setEnabled(true);
        txtcode.setEnabled(false);
        txtname.setEnabled(true);
        txtdescrip.setEnabled(true);
        txtprecio.setEnabled(true);
        jComboBox1.setEnabled(true);
        jcomboCantidad.setEnabled(true);
        jbSeleccionar.setEnabled(true);
        txtUrlImage.setEnabled(true);
        jbNuevo.setEnabled(false);
    }//GEN-LAST:event_ModificarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        if(jbmodificar.isEnabled() == false){
        jbeliminar.setEnabled(true);
        txtcode.setEnabled(false);
        txtname.setEnabled(true);
        txtdescrip.setEnabled(true);
        txtprecio.setEnabled(true);
        jComboBox1.setEnabled(true);
        jcomboCantidad.setEnabled(true);
        jbSeleccionar.setEnabled(true);
        txtUrlImage.setEnabled(true);
        jbNuevo.setEnabled(false);
        }
    }//GEN-LAST:event_EliminarActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Inventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Eliminar;
    private javax.swing.JLabel Imagen;
    private javax.swing.JMenuItem Modificar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbConsultar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSeleccionar;
    private javax.swing.JButton jbeliminar;
    private javax.swing.JButton jbinsertar;
    private javax.swing.JButton jbmodificar;
    private javax.swing.JComboBox<String> jcomboCantidad;
    private javax.swing.JTable table1;
    private javax.swing.JTextField txtUrlImage;
    private javax.swing.JTextField txtcode;
    private javax.swing.JTextField txtdescrip;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables

}
