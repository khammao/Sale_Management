

package Form;

import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MEE
 */
public class frmDepartment extends javax.swing.JInternalFrame {
 Connection c = DB.getConnection();
    String sql;
    String sql2015;
    DefaultTableModel model = new DefaultTableModel();
    public String lb_Department1;
    
    public frmDepartment() {
        initComponents();
        model = (DefaultTableModel)jTable1.getModel();
        jTable1.getTableHeader().setFont(new java.awt.Font("Saysettha OT", java.awt.Font.BOLD, 12));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        DeptGroup = new javax.swing.JPanel();
        btnFind = new javax.swing.JButton();
        txtFilter = new javax.swing.JTextField();
        lb_Department = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        LB_DeptNameLong = new javax.swing.JLabel();
        txtNameShort = new javax.swing.JTextField();
        txtDName = new javax.swing.JTextField();
        LB_DeptName = new javax.swing.JLabel();
        txtDEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtDID = new javax.swing.JTextField();
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
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        DeptGroup.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 5), "ຂໍ້ມູນພະແນກ(Department)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Saysettha OT", 1, 12), new java.awt.Color(0, 204, 0))); // NOI18N

        btnFind.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnFind.setText("ຄົ້ນຫາ");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        txtFilter.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        lb_Department.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lb_Department.setText("ພະແນກ:");

        javax.swing.GroupLayout DeptGroupLayout = new javax.swing.GroupLayout(DeptGroup);
        DeptGroup.setLayout(DeptGroupLayout);
        DeptGroupLayout.setHorizontalGroup(
            DeptGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeptGroupLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lb_Department)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFind)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DeptGroupLayout.setVerticalGroup(
            DeptGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeptGroupLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DeptGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFind)
                    .addComponent(txtFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_Department))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 5));

        LB_DeptNameLong.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_DeptNameLong.setText("ຊື້ພະແນກ:");

        txtNameShort.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        txtDName.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        LB_DeptName.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_DeptName.setText("ຊື້ພະແນກ(ສັ້ນ):");

        txtDEmail.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel4.setText("Email:");

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        jTable1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "ລຳດັບ(Nbr#)", "ຊື່ພະແນກ(DeptNameShort)", "ຊື່ພະແນກ(DeptName)", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(1).setMinWidth(180);
            jTable1.getColumnModel().getColumn(2).setMinWidth(200);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(200);
        }

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

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

        txtDID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtDID.setEnabled(false);

        btnNew.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnNew.setText("ເພີ່ມ");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LB_DeptName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LB_DeptNameLong, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtNameShort, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDID))
                            .addComponent(txtDName, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(btnSave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEdit))
                            .addComponent(btnNew, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnNew)
                                .addGap(23, 23, 23)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnSave)
                                    .addComponent(btnEdit)
                                    .addComponent(btnDelete)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNameShort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LB_DeptName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(LB_DeptNameLong)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(14, 14, 14)))
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DeptGroup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(DeptGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
  //  public void showStockName(){
    //    try {
     //       DefaultComboBoxModel mode = new DefaultComboBoxModel();
     //       sql = "Select DPID, DName from Department order by DName";
     //       mode.removeAllElements();
      //      array_Stock_name.clear();
      //      ResultSet rs = c.createStatement().executeQuery(sql);
        //    while (rs.next()){
        //        array_Stock_name.add(rs.getString("DPID"));
       //         mode.addElement(rs.getString("DName"));                
       //     }
       //     cmbDepartment.setModel(mode);
      //  } catch (Exception e) {
      //  }
   // }

    public  void showEngbtndtpDelete(){
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
    public  void showEngbtndtpEdit(){
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
    public  void showEngbtndtpSave(){
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
    public  void showEngbtndtpNew(){
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
    public  void showEngbtnDptNameLong(){
    try {
        sql2015= "Select English from LDCLanguage where  Laos = N'"+ LB_DeptNameLong.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql2015);
        if (rs.next()){
            String a = rs.getString("English");
            LB_DeptNameLong.setText(a);
        }     
    } catch (Exception e) {
    }
}  
    public  void showEngbtnDptName(){
    try {
        sql2015= "Select English from LDCLanguage where  Laos = N'"+ LB_DeptName.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql2015);
        if (rs.next()){
            String a = rs.getString("English");
            LB_DeptName.setText(a);
        }     
    } catch (Exception e) {
    }
}  
    public  void showEngbtnDptFind(){
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
    public  void showEngDepartment(){
    try {
        sql2015= "Select English from LDCLanguage where  Laos = N'"+ lb_Department.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql2015);
        if (rs.next()){
            String a = rs.getString("English");
            lb_Department.setText(a);
        }     
    } catch (Exception e) {
    }
}  
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
       showdata();
    }//GEN-LAST:event_formInternalFrameOpened
     private void Filterdata(){
     try{
          int index = jTable1.getRowCount()-1;
            while (index > -1){
                model.removeRow(index--);
            }
            sql = "select DPID,DNameShort,DName,Dmail  from Department where DPID like '%"+ txtFilter.getText() +"%' or DNameShort like '%"+ txtFilter.getText() +"%'";
            ResultSet rs = c.createStatement().executeQuery(sql);
            while (rs.next()){
                Vector v = new Vector();
                v.add(rs.getString("DPID"));
                v.add(rs.getString("DNameShort"));
                v.add(rs.getString("DName"));                
                v.add(rs.getString("Dmail"));
                model.addRow(v);
            }
            jTable1.setModel(model);
         } catch (Exception e) {
            //e.printStackTrace();
        }
    }
    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
       Filterdata();
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            if (txtNameShort.getText().equals("")||txtDName.getText().equals("")){
                int type = JOptionPane.WARNING_MESSAGE;
                String a = "Error...your data is not enough.";
                String b = "MESSAGE";
                JOptionPane.showMessageDialog(null, a,b,type);
                return;
            }
           
            if (JOptionPane.showConfirmDialog(null, "Do you like to Save ?", "Message", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
                sql = "Insert into Department (DNameShort,DName,Dmail) values (?,?,?)";
                PreparedStatement p = c.prepareStatement(sql);
                p.setString(1, txtNameShort.getText());
                p.setString(2,txtDName.getText());
                p.setString(3, txtDEmail.getText());
                
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
           // e.printStackTrace();
             int type = JOptionPane.WARNING_MESSAGE;
                    String a = "Error...Check your data again or check your Image.";
                    String b = "MESSAGE";
                    JOptionPane.showMessageDialog(null, a,b,type);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
       try {
            if (txtNameShort.getText().equals("")||txtDName.getText().equals("")){
                int type = JOptionPane.WARNING_MESSAGE;
                String a = "Error...your data is not enough.";
                String b = "MESSAGE";
                JOptionPane.showMessageDialog(null, a,b,type);
                return;
            }    
            if (JOptionPane.showConfirmDialog(null, "Do you like to Change ?", "Message", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
                sql = "Update Department set DNameShort=?, DName=?, Dmail=? where DPID=(?)";
                PreparedStatement p = c.prepareStatement(sql);
                p.setString(1,txtNameShort.getText());
                p.setString(2, txtDName.getText());
                p.setString(3, txtDEmail.getText());
                p.setString(4, txtDID.getText());
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

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       try {
            if (evt.getClickCount()==1){
                int index = jTable1.getSelectedRow();
                String DPID = jTable1.getValueAt(index, 0).toString();
                String DNameShort = jTable1.getValueAt(index, 1).toString();
                String DName = jTable1.getValueAt(index, 2).toString();
                String Dmail = jTable1.getValueAt(index, 3).toString();
                txtDID.setText(DPID);
                txtNameShort.setText(DNameShort);
                txtDName.setText(DName);               
                txtDEmail.setText(Dmail);           
            }            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
          try {
            if (txtDID.getText().equals("")){
                int type = JOptionPane.WARNING_MESSAGE;
                String a = "Error...your data is not enough.";
                String b = "MESSAGE";
                JOptionPane.showMessageDialog(null, a,b,type);
                return;
            }    
            if (JOptionPane.showConfirmDialog(null, "Do you like to Change ?", "Message", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
                sql = "Delete from Department where DPID=(?)";
                PreparedStatement p = c.prepareStatement(sql);
                p.setString(1, txtDID.getText());
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
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
         AllClear();
    }//GEN-LAST:event_btnNewActionPerformed
    private void AllClear(){
        try {
            txtDID.setText("");
            txtNameShort.setText("");
            txtDName.setText("");
            txtDEmail.setText("");
            txtNameShort.requestFocus();
            
        } catch (Exception e) {
        }
    }
    private void showdata(){
     try{
          int index = jTable1.getRowCount()-1;
            while (index > -1){
                model.removeRow(index--);
            }
            sql = "select DPID,DNameShort,DName,Dmail  from Department";
            ResultSet rs = c.createStatement().executeQuery(sql);
            while (rs.next()){
                Vector v = new Vector();
                v.add(rs.getString("DPID"));
                v.add(rs.getString("DNameShort"));
                v.add(rs.getString("DName"));                
                v.add(rs.getString("Dmail"));
                model.addRow(v);
            }
            jTable1.setModel(model);
         } catch (Exception e) {
            //e.printStackTrace();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DeptGroup;
    private javax.swing.JLabel LB_DeptName;
    private javax.swing.JLabel LB_DeptNameLong;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lb_Department;
    private javax.swing.JTextField txtDEmail;
    private javax.swing.JTextField txtDID;
    private javax.swing.JTextField txtDName;
    private javax.swing.JTextField txtFilter;
    private javax.swing.JTextField txtNameShort;
    // End of variables declaration//GEN-END:variables
}
