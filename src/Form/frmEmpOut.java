
package Form;
    
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.naming.spi.DirStateFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmEmpOut extends javax.swing.JInternalFrame {
    Connection c=DB.getConnection();
    String sql;
    String sqlStore;
    String sql12;
     String sql13;
    String ed;
    String sql2015;
    int Active;
    DefaultTableModel model =new DefaultTableModel();
    ArrayList dpt =new ArrayList();
     ArrayList str =new ArrayList();
    ArrayList emp1 =new ArrayList();
    ArrayList emp2 =new ArrayList();
    public frmEmpOut() {
        initComponents();
        groupButton();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LB_frmEmpOut = new javax.swing.JLabel();
        cmbDept = new javax.swing.JComboBox();
        LB_SeletLoc = new javax.swing.JLabel();
        LB_SelectEmpOutName = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        dtpOut = new com.toedter.calendar.JDateChooser();
        LB_EmpOutName = new javax.swing.JLabel();
        LB_ID = new javax.swing.JLabel();
        LB_EmpOutDate = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        ch2015 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNote = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        radDept = new javax.swing.JRadioButton();
        radStore = new javax.swing.JRadioButton();
        LB_SelectEmpOutDept = new javax.swing.JLabel();

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

        LB_frmEmpOut.setFont(new java.awt.Font("Saysettha OT", 1, 18)); // NOI18N
        LB_frmEmpOut.setText("ໜ້າຟຼອມເອົາພະນັກງານອອກ");

        cmbDept.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        cmbDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDeptActionPerformed(evt);
            }
        });

        LB_SeletLoc.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        LB_SeletLoc.setText("ເລືອກສາຂາ:");

        LB_SelectEmpOutName.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        LB_SelectEmpOutName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LB_SelectEmpOutNameActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 2));

        txtID.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        txtID.setEnabled(false);

        txtName.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        txtName.setEnabled(false);

        dtpOut.setDateFormatString("yyyy-MM-dd");
        dtpOut.setEnabled(false);
        dtpOut.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        LB_EmpOutName.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        LB_EmpOutName.setText("ຊື່ຂອງພະນັກງານ");

        LB_ID.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        LB_ID.setText("ລຳດັບ");

        LB_EmpOutDate.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        LB_EmpOutDate.setText("ວັນທີ່ອອກ");

        btnOk.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        btnOk.setText("ຕົກລົງ");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        btnCancel.setText("ຍົກເລິກ");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        ch2015.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ch2015ActionPerformed(evt);
            }
        });

        txtNote.setColumns(20);
        txtNote.setRows(5);
        jScrollPane1.setViewportView(txtNote);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 236, Short.MAX_VALUE)
                        .addComponent(btnCancel))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtID)
                            .addComponent(LB_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LB_EmpOutName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dtpOut, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(LB_EmpOutDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ch2015)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LB_EmpOutName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LB_ID))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 4, Short.MAX_VALUE)
                        .addComponent(LB_EmpOutDate)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dtpOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtName)
                    .addComponent(txtID)
                    .addComponent(ch2015, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8))
        );

        jPanel3.setBackground(new java.awt.Color(102, 153, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        radDept.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        radDept.setText("ພະແນກ");
        radDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radDeptActionPerformed(evt);
            }
        });

        radStore.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        radStore.setText("ຮ້ານ");
        radStore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radStoreActionPerformed(evt);
            }
        });

        LB_SelectEmpOutDept.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        LB_SelectEmpOutDept.setText("ພະແນກ:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(LB_SelectEmpOutDept, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbDept, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(LB_SelectEmpOutName, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(51, 51, 51)
                                        .addComponent(LB_SeletLoc)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(radDept)
                                        .addGap(26, 26, 26)
                                        .addComponent(radStore))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(LB_frmEmpOut, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(LB_frmEmpOut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radStore)
                    .addComponent(radDept)
                    .addComponent(LB_SeletLoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbDept, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LB_SelectEmpOutName)
                    .addComponent(LB_SelectEmpOutDept, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
      //  showDept();
    }//GEN-LAST:event_formInternalFrameOpened
    public  void showEngLB_EmpOutbtnCancel(){
    try {
        sql2015= "Select English from LDCLanguage where  Laos = N'"+ btnCancel.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql2015);
        if (rs.next()){
            String a = rs.getString("English");
            btnCancel.setText(a);
        }     
    } catch (Exception e) {
    }
}  
    public  void showEngLB_EmpOutbtnOk(){
    try {
        sql2015= "Select English from LDCLanguage where  Laos = N'"+ btnOk.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql2015);
        if (rs.next()){
            String a = rs.getString("English");
            btnOk.setText(a);
        }     
    } catch (Exception e) {
    }
}  
    public  void showEngLB_EmpOutDateTerm(){
    try {
        sql2015= "Select English from LDCLanguage where  Laos = N'"+ LB_EmpOutDate.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql2015);
        if (rs.next()){
            String a = rs.getString("English");
            LB_EmpOutDate.setText(a);
        }     
    } catch (Exception e) {
    }
}  
    public  void showEngLB_EmpOutNameToShow(){
    try {
        sql2015= "Select English from LDCLanguage where  Laos = N'"+ LB_EmpOutName.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql2015);
        if (rs.next()){
            String a = rs.getString("English");
            LB_EmpOutName.setText(a);
        }     
    } catch (Exception e) {
    }
}  
    public  void showEngLB_EmpOutID(){
    try {
        sql2015= "Select English from LDCLanguage where  Laos = N'"+ LB_ID.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql2015);
        if (rs.next()){
            String a = rs.getString("English");
            LB_ID.setText(a);
        }     
    } catch (Exception e) {
    }
}  
    public  void showEngLB_EmpOutSelectDeptName(){
    try {
        sql2015= "Select English from LDCLanguage where  Laos = N'"+ LB_SelectEmpOutDept.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql2015);
        if (rs.next()){
            String a = rs.getString("English");
            LB_SelectEmpOutDept.setText(a);
        }     
    } catch (Exception e) {
    }
}  
    public  void showEngLB_EmpOutRadStore(){
    try {
        sql2015= "Select English from LDCLanguage where  Laos = N'"+ radStore.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql2015);
        if (rs.next()){
            String a = rs.getString("English");
            radStore.setText(a);
        }     
    } catch (Exception e) {
    }
}  
    public  void showEngLB_EmpOutRadDept(){
    try {
        sql2015= "Select English from LDCLanguage where  Laos = N'"+ radDept.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql2015);
        if (rs.next()){
            String a = rs.getString("English");
            radDept.setText(a);
        }     
    } catch (Exception e) {
    }
}  
    public  void showEngLB_EmpOutSelectLoc(){
    try {
        sql2015= "Select English from LDCLanguage where  Laos = N'"+ LB_SeletLoc.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql2015);
        if (rs.next()){
            String a = rs.getString("English");
            LB_SeletLoc.setText(a);
        }     
    } catch (Exception e) {
    }
}  
    public  void showEngLB_EmpOutForm(){
    try {
        sql2015= "Select English from LDCLanguage where  Laos = N'"+ LB_frmEmpOut.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql2015);
        if (rs.next()){
            String a = rs.getString("English");
            LB_frmEmpOut.setText(a);
        }     
    } catch (Exception e) {
    }
}  
    private void cmbDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDeptActionPerformed
        try {
           if (radDept.isSelected()){
            int Emp12 =cmbDept.getSelectedIndex();
            DefaultComboBoxModel mode1 = new DefaultComboBoxModel();
            sql12 = "SELECT dbo.Employee.EID, dbo.Employee.FNameEng\n" +
            "FROM dbo.Employee INNER JOIN\n" +
            " dbo.Department ON dbo.Employee.DPID = dbo.Department.DPID\n" +
            "WHERE (dbo.Employee.DPID ='"+ dpt.get(Emp12) +"') and (dbo.Employee.TermDate is null) ";
            mode1.removeAllElements();
            emp1.clear();
            ResultSet rs = c.createStatement().executeQuery(sql12);
            while (rs.next()){
            emp1.add(rs.getString("EID"));
            mode1.addElement(rs.getString("FNameEng"));
            }
            LB_SelectEmpOutName.setModel(mode1);
           }
           else{
            int Emp12 =cmbDept.getSelectedIndex();
            DefaultComboBoxModel mode1 = new DefaultComboBoxModel();
            sql13 = "SELECT dbo.Employee.EID, dbo.Employee.FNameEng\n" +
            "FROM dbo.Employee INNER JOIN\n" +
            " dbo.Department ON dbo.Employee.DPID = dbo.Department.DPID\n" +
            "WHERE (dbo.Employee.DPID ='"+ str.get(Emp12) +"') and (dbo.Employee.TermDate is null) ";
            mode1.removeAllElements();
            emp2.clear();
            ResultSet rs = c.createStatement().executeQuery(sql13);
            while (rs.next()){
            emp2.add(rs.getString("EID"));
            mode1.addElement(rs.getString("FNameEng"));
            }
            LB_SelectEmpOutName.setModel(mode1);
           }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cmbDeptActionPerformed

    private void LB_SelectEmpOutNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LB_SelectEmpOutNameActionPerformed
        showEmployee_name();
    }//GEN-LAST:event_LB_SelectEmpOutNameActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        try {
           
            if (txtID.getText().equals("")||txtName.getText().equals("")){
                int type = JOptionPane.WARNING_MESSAGE;
                String a = "Error...your data is not enough.";
                String b = "MESSAGE";
                JOptionPane.showMessageDialog(null, a,b,type);
                return;
            }    
             java.util.Date dt1;
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            dt1 = dtpOut.getDate();
            String str1 = (String) df.format(dt1);
            if (JOptionPane.showConfirmDialog(null, "Do you like to Change ?", "Message", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
                ed="Update Employee set TermDate=?,NotActive=?,Note=? where EID=(?)";
                PreparedStatement p = c.prepareStatement(ed);
                p.setString(1,str1);
                p.setInt(2, Active);
                p.setString(3, txtNote.getText());
                p.setString(4, txtID.getText());
                if (p.executeUpdate()!=-1){
                    int type = JOptionPane.OK_OPTION;
                    String a = "Changed.";
                    String b = "MESSAGE";
                    JOptionPane.showMessageDialog(null, a,b,type);
                            
                }                
            }          
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnOkActionPerformed

    private void ch2015ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ch2015ActionPerformed
        if(ch2015.isSelected()){ 
            Active=1;
            dtpOut.setEnabled(true);
        }
       else{
           Active=0;
         dtpOut.setEnabled(false);
        }
    }//GEN-LAST:event_ch2015ActionPerformed
    private void groupButton(){
        ButtonGroup bg=new ButtonGroup();
        bg.add(radDept);
        bg.add(radStore);
    }
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        
    }//GEN-LAST:event_btnCancelActionPerformed

    private void radDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radDeptActionPerformed
        showDept();
    }//GEN-LAST:event_radDeptActionPerformed

    private void radStoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radStoreActionPerformed
       showStore();
    }//GEN-LAST:event_radStoreActionPerformed
    public void showEmployee_name(){
        try {

            String tmp=(String)LB_SelectEmpOutName.getSelectedItem();
            sql = "SELECT dbo.Employee.EID, dbo.Employee.EIDNbr, dbo.Employee.FName, dbo.Employee.FNameEng, dbo.Location.LOCName, dbo.Title.TName, dbo.Department.DName, dbo.Employee.MgrName, dbo.Employee.Address, \n" +
            "dbo.Employee.AddressEng, dbo.Employee.MPhone, dbo.Employee.HPhone, dbo.Employee.Sex, dbo.Employee.BDay, dbo.Employee.StartDate, dbo.Employee.TermDate, dbo.Employee.NotActive, \n" +
            "dbo.Employee.EEmail, dbo.Employee.PartTime\n" +
            "FROM dbo.Employee INNER JOIN\n" +
            "dbo.Department ON dbo.Employee.DPID = dbo.Department.DPID INNER JOIN\n" +
            "dbo.Location ON dbo.Employee.LocID = dbo.Location.LOCID INNER JOIN\n" +
            "dbo.Title ON dbo.Employee.TitleID = dbo.Title.TitleID where dbo.Employee.FnameEng = N'"+ LB_SelectEmpOutName.getSelectedItem().toString() +"' and TermDate is NULL";            

          ResultSet rs = c.createStatement().executeQuery(sql);
            if (rs.next()) {
                    String ID  = rs.getString("EID");
                    txtID.setText(ID);
                    String NameEng = rs.getString("FNameEng");
                    txtName.setText(NameEng);                  
                }          
              
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void showDept(){
        try {
            DefaultComboBoxModel mode =new DefaultComboBoxModel();
            sql="Select DPID,DName from Department";
            mode.removeAllElements();
            dpt.clear();
            ResultSet rs =c.createStatement().executeQuery(sql);
            while(rs.next()){
                dpt.add(rs.getString("DPID"));
                mode.addElement(rs.getString("DName")); 
            }
            cmbDept.setModel(mode);
        } catch (Exception e) {
        }
   
    }
    public void showStore(){
        try {
            DefaultComboBoxModel mode =new DefaultComboBoxModel();
            sqlStore="Select LOCID,LOCName from Location";
            mode.removeAllElements();
            str.clear();
            ResultSet rs =c.createStatement().executeQuery(sqlStore);
            while(rs.next()){
                str.add(rs.getString("LOCID"));
                mode.addElement(rs.getString("LOCName")); 
            }
            cmbDept.setModel(mode);
        } catch (Exception e) {
        }
   
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LB_EmpOutDate;
    private javax.swing.JLabel LB_EmpOutName;
    private javax.swing.JLabel LB_ID;
    private javax.swing.JLabel LB_SelectEmpOutDept;
    private javax.swing.JComboBox LB_SelectEmpOutName;
    private javax.swing.JLabel LB_SeletLoc;
    private javax.swing.JLabel LB_frmEmpOut;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnOk;
    private javax.swing.JCheckBox ch2015;
    private javax.swing.JComboBox cmbDept;
    private com.toedter.calendar.JDateChooser dtpOut;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radDept;
    private javax.swing.JRadioButton radStore;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextArea txtNote;
    // End of variables declaration//GEN-END:variables
}
