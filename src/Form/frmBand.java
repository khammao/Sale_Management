

package Form;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmBand extends javax.swing.JInternalFrame {
    Connection c=DB.getConnection();
    DefaultTableModel model =new DefaultTableModel();
    String sql;
    public frmBand() {
        initComponents();
        model = (DefaultTableModel)jTable1.getModel();
        jTable1.getTableHeader().setFont(new java.awt.Font("Saysettha OT", java.awt.Font.BOLD, 12));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        LB_BandFind = new javax.swing.JLabel();
        txtFindNameID = new javax.swing.JTextField();
        btnOKFind = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        LB_BandID = new javax.swing.JLabel();
        txtBrandsID = new javax.swing.JTextField();
        txtBandNameInput = new javax.swing.JTextField();
        LB_BandName = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        LB_DataBand = new javax.swing.JLabel();

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

        LB_BandFind.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_BandFind.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        LB_BandFind.setText("ຄົ້ນຫາ");

        txtFindNameID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        btnOKFind.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnOKFind.setText("ຕົກລົງ");
        btnOKFind.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(LB_BandFind, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtFindNameID, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOKFind)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB_BandFind)
                    .addComponent(txtFindNameID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOKFind))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 2, true));

        LB_BandID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_BandID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_BandID.setText("ລຳດັບ:");

        txtBrandsID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtBrandsID.setText("Auto");
        txtBrandsID.setEnabled(false);

        txtBandNameInput.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        LB_BandName.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_BandName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_BandName.setText("ຍີ່ຫໍ້:");

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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "ລຳດັບ(ID)", "ຍີ່ຫໍ້(Band)"
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(100);
            jTable1.getColumnModel().getColumn(1).setMinWidth(300);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LB_BandID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LB_BandName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBrandsID, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBandNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB_BandID)
                    .addComponent(txtBrandsID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB_BandName)
                    .addComponent(txtBandNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnSave)
                    .addComponent(btnEdit)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LB_DataBand.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_DataBand.setText("ຂໍ້ມູນຍີ່ຫໍ້");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(LB_DataBand, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LB_DataBand)
                .addGap(4, 4, 4)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        AllClear();
    }//GEN-LAST:event_btnAddActionPerformed
    private void showdata(){
     try{
          int index = jTable1.getRowCount()-1;
            while (index > -1){
                model.removeRow(index--);
            }
            sql = "select BrandID,BrandName  from IV_Brands";
            ResultSet rs = c.createStatement().executeQuery(sql);
            while (rs.next()){
                Vector v = new Vector();
                v.add(rs.getString("BrandID"));
                v.add(rs.getString("BrandName"));
                model.addRow(v);
            }
            jTable1.setModel(model);
         } catch (Exception e) {
            //e.printStackTrace();
        }
    }
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
       try {
            if (txtBandNameInput.getText().equals("")){
                int type = JOptionPane.WARNING_MESSAGE;
                String a = "Error...Please Enter Brand.";
                String b = "MESSAGE";
                JOptionPane.showMessageDialog(null, a,b,type);
                return;
            }
           if (txtBrandsID.getText().equals("Auto")){
             if (JOptionPane.showConfirmDialog(null, "Do you like to Save ?", "Message", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
                sql = "Insert into IV_Brands (BrandName) values (?)";
                PreparedStatement p = c.prepareStatement(sql);
                p.setString(1, txtBandNameInput.getText());    
                if (p.executeUpdate()!=-1){
                    int type = JOptionPane.OK_OPTION;
                    String a = "Finished.";
                    String b = "MESSAGE";
                    JOptionPane.showMessageDialog(null, a,b,type);
                    AllClear();
                    showdata();
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
    }//GEN-LAST:event_btnSaveActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        showdata();
    }//GEN-LAST:event_formInternalFrameOpened

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
         try {
            if (evt.getClickCount()==1){
                int index = jTable1.getSelectedRow();
                String GID = jTable1.getValueAt(index, 0).toString();
                String GName = jTable1.getValueAt(index, 1).toString();
                txtBrandsID.setText(GID);               
                txtBandNameInput.setText(GName);           
            }            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try {
            if (txtBrandsID.getText().equals("")){
                int type = JOptionPane.WARNING_MESSAGE;
                String a = "Error...your data is not enough.";
                String b = "MESSAGE";
                JOptionPane.showMessageDialog(null, a,b,type);
                return;
            }    
            if (JOptionPane.showConfirmDialog(null, "Do you like to Change ?", "Message", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
                sql = "Update IV_Brands set BrandName=? where BrandID=(?)";
                PreparedStatement p = c.prepareStatement(sql);
                p.setString(1,txtBandNameInput.getText());
                p.setString(2, txtBrandsID.getText());
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
            if (txtBrandsID.getText().equals("")){
                int type = JOptionPane.WARNING_MESSAGE;
                String a = "Error...your data is not enough.";
                String b = "MESSAGE";
                JOptionPane.showMessageDialog(null, a,b,type);
                return;
            }    
            if (JOptionPane.showConfirmDialog(null, "Do you like to Change ?", "Message", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
                sql = "Delete from IV_Brands where BrandID=(?)";
                PreparedStatement p = c.prepareStatement(sql);
                p.setString(1, txtBrandsID.getText());
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
    public void AllClear(){
        try {
            txtBrandsID.setText("Auto");
            txtBandNameInput.setText("");
            txtBandNameInput.requestFocus(); 
        } catch (Exception e) {
        }
    }
    public void ChangeLTEbtnBrandDelete(){
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
    public void ChangeLTEbtnBrandEdit(){
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
    public void ChangeLTEbtnBrandSave(){
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
    public void ChangeLTEbtnBrandAdd(){
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
    public void ChangeLTELBBrandName(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ LB_BandName.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            LB_BandName.setText(a);
        }     
    } catch (Exception e) {
    }
 }
    public void ChangeLTELBBrandID(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ LB_BandID.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            LB_BandID.setText(a);
        }     
    } catch (Exception e) {
    }
 }
    public void ChangeLTEbtnFindBandOk(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ btnOKFind.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            btnOKFind.setText(a);
        }     
    } catch (Exception e) {
    }
 }
    public void ChangeLTELBBrandFind(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ LB_BandFind.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            LB_BandFind.setText(a);
        }     
    } catch (Exception e) {
    }
 }
    public void ChangeLTELBDataBand(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ LB_DataBand.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            LB_DataBand.setText(a);
        }     
    } catch (Exception e) {
    }
 }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LB_BandFind;
    private javax.swing.JLabel LB_BandID;
    private javax.swing.JLabel LB_BandName;
    private javax.swing.JLabel LB_DataBand;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnOKFind;
    private javax.swing.JButton btnSave;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtBandNameInput;
    private javax.swing.JTextField txtBrandsID;
    private javax.swing.JTextField txtFindNameID;
    // End of variables declaration//GEN-END:variables
}
