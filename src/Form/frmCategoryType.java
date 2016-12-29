

package Form;

import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MEE
 */
public class frmCategoryType extends javax.swing.JInternalFrame {
    Connection c=DB.getConnection();
    DefaultTableModel model = new DefaultTableModel();
    String sql;
    ArrayList cat =new ArrayList();
    public frmCategoryType() {
        initComponents();
        model = (DefaultTableModel)jTable1.getModel();
        jTable1.getTableHeader().setFont(new java.awt.Font("Saysettha OT", java.awt.Font.BOLD, 12));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        LB_FindCategoryName = new javax.swing.JLabel();
        btnFind = new javax.swing.JButton();
        txtFindCat = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        txtCatID = new javax.swing.JTextField();
        LB_CategoryName = new javax.swing.JLabel();
        txtCatName = new javax.swing.JTextField();
        LB_CatID = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        LB_CategoryName1 = new javax.swing.JLabel();
        cmbGroup = new javax.swing.JComboBox();
        LB_DataOfCategoryType = new javax.swing.JLabel();

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

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255), 2));

        LB_FindCategoryName.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_FindCategoryName.setText("ປະເພດສິນຄ້າ:");

        btnFind.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnFind.setText("ຄົ້ນຫາ");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        txtFindCat.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(LB_FindCategoryName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFindCat, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnFind)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB_FindCategoryName)
                    .addComponent(btnFind)
                    .addComponent(txtFindCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255), 2));

        txtCatID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtCatID.setEnabled(false);

        LB_CategoryName.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_CategoryName.setText("ປະເພດສິນຄ້າ:");

        txtCatName.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        LB_CatID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_CatID.setText("ລຳດັບ:");

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        jTable1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "ລຳດົບ(Nbr#)", "ປະເພດບັນຫາ(Category Name)", "ກຸ່ມສິນຄ້າ(Group)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.setRowHeight(30);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(80);
            jTable1.getColumnModel().getColumn(1).setMinWidth(200);
            jTable1.getColumnModel().getColumn(2).setMinWidth(100);
        }

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        btnDelete.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnDelete.setText("ລົບອອກ");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnEdit.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnEdit.setText("ແກ້ໄຂ");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnSave.setText("ບັນທຶກ");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnAdd.setText("ເພີ່ມ");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(btnAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnEdit)
                    .addComponent(btnSave)
                    .addComponent(btnAdd)))
        );

        LB_CategoryName1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_CategoryName1.setText("ກຸ່ມສິນຄ້າ:");

        cmbGroup.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LB_CategoryName1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LB_CategoryName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LB_CatID, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCatID, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCatName, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCatID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LB_CatID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCatName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LB_CategoryName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB_CategoryName1)
                    .addComponent(cmbGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LB_DataOfCategoryType.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_DataOfCategoryType.setText("ຂໍ້ມູນປະເພດບັນຫາຂອງອຸປະກອນໄອທີ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LB_DataOfCategoryType, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LB_DataOfCategoryType)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            if (txtCatName.getText().equals("")){
                int type = JOptionPane.WARNING_MESSAGE;
                String a = "Error...Please Check your data again.";
                String b = "MESSAGE";
                JOptionPane.showMessageDialog(null, a,b,type);
                return;
            }
           
            int Cat1 =cmbGroup.getSelectedIndex();
            if (JOptionPane.showConfirmDialog(null, "Do you like to Save ?", "Message", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
                sql = "Insert into CATType(CDesc,GroupID)values(?,?)";
                PreparedStatement p = c.prepareStatement(sql);
                p.setString(1, txtCatName.getText());
                p.setString(2, cat.get(Cat1).toString());
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
    public void ChangeLTEbtnAddCat(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ btnAdd.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            btnAdd.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void ChangeLTEbtnDeletecate(){
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
    public void ChangeLTEbtnEditcate(){
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
    public void ChangeLTEbtnSaveCat(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ btnSave.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            btnSave.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void ChangeLTELBCateName(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ LB_CategoryName.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            LB_CategoryName.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void ChangeLTELBCatID(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ LB_CatID.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            LB_CatID.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void ChangeLTEbtnFind(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ btnFind.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            btnFind.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void ChangeLTELBCateFindName(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ LB_FindCategoryName.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            LB_FindCategoryName.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void ChangeLTELBDataOfCat(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ LB_DataOfCategoryType.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            LB_DataOfCategoryType.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        try {
            showdata();
            ShowGroup();
        } catch (Exception e) {
        }
        
        
    }//GEN-LAST:event_formInternalFrameOpened
    private void ShowGroup(){
        try {
            DefaultComboBoxModel mode = new DefaultComboBoxModel();
            sql = "Select GroupID, GroupName from IV_AssetGroup";
            mode.removeAllElements();
            cat.clear();
            ResultSet rs = c.createStatement().executeQuery(sql);
            while (rs.next()){
               cat.add(rs.getString("GroupID"));
                mode.addElement(rs.getString("GroupName"));                
            }
            cmbGroup.setModel(mode);
        } catch (Exception e) {
       }
    }
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            AllClear();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
       try {
            if (txtCatName.getText().equals("")){
                int type = JOptionPane.WARNING_MESSAGE;
                String a = "Error...Please Check your data again.";
                String b = "MESSAGE";
                JOptionPane.showMessageDialog(null, a,b,type);
                return;
            }
           
            int Cat1 =cmbGroup.getSelectedIndex();
            if (JOptionPane.showConfirmDialog(null, "Do you like to Edit ?", "Message", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
                sql = "Update CATType set CDesc=?,GroupID=? where CATID=(?)";
                PreparedStatement p = c.prepareStatement(sql);
                p.setString(1, txtCatName.getText());
                p.setString(2, cat.get(Cat1).toString());
                p.setString(3,txtCatID.getText());
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
    }//GEN-LAST:event_btnEditActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            if (evt.getClickCount()==1){
                int index = jTable1.getSelectedRow();
                String ID = jTable1.getValueAt(index, 0).toString();
                String Name = jTable1.getValueAt(index, 1).toString();
                String Group = jTable1.getValueAt(index, 2).toString();
                txtCatID.setText(ID);
                txtCatName.setText(Name);
                cmbGroup.setSelectedItem(Group); 
            }            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            if (txtCatID.getText().equals("")){
                int type = JOptionPane.WARNING_MESSAGE;
                String a = "Error...your data is not enough.";
                String b = "MESSAGE";
                JOptionPane.showMessageDialog(null, a,b,type);
                return;
            }
            if (JOptionPane.showConfirmDialog(null, "Do you like to Delete ?", "Message", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
                sql = "Delete from CATType where CATID=(?)";
                PreparedStatement p = c.prepareStatement(sql);
                p.setString(1, txtCatID.getText());
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
        try {
            Filterdata();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnFindActionPerformed
    public void AllClear(){
        try {
            txtCatID.setText("");
            txtCatName.setText("");
            txtCatName.requestFocus();
        } catch (Exception e) {
        }
    }
    private void showdata(){
     try{
          int index = jTable1.getRowCount()-1;
            while (index > -1){
                model.removeRow(index--);
            }
            sql = "SELECT dbo.CATType.CATID, dbo.CATType.CDesc, dbo.IV_AssetGroup.GroupName\n" +
                  "FROM dbo.CATType INNER JOIN\n" +
                  "dbo.IV_AssetGroup ON dbo.CATType.GroupID = dbo.IV_AssetGroup.GroupID";
            ResultSet rs = c.createStatement().executeQuery(sql);
            while (rs.next()){
                Vector v = new Vector();
                v.add(rs.getString("CATID"));
                v.add(rs.getString("CDesc"));
                v.add(rs.getString("GroupName"));
                model.addRow(v);
            }
            jTable1.setModel(model);
         } catch (Exception e) {
            //e.printStackTrace();
        }
    }
    private void Filterdata(){
     try{
          int index = jTable1.getRowCount()-1;
            while (index > -1){
                model.removeRow(index--);
            }
            sql = "SELECT dbo.CATType.CATID, dbo.CATType.CDesc, dbo.IV_AssetGroup.GroupName\n" +
                  "FROM dbo.CATType INNER JOIN\n" +
                  "dbo.IV_AssetGroup ON dbo.CATType.GroupID = dbo.IV_AssetGroup.GroupID\n" +
                  "where dbo.CATType.CATID like '%"+ txtFindCat.getText()+"%' or dbo.CATType.CDesc like '%"+ txtFindCat.getText()+"%'";
            ResultSet rs = c.createStatement().executeQuery(sql);
            while (rs.next()){
                Vector v = new Vector();
                v.add(rs.getString("CATID"));
                v.add(rs.getString("CDesc"));
                v.add(rs.getString("GroupName"));
                model.addRow(v);
            }
            jTable1.setModel(model);
         } catch (Exception e) {
            //e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LB_CatID;
    private javax.swing.JLabel LB_CategoryName;
    private javax.swing.JLabel LB_CategoryName1;
    private javax.swing.JLabel LB_DataOfCategoryType;
    private javax.swing.JLabel LB_FindCategoryName;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox cmbGroup;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCatID;
    private javax.swing.JTextField txtCatName;
    private javax.swing.JTextField txtFindCat;
    // End of variables declaration//GEN-END:variables
}
