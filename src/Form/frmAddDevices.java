

package Form;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmAddDevices extends javax.swing.JInternalFrame {
    Connection c=DB.getConnection();
    DefaultTableModel model = new DefaultTableModel();
    String sql;
     ArrayList unit =new ArrayList();
    ArrayList Brand =new ArrayList();
    ArrayList Cate =new ArrayList();
    ArrayList os =new ArrayList();
     ArrayList Dept=new ArrayList();
    ArrayList Store=new ArrayList();
    ArrayList empDeto=new ArrayList();
    ArrayList empstore =new ArrayList();
    ArrayList empAll =new ArrayList();
     String path; 
    public frmAddDevices() {
        initComponents();
        ButtonGroup();
    }
    public void ButtonGroup(){
        ButtonGroup bg=new ButtonGroup();
        bg.add(radDetp);
        bg.add(radStore);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        LB_txtFindDevices = new javax.swing.JLabel();
        txtFindDevices = new javax.swing.JTextField();
        btnAddDVOk = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnSaveOrder = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        LB_txtBrand = new javax.swing.JLabel();
        LB_txtOS = new javax.swing.JLabel();
        LB_txtFindDevices3 = new javax.swing.JLabel();
        LB_txtBarcode = new javax.swing.JLabel();
        LB_txtEquipmentType = new javax.swing.JLabel();
        LB_Equipment = new javax.swing.JLabel();
        cmbBrand = new javax.swing.JComboBox();
        cmbOS = new javax.swing.JComboBox();
        cmbCate = new javax.swing.JComboBox();
        txtNbr = new javax.swing.JTextField();
        txtBarcode = new javax.swing.JTextField();
        txtEquipmentName = new javax.swing.JTextField();
        txtIP = new javax.swing.JTextField();
        LB_txtFindDevices7 = new javax.swing.JLabel();
        LB_Color = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        LB_Size = new javax.swing.JLabel();
        txtSize = new javax.swing.JTextField();
        LB_Quantity = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        LB_Unit = new javax.swing.JLabel();
        cmbUnit = new javax.swing.JComboBox();
        LB_txtPrice = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        LB_txtDesc1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDesc1 = new javax.swing.JTextArea();
        LB_txtDesc2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDes2 = new javax.swing.JTextArea();
        LB_txtStatus = new javax.swing.JLabel();
        cmbStatus = new javax.swing.JComboBox();
        LBImagein = new javax.swing.JLabel();
        LB_imageLocation = new javax.swing.JLabel();
        LB_Serial = new javax.swing.JLabel();
        txtSerial = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        radDetp = new javax.swing.JRadioButton();
        radStore = new javax.swing.JRadioButton();
        cmbLoc = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        cmbEmp = new javax.swing.JComboBox();
        cmbDate1 = new com.toedter.calendar.JDateChooser();
        LB_txtEntrydate = new javax.swing.JLabel();
        LB_txtEndate = new javax.swing.JLabel();
        cmbDate2 = new com.toedter.calendar.JDateChooser();
        LB_FrmAddNewDV = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 2, true));

        LB_txtFindDevices.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_txtFindDevices.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_txtFindDevices.setText("ຄົ້ນຫາ");

        txtFindDevices.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtFindDevices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFindDevicesActionPerformed(evt);
            }
        });
        txtFindDevices.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFindDevicesKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFindDevicesKeyReleased(evt);
            }
        });

        btnAddDVOk.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnAddDVOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/1430905404_Synchronize.png"))); // NOI18N
        btnAddDVOk.setText("ຕົກລົງ");
        btnAddDVOk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddDVOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDVOkActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Delete_Icon-300x241.png"))); // NOI18N
        btnDelete.setText("ລົບອອກ");
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnEdit.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/document_edit.png"))); // NOI18N
        btnEdit.setText("ແກ້ໄຂ");
        btnEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEdit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnSaveOrder.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnSaveOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/disksave_4a90b428-e98a-4189-82cc-fd6163c92f1a.png"))); // NOI18N
        btnSaveOrder.setText("ບັນທຶກ");
        btnSaveOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSaveOrder.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSaveOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveOrderActionPerformed(evt);
            }
        });

        btnadd.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/orange-add-property-256.png"))); // NOI18N
        btnadd.setText("ເພີ່ມ");
        btnadd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnadd.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LB_txtFindDevices, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFindDevices, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddDVOk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnadd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSaveOrder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSaveOrder)
                        .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnadd))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LB_txtFindDevices)
                        .addComponent(txtFindDevices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAddDVOk)))
                .addContainerGap())
        );

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 2, true));
        jPanel3.setPreferredSize(new java.awt.Dimension(795, 520));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LB_txtBrand.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_txtBrand.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_txtBrand.setText("ຍີ່ຫໍ້:");
        jPanel3.add(LB_txtBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 205, 51, -1));

        LB_txtOS.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_txtOS.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_txtOS.setText("ລະບົບປະຕິບັດການ:");
        jPanel3.add(LB_txtOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 242, -1, -1));

        LB_txtFindDevices3.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_txtFindDevices3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_txtFindDevices3.setText("ເລກທີ່ອຸປະກອນ:");
        jPanel3.add(LB_txtFindDevices3, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 21, -1, -1));

        LB_txtBarcode.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_txtBarcode.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_txtBarcode.setText("ບາຣໂຄດ:");
        jPanel3.add(LB_txtBarcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 21, -1, -1));

        LB_txtEquipmentType.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_txtEquipmentType.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_txtEquipmentType.setText("ປະເພດອຸປະກອນ:");
        jPanel3.add(LB_txtEquipmentType, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 276, -1, -1));

        LB_Equipment.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_Equipment.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_Equipment.setText("ຊື່ອຸປະກອນ:");
        jPanel3.add(LB_Equipment, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 53, -1, 30));

        cmbBrand.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbBrand.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(cmbBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 197, 154, -1));

        cmbOS.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbOS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(cmbOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 234, 154, -1));

        cmbCate.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbCate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(cmbCate, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 271, 209, -1));

        txtNbr.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtNbr.setText("Auto");
        jPanel3.add(txtNbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 17, 80, 30));

        txtBarcode.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel3.add(txtBarcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 17, 165, 30));

        txtEquipmentName.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel3.add(txtEquipmentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 53, 316, 30));

        txtIP.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel3.add(txtIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 89, 154, 30));

        LB_txtFindDevices7.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_txtFindDevices7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_txtFindDevices7.setText("IP Address:");
        jPanel3.add(LB_txtFindDevices7, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 93, -1, -1));

        LB_Color.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_Color.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_Color.setText("ສີ:");
        jPanel3.add(LB_Color, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 93, -1, -1));

        txtColor.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel3.add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 89, 94, 30));

        LB_Size.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_Size.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_Size.setText("ຂະໜາດ:");
        jPanel3.add(LB_Size, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 129, -1, -1));

        txtSize.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel3.add(txtSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 125, 94, 30));

        LB_Quantity.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_Quantity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_Quantity.setText("ຈຳນວນ:");
        jPanel3.add(LB_Quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, -1));

        txtQty.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel3.add(txtQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 196, 94, 30));

        LB_Unit.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_Unit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_Unit.setText("ຫົວໜ່ວຍ:");
        jPanel3.add(LB_Unit, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 170, 51, -1));

        cmbUnit.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbUnit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(cmbUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 162, 154, -1));

        LB_txtPrice.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_txtPrice.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_txtPrice.setText("ລາຄາ:");
        jPanel3.add(LB_txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 165, -1, -1));

        txtPrice.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel3.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 161, 94, 30));

        LB_txtDesc1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_txtDesc1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_txtDesc1.setText("1 ລາຍລະອຽດ:");
        jPanel3.add(LB_txtDesc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 341, -1, -1));

        txtDesc1.setColumns(20);
        txtDesc1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtDesc1.setRows(5);
        jScrollPane1.setViewportView(txtDesc1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 341, 315, 79));

        LB_txtDesc2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_txtDesc2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_txtDesc2.setText("2 ລາຍລະອຽດ:");
        jPanel3.add(LB_txtDesc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 426, -1, -1));

        txtDes2.setColumns(20);
        txtDes2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtDes2.setRows(5);
        jScrollPane2.setViewportView(txtDes2);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 426, 315, 79));

        LB_txtStatus.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_txtStatus.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_txtStatus.setText("ສະຖານະ:");
        jPanel3.add(LB_txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 310, 50, -1));

        cmbStatus.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ຍັງບໍ່ໄດ້ໃຊ້ງານ", "ໃຊ້ງານຢູ່", "ໃຊ້ງານບໍ່ໄດ້" }));
        cmbStatus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(cmbStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 305, 153, -1));

        LBImagein.setBackground(new java.awt.Color(255, 255, 255));
        LBImagein.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBImagein.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2), "ຮູບພາບ(Image)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Saysettha OT", 0, 12))); // NOI18N
        LBImagein.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LBImagein.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LBImageinMouseClicked(evt);
            }
        });
        jPanel3.add(LBImagein, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 270, 230));

        LB_imageLocation.setBackground(new java.awt.Color(255, 204, 204));
        LB_imageLocation.setOpaque(true);
        jPanel3.add(LB_imageLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, 270, 22));

        LB_Serial.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_Serial.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_Serial.setText("ເລກລະຫັດ:");
        jPanel3.add(LB_Serial, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 129, 79, -1));

        txtSerial.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jPanel3.add(txtSerial, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 125, 154, 30));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 204), 2));

        radDetp.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        radDetp.setText("ພະແນກ");
        radDetp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radDetpActionPerformed(evt);
            }
        });

        radStore.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        radStore.setText("ຮ້ານ");
        radStore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radStoreActionPerformed(evt);
            }
        });

        cmbLoc.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbLoc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-------- Select Location ----------" }));
        cmbLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLocActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("ພະນັກງານ:");

        cmbEmp.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEmpActionPerformed(evt);
            }
        });
        cmbEmp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmbEmpKeyReleased(evt);
            }
        });

        cmbDate1.setDateFormatString("dd-MM-yyyy");

        LB_txtEntrydate.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_txtEntrydate.setText("ວັນທີ່ເຂົ້າ:");

        LB_txtEndate.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_txtEndate.setText("ວັນໝົດອາຍຸ:");

        cmbDate2.setDateFormatString("dd-MM-yyyy");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(cmbEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(LB_txtEntrydate)
                        .addGap(4, 4, 4)
                        .addComponent(cmbDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(LB_txtEndate)
                        .addGap(4, 4, 4)
                        .addComponent(cmbDate2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(radDetp, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(radStore, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmbLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radDetp)
                    .addComponent(radStore))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel5))
                    .addComponent(cmbEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LB_txtEntrydate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LB_txtEndate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDate2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 19, 330, 220));

        LB_FrmAddNewDV.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        LB_FrmAddNewDV.setText("ຮູບແບບເພີ່ມຂໍ້ມູນອຸປະກອນໃໝ່");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(LB_FrmAddNewDV, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(LB_FrmAddNewDV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        ShowUnit();
        ShowBrand();
        showcategory();
        ShowOS();
        DisibleAdd();
    }//GEN-LAST:event_formInternalFrameOpened
    public void EnableAdd(){
        try {
            txtBarcode.setEnabled(true);
            txtColor.setEnabled(true);
            txtDes2.setEnabled(true);
            txtDesc1.setEnabled(true);
            txtEquipmentName.setEnabled(true);
            txtIP.setEnabled(true);
            txtSerial.setEnabled(true);
            txtPrice.setEnabled(true);
            txtQty.setEnabled(true);
            txtSize.setEnabled(true);
            cmbBrand.setEnabled(true);
            cmbCate.setEnabled(true);
            cmbOS.setEnabled(true);
            cmbUnit.setEnabled(true);
            cmbStatus.setEnabled(true);
            btnDelete.setEnabled(true);
            btnEdit.setEnabled(true);
            btnSaveOrder.setEnabled(true);
            radDetp.setEnabled(true);
            radStore.setEnabled(true);
            cmbLoc.setEnabled(true);
            cmbEmp.setEnabled(true);
            cmbDate1.setEnabled(true);
            cmbDate2.setEnabled(true);
        } catch (Exception e) {
        }
    }
    public void EnableEdit(){
        try {
            txtBarcode.setEnabled(true);
            txtColor.setEnabled(true);
            txtDes2.setEnabled(true);
            txtDesc1.setEnabled(true);
            txtEquipmentName.setEnabled(true);
            txtIP.setEnabled(true);
            txtSerial.setEnabled(true);
            txtPrice.setEnabled(true);
            txtQty.setEnabled(true);
            txtSize.setEnabled(true);
            cmbBrand.setEnabled(true);
            cmbCate.setEnabled(true);
            cmbOS.setEnabled(true);
            cmbUnit.setEnabled(true);
            cmbStatus.setEnabled(true);
            btnDelete.setEnabled(true);
            btnEdit.setEnabled(true);
            radDetp.setEnabled(true);
            radStore.setEnabled(true);
            cmbLoc.setEnabled(true);
            cmbEmp.setEnabled(true);
            cmbDate1.setEnabled(true);
            cmbDate2.setEnabled(true);
        } catch (Exception e) {
        }
    }
    public void DisibleAdd(){
        try {
            txtBarcode.setEnabled(false);
            txtColor.setEnabled(false);
            txtDes2.setEnabled(false);
            txtDesc1.setEnabled(false);
            txtEquipmentName.setEnabled(false);
            txtIP.setEnabled(false);
            txtSerial.setEnabled(false);
            txtNbr.setEnabled(false);
            txtPrice.setEnabled(false);
            txtQty.setEnabled(false);
            txtSize.setEnabled(false);
            cmbBrand.setEnabled(false);
            cmbCate.setEnabled(false);
            cmbOS.setEnabled(false);
            cmbUnit.setEnabled(false);
            cmbStatus.setEnabled(false);
            btnDelete.setEnabled(false);
            btnEdit.setEnabled(false);
            btnSaveOrder.setEnabled(false);
            radDetp.setEnabled(false);
            radStore.setEnabled(false);
            cmbLoc.setEnabled(false);
            cmbEmp.setEnabled(false);
            cmbDate1.setEnabled(false);
            cmbDate2.setEnabled(false);
        } catch (Exception e) {
        }
    }
    private static BufferedImage ResizeScall(Image im , int w, int h){
        try {
            BufferedImage buff = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
            Graphics2D g = buff.createGraphics();
            g.drawImage(im, 0, 0, w, h, null);
            g.dispose();
            return buff;
            
        } catch (Exception e) {
        }
        return null;
    }
    private void LBImageinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBImageinMouseClicked
       try {
            if (evt.getClickCount()==2){
                JFileChooser choose = new JFileChooser();
                choose.showOpenDialog(this);
                path = choose.getSelectedFile().getAbsolutePath();
                ImageIcon icon = new ImageIcon(path);
                Image im = new ImageIcon(path).getImage();
                Image ico = ResizeScall(im, LBImagein.getWidth(), LBImagein.getHeight());
                LBImagein.setIcon(new ImageIcon(ico));
                LB_imageLocation.setText(path);

            }

        } catch (Exception e) {
            // e.printStackTrace();
        }
    }//GEN-LAST:event_LBImageinMouseClicked
    public void AllClear(){
        try {
            txtNbr.setText("Auto");
            txtBarcode.setText("");
            txtColor.setText("");
            txtDes2.setText("");
            txtDesc1.setText("");
            txtEquipmentName.setText("");
            txtIP.setText("");
            txtPrice.setText("");
            txtPrice.setText("");
            txtQty.setText("");
            txtSize.setText("");
            cmbBrand.setSelectedIndex(0);
            cmbCate.setSelectedIndex(0);
            cmbOS.setSelectedIndex(0);
            cmbUnit.setSelectedIndex(0);
            cmbStatus.setSelectedIndex(0);
        } catch (Exception e) {
        }
    }
     public void AllClearAdd(){
        try {      
            txtBarcode.setText("");
            txtColor.setText("");
            txtDes2.setText("");
            txtDesc1.setText("");
            txtEquipmentName.setText("");
            txtIP.setText("");
            txtPrice.setText("");
            txtPrice.setText("");
            txtQty.setText("");
            txtSize.setText("");
            cmbBrand.setSelectedIndex(0);
            cmbCate.setSelectedIndex(0);
            cmbOS.setSelectedIndex(0);
            cmbUnit.setSelectedIndex(0);
            cmbStatus.setSelectedIndex(0);
        } catch (Exception e) {
        }
    }
    private void btnSaveOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveOrderActionPerformed
         try {
            if (txtNbr.getText().equals("")){
                int type = JOptionPane.WARNING_MESSAGE;
                String a = "Error...Please Enter Group Name.";
                String b = "MESSAGE";
                JOptionPane.showMessageDialog(null, a,b,type);
                return;
            }
           int Brans =cmbBrand.getSelectedIndex();
           int OS1 = cmbOS.getSelectedIndex();
           int cat1=cmbCate.getSelectedIndex();
           int unit1=cmbUnit.getSelectedIndex();
           int em =cmbEmp.getSelectedIndex();
           java.util.Date dt1, dt2;
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            dt1 = cmbDate1.getDate();
            dt2 = cmbDate2.getDate();
            String str1 = (String) df.format(cmbDate1.getDate());
            String str2 = (String) df.format(cmbDate2.getDate());
            if(txtNbr.getText().equals("Auto")){
                if (JOptionPane.showConfirmDialog(null, "Do you like to Save ?", "Message", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
                sql = "Insert into IV_Equipment (Barcode,BrandID,OSID,CATID,ProductName,IPAddress,SerialNbr,Color,Size,UnitID,Quantity,Prices,Desc1,Desc2,Picture,Status,EntryDate,EXP,EID) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement p = c.prepareStatement(sql);
                p.setString(1, txtBarcode.getText());
                p.setString(2, Brand.get(Brans).toString());
                p.setString(3,os.get(OS1).toString());
                p.setString(4,Cate.get(cat1).toString());
                p.setString(5,txtEquipmentName.getText());
                p.setString(6, txtIP.getText());
                p.setString(7, txtSerial.getText());
                p.setString(8,txtColor.getText());
                p.setString(9,txtSize.getText());
                p.setString(10,unit.get(unit1).toString());
                p.setFloat(11,Float.parseFloat(txtQty.getText()));
                p.setFloat(12,Float.parseFloat(txtPrice.getText()));
                p.setString(13,txtDesc1.getText());
                p.setString(14,txtDes2.getText());
                p.setString(15,LB_imageLocation.getText());
                p.setString(16,cmbStatus.getSelectedItem().toString());
                p.setString(17, str1);
                p.setString(18, str2);
                p.setString(19,empAll.get(em).toString());
                if (p.executeUpdate()!=-1){
                    int type = JOptionPane.OK_OPTION;
                    String a = "Finished.";
                    String b = "MESSAGE";
                    JOptionPane.showMessageDialog(null, a,b,type);
                    AllClear();
                    
                }                
            }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
             int type = JOptionPane.WARNING_MESSAGE;
                    String a = "Error...Check your data again.";
                    String b = "MESSAGE";
                    JOptionPane.showMessageDialog(null, a,b,type);
        }
    }//GEN-LAST:event_btnSaveOrderActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
       EnableAdd();
      AllClearAdd();
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnAddDVOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDVOkActionPerformed
        EnableEdit();
        Filterdata();
    }//GEN-LAST:event_btnAddDVOkActionPerformed

    private void txtFindDevicesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFindDevicesKeyPressed
        
    }//GEN-LAST:event_txtFindDevicesKeyPressed

    private void txtFindDevicesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFindDevicesKeyReleased
    
    }//GEN-LAST:event_txtFindDevicesKeyReleased

    private void txtFindDevicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFindDevicesActionPerformed
        // TODO add your handling code here:
        btnAddDVOkActionPerformed(evt);
    }//GEN-LAST:event_txtFindDevicesActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try {
            if(txtNbr.getText().equals("")||txtNbr.getText().equals("Auto")){
              int type=JOptionPane.WARNING_MESSAGE;
              String a="Error...Please Check your data again.";
              String b="MESSAGE";
              JOptionPane.showMessageDialog(null,a, b,type);
              return;
            }
            int Brans =cmbBrand.getSelectedIndex();
            int OS1 = cmbOS.getSelectedIndex();
            int cat1=cmbCate.getSelectedIndex();
            int unit1=cmbUnit.getSelectedIndex();
            java.util.Date dt1, dt2;
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            dt1 = cmbDate1.getDate();
            dt2 = cmbDate2.getDate();
            String str1 = (String) df.format(cmbDate1.getDate());
            String str2 = (String) df.format(cmbDate2.getDate());
            if(JOptionPane.showConfirmDialog(null, "Do you like to Save ?", "Message", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
               sql="Update IV_Equipment set Barcode=?,BrandID=?,OSID=?,CATID=?,ProductName=?,IPAddress=?,SerialNbr=?,Color=?,Size=?,UnitID=?,Quantity=?,Prices=?,\n"+
                   "Desc1=?,Desc2=?,Picture=?,Status=?,EntryDate=?,EXP=? where ProductID=(?)";
                PreparedStatement p = c.prepareStatement(sql);
                p.setString(1, txtBarcode.getText());
                p.setString(2, Brand.get(Brans).toString());
                p.setString(3,os.get(OS1).toString());
                p.setString(4,Cate.get(cat1).toString());
                p.setString(5,txtEquipmentName.getText());
                p.setString(6, txtIP.getText());
                p.setString(7, txtSerial.getText());
                p.setString(8,txtColor.getText());
                p.setString(9,txtSize.getText());
                p.setString(10,unit.get(unit1).toString());
                p.setFloat(11,Float.parseFloat(txtQty.getText()));
                p.setFloat(12,Float.parseFloat(txtPrice.getText()));
                p.setString(13,txtDesc1.getText());
                p.setString(14,txtDes2.getText());
                p.setString(15,LB_imageLocation.getText());
                p.setString(16,cmbStatus.getSelectedItem().toString());
                p.setString(17, str1);
                p.setString(18, str2);
                p.setString(19, txtNbr.getText());
                if (p.executeUpdate()!=-1){
                    int type = JOptionPane.OK_OPTION;
                    String a = "Finished.";
                    String b = "MESSAGE";
                    JOptionPane.showMessageDialog(null, a,b,type);
                    AllClear();
                    
                }                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            if(txtNbr.getText().equals("")||txtNbr.getText().equals("Auto")){
            int type=JOptionPane.WARNING_MESSAGE;
            String a="Eorro...Please check your data again.";
            String b="MESSAGE";
            JOptionPane.showMessageDialog(null, a, b, type);
            return;
            }
            if(JOptionPane.showConfirmDialog(null, "Do you want to Save ?","MESSAGE",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            sql="Delete from IV_Equipment where ProductID=(?)";
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, txtNbr.getText());
            if(p.executeUpdate()!=-1){
                int type=JOptionPane.OK_OPTION;
                String a="Finished";
                String b="Message";
                JOptionPane.showMessageDialog(null,a, b,type);
                AllClear();
            }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnDeleteActionPerformed
private void ShowDept(){
        try {
            DefaultComboBoxModel mode = new DefaultComboBoxModel();
            sql = "SELECT DPID, DName FROM Department order by DName";
            mode.removeAllElements();
            Dept.clear();
            ResultSet rs = c.createStatement().executeQuery(sql);
            while (rs.next()){
               Dept.add(rs.getString("DPID"));
                mode.addElement(rs.getString("DName"));                
            }
            cmbLoc.setModel(mode);
        } catch (Exception e) {
       }
    }
    private void ShowStore(){
        try {
            DefaultComboBoxModel mode = new DefaultComboBoxModel();
            sql = "SELECT LOCID, LOCName FROM dbo.Location WHERE (LOCName <> N'HQ')";
            mode.removeAllElements();
            Store.clear();
            ResultSet rs = c.createStatement().executeQuery(sql);
            while (rs.next()){
               Store.add(rs.getString("LOCID"));
                mode.addElement(rs.getString("LOCName"));                
            }
            cmbLoc.setModel(mode);
        } catch (Exception e) {
       }
    }
    private void radDetpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radDetpActionPerformed
        ShowDept();

    }//GEN-LAST:event_radDetpActionPerformed

    private void radStoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radStoreActionPerformed
        ShowStore();

    }//GEN-LAST:event_radStoreActionPerformed

    private void cmbLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLocActionPerformed
        try {
            if (radDetp.isSelected()){
                int Emp =cmbLoc.getSelectedIndex();
                DefaultComboBoxModel mode = new DefaultComboBoxModel();

                sql = "SELECT dbo.Employee.EID, dbo.Employee.FNameEng\n" +
                "FROM dbo.Employee INNER JOIN\n" +
                " dbo.Department ON dbo.Employee.DPID = dbo.Department.DPID\n" +
                "WHERE (dbo.Employee.DPID ='"+ Dept.get(Emp) +"') and dbo.Employee.TermDate IS NULL";
                empAll.clear();
                mode.removeAllElements();
                empDeto.clear();

                ResultSet rs = c.createStatement().executeQuery(sql);
                while (rs.next()){
                    empDeto.add(rs.getString("EID"));
                    mode.addElement(rs.getString("FNameEng"));
                    empAll.add(rs.getString("EID"));
                }
                cmbEmp.setModel(mode);
            }else if(radStore.isSelected()){
                int Emp1 =cmbLoc.getSelectedIndex();
                DefaultComboBoxModel mode = new DefaultComboBoxModel();
                sql = "SELECT dbo.Employee.EID, dbo.Employee.FNameEng\n" +
                "FROM dbo.Employee INNER JOIN\n" +
                " dbo.Department ON dbo.Employee.DPID = dbo.Department.DPID\n" +
                "WHERE (dbo.Employee.LOCID ='"+ Store.get(Emp1) +"') and (dbo.Employee.TermDate IS NULL)";
                empAll.clear();
                mode.removeAllElements();
                empstore.clear();
                ResultSet rs1 = c.createStatement().executeQuery(sql);
                while (rs1.next()){
                    empstore.add(rs1.getString("EID"));
                    mode.addElement(rs1.getString("FNameEng"));
                    empAll.add(rs1.getString("EID"));
                }
                cmbEmp.setModel(mode);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_cmbLocActionPerformed

    private void cmbEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEmpActionPerformed
        
    }//GEN-LAST:event_cmbEmpActionPerformed

    private void cmbEmpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbEmpKeyReleased

    }//GEN-LAST:event_cmbEmpKeyReleased
    private void Filterdata(){
     try{
         sql="SELECT dbo.IV_Equipment.ProductID, dbo.IV_Equipment.Barcode, dbo.IV_Brands.BrandName, dbo.IV_OperatingSystem.OSName, dbo.CATType.CDesc, dbo.IV_Equipment.ProductName, dbo.IV_Equipment.IPAddress, \n" +
         "dbo.IV_Equipment.Color, dbo.IV_Equipment.Size, dbo.IV_Unit.UnitName, dbo.IV_Equipment.Quantity, dbo.IV_Equipment.Prices, dbo.IV_Equipment.Desc1, dbo.IV_Equipment.Desc2, dbo.IV_Equipment.Picture, \n" +
        "dbo.IV_Equipment.Status, dbo.IV_Equipment.EntryDate, dbo.IV_Equipment.EXP\n" +
        "FROM dbo.IV_Equipment INNER JOIN\n" +
        "dbo.IV_Brands ON dbo.IV_Equipment.BrandID = dbo.IV_Brands.BrandID INNER JOIN\n" +
        "dbo.IV_Unit ON dbo.IV_Equipment.UnitID = dbo.IV_Unit.UnitID INNER JOIN\n" +
        "dbo.CATType ON dbo.IV_Equipment.CATID = dbo.CATType.CATID INNER JOIN\n" +
        "dbo.IV_OperatingSystem ON dbo.IV_Equipment.OSID = dbo.IV_OperatingSystem.OSID\n"+
        "where dbo.IV_Equipment.Barcode like '%"+ txtFindDevices.getText().toString() +"%' or  dbo.IV_Equipment.IPAddress like '%"+ txtFindDevices.getText().toString() +"%'";
         ResultSet rs = c.createStatement().executeQuery(sql);
         if (rs.next()) {
                    String ID  = rs.getString("ProductID");
                    txtNbr.setText(ID);
                    String bar = rs.getString("Barcode");
                    txtBarcode.setText(bar);
                    String Brand = rs.getString("BrandName");
                    cmbBrand.setSelectedItem(Brand);
                    String OS2 = rs.getString("OSName");
                    cmbOS.setSelectedItem(OS2);
                    String Cat2 = rs.getString("CDesc");
                    cmbCate.setSelectedItem(Cat2);
                    String EpName = rs.getString("ProductName");
                    txtEquipmentName.setText(EpName);                          
                    String IP = rs.getString("IPAddress");
                    txtIP.setText(IP);
                    String col = rs.getString("Color");
                    txtColor.setText(col);
                    String SZ = rs.getString("Size");
                    txtSize.setText(SZ);
                    String Unt = rs.getString("UnitName");
                    cmbUnit.setSelectedItem(Unt);
                    
                    float Qty = rs.getFloat("Quantity");
                    String qt=Float.toString(Qty);
                    txtQty.setText(qt);  
                    
                    float Price = rs.getFloat("Prices");
                    String price1=Float.toString(Price);
                    txtPrice.setText(price1);
                    
                    String Des1 = rs.getString("Desc1");
                    txtDesc1.setText(Des1); 
                    String Des2 = rs.getString("Desc2");
                    txtDes2.setText(Des2); 
                    
                    String Status1 = rs.getString("Status");
                    cmbStatus.setSelectedItem(Status1); 
                    cmbDate1.setDate(rs.getDate("EntryDate"));
                    cmbDate2.setDate(rs.getDate("EXP"));
                    
                    String Picture = rs.getString("Picture");
                    LB_imageLocation.setText(Picture); 
                    Image im = new ImageIcon(Picture).getImage();
                    Image ico = ResizeScall(im, LBImagein.getWidth(), LBImagein.getHeight());
                    LBImagein.setIcon(new ImageIcon(ico));
                    LB_imageLocation.setText(Picture);
                }          
         } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void ShowOS(){
        try {
            DefaultComboBoxModel mode = new DefaultComboBoxModel();
            sql = "Select OSID, OSName from IV_OperatingSystem";
            mode.removeAllElements();
            os.clear();
            ResultSet rs = c.createStatement().executeQuery(sql);
            while (rs.next()){
               os.add(rs.getString("OSID"));
                mode.addElement(rs.getString("OSName"));                
            }
            cmbOS.setModel(mode);
        } catch (Exception e) {
       }
    }
    private void ShowUnit(){
        try {
            DefaultComboBoxModel mode = new DefaultComboBoxModel();
            sql = "Select UnitID, UnitName from IV_Unit";
            mode.removeAllElements();
            unit.clear();
            ResultSet rs = c.createStatement().executeQuery(sql);
            while (rs.next()){
               unit.add(rs.getString("UnitID"));
                mode.addElement(rs.getString("UnitName"));                
            }
            cmbUnit.setModel(mode);
        } catch (Exception e) {
       }
    }
    private void ShowBrand(){
        try {
            DefaultComboBoxModel modeBrand = new DefaultComboBoxModel();
            sql="Select BrandID,BrandName from IV_Brands";
            modeBrand.removeAllElements();
            Brand.clear();
            ResultSet rs=c.createStatement().executeQuery(sql);
            while(rs.next()){
                Brand.add(rs.getString("BrandID"));
                modeBrand.addElement(rs.getString("BrandName"));
            }
            cmbBrand.setModel(modeBrand);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void showcategory(){
        try {
            DefaultComboBoxModel mode=new DefaultComboBoxModel();
            sql="Select * from CATType";
            mode.removeAllElements();
            Cate.clear();
            ResultSet rs =c.createStatement().executeQuery(sql);
            while(rs.next()){
                Cate.add(rs.getString("CATID"));
                mode.addElement(rs.getString("CDesc"));
            }
            cmbCate.setModel(mode);
        } catch (Exception e) {
        }
    }
 public void ChangeLTELBEquimentForm(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ LB_FrmAddNewDV.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            LB_FrmAddNewDV.setText(a);
        }     
    } catch (Exception e) {
    }
 }
 public void ChangeLTELBtxtFindDevices(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ LB_txtFindDevices.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            LB_txtFindDevices.setText(a);
        }     
    } catch (Exception e) {
    }
} 
 public void ChangeLTELBSerial(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ LB_Serial.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            LB_Serial.setText(a);
        }     
    } catch (Exception e) {
    }
} 
 public void ChangeLTEbtnAddDVOk(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ btnAddDVOk.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            btnAddDVOk.setText(a);
        }     
    } catch (Exception e) {
    }
} 
 public void ChangeLTELBtxtFindDevices3(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ LB_txtFindDevices3.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            LB_txtFindDevices3.setText(a);
        }     
    } catch (Exception e) {
    }
} 
 public void ChangeLTELBtxtBarcode(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ LB_txtBarcode.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            LB_txtBarcode.setText(a);
        }     
    } catch (Exception e) {
    }
} 
 public void ChangeLTELBEquipment(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ LB_Equipment.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            LB_Equipment.setText(a);
        }     
    } catch (Exception e) {
    }
} 
  public void ChangeLTELBColor(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ LB_Color.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            LB_Color.setText(a);
        }     
    } catch (Exception e) {
    }
} 
 public void ChangeLTELBQuantity(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ LB_Quantity.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            LB_Quantity.setText(a);
        }     
    } catch (Exception e) {
    }
} 
 public void ChangeLTELBSize(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ LB_Size.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            LB_Size.setText(a);
        }     
    } catch (Exception e) {
    }
} 
public void ChangeLTELB_Unit(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ LB_Unit.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            LB_Unit.setText(a);
        }     
    } catch (Exception e) {
    }
} 
public void ChangeLTELB_Price(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ LB_txtPrice.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            LB_txtPrice.setText(a);
        }     
    } catch (Exception e) {
    }
} 
public void ChangeLTELB_Brand(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ LB_txtBrand.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            LB_txtBrand.setText(a);
        }     
    } catch (Exception e) {
    }
} 
public void ChangeLTELB_OS(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ LB_txtOS.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            LB_txtOS.setText(a);
        }     
    } catch (Exception e) {
    }
} 
public void ChangeLTELB_EquipmentType(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ LB_txtEquipmentType.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            LB_txtEquipmentType.setText(a);
        }     
    } catch (Exception e) {
    }
} 
public void ChangeLTELB_EquipmentStatus(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ LB_txtStatus.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            LB_txtStatus.setText(a);
        }     
    } catch (Exception e) {
    }
} 
public void ChangeLTELB_EquipmentDesc1(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ LB_txtDesc1.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            LB_txtDesc1.setText(a);
        }     
    } catch (Exception e) {
    }
} 
public void ChangeLTELB_EquipmentDesc2(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ LB_txtDesc2.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            LB_txtDesc2.setText(a);
        }     
    } catch (Exception e) {
    }
} 
public void ChangeLTELB_Entrydate(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ LB_txtEntrydate.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            LB_txtEntrydate.setText(a);
        }     
    } catch (Exception e) {
    }
} 
 public void ChangeLTELB_Enddate(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ LB_txtEndate.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            LB_txtEndate.setText(a);
        }     
    } catch (Exception e) {
    }
} 
 public void ChangeLTEbtnAdd(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ btnadd.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            btnadd.setText(a);
        }     
    } catch (Exception e) {
    }
 }
 public void ChangeLTEbtnSave(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ btnSaveOrder.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            btnSaveOrder.setText(a);
        }     
    } catch (Exception e) {
    }
 }
 public void ChangeLTEbtnEdit(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ btnEdit.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            btnEdit.setText(a);
        }     
    } catch (Exception e) {
    }
 }
 public void ChangeLTEbtnDelete(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ btnDelete.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            btnDelete.setText(a);
        }     
    } catch (Exception e) {
    }
 }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LBImagein;
    private javax.swing.JLabel LB_Color;
    private javax.swing.JLabel LB_Equipment;
    private javax.swing.JLabel LB_FrmAddNewDV;
    private javax.swing.JLabel LB_Quantity;
    private javax.swing.JLabel LB_Serial;
    private javax.swing.JLabel LB_Size;
    private javax.swing.JLabel LB_Unit;
    private javax.swing.JLabel LB_imageLocation;
    private javax.swing.JLabel LB_txtBarcode;
    private javax.swing.JLabel LB_txtBrand;
    private javax.swing.JLabel LB_txtDesc1;
    private javax.swing.JLabel LB_txtDesc2;
    private javax.swing.JLabel LB_txtEndate;
    private javax.swing.JLabel LB_txtEntrydate;
    private javax.swing.JLabel LB_txtEquipmentType;
    private javax.swing.JLabel LB_txtFindDevices;
    private javax.swing.JLabel LB_txtFindDevices3;
    private javax.swing.JLabel LB_txtFindDevices7;
    private javax.swing.JLabel LB_txtOS;
    private javax.swing.JLabel LB_txtPrice;
    private javax.swing.JLabel LB_txtStatus;
    private javax.swing.JButton btnAddDVOk;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSaveOrder;
    private javax.swing.JButton btnadd;
    private javax.swing.JComboBox cmbBrand;
    private javax.swing.JComboBox cmbCate;
    private com.toedter.calendar.JDateChooser cmbDate1;
    private com.toedter.calendar.JDateChooser cmbDate2;
    private javax.swing.JComboBox cmbEmp;
    private javax.swing.JComboBox cmbLoc;
    private javax.swing.JComboBox cmbOS;
    private javax.swing.JComboBox cmbStatus;
    private javax.swing.JComboBox cmbUnit;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton radDetp;
    private javax.swing.JRadioButton radStore;
    private javax.swing.JTextField txtBarcode;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextArea txtDes2;
    private javax.swing.JTextArea txtDesc1;
    private javax.swing.JTextField txtEquipmentName;
    private javax.swing.JTextField txtFindDevices;
    private javax.swing.JTextField txtIP;
    private javax.swing.JTextField txtNbr;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtSerial;
    private javax.swing.JTextField txtSize;
    // End of variables declaration//GEN-END:variables
}
