

package Form;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class frmProductGroup extends javax.swing.JInternalFrame {
    Connection c=DB.getConnection();
    String sql;
    String load;
    String add;
    DefaultTableModel model =new DefaultTableModel();
    public frmProductGroup() {
        initComponents();
        model=(DefaultTableModel)jTable1.getModel();
        jTable1.getTableHeader().setFont(new java.awt.Font("Saysettha OT", java.awt.Font.BOLD, 14));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        LB_FindG = new javax.swing.JLabel();
        txtFindG = new javax.swing.JTextField();
        btnFindGroup = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtGroupID = new javax.swing.JTextField();
        LB_GroupID = new javax.swing.JLabel();
        LB_ProductGourpName = new javax.swing.JLabel();
        txtProductGroupName = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        LB_ProductGroup = new javax.swing.JLabel();

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

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 2, true));

        LB_FindG.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_FindG.setText("ຄົ້ນຫາ");

        txtFindG.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        btnFindGroup.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnFindGroup.setText("ຕົກລົງ");
        btnFindGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindGroupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(LB_FindG, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFindG, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFindGroup)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB_FindG)
                    .addComponent(txtFindG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFindGroup))
                .addContainerGap())
        );

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 2, true));

        txtGroupID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtGroupID.setEnabled(false);
        txtGroupID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGroupIDActionPerformed(evt);
            }
        });

        LB_GroupID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_GroupID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_GroupID.setText("ລຳດັບ:");

        LB_ProductGourpName.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_ProductGourpName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_ProductGourpName.setText("ຊື່ກຸ່ມ:");

        txtProductGroupName.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        btnAdd.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnAdd.setText("ເພີ່ມ");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

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

        jTable1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "ID", "Group Name"
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
            jTable1.getColumnModel().getColumn(0).setMinWidth(100);
            jTable1.getColumnModel().getColumn(1).setMinWidth(230);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LB_ProductGourpName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LB_GroupID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete))
                    .addComponent(txtProductGroupName, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGroupID, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB_GroupID)
                    .addComponent(txtGroupID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB_ProductGourpName)
                    .addComponent(txtProductGroupName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnSave)
                    .addComponent(btnEdit)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LB_ProductGroup.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        LB_ProductGroup.setText("ກຸ່ມຂອງສິນຄ້າ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(LB_ProductGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LB_ProductGroup)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtGroupIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGroupIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGroupIDActionPerformed
    public void Filterdata(){
        try {
            int index=jTable1.getRowCount()-1;
            while (index > -1){
                model.removeRow(index--);
            }
            load="Select GroupID,GroupName from IV_AssetGroup where GroupID like '%"+ txtFindG.getText()+"%' or GroupName like '%"+ txtFindG.getText()+"%'";
            ResultSet rs=c.createStatement().executeQuery(load);
           while (rs.next()){
               Vector v = new Vector();
                v.add(rs.getString("GroupID"));
                v.add(rs.getString("GroupName"));
                model.addRow(v);
            }
        } catch (Exception e) {
        }
    }
    public void LoadData(){
        try {
            int index=jTable1.getRowCount()-1;
            while (index > -1){
                model.removeRow(index--);
            }
            load="Select GroupID,GroupName from IV_AssetGroup";
            ResultSet rs=c.createStatement().executeQuery(load);
           while (rs.next()){
               Vector v = new Vector();
                v.add(rs.getString("GroupID"));
                v.add(rs.getString("GroupName"));
                model.addRow(v);
            }
        } catch (Exception e) {
        }
    }
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
       LoadData();
    }//GEN-LAST:event_formInternalFrameOpened

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            if (evt.getClickCount()==1){
                int index = jTable1.getSelectedRow();
                String ID = jTable1.getValueAt(index, 0).toString();
                String Name = jTable1.getValueAt(index, 1).toString();
                txtGroupID.setText(ID);
                txtProductGroupName.setText(Name);   
            }            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jTable1MouseClicked
    public void AllClear(){
        txtGroupID.setText("");
        txtProductGroupName.setText("");
        txtProductGroupName.requestFocus();
    }
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            AllClear();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            if((txtProductGroupName.getText().equals(""))){
                int type=JOptionPane.WARNING_MESSAGE;
                String a = "Error...your data is not enough.";
                String b = "MESSAGE";
                JOptionPane.showMessageDialog(null, a,b,type);
                return;
            }
            if(JOptionPane.showConfirmDialog(null, "Do you like to Save ?", "Message", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
                add="Insert into IV_AssetGroup (GroupName) values(?)";
                PreparedStatement p= c.prepareStatement(add);
                p.setString(1, txtProductGroupName.getText());
                if (p.executeUpdate()!=-1){
                    int type = JOptionPane.OK_OPTION;
                    String a = "Finished.";
                    String b = "MESSAGE";
                    JOptionPane.showMessageDialog(null, a,b,type);
                    AllClear();
                    LoadData();
                }                
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
       try {
            if (txtGroupID.getText().equals("")||txtProductGroupName.getText().equals("")){
                int type = JOptionPane.WARNING_MESSAGE;
                String a = "Error...your data is not enough.";
                String b = "MESSAGE";
                JOptionPane.showMessageDialog(null, a,b,type);
                return;
            }    
            if (JOptionPane.showConfirmDialog(null, "Do you like to Change ?", "Message", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
                sql = "Update IV_AssetGroup set GroupName=? where GroupID=(?)";
                PreparedStatement p = c.prepareStatement(sql);
                p.setString(1,txtProductGroupName.getText());
                p.setString(2, txtGroupID.getText());
                if (p.executeUpdate()!=-1){
                    int type = JOptionPane.OK_OPTION;
                    String a = "Changed.";
                    String b = "MESSAGE";
                    JOptionPane.showMessageDialog(null, a,b,type);
                   AllClear();
                    LoadData();           
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
            if (txtGroupID.getText().equals("")){
                int type = JOptionPane.WARNING_MESSAGE;
                String a = "Error...your data is not enough.";
                String b = "MESSAGE";
                JOptionPane.showMessageDialog(null, a,b,type);
                return;
            }    
            if (JOptionPane.showConfirmDialog(null, "Do you like to Change ?", "Message", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
                sql = "Delete from IV_AssetGroup where GroupID=(?)";
                PreparedStatement p = c.prepareStatement(sql);
                p.setString(1, txtGroupID.getText());
                if (p.executeUpdate()!=-1){
                    int type = JOptionPane.OK_OPTION;
                    String a = "Changed.";
                    String b = "MESSAGE";
                    JOptionPane.showMessageDialog(null, a,b,type);
                    AllClear();
                    LoadData();
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

    private void btnFindGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindGroupActionPerformed
        Filterdata();
    }//GEN-LAST:event_btnFindGroupActionPerformed
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
    public void ChangeLTEbtnSave(){
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
    public void ChangeLTEbtnAdd(){
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
    public void ChangeLTELBGname(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ LB_ProductGourpName.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            LB_ProductGourpName.setText(a);
        }     
    } catch (Exception e) {
    }
 }
    public void ChangeLTELBGID(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ LB_GroupID.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            LB_GroupID.setText(a);
        }     
    } catch (Exception e) {
    }
 }
    public void ChangeLTEbtnFindG(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ btnFindGroup.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            btnFindGroup.setText(a);
        }     
    } catch (Exception e) {
    }
 }
    public void ChangeLTELBFind(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ LB_FindG.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            LB_FindG.setText(a);
        }     
    } catch (Exception e) {
    }
 }
    public void ChangeLTELBProductGroup(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ LB_ProductGroup.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            LB_ProductGroup.setText(a);
        }     
    } catch (Exception e) {
    }
 }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LB_FindG;
    private javax.swing.JLabel LB_GroupID;
    private javax.swing.JLabel LB_ProductGourpName;
    private javax.swing.JLabel LB_ProductGroup;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnFindGroup;
    private javax.swing.JButton btnSave;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtFindG;
    private javax.swing.JTextField txtGroupID;
    private javax.swing.JTextField txtProductGroupName;
    // End of variables declaration//GEN-END:variables
}
