/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Form;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MEE
 */
public class frmLocStoreType extends javax.swing.JInternalFrame {
    Connection c=DB.getConnection();
    String sql;
    String sql2015;
    DefaultTableModel model = new DefaultTableModel();
    public frmLocStoreType() {
        initComponents();
        model = (DefaultTableModel)jTable1.getModel();
        jTable1.getTableHeader().setFont(new java.awt.Font("Saysettha OT", java.awt.Font.BOLD, 12));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        LB_FindLocType = new javax.swing.JLabel();
        btnFilter = new javax.swing.JButton();
        txtFilter = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        txtTID = new javax.swing.JTextField();
        LB_StoreTypeName = new javax.swing.JLabel();
        txtTName = new javax.swing.JTextField();
        LB_LocTyepID = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();

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

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 5), "ຂໍ້ມູນປະເພດສາຂາ(Store Type)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Saysettha OT", 1, 12), new java.awt.Color(0, 204, 0))); // NOI18N

        LB_FindLocType.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_FindLocType.setText("ລະຫັດ/ຊື່ປະເພດ:");

        btnFilter.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnFilter.setText("ຄົ້ນຫາ");
        btnFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterActionPerformed(evt);
            }
        });

        txtFilter.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(LB_FindLocType)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFilter)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFilter)
                    .addComponent(LB_FindLocType)
                    .addComponent(txtFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 4, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 5));

        txtTID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtTID.setEnabled(false);

        LB_StoreTypeName.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_StoreTypeName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_StoreTypeName.setText("ປະເພດສາຂາ:");

        txtTName.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        LB_LocTyepID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_LocTyepID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_LocTyepID.setText("ລຳດັບ:");

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        jTable1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "ລຳດັບ(ID)", "ປະເພດສາຊາ(Store Name)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
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
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(1).setMinWidth(300);
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

        btnNew.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnNew.setText("ເພີ່ມ");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnEdit)
                    .addComponent(btnSave)
                    .addComponent(btnNew)))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LB_LocTyepID, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LB_StoreTypeName, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTName, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTID, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LB_LocTyepID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LB_StoreTypeName))
                .addGap(12, 12, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 7, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
   public  void showEngbtnLocTypeDelete(){
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
    public  void showEngbtnLocTypeEdit(){
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
    public  void showEngbtnLocTypeSave(){
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
    public  void showEngbtnLocTypeNew(){
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
    public  void showEngLBLocTypeName(){
    try {
        sql2015= "Select English from LDCLanguage where  Laos = N'"+ LB_StoreTypeName.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql2015);
        if (rs.next()){
            String a = rs.getString("English");
            LB_StoreTypeName.setText(a);
        }     
    } catch (Exception e) {
    }
}  
    public  void showEngLBLocTypeID(){
    try {
        sql2015= "Select English from LDCLanguage where  Laos = N'"+ LB_LocTyepID.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql2015);
        if (rs.next()){
            String a = rs.getString("English");
            LB_LocTyepID.setText(a);
        }     
    } catch (Exception e) {
    }
}  
    public  void showEngbtnFilterLocType(){
    try {
        sql2015= "Select English from LDCLanguage where  Laos = N'"+ btnFilter.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql2015);
        if (rs.next()){
            String a = rs.getString("English");
            btnFilter.setText(a);
        }     
    } catch (Exception e) {
    }
}  
    public  void showEngLBFindLocType(){
    try {
        sql2015= "Select English from LDCLanguage where  Laos = N'"+ LB_FindLocType.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql2015);
        if (rs.next()){
            String a = rs.getString("English");
            LB_FindLocType.setText(a);
        }     
    } catch (Exception e) {
    }
}  
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        showData();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
       AllClear();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
         try {
            if (txtTName.getText().equals("")){
                int type = JOptionPane.WARNING_MESSAGE;
                String a = "Error...Please Check your data.";
                String b = "MESSAGE";
                JOptionPane.showMessageDialog(null, a,b,type);
                return;
            }
           
            if (JOptionPane.showConfirmDialog(null, "Do you like to Save ?", "Message", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
                sql = "Insert into LOCStoreType(LOCStoreTypeName) values (?)";
                PreparedStatement p = c.prepareStatement(sql);
                p.setString(1, txtTName.getText());    
                if (p.executeUpdate()!=-1){
                    int type = JOptionPane.OK_OPTION;
                    String a = "Finished.";
                    String b = "MESSAGE";
                    JOptionPane.showMessageDialog(null, a,b,type);
                    AllClear();
                    showData();
                }                
            }
            
        } catch (Exception e) {
           // e.printStackTrace();
             int type = JOptionPane.WARNING_MESSAGE;
                    String a = "Error...Check your data again or check your Image.";
                    String b = "MESSAGE";
                    JOptionPane.showMessageDialog(null, a,b,type);
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
         try {
            if (txtTID.getText().equals("")){
                int type = JOptionPane.WARNING_MESSAGE;
                String a = "Error...your data is not enough.";
                String b = "MESSAGE";
                JOptionPane.showMessageDialog(null, a,b,type);
                return;
            }    
            if (JOptionPane.showConfirmDialog(null, "Do you like to Change ?", "Message", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
                sql = "Update LOCStoreType set LOCStoreTypeName=? where LOCStoreTypeID=(?)";
                PreparedStatement p = c.prepareStatement(sql);
                p.setString(1,txtTName.getText());
                p.setString(2, txtTID.getText());
                if (p.executeUpdate()!=-1){
                    int type = JOptionPane.OK_OPTION;
                    String a = "Changed.";
                    String b = "MESSAGE";
                    JOptionPane.showMessageDialog(null, a,b,type);
                   AllClear();
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
    }//GEN-LAST:event_btnEditActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            if (evt.getClickCount()==1){
                int index = jTable1.getSelectedRow();
                String GID = jTable1.getValueAt(index, 0).toString();
                String GName = jTable1.getValueAt(index, 1).toString();
                txtTID.setText(GID);               
                txtTName.setText(GName);           
            }            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            if (txtTID.getText().equals("")){
                int type = JOptionPane.WARNING_MESSAGE;
                String a = "Error...your data is not enough.";
                String b = "MESSAGE";
                JOptionPane.showMessageDialog(null, a,b,type);
                return;
            }    
            if (JOptionPane.showConfirmDialog(null, "Do you like to Delete ?", "Message", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
                sql = "Delete from LOCStoreType where LOCStoreTypeID=(?)";
                PreparedStatement p = c.prepareStatement(sql);
                p.setString(1, txtTID.getText());
                if (p.executeUpdate()!=-1){
                    int type = JOptionPane.OK_OPTION;
                    String a = "Deleted.";
                    String b = "MESSAGE";
                    JOptionPane.showMessageDialog(null, a,b,type);
                   AllClear();
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

    private void btnFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterActionPerformed
        Filters();
    }//GEN-LAST:event_btnFilterActionPerformed
    private void Filters(){
      try{
          int index = jTable1.getRowCount()-1;
            while (index > -1){
                model.removeRow(index--);
            }
            sql = "select * from LOCStoreType where LOCStoreTypeID like '%"+ txtFilter.getText() +"%' or LOCStoreTypeName like '%"+ txtFilter.getText() +"%'";
            ResultSet rs = c.createStatement().executeQuery(sql);
            while (rs.next()){
                Vector v = new Vector();
                v.add(rs.getString("LOCStoreTypeID"));
                v.add(rs.getString("LOCStoreTypeName"));
                model.addRow(v);
            }
            jTable1.setModel(model);
         } catch (Exception e) {
            //e.printStackTrace();
        }  
    }
    private void showData(){
        try{
          int index = jTable1.getRowCount()-1;
            while (index > -1){
                model.removeRow(index--);
            }
            sql = "select LOCStoreTypeID,LOCStoreTypeName  from LOCStoreType";
            ResultSet rs = c.createStatement().executeQuery(sql);
            while (rs.next()){
                Vector v = new Vector();
                v.add(rs.getString("LOCStoreTypeID"));
                v.add(rs.getString("LOCStoreTypeName"));
                model.addRow(v);
            }
            jTable1.setModel(model);
         } catch (Exception e) {
            //e.printStackTrace();
        }
    }
    private void AllClear(){
        txtTID.setText("");
        txtTName.setText("");
        txtTName.requestFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LB_FindLocType;
    private javax.swing.JLabel LB_LocTyepID;
    private javax.swing.JLabel LB_StoreTypeName;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnFilter;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtFilter;
    private javax.swing.JTextField txtTID;
    private javax.swing.JTextField txtTName;
    // End of variables declaration//GEN-END:variables
}
