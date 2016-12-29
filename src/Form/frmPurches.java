
package Form;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;


public class frmPurches extends javax.swing.JInternalFrame {
    private JButton button1;
    JDesktopPane desktop;
    JInternalFrame internalFrame;
    
    Connection c=DB.getConnection();
    DefaultTableModel model = new DefaultTableModel();
    //public String tables;
    
    String sql;
    String del;
    String del2;
    int   int1;
    String path;
    ArrayList unit =new ArrayList();
    ArrayList Brand =new ArrayList();
    ArrayList Cate =new ArrayList();
    ArrayList dpt = new ArrayList();
    JLabel lbCount = new JLabel();
    double Amount=0;
    JLabel lbSum = new JLabel();
    JLabel LbID =new JLabel();
    
    public frmPurches() {
        initComponents();
         model = (DefaultTableModel)jTable1.getModel();
         jTable1.getTableHeader().setFont(new java.awt.Font("Saysettha OT", java.awt.Font.BOLD, 12));
    }
    public void showData(){
        try {
            int unit2=cmbUnit.getSelectedIndex(); 
            int brand2=cmbBrand.getSelectedIndex();
            int cat2=cmbCate.getSelectedIndex();
            int dtp2=cmbDept.getSelectedIndex();
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            
            String a[] ={txtBill.getText(),txtBarcode.getText(),txtName.getText(),txtTotal.getText(),txtQty.getText(),
                        unit.get(unit2).toString(), cmbUnit.getSelectedItem().toString(),
                        Brand.get(brand2).toString(),cmbBrand.getSelectedItem().toString(),
                        Cate.get(cat2).toString(),cmbCate.getSelectedItem().toString(),
                        txtDesc.getText(),
                        dpt.get(dtp2).toString(),cmbDept.getSelectedItem().toString()
                        };
            
            dtm.addRow(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void AllClear(){
        try {
            txtBarcode.setText("");
            txtDesc.setText("");
            txtName.setText("");
            txtPrice.setText("");
            txtQty.setText("");
            txtTotal.setText("");
            //txtAutoID.setText("");
        } catch (Exception e) {
        }
    }
    public void DisibleText(){
        try {
            txtBill.setEnabled(false);
            txtBarcode.setEnabled(false);
            txtDesc.setEnabled(false);
            txtName.setEnabled(false);
            txtPrice.setEnabled(false);
            txtQty.setEnabled(false);
            cmbBrand.setEnabled(false);
            cmbCate.setEnabled(false);
            cmbDept.setEnabled(false);
            cmbStatus.setEnabled(false);
            cmbUnit.setEnabled(false);
            dtpDatePur.setEnabled(false);
            btnDelete.setEnabled(false);
            btnEdit.setEnabled(false);
            btnSaveOrder.setEnabled(false);
            btnSearch.setEnabled(false);
            btnAdd1.setEnabled(false);
            btnCancel.setEnabled(false);
         //   txtAmount.setEnabled(false);
            txtAutoID.setEnabled(false);
            btnAdd3.setEnabled(false);
           // btnRemove.setEnabled(false);
            txtTotal.setEnabled(false);
        } catch (Exception e) {
        }
    }
    public void EnableText(){
        try {
            txtBarcode.setEnabled(true);
            txtDesc.setEnabled(true);
            txtName.setEnabled(true);
            txtPrice.setEnabled(true);
            txtQty.setEnabled(true);
            cmbBrand.setEnabled(true);
            cmbCate.setEnabled(true);
            cmbDept.setEnabled(true);
            cmbStatus.setEnabled(true);
            cmbUnit.setEnabled(true);
            dtpDatePur.setEnabled(true);
            btnDelete.setEnabled(false);
            btnEdit.setEnabled(false);
            btnSaveOrder.setEnabled(true);
            btnSearch.setEnabled(true);
            btnAdd1.setEnabled(true);
            btnCancel.setEnabled(true);
            btnAdd3.setEnabled(true);
           // btnRemove.setEnabled(true);
            txtTotal.setEnabled(true);
        } catch (Exception e) {
        }
    }
    public void EnableTextEdit(){
        try {
            txtBarcode.setEnabled(true);
            txtDesc.setEnabled(true);
            txtName.setEnabled(true);
            txtPrice.setEnabled(true);
            txtQty.setEnabled(true);
            cmbBrand.setEnabled(true);
            cmbCate.setEnabled(true);
            cmbDept.setEnabled(true);
            cmbStatus.setEnabled(true);
            cmbUnit.setEnabled(true);
            dtpDatePur.setEnabled(true);
            btnDelete.setEnabled(true);
            btnEdit.setEnabled(true);
            btnSaveOrder.setEnabled(false);
            btnSearch.setEnabled(true);
            btnSaveOrder.setEnabled(false);
            btnAdd1.setEnabled(true);
            btnCancel.setEnabled(true);
            btnAdd3.setEnabled(true);
           // btnRemove.setEnabled(true);
            txtTotal.setEnabled(true);
        } catch (Exception e) {
        }
    }
    public void onlynumber(){
    try {
                     int1 = Integer.parseInt(txtPrice.getText());   //This was a string coming from a resultset that I changed into and Int
                     txtPrice.requestFocusInWindow();
                     } catch (Exception z) { 
                         JOptionPane.showMessageDialog(this, "Incorrect Data Type! Numbers Only!",
                            "Inane error", JOptionPane.ERROR_MESSAGE);
                         txtPrice.setText("");
                         txtPrice.requestFocusInWindow();
                         return;
                }
}
    public void showCount(){
        try {
            sql = "select count(bill) as COUNTS from IV_Purchase";
            ResultSet rs = c.createStatement().executeQuery(sql);
            while (rs.next()){
                String a = rs.getString("COUNTS");
                lbCount.setText(a);
            }
            
        } catch (Exception e) {
        }
    }
 public void showCountID(){
        try {
            sql = "select count(NbrID) as COUNTSID from IV_PurchaseDetail";
            ResultSet rs = c.createStatement().executeQuery(sql);
            while (rs.next()){
                String a1 = rs.getString("COUNTSID");
                LbID.setText(a1);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        LB_txtFindDevi = new javax.swing.JLabel();
        txtFindDevices = new javax.swing.JTextField();
        btnOrdeFind = new javax.swing.JButton();
        btnSaveOrder = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        LB_Frmorderequipment = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        LB_txtBrand = new javax.swing.JLabel();
        LB_txtBarcode = new javax.swing.JLabel();
        LB_txtEquipmentType = new javax.swing.JLabel();
        LB_Equipment = new javax.swing.JLabel();
        cmbBrand = new javax.swing.JComboBox();
        cmbCate = new javax.swing.JComboBox();
        txtBarcode = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        LB_Quantity = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        LB_Unit = new javax.swing.JLabel();
        cmbUnit = new javax.swing.JComboBox();
        LB_txtPrice = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        LB_txtDesc1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDesc = new javax.swing.JTextArea();
        LB_txtStatus = new javax.swing.JLabel();
        cmbStatus = new javax.swing.JComboBox();
        LB_txtOrderdate = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        dtpDatePur = new com.toedter.calendar.JDateChooser();
        LB_Department = new javax.swing.JLabel();
        cmbDept = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        LB_Bill = new javax.swing.JLabel();
        txtBill = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        btnAdd1 = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnAdd3 = new javax.swing.JButton();
        txtAmount = new javax.swing.JTextField();
        txtAutoID = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        LB_Total = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setPreferredSize(new java.awt.Dimension(920, 650));
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
        jPanel1.setPreferredSize(new java.awt.Dimension(629, 356));

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 2, true));

        LB_txtFindDevi.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_txtFindDevi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_txtFindDevi.setText("ຄົ້ນຫາ");

        txtFindDevices.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnadd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSaveOrder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(LB_txtFindDevi, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFindDevices, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(btnOrdeFind)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
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

        LB_Frmorderequipment.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        LB_Frmorderequipment.setText("ຮູບແບບສັ່ງຊື່ອຸປະກອນໃໝ່");

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 2, true));

        LB_txtBrand.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_txtBrand.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_txtBrand.setText("ຍີ່ຫໍ້:");

        LB_txtBarcode.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_txtBarcode.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_txtBarcode.setText("ບາຣໂຄດ:");

        LB_txtEquipmentType.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_txtEquipmentType.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_txtEquipmentType.setText("ປະເພດອຸປະກອນ:");

        LB_Equipment.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_Equipment.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_Equipment.setText("ຊື່ອຸປະກອນ:");

        cmbBrand.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        cmbCate.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        txtBarcode.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        txtName.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        LB_Quantity.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_Quantity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_Quantity.setText("ຈຳນວນ:");

        txtQty.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtQty.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtyActionPerformed(evt);
            }
        });
        txtQty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQtyKeyReleased(evt);
            }
        });

        LB_Unit.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_Unit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_Unit.setText("ຫົວໜ່ວຍ:");

        cmbUnit.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbUnit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbUnitMouseClicked(evt);
            }
        });
        cmbUnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbUnitActionPerformed(evt);
            }
        });

        LB_txtPrice.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_txtPrice.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_txtPrice.setText("ລາຄາ:");

        txtPrice.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtPrice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPrice.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                txtPriceComponentAdded(evt);
            }
        });

        LB_txtDesc1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_txtDesc1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_txtDesc1.setText("1 ລາຍລະອຽດ:");

        txtDesc.setColumns(20);
        txtDesc.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtDesc.setRows(5);
        jScrollPane1.setViewportView(txtDesc);

        LB_txtStatus.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_txtStatus.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_txtStatus.setText("ສະຖານະ:");

        cmbStatus.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ກຳລັງສັ່ງຊື້", "ຍົກເລີກການສັ່ງຊື້", "ສັ່ງຊື້ສຳເລັດ", " " }));

        LB_txtOrderdate.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_txtOrderdate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_txtOrderdate.setText("ວັນທີ່ສັ່ງຊື້:");

        btnSearch.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Search-2-icon.png"))); // NOI18N
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        dtpDatePur.setDateFormatString("dd-MM-yyyy");
        dtpDatePur.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        LB_Department.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_Department.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_Department.setText("ຈາກພະແນກ:");

        cmbDept.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 153), 2));

        jTable1.setFont(new java.awt.Font("Phetsarath OT", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nbr#", "Barcode", "Equipment", "Price", "Quantity", "UnitID", "UnitName", "BrandID", "Brands", "CatID", "Category", "DptID", "Department", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.setRowHeight(25);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(110);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(8).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(9).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(11).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(12).setPreferredWidth(120);
            jTable1.getColumnModel().getColumn(13).setPreferredWidth(200);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        LB_Bill.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_Bill.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_Bill.setText("ເລກທີ່ຊື້:");

        txtBill.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 204), 2));

        btnAdd1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAdd1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Actions-go-next-icon.png"))); // NOI18N
        btnAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd1ActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Actions-go-previous-icon.png"))); // NOI18N
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnAdd3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAdd3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/2000px-Fairytale_button_add.svg.png"))); // NOI18N
        btnAdd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAdd3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(btnAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(btnAdd3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        txtAmount.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        txtAmount.setForeground(new java.awt.Color(255, 0, 102));
        txtAmount.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        txtAutoID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        txtTotal.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotal.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                txtTotalComponentAdded(evt);
            }
        });

        LB_Total.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_Total.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_Total.setText("ລວມລາຄາ:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(LB_Equipment, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(LB_txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(LB_Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(LB_Unit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(4, 4, 4))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(LB_txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(LB_txtOrderdate, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(LB_txtEquipmentType, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(LB_txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmbUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmbBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmbCate, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(dtpDatePur, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(32, 32, 32))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(LB_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(50, 50, 50)))
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LB_Bill, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LB_Department, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LB_txtBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(txtBill, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtAutoID, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(txtBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cmbDept, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LB_txtDesc1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAmount))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtBill, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LB_Bill)
                                    .addComponent(txtAutoID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmbDept, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LB_Department, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LB_txtBarcode)
                                    .addComponent(txtBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(LB_Equipment, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(LB_txtPrice))
                                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(LB_Quantity))
                                    .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LB_Total))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(cmbUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LB_Unit))
                                        .addGap(11, 11, 11)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(cmbBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LB_txtBrand))
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(cmbCate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LB_txtEquipmentType))
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LB_txtStatus))
                                        .addGap(11, 11, 11)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(dtpDatePur, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LB_txtOrderdate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(413, 413, 413)
                        .addComponent(LB_txtDesc1)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(LB_Frmorderequipment, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(LB_Frmorderequipment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private BufferedImage ResizeSccall(Image im, int w, int h){
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
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        try {
            ShowUnit();
            ShowBrand();
            showcategory();
            ShowDepartment();
            DisibleText();
           Image im = new ImageIcon("src/icon/LDC_Import-Export Logo.jpg").getImage();
            Image icon = ResizeSccall(im, btnSearch.getWidth(), btnSearch.getHeight());
            btnSearch.setIcon(new ImageIcon(icon));     
        } catch (Exception e) {
        }
    }//GEN-LAST:event_formInternalFrameOpened
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
            cmbCate.setModel(mode);
        } catch (Exception e) {
        }
    }
    private void txtPriceComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_txtPriceComponentAdded
        onlynumber();
    }//GEN-LAST:event_txtPriceComponentAdded

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try {  
          frmPurchaseDialog ps = new frmPurchaseDialog(null, closable);
          ps.setVisible(true);
          txtBarcode.setText(ps.Barcode);
          txtName.setText(ps.EquipmentName);
         
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnSaveOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveOrderActionPerformed
        try {  
             if (txtBill.getText().equals("")){
                int type = JOptionPane.WARNING_MESSAGE;
                String a = "Error...your data is not enough.";
                String b = "MESSAGE";
                JOptionPane.showMessageDialog(null, a,b,type);
                return;
            }    
            if (JOptionPane.showConfirmDialog(null, "Do you like to Change ?", "Message", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            java.util.Date dt1, dt2;
            java.text.DecimalFormat d = new java.text.DecimalFormat("###.00");
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            dt1 = dtpDatePur.getDate();
            String str1 = (String) df.format(dtpDatePur.getDate());
            sql = "Insert into IV_Purchase (Bill, PurDate, Amount) values (?,?,?)";
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, txtBill.getText());
            p.setString(2, str1);        
            p.setString(3,txtAmount.getText());
            if (p.executeUpdate()!=-1){
                 
                int rows=jTable1.getRowCount(); 
                sql = "INSERT INTO IV_PurchaseDetail (Bill,Barcode,EquipmentName,Prices,Qty,UnitID,BrandID,CATID,DPID,Description) values (?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement p1 = c.prepareStatement(sql);
                for(int row = 0; row<rows; row++){  
                    String Bill = (String)jTable1.getValueAt(row, 0);
                    String Bar = (String)jTable1.getValueAt(row, 1);
                    String EqName = (String)jTable1.getValueAt(row, 2);
                    String Price = (String)jTable1.getValueAt(row, 3);
                    float pr=Float.parseFloat(Price);
                    String qty = (String)jTable1.getValueAt(row, 4);
                    float qt=Float.parseFloat(qty);
                    String Unit = (String)jTable1.getValueAt(row, 5);
                    int nt=Integer.parseInt(Unit);
                    String Brand1 = (String)jTable1.getValueAt(row, 7);
                    int bd=Integer.parseInt(Brand1);
                    String cate = (String)jTable1.getValueAt(row, 9); 
                    int ct=Integer.parseInt(cate);
                    String Dpt = (String)jTable1.getValueAt(row, 11);
                    int dp=Integer.parseInt(Dpt);
                    String Dec = (String)jTable1.getValueAt(row, 13);
                    p1.setString(1,Bill);
                    p1.setString(2,Bar);
                    p1.setString(3,EqName);
                    p1.setFloat(4,pr);
                    p1.setFloat(5,qt);
                    p1.setInt(6,nt);
                    p1.setInt(7,bd);
                    p1.setInt(8,ct);                   
                    p1.setInt(9,dp);
                    p1.setString(10,Dec);
                    p1.addBatch();
                }
                p1.executeBatch();
                c.commit();
                //===============================
                    int type = JOptionPane.OK_OPTION;
                    String a = "Finished.";
                    String b = "MESSAGE";
                    JOptionPane.showMessageDialog(null, a,b,type);
                //===============================
                ShowReport();
                
            }
            AutoBill();
            ClearTable();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSaveOrderActionPerformed
    public void ShowReport(){
        try {
            java.util.Date date1;
                SimpleDateFormat fdate = new SimpleDateFormat("yyyy-MM-dd");
                date1 = dtpDatePur.getDate();
                String strdate = (String) fdate.format(dtpDatePur.getDate());
                String Bill=txtBill.getText();
                HashMap map = new HashMap();
                
                map.put("Bill", Bill);
                map.put("Date", strdate);
                JasperPrint print = JasperFillManager.fillReport("Report\\Bill_Purchase.jasper",map, c);
                JFrame fr = new JFrame();
                fr.setTitle("Bill Purchase IT Equipment");
                Dimension dr = Toolkit.getDefaultToolkit().getScreenSize();
                int w = (int)dr.getWidth();
                int h = (int)dr.getHeight();
                fr.setBounds(0,0,w,h);
                fr.getContentPane().add(new JRViewer(print));
                fr.setVisible(true);
        } catch (Exception e) {
        }
    }
    public void ClearTable(){
         while (model.getRowCount()>0){
            model.removeRow(0);
}
    }
    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        EnableText();
        AllClear();
       // AutoID();
        AutoBill();
       
    }//GEN-LAST:event_btnaddActionPerformed
    public void AutoBill(){
    try {
            showCount();
            sql = "select bill from IV_Purchase where bill = 'PO/00'";
            ResultSet rs = c.createStatement().executeQuery(sql);
            if (rs.next()){
                String b = rs.getString("bill");
                String sum = b+lbCount.getText();
                txtBill.setText(sum);               
            }
            rs.close();
            
        } catch (Exception e) {
        }
    }
    public void AutoID(){
    try {
            //showCountID();
            //sql = "select NbrID from IV_PurchaseDetail where NbrID = '0'";
            //ResultSet rs = c.createStatement().executeQuery(sql);
            //if (rs.next()){
                //String a2 = rs.getString("NbrID");
               LbID.setText("0");
               int j=jTable1.getRowCount(); 
               //for(int i=0;i<j;i++){
                if (j==0){
                    String a2="1";
                String ID = j+a2;
                txtAutoID.setText(ID);  
                }else{
                 String a2="0";
                String ID = j+a2;
                txtAutoID.setText(ID); 
                }
                
                
              // }
            //}
           // rs.close();
        
   
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void cmbUnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbUnitActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cmbUnitActionPerformed

    private void cmbUnitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbUnitMouseClicked
        // TODO add your handling code here:
      
    }//GEN-LAST:event_cmbUnitMouseClicked

    private void btnOrdeFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdeFindActionPerformed
       EnableTextEdit();
        try {  
             int index = jTable1.getRowCount()-1;
            while (index > -1){
                model.removeRow(index--);
            }
            sql = "SELECT dbo.IV_PurchaseDetail.Bill,dbo.IV_PurchaseDetail.Barcode, dbo.IV_PurchaseDetail.EquipmentName, dbo.IV_PurchaseDetail.Prices, dbo.IV_PurchaseDetail.Qty, dbo.IV_PurchaseDetail.UnitID, dbo.IV_Unit.UnitName, \n" +
                " dbo.IV_PurchaseDetail.BrandID, dbo.IV_Brands.BrandName, dbo.IV_PurchaseDetail.CATID, dbo.CATType.CDesc, dbo.IV_PurchaseDetail.DPID, dbo.Department.DName, dbo.IV_PurchaseDetail.Description\n" +
                "FROM dbo.IV_Purchase INNER JOIN\n" +
                " dbo.IV_PurchaseDetail ON dbo.IV_Purchase.Bill = dbo.IV_PurchaseDetail.Bill INNER JOIN\n" +
                " dbo.IV_Unit ON dbo.IV_PurchaseDetail.UnitID = dbo.IV_Unit.UnitID INNER JOIN\n" +
                " dbo.IV_Brands ON dbo.IV_PurchaseDetail.BrandID = dbo.IV_Brands.BrandID INNER JOIN\n" +
                " dbo.CATType ON dbo.IV_PurchaseDetail.CATID = dbo.CATType.CATID INNER JOIN\n" +
                " dbo.Department ON dbo.IV_PurchaseDetail.DPID = dbo.Department.DPID where dbo.IV_PurchaseDetail.Bill = N'"+ txtFindDevices.getText().toString() +"'";            

          ResultSet rs = c.createStatement().executeQuery(sql);
            while (rs.next()){
                Vector v = new Vector();
                v.add(rs.getString("Bill"));
                v.add(rs.getString("Barcode"));
                v.add(rs.getString("EquipmentName"));
                v.add(rs.getString("Prices"));
                v.add(rs.getString("Qty"));
                v.add(rs.getString("UnitID"));
                v.add(rs.getString("UnitName"));
                v.add(rs.getString("BrandID"));
                v.add(rs.getString("BrandName"));
                v.add(rs.getString("CATID"));
                v.add(rs.getString("CDesc"));
                v.add(rs.getString("DPID"));
                v.add(rs.getString("DName"));
                v.add(rs.getString("Description"));

                model.addRow(v);
            }
            jTable1.setModel(model);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnOrdeFindActionPerformed

    private void btnAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd1ActionPerformed
        try {
            
            
            int unit2=cmbUnit.getSelectedIndex(); 
            int brand2=cmbBrand.getSelectedIndex();
            int cat2=cmbCate.getSelectedIndex();
            int dtp2=cmbDept.getSelectedIndex();
             java.text.DecimalFormat dfff = new java.text.DecimalFormat("##,###");
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            String a[] ={txtBill.getText(),txtBarcode.getText(),txtName.getText(),txtTotal.getText(),txtQty.getText(),
                        unit.get(unit2).toString(), cmbUnit.getSelectedItem().toString(),
                        Brand.get(brand2).toString(),cmbBrand.getSelectedItem().toString(),
                        Cate.get(cat2).toString(),cmbCate.getSelectedItem().toString(),
                        dpt.get(dtp2).toString(),cmbDept.getSelectedItem().toString(),
                        txtDesc.getText()
                        };
            
            dtm.addRow(a);
            AllClear();   
           // AutoID();
            //=================== format textAmount ============================
             CalculateTable();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnAdd1ActionPerformed
    public void CalculateTable(){
        try {
             int numberOfRaw = model.getRowCount();
                float total = 0;
            java.text.DecimalFormat dff = new java.text.DecimalFormat("##,###");
             
            for (int i = 0; i < numberOfRaw; i++) {    
                        Double value = Double.valueOf(model.getValueAt(i, 3).toString());
                        total += value;             
                        float x = total;
                        txtAmount.setText(dff.format(x));
                }             
        } catch (Exception e) {
        }
    }
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        try {       
        DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
        int[] rows = jTable1.getSelectedRows();
        for(int i=0;i<rows.length;i++){
        model.removeRow(rows[i]-i);
   }
        CalculateTable();
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_btnCancelActionPerformed
    public void myMethodEdit() { // Create Method for Edit quantity and amount in jTable
    java.text.DecimalFormat d1 = new java.text.DecimalFormat("###");
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    if (jTable1.getRowCount() > 0) {
        if (jTable1.getSelectedRowCount() > 0) {
            int selectedRow[] = jTable1.getSelectedRows();
            for (int i : selectedRow) {
               Double value = Double.valueOf(model.getValueAt(i, 4).toString()); // Column of Price
               Double value1 = Double.valueOf(model.getValueAt(i, 3).toString());// Column of Quantity
               double x,y;// for quantity
               double a,b;// for quantity
               x = Double.parseDouble(txtQty.getText());
               y = x + value;
               a = Double.parseDouble(txtTotal.getText());
               b=a+value1;
               jTable1.setValueAt(d1.format(y), jTable1.getSelectedRow(), 4);
               jTable1.setValueAt(d1.format(b), jTable1.getSelectedRow(), 3);
               CalculateTable();
            }
        }
    }
}
    private void btnAdd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd3ActionPerformed
        try { 
            myMethodEdit();
            CalculateTable();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnAdd3ActionPerformed

    private void txtQtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtyKeyReleased
        try {
            java.text.DecimalFormat dfff = new java.text.DecimalFormat("#####");
            float x, y, sum1;
            x = Float.parseFloat(txtPrice.getText());
            y = Float.parseFloat(txtQty.getText());
            sum1 = x * y;
            String s = String.valueOf(dfff.format(sum1));
            lbSum.setText(s);
            txtTotal.setText(s);
        } catch (Exception e) {
            //e.printStackTrace();
        }
    }//GEN-LAST:event_txtQtyKeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            if (evt.getClickCount()==1){
                java.text.DecimalFormat dffff = new java.text.DecimalFormat("###");
                int index = jTable1.getSelectedRow();
                String bil =jTable1.getValueAt(index, 0).toString();
                String GID = jTable1.getValueAt(index, 1).toString();
                String GName = jTable1.getValueAt(index, 2).toString();
                String Total = jTable1.getValueAt(index, 3).toString();
                String qty = jTable1.getValueAt(index, 4).toString();
                String un = jTable1.getValueAt(index, 6).toString();
                String ba = jTable1.getValueAt(index, 8).toString();
                String ca=jTable1.getValueAt(index,10).toString();               
                String dp=jTable1.getValueAt(index,11).toString();
                String dc=jTable1.getValueAt(index, 13).toString();
                txtBill.setText(bil);
                txtBarcode.setText(GID);               
                txtName.setText(GName); 
                txtQty.setText(qty);
                txtTotal.setText(Total);
                float price =Float.parseFloat(txtTotal.getText().toString())/Float.parseFloat(txtQty.getText().toString());
                String p=String.valueOf(dffff.format(price));
                txtPrice.setText(p);
                cmbUnit.setSelectedItem(un);
                cmbBrand.setSelectedItem(ba);
                cmbCate.setSelectedItem(ca);               
                cmbDept.setSelectedItem(dp);
                txtDesc.setText(dc);
            }            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtTotalComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_txtTotalComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalComponentAdded

    private void txtQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtyActionPerformed
       
    }//GEN-LAST:event_txtQtyActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
    try {
            if (txtFindDevices.getText().equals("")){
                int type = JOptionPane.WARNING_MESSAGE;
                String a = "Error...your data is not enough.";
                String b = "MESSAGE";
                JOptionPane.showMessageDialog(null, a,b,type);
                return;
            }    
            if (JOptionPane.showConfirmDialog(null, "Do you like to Delete ?", "Message", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
                //============= for Delete Item on Table IV_PurchaseDetail =============
                del = "Delete from IV_PurchaseDetail where Bill=(?)";
                PreparedStatement p = c.prepareStatement(del);
                p.setString(1, txtFindDevices.getText());
                if (p.executeUpdate()!=-1){
                    //============= for Delete Item on Table IV_Purchase =============
                    del2 = "Delete from IV_Purchase where Bill=(?)";
                    PreparedStatement p1 = c.prepareStatement(del2);
                    p1.setString(1, txtFindDevices.getText());
                    //================ Show Message box =============
                    if (p1.executeUpdate()!=-1){
                         int type = JOptionPane.OK_OPTION;
                        String a = "Finished.";
                        String b = "MESSAGE";
                        JOptionPane.showMessageDialog(null, a,b,type);
                        AllClear();
                        ClearTable();
                    }                   
                }                
            }          
        } catch (Exception e) {
            e.printStackTrace();
             int type = JOptionPane.WARNING_MESSAGE;
             String a = "Error...Check your data again.";
             String b = "MESSAGE";
             JOptionPane.showMessageDialog(null, a,b,type);
             return;
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try {
            if (txtBill.getText().equals("")){
                int type = JOptionPane.WARNING_MESSAGE;
                String a = "Error...your data is not enough.";
                String b = "MESSAGE";
                JOptionPane.showMessageDialog(null, a,b,type);
                return;
            }    
            if (JOptionPane.showConfirmDialog(null, "Do you like to Change ?", "Message", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
                //---------- Update Item in table IV_Pruchase ------------------
                sql = "Update IV_Purchase set Amount=? where Bill=(?)";
                PreparedStatement p = c.prepareStatement(sql);
                p.setString(1,txtAmount.getText());
                p.setString(2, txtBill.getText());
                if (p.executeUpdate()!=-1){
                //---------- Update Item in table IV_PruchaseDetail ------------------    
                int rows=jTable1.getRowCount(); 
                sql="Update IV_PurchaseDetail set EquipmentName=?,Prices=?,Qty=?,UnitID=?,BrandID=?,CATID=?,DPID=?,Description=? where Bill=(?) and Barcode=(?) ";
                PreparedStatement p1 = c.prepareStatement(sql);
                for(int row = 0; row<rows; row++){  
                    String Bill = (String)jTable1.getValueAt(row, 0);
                    String Bar = (String)jTable1.getValueAt(row, 1);
                    String EName = (String)jTable1.getValueAt(row, 2);
                    String Price = (String)jTable1.getValueAt(row, 3);
                    float pr=Float.parseFloat(Price);
                    String qty = (String)jTable1.getValueAt(row, 4);
                    float qt=Float.parseFloat(qty);
                    String Unit = (String)jTable1.getValueAt(row, 5);
                    int nt=Integer.parseInt(Unit);
                    String Brand1 = (String)jTable1.getValueAt(row, 7);
                    int bd=Integer.parseInt(Brand1);
                    String cate = (String)jTable1.getValueAt(row, 9); 
                    int ct=Integer.parseInt(cate);
                    String Dpt = (String)jTable1.getValueAt(row, 11);
                    int dp=Integer.parseInt(Dpt);
                    String Dec = (String)jTable1.getValueAt(row, 13);
                    
                    p1.setString(1,EName);
                    p1.setFloat(2,pr);
                    p1.setFloat(3,qt);
                    p1.setInt(4,nt);
                    p1.setInt(5,bd);
                    p1.setInt(6,ct);                   
                    p1.setInt(7,dp);
                    p1.setString(8,Dec);
                    p1.setString(9,Bill);
                    p1.setString(10,Bar);
                    p1.addBatch();
                }
                p1.executeBatch();
                c.commit();
                    
                int type = JOptionPane.OK_OPTION;
                String a = "Changed.";
                String b = "MESSAGE";
                JOptionPane.showMessageDialog(null, a,b,type);
                ShowReport();
                AllClear();
                            
                }                
            }          
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnEditActionPerformed
public void ChangeLTELB_Total(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ LB_Total.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            LB_Total.setText(a);
        }     
    } catch (Exception e) {
    }
 } 
public void ChangeLTELB_Bill(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ LB_Bill.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            LB_Bill.setText(a);
        }     
    } catch (Exception e) {
    }
 } 
public void ChangeLTELB_Frmorderequipment(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ LB_Frmorderequipment.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            LB_Frmorderequipment.setText(a);
        }     
    } catch (Exception e) {
    }
 }
public void ChangeLTELB_Department(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ LB_Department.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            LB_Department.setText(a);
        }     
    } catch (Exception e) {
    }
 }
public void ChangeLTELB_txtFindDevi(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ LB_txtFindDevi.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            LB_txtFindDevi.setText(a);
        }     
    } catch (Exception e) {
    }
 }
public void ChangeLTEbtnOrdeFind(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ btnOrdeFind.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            btnOrdeFind.setText(a);
        }     
    } catch (Exception e) {
    }
 }
public void ChangeLTEbtnSaveOrder(){
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
public void ChangeLTEbtnEdite(){
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
public void ChangeLTELB_txtBarcode(){
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
public void ChangeLTELB_Equipment(){
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
public void ChangeLTELB_Quantity(){
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
public void ChangeLTELB_txtBrand(){
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
public void ChangeLTELB_txtEquipmentType(){
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
public void ChangeLTELB_txtStatus(){
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
public void ChangeLTELB_txtDesc1(){
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
public void ChangeLTELB_txtOrderdate(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ LB_txtOrderdate.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            LB_txtOrderdate.setText(a);
        }     
    } catch (Exception e) {
    }
 }

public void ChangeLTELB_txtPrice(){
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LB_Bill;
    private javax.swing.JLabel LB_Department;
    private javax.swing.JLabel LB_Equipment;
    private javax.swing.JLabel LB_Frmorderequipment;
    private javax.swing.JLabel LB_Quantity;
    private javax.swing.JLabel LB_Total;
    private javax.swing.JLabel LB_Unit;
    private javax.swing.JLabel LB_txtBarcode;
    private javax.swing.JLabel LB_txtBrand;
    private javax.swing.JLabel LB_txtDesc1;
    private javax.swing.JLabel LB_txtEquipmentType;
    private javax.swing.JLabel LB_txtFindDevi;
    private javax.swing.JLabel LB_txtOrderdate;
    private javax.swing.JLabel LB_txtPrice;
    private javax.swing.JLabel LB_txtStatus;
    private javax.swing.JButton btnAdd1;
    private javax.swing.JButton btnAdd3;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnOrdeFind;
    private javax.swing.JButton btnSaveOrder;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnadd;
    private javax.swing.JComboBox cmbBrand;
    private javax.swing.JComboBox cmbCate;
    private javax.swing.JComboBox cmbDept;
    private javax.swing.JComboBox cmbStatus;
    private javax.swing.JComboBox cmbUnit;
    private com.toedter.calendar.JDateChooser dtpDatePur;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtAutoID;
    public javax.swing.JTextField txtBarcode;
    private javax.swing.JTextField txtBill;
    private javax.swing.JTextArea txtDesc;
    private javax.swing.JTextField txtFindDevices;
    public javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
