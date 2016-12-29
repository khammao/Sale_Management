

package Form;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmOperatingSystem extends javax.swing.JInternalFrame {
    Connection c=DB.getConnection();
    String sql;
    DefaultTableModel model=new DefaultTableModel();
    public frmOperatingSystem() {
        initComponents();
        model = (DefaultTableModel)jTable1.getModel();
        jTable1.getTableHeader().setFont(new java.awt.Font("Saysettha OT", java.awt.Font.BOLD, 14));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        LB_FindNameID = new javax.swing.JLabel();
        TextOSfindname = new javax.swing.JTextField();
        btnOKFind = new javax.swing.JButton();
        LB_DataOS = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        LB_OSID = new javax.swing.JLabel();
        TextOSID = new javax.swing.JTextField();
        LB_OSName = new javax.swing.JLabel();
        TextOSName = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

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

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 2, true));

        LB_FindNameID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_FindNameID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_FindNameID.setText("ຄົ້ນຫາ");

        TextOSfindname.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        btnOKFind.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnOKFind.setText("ຕົກລົງ");
        btnOKFind.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOKFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKFindActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(LB_FindNameID, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(TextOSfindname, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOKFind)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB_FindNameID)
                    .addComponent(TextOSfindname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOKFind))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LB_DataOS.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_DataOS.setText("ຂໍ້ມູນລະບົບປະຕິບັດການ");

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 2, true));

        LB_OSID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_OSID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_OSID.setText("ລຳດັບ:");

        TextOSID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        TextOSID.setEnabled(false);

        LB_OSName.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_OSName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_OSName.setText("ລະບົບປະຕິບັດການ:");

        TextOSName.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

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

        btnAdd.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnAdd.setText("ເພີ່ມ");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "ລຳດັບ(ID)", "ລະບົບປະຕິບັດການ(Operating System)"
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
            jTable1.getColumnModel().getColumn(0).setMinWidth(100);
            jTable1.getColumnModel().getColumn(1).setMinWidth(300);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(btnAdd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDelete))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LB_OSID)
                                    .addComponent(LB_OSName, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextOSID, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextOSName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 39, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB_OSID)
                    .addComponent(TextOSID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB_OSName)
                    .addComponent(TextOSName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnEdit)
                    .addComponent(btnDelete)
                    .addComponent(btnAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(LB_DataOS, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LB_DataOS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
     AllClear();
    }//GEN-LAST:event_btnAddActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
       LoadDdata();
    }//GEN-LAST:event_formInternalFrameOpened

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            if(evt.getClickCount()==1){
                int index=jTable1.getSelectedRow();
                String id=jTable1.getValueAt(index, 0).toString();
                String name=jTable1.getValueAt(index, 1).toString();
                TextOSID.setText(id);
                TextOSName.setText(name);
                
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            if(TextOSName.getText().equals("")){
                int type=JOptionPane.WARNING_MESSAGE;
                String a="Error...your data is not enough.";
                String b="MESSAGE";
                JOptionPane.showMessageDialog(null, a,b,type);
                return;
            }
            if(JOptionPane.showConfirmDialog(null, "Do you like to Save ?", "Message",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
                sql="Insert into IV_OperatingSystem(OSName) values(?)";
                PreparedStatement p=c.prepareStatement(sql);
                p.setString(1, TextOSName.getText());
                if(p.executeUpdate() !=-1){
                    int type=JOptionPane.OK_OPTION;
                    String a="Finished";
                    String b="MESSAGE";
                    JOptionPane.showMessageDialog(null, a,b,type);
                    AllClear();
                    LoadDdata();
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try {
            if((TextOSID.getText().equals(""))||(TextOSName.equals(""))){
                int type=JOptionPane.WARNING_MESSAGE;
                String a="Error...your data is not enough.";
                String b="MESSAGE";
                JOptionPane.showMessageDialog(null, a,b,type);
                return;
            }
            if(JOptionPane.showConfirmDialog(null,"Do you like to Edit ?","Message",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
                sql="Update IV_OperatingSystem set OSName=? where OSID=(?)";
                PreparedStatement p=c.prepareStatement(sql);
                p.setString(1, TextOSName.getText());
                p.setString(2, TextOSID.getText());
                if(p.executeUpdate()!=-1){
                    int type=JOptionPane.OK_OPTION;
                    String a="Finished";
                    String b="Message";
                    JOptionPane.showMessageDialog(null, a,b,type);
                    AllClear();
                    LoadDdata();
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            if(TextOSID.getText().equals("")){
                int type=JOptionPane.WARNING_MESSAGE;
                String a="Erro...Please Select Data";
                String b="Message";
                JOptionPane.showMessageDialog(null,a,b,type);
                return;
            }
            if(JOptionPane.showConfirmDialog(null,"Do you like to Delete","Message",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
                sql="Delete from IV_OperatingSystem where OSID=(?)";
                PreparedStatement p=c.prepareStatement(sql);
                p.setString(1, TextOSID.getText());
                if(p.executeUpdate()!=-1){
                    int type=JOptionPane.OK_OPTION;
                    String a="Finished";
                    String b="Message";
                    JOptionPane.showMessageDialog(null,a,b,type);
                    AllClear();
                    LoadDdata();
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnOKFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKFindActionPerformed
        try {
            Filters();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnOKFindActionPerformed
    public void AllClear(){
        try {
            TextOSID.setText("");
            TextOSName.setText("");
            TextOSName.requestFocus();
        } catch (Exception e) {
        }
    }
    public void LoadDdata(){
        try {
            int index =jTable1.getRowCount()-1;
            while(index>-1){
                model.removeRow(index--);
            }
            sql="Select OSID,OSName from IV_OperatingSystem";
            ResultSet rs=c.createStatement().executeQuery(sql);
            while(rs.next()){
               Vector v=new Vector();
               v.add(rs.getString("OSID"));
               v.add(rs.getString("OSName"));
                model.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void Filters(){
        try {
            int index =jTable1.getRowCount()-1;
            while(index>-1){
                model.removeRow(index--);
            }
            sql="Select OSID,OSName from IV_OperatingSystem where OSID like '%"+ TextOSfindname.getText() +"%' or OSName like '%"+ TextOSfindname.getText() +"%'";
            ResultSet rs=c.createStatement().executeQuery(sql);
            while(rs.next()){
               Vector v=new Vector();
               v.add(rs.getString("OSID"));
               v.add(rs.getString("OSName"));
                model.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 public void ChangeLTELbtnAddOS(){
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
    public void ChangeLTELbtnDeleteOS(){
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
    public void ChangeLTELbtnEditOS(){
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
    public void ChangeLTELbtnSaveOS(){
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
    public void ChangeLTELBOSName(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ LB_OSName.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            LB_OSName.setText(a);
        }     
    } catch (Exception e) {
    }
 }
    public void ChangeLTELBOSID(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ LB_OSID.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            LB_OSID.setText(a);
        }     
    } catch (Exception e) {
    }
 }
    public void ChangeLTEbtnFindOk(){
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
    public void ChangeLTELBFindIDName(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ LB_FindNameID.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            LB_FindNameID.setText(a);
        }     
    } catch (Exception e) {
    }
 }
    public void ChangeLTELBDataOS(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ LB_DataOS.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            LB_DataOS.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LB_DataOS;
    private javax.swing.JLabel LB_FindNameID;
    private javax.swing.JLabel LB_OSID;
    private javax.swing.JLabel LB_OSName;
    private javax.swing.JTextField TextOSID;
    private javax.swing.JTextField TextOSName;
    private javax.swing.JTextField TextOSfindname;
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
    // End of variables declaration//GEN-END:variables
}
