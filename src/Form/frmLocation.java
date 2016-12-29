
package Form;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class frmLocation extends javax.swing.JInternalFrame {
    Connection c=DB.getConnection();
    String sql;
    String sql2015;
    DefaultTableModel model = new DefaultTableModel();
     ArrayList GLocation = new ArrayList();
     ArrayList TLocation = new ArrayList();
    public frmLocation() {
        initComponents();
        model = (DefaultTableModel)jTable1.getModel();
        jTable1.getTableHeader().setFont(new java.awt.Font("Saysettha OT", java.awt.Font.BOLD, 12));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        LB_StoreName = new javax.swing.JLabel();
        txtNo = new javax.swing.JTextField();
        LB_StoreGroupName = new javax.swing.JLabel();
        txtLocName = new javax.swing.JTextField();
        LB_LocNbr = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        cmbGroup = new javax.swing.JComboBox();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbTypeLoc = new javax.swing.JComboBox();
        LB_StoreNameType = new javax.swing.JLabel();
        txtLocID = new javax.swing.JTextField();
        btnNew = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        LB_FindnameofID = new javax.swing.JLabel();
        btnFind = new javax.swing.JButton();
        txtFilter = new javax.swing.JTextField();

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

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 5));

        LB_StoreName.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_StoreName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_StoreName.setText("ຊື້ສາຂາ:");

        txtNo.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        LB_StoreGroupName.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_StoreGroupName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_StoreGroupName.setText("ກຸ່ມສາຂາ:");

        txtLocName.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        LB_LocNbr.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_LocNbr.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_LocNbr.setText("ເລກສາຂາ:");

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        jTable1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "ລຳດັບ(ID)", "ກູ່ມ(Group)", "ເລກ(Nbr#)", "ຊື່ສາຂາ(Store name)", "ປະເພດ(Type)", "Email"
            }
        ));
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.setRowHeight(30);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(70);
            jTable1.getColumnModel().getColumn(1).setMinWidth(100);
            jTable1.getColumnModel().getColumn(2).setMinWidth(50);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(200);
        }

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        btnSave.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnSave.setText("ບັນທຶກ");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnEdit.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnEdit.setText("ແກ້ໄຂ");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnDelete.setText("ລົບອອກ");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        cmbGroup.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGroupActionPerformed(evt);
            }
        });

        txtEmail.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Email:");

        cmbTypeLoc.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        LB_StoreNameType.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_StoreNameType.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_StoreNameType.setText("ປະເພດສາຂາ:");

        txtLocID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtLocID.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtLocID.setEnabled(false);

        btnNew.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnNew.setText("ເພີ່ມ");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 3), "ຊໍ້ມູນຂອງສາຂາ(Find by Store ID, Name)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Saysettha OT", 1, 12), new java.awt.Color(0, 204, 0))); // NOI18N

        LB_FindnameofID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_FindnameofID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_FindnameofID.setText("ລະຫັດ/ຊື່ສາຂາ:");

        btnFind.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnFind.setText("ຄົ້ນຫາ");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        txtFilter.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(LB_FindnameofID, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LB_FindnameofID))
                .addGap(18, 18, 18)
                .addComponent(btnFind)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LB_LocNbr, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LB_StoreName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LB_StoreNameType, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LB_StoreGroupName, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLocID))
                            .addComponent(txtLocName)
                            .addComponent(cmbTypeLoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LB_LocNbr)
                            .addComponent(txtLocID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(LB_StoreName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5))
                            .addComponent(txtLocName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmbTypeLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LB_StoreNameType)))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB_StoreGroupName)
                    .addComponent(cmbGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave)
                    .addComponent(btnEdit)
                    .addComponent(btnDelete)
                    .addComponent(btnNew))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGroupActionPerformed
       
    }//GEN-LAST:event_cmbGroupActionPerformed
   public  void showEngstoreLBFindNameorID(){
    try {
        sql2015= "Select English from LDCLanguage where  Laos = N'"+ LB_FindnameofID.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql2015);
        if (rs.next()){
            String a = rs.getString("English");
            LB_FindnameofID.setText(a);
        }     
    } catch (Exception e) {
    }
}  
    public  void showEngstorebtnFind(){
    try {
        sql2015= "Select English from LDCLanguage where  Laos = N'"+ btnFind.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql2015);
        if (rs.next()){
            String a = rs.getString("English");
            btnFind.setText(a);
        }     
    } catch (Exception e) {
    }
}  
    public  void showEngstorebtnDelete(){
    try {
        sql2015= "Select English from LDCLanguage where  Laos = N'"+ btnDelete.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql2015);
        if (rs.next()){
            String a = rs.getString("English");
            btnDelete.setText(a);
        }     
    } catch (Exception e) {
    }
}  
    public  void showEngstorebtnEdit(){
    try {
        sql2015= "Select English from LDCLanguage where  Laos = N'"+ btnEdit.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql2015);
        if (rs.next()){
            String a = rs.getString("English");
            btnEdit.setText(a);
        }     
    } catch (Exception e) {
    }
}  
    public  void showEngstorebtnSave(){
    try {
        sql2015= "Select English from LDCLanguage where  Laos = N'"+ btnSave.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql2015);
        if (rs.next()){
            String a = rs.getString("English");
            btnSave.setText(a);
        }     
    } catch (Exception e) {
    }
}  
    public  void showEngstorebtnNew(){
    try {
        sql2015= "Select English from LDCLanguage where  Laos = N'"+ btnNew.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql2015);
        if (rs.next()){
            String a = rs.getString("English");
            btnNew.setText(a);
        }     
    } catch (Exception e) {
    }
}  
    public  void showEngLBStoreGroup(){
    try {
        sql2015= "Select English from LDCLanguage where  Laos = N'"+ LB_StoreGroupName.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql2015);
        if (rs.next()){
            String a = rs.getString("English");
            LB_StoreGroupName.setText(a);
        }     
    } catch (Exception e) {
    }
}  
    public  void showEngLBStoreType(){
    try {
        sql2015= "Select English from LDCLanguage where  Laos = N'"+ LB_StoreNameType.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql2015);
        if (rs.next()){
            String a = rs.getString("English");
            LB_StoreNameType.setText(a);
        }     
    } catch (Exception e) {
    }
}  
    public  void showEngLBStoreName(){
    try {
        sql2015= "Select English from LDCLanguage where  Laos = N'"+ LB_StoreName.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql2015);
        if (rs.next()){
            String a = rs.getString("English");
            LB_StoreName.setText(a);
        }     
    } catch (Exception e) {
    }
}  
    public  void showEngLBLocNbr(){
    try {
        sql2015= "Select English from LDCLanguage where  Laos = N'"+ LB_LocNbr.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql2015);
        if (rs.next()){
            String a = rs.getString("English");
            LB_LocNbr.setText(a);
        }     
    } catch (Exception e) {
    }
}  
    private void ShowGLoc(){
        try {
            DefaultComboBoxModel mode = new DefaultComboBoxModel();
            sql = "Select LOCTypeID, LOCTypeName from LOCType order by LOCTypeName";
            mode.removeAllElements();
            GLocation.clear();
            ResultSet rs = c.createStatement().executeQuery(sql);
            while (rs.next()){
               GLocation.add(rs.getString("LOCTypeID"));
                mode.addElement(rs.getString("LOCTypeName"));                
            }
            cmbGroup.setModel(mode);
        } catch (Exception e) {
       }
    }
     private void ShowTypeLoc(){
        try {
            DefaultComboBoxModel mode = new DefaultComboBoxModel();
            sql = "Select LOCStoreTypeID, LOCStoreTypeName from LOCStoreType order by LOCStoreTypeName";
            mode.removeAllElements();
            TLocation.clear();
            ResultSet rs = c.createStatement().executeQuery(sql);
            while (rs.next()){
               TLocation.add(rs.getString("LOCStoreTypeID"));
                mode.addElement(rs.getString("LOCStoreTypeName"));                
            }
            cmbTypeLoc.setModel(mode);
        } catch (Exception e) {
       }
    }
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        ShowGLoc(); 
        ShowTypeLoc();
        showdata();
    }//GEN-LAST:event_formInternalFrameOpened

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
         try {
            if (evt.getClickCount()==1){
                int index = jTable1.getSelectedRow();
                String LocID = jTable1.getValueAt(index, 0).toString();
                String LTypeName = jTable1.getValueAt(index, 1).toString();
                String LocNrb = jTable1.getValueAt(index, 2).toString();
                String LocName = jTable1.getValueAt(index, 3).toString();
                String LocStoreType = jTable1.getValueAt(index, 4).toString();
                String LocMail = jTable1.getValueAt(index, 5).toString();
                txtLocID.setText(LocID);               
                cmbGroup.setSelectedItem(LTypeName); 
                txtNo.setText(LocNrb); 
                txtLocName.setText(LocName); 
                cmbTypeLoc.setSelectedItem(LocStoreType); 
                txtEmail.setText(LocMail); 
            }            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        AllClear();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            if (txtNo.getText().equals("")||txtLocName.getText().equals("")){
                int type = JOptionPane.WARNING_MESSAGE;
                String a = "Error...Please Check your data again.";
                String b = "MESSAGE";
                JOptionPane.showMessageDialog(null, a,b,type);
                return;
            }
           
            int TLoc =cmbTypeLoc.getSelectedIndex();
            if (JOptionPane.showConfirmDialog(null, "Do you like to Save ?", "Message", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
                sql = "Insert into Location(LOCType,LOCNbr,LOCName,LOCStoreTypeID,LOCEmail)values(?,?,?,?,?)";
                PreparedStatement p = c.prepareStatement(sql);
                p.setString(1, cmbGroup.getSelectedItem().toString());
                p.setString(2, txtNo.getText());
                p.setString(3, txtLocName.getText());
                p.setString(4, TLocation.get(TLoc).toString());
                p.setString(5, txtEmail.getText());
                if (p.executeUpdate()!=-1){
                    int type = JOptionPane.OK_OPTION;
                    String a = "Finished.";
                    String b = "MESSAGE";
                    JOptionPane.showMessageDialog(null, a,b,type);
                    AllClear();
                    showdata();
                }                
            }
            
        } catch (Exception e) {
            //e.printStackTrace();
             int type = JOptionPane.WARNING_MESSAGE;
                    String a = "Error...Check your data again.";
                    String b = "MESSAGE";
                    JOptionPane.showMessageDialog(null, a,b,type);
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try {
            if (txtLocID.getText().equals("")){
                int type = JOptionPane.WARNING_MESSAGE;
                String a = "Error...your data is not enough.";
                String b = "MESSAGE";
                JOptionPane.showMessageDialog(null, a,b,type);
                return;
            }    
            int TLoc =cmbTypeLoc.getSelectedIndex();
            if (JOptionPane.showConfirmDialog(null, "Do you like to Change ?", "Message", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
                sql = "Update Location set LOCType=?,LOCNbr=?,LOCName=?,LOCStoreTypeID=?,LOCEmail=? where LOCID=(?)";
                PreparedStatement p = c.prepareStatement(sql);
                p.setString(1,cmbGroup.getSelectedItem().toString());
                p.setString(2, txtNo.getText());
                p.setString(3, txtLocName.getText());
                p.setString(4, TLocation.get(TLoc).toString());
                p.setString(5, txtEmail.getText());
                p.setString(6, txtLocID.getText());
                if (p.executeUpdate()!=-1){
                    int type = JOptionPane.OK_OPTION;
                    String a = "Changed.";
                    String b = "MESSAGE";
                    JOptionPane.showMessageDialog(null, a,b,type);
                   AllClear();
                    showdata();
                            
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
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
         try {
            if (txtLocID.getText().equals("")){
                int type = JOptionPane.WARNING_MESSAGE;
                String a = "Error...your data is not enough.";
                String b = "MESSAGE";
                JOptionPane.showMessageDialog(null, a,b,type);
                return;
            }    
            if (JOptionPane.showConfirmDialog(null, "Do you like to Delete ?", "Message", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
                sql = "Delete from Location where LOCID=(?)";
                PreparedStatement p = c.prepareStatement(sql);
                p.setString(1, txtLocID.getText());
                if (p.executeUpdate()!=-1){
                    int type = JOptionPane.OK_OPTION;
                    String a = "Deleted.";
                    String b = "MESSAGE";
                    JOptionPane.showMessageDialog(null, a,b,type);
                   AllClear();
                   showdata();         
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

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        try{
          int index = jTable1.getRowCount()-1;
            while (index > -1){
                model.removeRow(index--);
            }
            sql = "SELECT dbo.Location.LOCID, dbo.LOCType.LOCTypeName, dbo.Location.LOCNbr, dbo.Location.LOCName, dbo.LOCStoreType.LOCStoreTypeName, dbo.Location.LOCEmail\n" +
                  "FROM dbo.Location LEFT OUTER JOIN\n" +
                  "dbo.LOCStoreType ON dbo.Location.LOCStoreTypeID = dbo.LOCStoreType.LOCStoreTypeID LEFT OUTER JOIN\n" +
                  "dbo.LOCType ON dbo.Location.LOCType = dbo.LOCType.LOCTypeName where LOCID like '%"+ txtFilter.getText() +"%' or LOCName like '%"+ txtFilter.getText() +"%'";
            ResultSet rs = c.createStatement().executeQuery(sql);
            while (rs.next()){
                Vector v = new Vector();
                v.add(rs.getString("LOCID"));
                v.add(rs.getString("LOCTypeName"));
                v.add(rs.getString("LOCNbr"));
                v.add(rs.getString("LOCName"));
                v.add(rs.getString("LOCStoreTypeName"));
                v.add(rs.getString("LOCEmail"));
                model.addRow(v);
            }
            jTable1.setModel(model);
         } catch (Exception e) {
            //e.printStackTrace();
        }
    }//GEN-LAST:event_btnFindActionPerformed
    private void showdata(){
     try{
          int index = jTable1.getRowCount()-1;
            while (index > -1){
                model.removeRow(index--);
            }
            sql = "SELECT dbo.Location.LOCID, dbo.LOCType.LOCTypeName, dbo.Location.LOCNbr, dbo.Location.LOCName, dbo.LOCStoreType.LOCStoreTypeName, dbo.Location.LOCEmail\n" +
                  "FROM dbo.Location LEFT OUTER JOIN\n" +
                  "dbo.LOCStoreType ON dbo.Location.LOCStoreTypeID = dbo.LOCStoreType.LOCStoreTypeID LEFT OUTER JOIN\n" +
                  "dbo.LOCType ON dbo.Location.LOCType = dbo.LOCType.LOCTypeName";
            ResultSet rs = c.createStatement().executeQuery(sql);
            while (rs.next()){
                Vector v = new Vector();
                v.add(rs.getString("LOCID"));
                v.add(rs.getString("LOCTypeName"));
                v.add(rs.getString("LOCNbr"));
                v.add(rs.getString("LOCName"));
                v.add(rs.getString("LOCStoreTypeName"));
                v.add(rs.getString("LOCEmail"));
                model.addRow(v);
            }
            jTable1.setModel(model);
         } catch (Exception e) {
            //e.printStackTrace();
        }
    }
    private void AllClear(){
        txtLocID.setText("");
        txtNo.setText("");
        txtLocName.setText("");
        txtEmail.setText("");
         txtLocID.requestFocus();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LB_FindnameofID;
    private javax.swing.JLabel LB_LocNbr;
    private javax.swing.JLabel LB_StoreGroupName;
    private javax.swing.JLabel LB_StoreName;
    private javax.swing.JLabel LB_StoreNameType;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox cmbGroup;
    private javax.swing.JComboBox cmbTypeLoc;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFilter;
    private javax.swing.JTextField txtLocID;
    private javax.swing.JTextField txtLocName;
    private javax.swing.JTextField txtNo;
    // End of variables declaration//GEN-END:variables
}
