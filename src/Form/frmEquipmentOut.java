

package Form;

import java.awt.Dimension;
import java.awt.TextField;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;

public class frmEquipmentOut extends javax.swing.JInternalFrame {
    Connection c=DB.getConnection();
    String sql;
    ArrayList Dept=new ArrayList();
    ArrayList Store=new ArrayList();
    ArrayList empDeto=new ArrayList();
    ArrayList empstore =new ArrayList();
    ArrayList empAll =new ArrayList();
    DefaultTableModel model = new DefaultTableModel();
    JLabel LbID =new JLabel();
    JLabel LbOH =new JLabel();
    public frmEquipmentOut() {
        initComponents();
         model = (DefaultTableModel)jTable1.getModel();
         jTable1.getTableHeader().setFont(new java.awt.Font("Saysettha OT", java.awt.Font.BOLD, 12));
        ButtonGrouop();
    }
    public void ButtonGrouop(){
        try {
            ButtonGroup bg=new ButtonGroup();
            bg.add(radDetp);
            bg.add(radStore);
        } catch (Exception e) {
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        LB_txtFindDevi = new javax.swing.JLabel();
        txtFindDevices = new javax.swing.JTextField();
        btnOrdeFind = new javax.swing.JButton();
        btnSaveOrder = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        cmbLoc = new javax.swing.JComboBox();
        radDetp = new javax.swing.JRadioButton();
        radStore = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        dtpDate = new com.toedter.calendar.JDateChooser();
        lb_Bill = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtBar = new javax.swing.JTextField();
        txtQty = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbEmp = new javax.swing.JComboBox();
        txtOH = new javax.swing.JTextField();
        cmbStatus = new javax.swing.JComboBox();
        LB_txtStatus = new javax.swing.JLabel();
        txtSerial = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

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

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255), 2));

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
                .addGap(23, 23, 23)
                .addComponent(LB_txtFindDevi, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFindDevices, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOrdeFind)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
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

        cmbLoc.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbLoc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-------- Select Location ----------" }));
        cmbLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLocActionPerformed(evt);
            }
        });

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

        jLabel2.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("ວັນທີ່:");

        jLabel3.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("ເລກທີ່:");

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255), 2));

        jTable1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nbr#", "Barcode", "Equipment", "Quantity", "Serial", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.setRowHeight(20);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(450);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(150);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
        );

        dtpDate.setDateFormatString("dd-MM-yyyy");
        dtpDate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        dtpDate.setPreferredSize(new java.awt.Dimension(91, 19));
        dtpDate.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                dtpDateAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        dtpDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dtpDateMouseClicked(evt);
            }
        });
        dtpDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dtpDateKeyReleased(evt);
            }
        });

        lb_Bill.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lb_Bill.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 153)));

        jLabel4.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel4.setText("ລະຫັດບາໂຄດ:");

        txtBar.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtBar.setPreferredSize(new java.awt.Dimension(6, 30));
        txtBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBarActionPerformed(evt);
            }
        });
        txtBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBarKeyReleased(evt);
            }
        });

        txtQty.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtQty.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQty.setPreferredSize(new java.awt.Dimension(6, 30));
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

        txtName.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtName.setEnabled(false);
        txtName.setPreferredSize(new java.awt.Dimension(6, 30));

        jLabel5.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
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

        txtOH.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtOH.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOH.setEnabled(false);

        cmbStatus.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ໃຊ້ງານຢູ່", "ໃຊ້ງານບໍ່ໄດ້" }));

        LB_txtStatus.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_txtStatus.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_txtStatus.setText("ສະຖານະ:");

        txtSerial.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtSerial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSerial.setPreferredSize(new java.awt.Dimension(6, 30));
        txtSerial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSerialActionPerformed(evt);
            }
        });
        txtSerial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSerialKeyReleased(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Search-2-icon.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel5))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel4)))
                                .addGap(3, 3, 3)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(269, 269, 269)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(LB_txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(radDetp, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(radStore, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(338, 338, 338)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_Bill, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dtpDate, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(txtBar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtOH, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtSerial, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dtpDate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radDetp)
                            .addComponent(radStore))))
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(cmbLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(cmbEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(LB_txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lb_Bill, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOH, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSerial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        EnableButton();
        AutoBill();
    }//GEN-LAST:event_btnaddActionPerformed
    public void AutoBill(){
    try {
            showCount();
            sql = "select OrderBill from IV_EquipmentOrder where OrderBill = 'R00'";
            ResultSet rs = c.createStatement().executeQuery(sql);
            if (rs.next()){
                String b = rs.getString("OrderBill");
                String sum = b+LbID.getText();
                lb_Bill.setText(sum);               
            }
            rs.close();
            
        } catch (Exception e) {
        }
    }
    public void showCount(){
        try {
            sql = "select count(OrderBill) as COUNTS from IV_EquipmentOrder";
            ResultSet rs = c.createStatement().executeQuery(sql);
            while (rs.next()){
                String a = rs.getString("COUNTS");
                LbID.setText(a);
            }
            
        } catch (Exception e) {
        }
    }
    private void btnSaveOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveOrderActionPerformed
            try {
             if (lb_Bill.getText().equals("")){
                int type = JOptionPane.WARNING_MESSAGE;
                String a = "Error...your data is not enough.";
                String b = "MESSAGE";
                JOptionPane.showMessageDialog(null, a,b,type);
                return;
            }
           
            if (JOptionPane.showConfirmDialog(null, "Do you like to Save ?", "Message", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                String str1 = (String) df.format(dtpDate.getDate());
                int em=cmbEmp.getSelectedIndex();
                 
                sql = "Insert into IV_EquipmentOrder (OrderBill, ODate, EID) values (?,?,?)";
                PreparedStatement p = c.prepareStatement(sql);
                
                p.setString(1, lb_Bill.getText());
                p.setString(2, str1);        
                p.setString(3, empAll.get(em).toString());
                
                 if (p.executeUpdate()!=-1){
                   //----------- Save data in Jtable ---------------------------
                   int rows=jTable1.getRowCount(); 
                    sql = "INSERT INTO IV_EquipmentOrderDetail (OrderBill,Barcode,EQName,Qty,Serial,Status) values (?,?,?,?,?,?)";
                    PreparedStatement p1 = c.prepareStatement(sql);
                    for(int row = 0; row<rows; row++){  
                        String OrdBill = (String)jTable1.getValueAt(row, 0);
                        String Barc = (String)jTable1.getValueAt(row, 1);
                        String EqName = (String)jTable1.getValueAt(row, 2);
                        String Price = (String)jTable1.getValueAt(row, 3);
                        float pr=Float.parseFloat(Price);
                        String ser =(String)jTable1.getValueAt(row, 4);
                        String stt =(String)jTable1.getValueAt(row, 5);
      
                        p1.setString(1,OrdBill);
                        p1.setString(2,Barc);
                        p1.setString(3,EqName);
                        p1.setFloat(4, pr);
                        p1.setString(5, ser);
                        p1.setString(6, stt);
                        p1.addBatch();
                    }
                    p1.executeBatch();
                    c.commit();
                //===============================
                    int type = JOptionPane.OK_OPTION;
                    String a = "Finished.";
                    String b = "MESSAGE";
                    JOptionPane.showMessageDialog(null, a,b,type);
                //---------Update Status on 
                
                }            
            }
            ClearTable();
            ShowReport();
            AllClear();
            AutoBill();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSaveOrderActionPerformed
public void ShowReport(){
        try {
            java.util.Date date1;
                SimpleDateFormat fdate = new SimpleDateFormat("yyyy-MM-dd");
                date1 = dtpDate.getDate();
                String strdate = (String) fdate.format(dtpDate.getDate());
                String Bill=lb_Bill.getText();
                HashMap map = new HashMap();
                
                map.put("Bill", Bill);
                map.put("Date", strdate);
                JasperPrint print = JasperFillManager.fillReport("Report\\ReportEquipmentOut.jasper",map, c);
                JFrame fr = new JFrame();
                fr.setTitle("IT Equipment");
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
    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
      
        
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
      
       
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnOrdeFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdeFindActionPerformed
      
    }//GEN-LAST:event_btnOrdeFindActionPerformed

    private void radDetpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radDetpActionPerformed
        ShowDept();
        
    }//GEN-LAST:event_radDetpActionPerformed
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
    private void radStoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radStoreActionPerformed
        ShowStore();
         
    }//GEN-LAST:event_radStoreActionPerformed
    private void Filterdata(){
            try {
            sql = "SELECT EquipmentName,Qty\n" +
                  "FROM IV_EquipmentStock\n" +
                  "WHERE Barcode = N'"+ txtBar.getText().toString() +"'";            
            java.text.DecimalFormat df = new java.text.DecimalFormat("##,###");
          ResultSet rs = c.createStatement().executeQuery(sql);
            if (rs.next()) {
                    String name  = rs.getString("EquipmentName");
                    txtName.setText(name);
                    int qty  = rs.getInt("Qty");
                    txtOH.setText(df.format(qty));
                }          
              
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void DisbleButton(){
        btnDelete.setEnabled(false);
        btnEdit.setEnabled(false);
        btnSaveOrder.setEnabled(false);
    }
    public void EnableButton(){
        btnSaveOrder.setEnabled(true);
    }
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        try {
           DisbleButton();
           txtBar.setToolTipText("<html><b><font color=red>" + "Please Enter Barcode" + "</font></b></html>");
           txtQty.setToolTipText("<html><b><font color=red>" + "Please Enter Quantity" + "</font></b></html>");
           txtSerial.setToolTipText("<html><b><font color=red>" + "Please Enter Serial Number" + "</font></b></html>");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_formInternalFrameOpened

    private void txtBarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBarKeyReleased
       
    }//GEN-LAST:event_txtBarKeyReleased

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
    public void AllClear(){
    txtBar.setText("");
    txtName.setText("");
    txtQty.setText("");
    txtOH.setText("");
    txtSerial.setText("");
    }
    private void cmbEmpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbEmpKeyReleased
     
    }//GEN-LAST:event_cmbEmpKeyReleased

    private void cmbEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEmpActionPerformed
         this.txtBar.requestFocus();     
    }//GEN-LAST:event_cmbEmpActionPerformed

    private void dtpDateAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_dtpDateAncestorAdded
       
    }//GEN-LAST:event_dtpDateAncestorAdded

    private void dtpDateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dtpDateKeyReleased
       // TODO add your handling code here:
    }//GEN-LAST:event_dtpDateKeyReleased

    private void dtpDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dtpDateMouseClicked
      
    }//GEN-LAST:event_dtpDateMouseClicked

    private void txtQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtyActionPerformed
        this.txtSerial.requestFocusInWindow();
    }//GEN-LAST:event_txtQtyActionPerformed

    private void txtBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBarActionPerformed
       Filterdata();
       this.txtQty.requestFocusInWindow();
    }//GEN-LAST:event_txtBarActionPerformed

    private void txtQtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtyKeyReleased

        MinusQty();
    }//GEN-LAST:event_txtQtyKeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            if(evt.getClickCount()==1){
               int index = jTable1.getSelectedRow();
                String Nbr = jTable1.getValueAt(index, 0).toString();
                String bar = jTable1.getValueAt(index, 1).toString();
                String name = jTable1.getValueAt(index, 2).toString();
                String qty = jTable1.getValueAt(index, 3).toString();
                lb_Bill.setText(Nbr);
                txtBar.setText(bar);
                txtName.setText(name);               
                txtQty.setText(qty);    
                
            }else if (evt.getClickCount()==2){
                DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
                int[] rows = jTable1.getSelectedRows();
                for(int i=0;i<rows.length;i++){
                model.removeRow(rows[i]-i);
                PlusQty();
                UpdateStock();
            }
            
          }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtSerialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSerialActionPerformed
        try {
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        String a[] ={lb_Bill.getText(),txtBar.getText(),txtName.getText(),txtQty.getText(),txtSerial.getText(),cmbStatus.getSelectedItem().toString()};       
        dtm.addRow(a);
        //--------------- update stock--------------
        sql="Update IV_EquipmentStock set Qty=? where Barcode=(?)";
        PreparedStatement p = c.prepareStatement(sql);
         p.setFloat(1,Float.parseFloat(txtOH.getText()));
         p.setString(2, txtBar.getText());
         if (p.executeUpdate()!=-1){
                            
         }               
        AllClear();
        this.txtBar.requestFocusInWindow();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txtSerialActionPerformed

    private void txtSerialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSerialKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSerialKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {  
          frmSubStockPur ps = new frmSubStockPur(null, closable);
          ps.setVisible(true);
          txtBar.setText(ps.Barcode);
          txtBar.requestFocus();
         
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    public void MinusQty(){
        try {
            java.text.DecimalFormat df1 = new java.text.DecimalFormat("#####");
            float x, y, Minus;
            x = Float.parseFloat(txtOH.getText());
            y = Float.parseFloat(txtQty.getText());
            if(x<y){
                int type = JOptionPane.OK_OPTION;
                String a = "Quantity not enough.";
                String b = "MESSAGE";
                JOptionPane.showMessageDialog(null, a,b,type);
                txtQty.setText("");
            }else{
                Minus = x - y;
                String s = String.valueOf(df1.format(Minus));
                txtOH.setText(s);
            }
        } catch (Exception e) {
        }
    }
    public void PlusQty(){
        try {
            java.text.DecimalFormat df1 = new java.text.DecimalFormat("#####");
            float x, y, Minus;
            String qt;
            sql="Select Qty from IV_EquipmentStock where Barcode='"+ txtBar.getText() +"'";
            ResultSet rs = c.createStatement().executeQuery(sql);
             if (rs.next()) {
                    String OH  = rs.getString("Qty");
                    LbOH.setText(OH);
             }
            x = Float.parseFloat(LbOH.getText());
            y = Float.parseFloat(txtQty.getText());
            Minus = x + y;
            String s = String.valueOf(df1.format(Minus));
            txtOH.setText(s);
        } catch (Exception e) {
        }
    }
    public void UpdateStock(){
        try {
            sql="Update IV_EquipmentStock set Qty=? where Barcode=(?)";
             PreparedStatement p = c.prepareStatement(sql);
             p.setString(1, txtOH.getText());
             p.setString(2, txtBar.getText());
             if (p.executeUpdate()!=-1){
//                int type = JOptionPane.OK_OPTION;
//                String a = "Finished.";
//                String b = "MESSAGE";
//                JOptionPane.showMessageDialog(null, a,b,type);
               
                }
              AllClear();
        } catch (Exception e) {
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LB_txtFindDevi;
    private javax.swing.JLabel LB_txtStatus;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnOrdeFind;
    private javax.swing.JButton btnSaveOrder;
    private javax.swing.JButton btnadd;
    private javax.swing.JComboBox cmbEmp;
    private javax.swing.JComboBox cmbLoc;
    private javax.swing.JComboBox cmbStatus;
    private com.toedter.calendar.JDateChooser dtpDate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lb_Bill;
    private javax.swing.JRadioButton radDetp;
    private javax.swing.JRadioButton radStore;
    public javax.swing.JTextField txtBar;
    private javax.swing.JTextField txtFindDevices;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtOH;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtSerial;
    // End of variables declaration//GEN-END:variables
}
