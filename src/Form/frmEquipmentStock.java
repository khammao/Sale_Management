package Form;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class frmEquipmentStock extends javax.swing.JInternalFrame {
    Connection c =DB.getConnection();
    String sql;
    ArrayList unit =new ArrayList();
    ArrayList dpt=new ArrayList();
    ArrayList Brand=new ArrayList();
    ArrayList Cate =new ArrayList();
    DefaultTableModel mode=new DefaultTableModel();
    public frmEquipmentStock() {
        initComponents();
        mode=(DefaultTableModel) jTable1.getModel();
        jTable1.getTableHeader().setFont(new java.awt.Font("Saysettha OT", java.awt.Font.BOLD, 12));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnadd = new javax.swing.JButton();
        btnSaveOrder = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        LB_txtFindDevi = new javax.swing.JLabel();
        txtFindDevices = new javax.swing.JTextField();
        btnOrdeFind = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtBar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cmbBrand = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        cmbcate = new javax.swing.JComboBox();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        cmbDept = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cmbUnit = new javax.swing.JComboBox();

        setClosable(true);
        setIconifiable(true);
        setTitle("Recording Equipment to Stock");
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

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255), 2));
        jPanel2.setPreferredSize(new java.awt.Dimension(817, 47));

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

        btnSaveOrder.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnSaveOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/disksave_4a90b428-e98a-4189-82cc-fd6163c92f1a.png"))); // NOI18N
        btnSaveOrder.setText("ບັນທຶກ");
        btnSaveOrder.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSaveOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveOrderActionPerformed(evt);
            }
        });

        btnEdit.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/document_edit.png"))); // NOI18N
        btnEdit.setText("ແກ້ໄຂ");
        btnEdit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Delete_Icon-300x241.png"))); // NOI18N
        btnDelete.setText("ລົບອອກ");
        btnDelete.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        LB_txtFindDevi.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_txtFindDevi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_txtFindDevi.setText("ຄົ້ນຫາ");

        txtFindDevices.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtFindDevices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFindDevicesActionPerformed(evt);
            }
        });

        btnOrdeFind.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnOrdeFind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/1430905404_Synchronize.png"))); // NOI18N
        btnOrdeFind.setText("ຕົກລົງ");
        btnOrdeFind.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnOrdeFind.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnOrdeFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdeFindActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnadd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSaveOrder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LB_txtFindDevi, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFindDevices, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(btnOrdeFind)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LB_txtFindDevi)
                        .addComponent(txtFindDevices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnOrdeFind))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSaveOrder)
                        .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnadd)))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255), 2));

        txtBar.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("ເລກບາຣໂຄດ:");

        jLabel2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("ອຸປະກອນ:");

        txtName.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("ຈຳນວນ:");

        txtAmount.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtAmount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAmountKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("ລາຄາລວມ:");

        txtQty.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtQty.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQty.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtQtyInputMethodTextChanged(evt);
            }
        });
        txtQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtyActionPerformed(evt);
            }
        });
        txtQty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQtyKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQtyKeyReleased(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 204), 2));

        jTable1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Barcde", "Equipment", "Price", "Quantity", "Unit", "Brands", "Category", "Department", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.setRowHeight(27);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(120);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(120);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(120);
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(130);
            jTable1.getColumnModel().getColumn(8).setPreferredWidth(100);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("ລາຄາ:");

        txtPrice.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        btnSearch.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Search-2-icon.png"))); // NOI18N
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("ຍີ່ຫໍ້:");

        cmbBrand.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("ປະເພດ:");

        cmbcate.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jDateChooser1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        cmbDept.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("ພະແນກ:");

        jLabel9.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("ວັນທີ່:");

        jLabel10.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("ຫົວໜ່ວຍ:");

        cmbUnit.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel1)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAmount)
                            .addComponent(txtBar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbBrand, 0, 124, Short.MAX_VALUE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel2))
                            .addComponent(jLabel3)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(cmbcate, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbDept, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(17, 17, 17)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(cmbUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cmbBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(cmbcate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(cmbDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 821, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed


    }//GEN-LAST:event_btnaddActionPerformed

    private void btnSaveOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveOrderActionPerformed
        try {
            if (txtBar.getText().equals("")){
                int type=JOptionPane.WARNING_MESSAGE;
                String a="Error...your data is not enough";
                String b="MESSAGE";
                JOptionPane.showMessageDialog(null,a,b,type);
            }
            int un =cmbUnit.getSelectedIndex();
            int bd =cmbBrand.getSelectedIndex();
            int ct =cmbcate.getSelectedIndex();
            int dp=cmbDept.getSelectedIndex();
            if(JOptionPane.showConfirmDialog(null,"Do you like to save?","Message",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
                SimpleDateFormat dd =new SimpleDateFormat("yyyy-MM-dd");
                String date=(String) dd.format(jDateChooser1.getDate());
                sql="Insert into IV_EquipmentStock (Barcode,EquipmentName,Prices,Qty,UnitID,BrandID,CATID,DPID,SDates) values(?,?,?,?,?,?,?,?,?)";
                PreparedStatement p=c.prepareStatement(sql);
                p.setString(1, txtBar.getText());
                p.setString(2, txtName.getText());
                p.setFloat(3, Float.parseFloat(txtPrice.getText()));
                p.setFloat(4, Float.parseFloat(txtQty.getText()));
                p.setString(5, unit.get(un).toString());
                p.setString(6,Brand.get(bd).toString());
                p.setString(7,Cate.get(ct).toString());
                p.setString(8,dpt.get(dp).toString());
                p.setString(9, date);
                if(p.executeUpdate() !=-1){
                    int type=JOptionPane.OK_OPTION;
                    String a="Finished";
                    String b ="message";
                    JOptionPane.showMessageDialog(null,a,b,type);
                }
                showData();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSaveOrderActionPerformed
   public void FilterData(){
        try {
            int index = jTable1.getRowCount()-1;
            while (index > -1){
                mode.removeRow(index--);
            }
            sql="SELECT  dbo.IV_EquipmentStock.Barcode, dbo.IV_EquipmentStock.EquipmentName, dbo.IV_EquipmentStock.Prices, dbo.IV_EquipmentStock.Qty, dbo.IV_Unit.UnitName, dbo.IV_Brands.BrandName, dbo.CATType.CDesc, \n" +
            "dbo.Department.DName,dbo.IV_EquipmentStock.SDates\n" +
            "FROM dbo.IV_EquipmentStock INNER JOIN\n" +
            "dbo.IV_Unit ON dbo.IV_EquipmentStock.UnitID = dbo.IV_Unit.UnitID INNER JOIN\n" +
            "dbo.IV_Brands ON dbo.IV_EquipmentStock.BrandID = dbo.IV_Brands.BrandID INNER JOIN\n" +
            "dbo.CATType ON dbo.IV_EquipmentStock.CATID = dbo.CATType.CATID INNER JOIN\n" +
            "dbo.Department ON dbo.IV_EquipmentStock.DPID = dbo.Department.DPID\n" +
            "where dbo.IV_EquipmentStock.Barcode='"+ txtFindDevices.getText() +"'";
            ResultSet rs = c.createStatement().executeQuery(sql);
            while(rs.next()){
                Vector v=new Vector();
                v.add(rs.getString("Barcode"));
                v.add(rs.getString("EquipmentName"));
                v.add(rs.getFloat("Prices"));
                v.add(rs.getFloat("Qty"));
                v.add(rs.getString("UnitName"));
                v.add(rs.getString("BrandName"));
                v.add(rs.getString("CDesc"));
                v.add(rs.getString("DName"));
                v.add(rs.getString("SDates"));
                mode.addRow(v);
        }
          jTable1.setModel(mode);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    public void showData(){
        try {
            int index = jTable1.getRowCount()-1;
            while (index > -1){
                mode.removeRow(index--);
            }
            sql="SELECT  dbo.IV_EquipmentStock.Barcode, dbo.IV_EquipmentStock.EquipmentName, dbo.IV_EquipmentStock.Prices, dbo.IV_EquipmentStock.Qty, dbo.IV_Unit.UnitName, dbo.IV_Brands.BrandName, dbo.CATType.CDesc, \n" +
            "dbo.Department.DName,dbo.IV_EquipmentStock.SDates\n" +
            "FROM dbo.IV_EquipmentStock INNER JOIN\n" +
            "dbo.IV_Unit ON dbo.IV_EquipmentStock.UnitID = dbo.IV_Unit.UnitID INNER JOIN\n" +
            "dbo.IV_Brands ON dbo.IV_EquipmentStock.BrandID = dbo.IV_Brands.BrandID INNER JOIN\n" +
            "dbo.CATType ON dbo.IV_EquipmentStock.CATID = dbo.CATType.CATID INNER JOIN\n" +
            "dbo.Department ON dbo.IV_EquipmentStock.DPID = dbo.Department.DPID";
            ResultSet rs = c.createStatement().executeQuery(sql);
            while(rs.next()){
                Vector v=new Vector();
                v.add(rs.getString("Barcode"));
                v.add(rs.getString("EquipmentName"));
                v.add(rs.getFloat("Prices"));
                v.add(rs.getFloat("Qty"));
                v.add(rs.getString("UnitName"));
                v.add(rs.getString("BrandName"));
                v.add(rs.getString("CDesc"));
                v.add(rs.getString("DName"));
                v.add(rs.getString("SDates"));
                mode.addRow(v);
        }
          jTable1.setModel(mode);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try {
            if(txtBar.getText().equals("")){
                int type=JOptionPane.WARNING_MESSAGE;
                String a="Error...your data is not enough";
                String b="MESSAGE";
                JOptionPane.showMessageDialog(null,a,b,type);
                return;
            }
            int un1 =cmbUnit.getSelectedIndex();
            int bd1 =cmbBrand.getSelectedIndex();
            int ct1 =cmbcate.getSelectedIndex();
            int dp1=cmbDept.getSelectedIndex();
            SimpleDateFormat dd =new SimpleDateFormat("yyyy-MM-dd");
            String date1=(String) dd.format(jDateChooser1.getDate());
            if(JOptionPane.showConfirmDialog(null,"Do you like to save?", "message", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
                sql="Update IV_EquipmentStock set EquipmentName=?,Prices=?,Qty=?,UnitID=?,BrandID=?,CATID=?,DPID=?,SDates=? where Barcode=(?)";
                PreparedStatement p=c.prepareStatement(sql);
                p.setString(1, txtName.getText());
                p.setFloat(2, Float.parseFloat(txtPrice.getText()));
                p.setFloat(3, Float.parseFloat(txtQty.getText()));
                p.setString(4, unit.get(un1).toString());
                p.setString(5,Brand.get(bd1).toString());
                p.setString(6,Cate.get(ct1).toString());
                p.setString(7,dpt.get(dp1).toString());
                p.setString(8, date1);
                p.setString(9,txtBar.getText());
                if(p.executeUpdate()!=-1){
                    int type=JOptionPane.OK_OPTION;
                    String a="Finished";
                    String b ="message";
                    JOptionPane.showMessageDialog(null,a,b,type);
                }
                showData();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
         try {
            if (txtBar.getText().equals("")){
                int type = JOptionPane.WARNING_MESSAGE;
                String a = "Error...your data is not enough.";
                String b = "MESSAGE";
                JOptionPane.showMessageDialog(null, a,b,type);
                return;
            }
            if (JOptionPane.showConfirmDialog(null, "Do you like to Delete ?", "Message", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
                sql = "Delete from IV_EquipmentStock where Barcode=(?)";
                PreparedStatement p = c.prepareStatement(sql);
                p.setString(1, txtBar.getText());
                if (p.executeUpdate()!=-1){
                    int type = JOptionPane.OK_OPTION;
                    String a = "Deleted.";
                    String b = "MESSAGE";
                    JOptionPane.showMessageDialog(null, a,b,type);
                    showData();
                }                
            }          
        } catch (Exception e) {
            //e.printStackTrace();
             int type = JOptionPane.WARNING_MESSAGE;
                    String a = "Error...Check your data again.";
                    String b = "MESSAGE";
                    JOptionPane.showMessageDialog(null, a,b,type);
                    return;
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnOrdeFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdeFindActionPerformed
        FilterData();
    }//GEN-LAST:event_btnOrdeFindActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try {
           
          frmSubStock ps = new frmSubStock(null, closable);
          ps.setVisible(true);
          java.text.DecimalFormat df = new java.text.DecimalFormat("###");
          
          txtBar.setText(ps.Barcode);
          txtName.setText(ps.EquipmentName);
          //------------ for text amount---------
          Float x;
          x = Float.parseFloat((ps.Price));
          String y;
          y = String.valueOf(df.format(x));          
          txtAmount.setText(y);
          //------------ for text quantity ---------
          Float a;
          a = Float.parseFloat((ps.qty));
          String b;
          b = String.valueOf(df.format(a));          
          txtQty.setText(b);
          //---------- for text price----------------
         String n=txtAmount.getText();
         String m=txtQty.getText();
         float i=Float.parseFloat(n);
         float j=Float.parseFloat(m);
         float sum=i/j;
         String p=String.valueOf(df.format(sum));
         txtPrice.setText(p);
         //---------------- for unit--------------------
         cmbUnit.setSelectedItem(ps.unit);
         cmbBrand.setSelectedItem(ps.brand);
         cmbcate.setSelectedItem(ps.categ);
         cmbDept.setSelectedItem(ps.dtpm);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtAmountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAmountKeyReleased

    }//GEN-LAST:event_txtAmountKeyReleased

    private void txtQtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtyKeyReleased
        
    }//GEN-LAST:event_txtQtyKeyReleased

    private void txtQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtyActionPerformed
     
    }//GEN-LAST:event_txtQtyActionPerformed

    private void txtQtyInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtQtyInputMethodTextChanged
      
    }//GEN-LAST:event_txtQtyInputMethodTextChanged

    private void txtQtyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtyKeyPressed
        
    }//GEN-LAST:event_txtQtyKeyPressed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
       Date date = new Date();
       jDateChooser1.setDate(date);
       showData();
       ShowUnit();
       ShowDepartment();
       ShowBrand();
       showcategory();
    }//GEN-LAST:event_formInternalFrameOpened

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            java.text.DecimalFormat df1 = new java.text.DecimalFormat("###");
            if(evt.getClickCount()==1){
                int index=jTable1.getSelectedRow();
                String bar=jTable1.getValueAt(index, 0).toString();
                String name=jTable1.getValueAt(index,1).toString();
                String price=jTable1.getValueAt(index, 2).toString();
                String qty=jTable1.getValueAt(index, 3).toString();
                String ut=jTable1.getValueAt(index, 4).toString();
                String bn=jTable1.getValueAt(index, 5).toString();
                String ce=jTable1.getValueAt(index, 6).toString();
                String dm=jTable1.getValueAt(index, 7).toString();
                String dt=jTable1.getValueAt(index, 8).toString();
                txtBar.setText(bar);
                txtName.setText(name);
                txtPrice.setText(price);
                txtQty.setText(qty);
                cmbUnit.setSelectedItem(ut);
                cmbBrand.setSelectedItem(bn);
                cmbcate.setSelectedItem(ce);
                cmbDept.setSelectedItem(dm);
                jDateChooser1.setDateFormatString(dt);
                float total =Float.parseFloat(txtPrice.getText().toString()) * Float.parseFloat(txtQty.getText().toString());
                String t=String.valueOf(df1.format(total));
                txtAmount.setText(t);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtFindDevicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFindDevicesActionPerformed
        btnOrdeFindActionPerformed(evt);
    }//GEN-LAST:event_txtFindDevicesActionPerformed
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
    private void ShowDepartment(){
        try {
            DefaultComboBoxModel mode = new DefaultComboBoxModel();
            sql = "Select DPID, DName from Department";
            mode.removeAllElements();
            dpt.clear();
            ResultSet rs = c.createStatement().executeQuery(sql);
            while (rs.next()){
               dpt.add(rs.getString("DPID"));
                mode.addElement(rs.getString("DName"));                
            }
            cmbDept.setModel(mode);
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
            cmbcate.setModel(mode);
        } catch (Exception e) {
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LB_txtFindDevi;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnOrdeFind;
    private javax.swing.JButton btnSaveOrder;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnadd;
    public javax.swing.JComboBox cmbBrand;
    public javax.swing.JComboBox cmbDept;
    public javax.swing.JComboBox cmbUnit;
    public javax.swing.JComboBox cmbcate;
    public com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public javax.swing.JTextField txtAmount;
    public javax.swing.JTextField txtBar;
    private javax.swing.JTextField txtFindDevices;
    public javax.swing.JTextField txtName;
    public javax.swing.JTextField txtPrice;
    public javax.swing.JTextField txtQty;
    // End of variables declaration//GEN-END:variables
}
