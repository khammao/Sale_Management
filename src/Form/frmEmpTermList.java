/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Form;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author khammaox
 */
public class frmEmpTermList extends javax.swing.JInternalFrame {
    Connection c=DB.getConnection();
    String sql;
    String sql2015;
   DefaultTableModel model = new DefaultTableModel();
     ArrayList Dept = new ArrayList();
     ArrayList Loc = new ArrayList();
    public frmEmpTermList() {
        initComponents();
        model = (DefaultTableModel)jTable1.getModel();
        jTable1.getTableHeader().setFont(new java.awt.Font("Saysettha OT", java.awt.Font.BOLD, 12));
        groupButton();
    }
    private void groupButton(){
        ButtonGroup bg=new ButtonGroup();
        bg.add(radDept);
        bg.add(radStore);
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        radDept = new javax.swing.JRadioButton();
        cmbDept = new javax.swing.JComboBox();
        radStore = new javax.swing.JRadioButton();
        cmbStore = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        LB_ListOfEmployeeLeave = new javax.swing.JLabel();

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

        radDept.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        radDept.setForeground(new java.awt.Color(0, 51, 255));
        radDept.setText("ພະແນກ");
        radDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radDeptActionPerformed(evt);
            }
        });

        cmbDept.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbDept.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDeptActionPerformed(evt);
            }
        });

        radStore.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        radStore.setForeground(new java.awt.Color(0, 51, 255));
        radStore.setText("ຮ້ານ");
        radStore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radStoreActionPerformed(evt);
            }
        });

        cmbStore.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbStore.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbStore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbStoreActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 153), 3));

        jTable1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nbr#", "ຊື່ແລະນາມສະກຸນ(Lao)", "Employee Name", "ສາຂາ(Location)", "ຕຳແໜ່ງ(Title)", "ພະແນກ(Department)", "ທີ່ຢູ່(Lao)", "Address", "Mobile", "Telephone", "ເພດ(Sex)", "ວັນ,ເດືອນ,ປີ", "ວັນທີ່ເຂົ້າວຽກ", "ວັນທີ່ອອກວຽກ", "E-mail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.setRowHeight(30);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(50);
            jTable1.getColumnModel().getColumn(1).setMinWidth(200);
            jTable1.getColumnModel().getColumn(2).setMinWidth(200);
            jTable1.getColumnModel().getColumn(3).setMinWidth(150);
            jTable1.getColumnModel().getColumn(4).setMinWidth(150);
            jTable1.getColumnModel().getColumn(5).setMinWidth(150);
            jTable1.getColumnModel().getColumn(6).setMinWidth(200);
            jTable1.getColumnModel().getColumn(7).setMinWidth(200);
            jTable1.getColumnModel().getColumn(8).setMinWidth(80);
            jTable1.getColumnModel().getColumn(9).setMinWidth(80);
            jTable1.getColumnModel().getColumn(11).setMinWidth(100);
            jTable1.getColumnModel().getColumn(12).setMinWidth(100);
            jTable1.getColumnModel().getColumn(13).setMinWidth(100);
            jTable1.getColumnModel().getColumn(14).setMinWidth(200);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        LB_ListOfEmployeeLeave.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_ListOfEmployeeLeave.setText("ລາຍຊື່ພະນັກງານທີ່ອອກ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LB_ListOfEmployeeLeave, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(radDept)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbDept, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(radStore)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbStore, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radDept)
                        .addComponent(cmbDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(radStore)
                        .addComponent(cmbStore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addComponent(LB_ListOfEmployeeLeave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radDeptActionPerformed
       if(radDept.isSelected()){             
            cmbDept.setEnabled(true);
            cmbStore.setEnabled(false);
        }
    }//GEN-LAST:event_radDeptActionPerformed
    public  void showEngLB_EmpListofOut(){
    try {
        sql2015= "Select English from LDCLanguage where  Laos = N'"+ LB_ListOfEmployeeLeave.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql2015);
        if (rs.next()){
            String a = rs.getString("English");
            LB_ListOfEmployeeLeave.setText(a);
        }     
    } catch (Exception e) {
    }
}  
    public  void showEngLB_EmpTermListtStore(){
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
    public  void showEngLB_EmpTermListDept(){
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
    private void cmbDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDeptActionPerformed
        showFilterD();
    }//GEN-LAST:event_cmbDeptActionPerformed
     private void showFilterD(){
     try{
          int index = jTable1.getRowCount()-1;
            while (index > -1){
                model.removeRow(index--);
            }
            sql = "SELECT dbo.Employee.EIDNbr, dbo.Employee.FName, dbo.Employee.FNameEng, dbo.Location.LOCName, dbo.Title.TName, dbo.Department.DName, dbo.Employee.Address, dbo.Employee.AddressEng, \n" +
            "dbo.Employee.MPhone, dbo.Employee.HPhone, dbo.Employee.Sex, dbo.Employee.BDay, dbo.Employee.StartDate, dbo.Employee.TermDate, dbo.Employee.EEmail\n" +
            "FROM dbo.Employee INNER JOIN\n" +
            "dbo.Department ON dbo.Employee.DPID = dbo.Department.DPID INNER JOIN\n" +
            "dbo.Location ON dbo.Employee.LocID = dbo.Location.LOCID INNER JOIN\n" +
            "dbo.Title ON dbo.Employee.TitleID = dbo.Title.TitleID\n" +
            "WHERE DName= N'"+ cmbDept.getSelectedItem().toString() +"'and (dbo.Employee.TermDate IS Not NULL)";
            ResultSet rs = c.createStatement().executeQuery(sql);
            while (rs.next()){
                Vector v = new Vector();
                v.add(rs.getString("EIDNbr"));
                v.add(rs.getString("FName"));
                v.add(rs.getString("FNameEng"));                
                v.add(rs.getString("LOCName"));
                v.add(rs.getString("TName"));
                v.add(rs.getString("DName"));             
                v.add(rs.getString("Address"));
                v.add(rs.getString("AddressEng"));
                v.add(rs.getString("MPhone"));
                v.add(rs.getString("HPhone"));                
                v.add(rs.getString("Sex"));
                v.add(rs.getString("BDay"));
                v.add(rs.getString("StartDate"));
                v.add(rs.getString("TermDate"));                
                v.add(rs.getString("EEmail"));
                model.addRow(v);
            }
            jTable1.setModel(model);
         } catch (Exception e) {
            //e.printStackTrace();
        }
    }  
    private void ShowDept(){
        try {
            DefaultComboBoxModel mode = new DefaultComboBoxModel();
            sql = "Select DPID, DName from Department Where DNameShort<>'Store Op' and DNameShort<>'Audit' and DNameShort<>'Store Op DM' and DNameShort<>'Store Op SMgr' and DNameShort<>'Store Op ASMgr'and DNameShort<>'Store Op SC'and DNameShort<>'Store Op Cashier' and DNameShort<>'Store OP Stocker'and DNameShort<>'HQ1'";
            mode.removeAllElements();
            Dept.clear();
            ResultSet rs = c.createStatement().executeQuery(sql);
            while (rs.next()){
               Dept.add(rs.getString("DPID"));
                mode.addElement(rs.getString("DName"));                
            }
            cmbDept.setModel(mode);
        } catch (Exception e) {
       }
     }
    private void radStoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radStoreActionPerformed
          if(radStore.isSelected()){             
            cmbStore.setEnabled(true);
            cmbDept.setEnabled(false);
        }
    }//GEN-LAST:event_radStoreActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        cmbDept.setEnabled(false);
       cmbStore.setEnabled(false);
       showdata();
       ShowDept();
       ShowMLoc();
    }//GEN-LAST:event_formInternalFrameOpened

    private void cmbStoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStoreActionPerformed
       showFilterStore();
    }//GEN-LAST:event_cmbStoreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        showdata();
        cmbDept.setEnabled(false);
        cmbStore.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed
   
    private void showFilterStore(){
     try{
          int index = jTable1.getRowCount()-1;
            while (index > -1){
                model.removeRow(index--);
            }
            sql = "SELECT dbo.Employee.EIDNbr, dbo.Employee.FName, dbo.Employee.FNameEng, dbo.Location.LOCName, dbo.Title.TName, dbo.Department.DName, dbo.Employee.Address, dbo.Employee.AddressEng, \n" +
            "dbo.Employee.MPhone, dbo.Employee.HPhone, dbo.Employee.Sex, dbo.Employee.BDay, dbo.Employee.StartDate, dbo.Employee.TermDate, dbo.Employee.EEmail\n" +
            "FROM dbo.Employee INNER JOIN\n" +
            "dbo.Department ON dbo.Employee.DPID = dbo.Department.DPID INNER JOIN\n" +
            "dbo.Location ON dbo.Employee.LocID = dbo.Location.LOCID INNER JOIN\n" +
            "dbo.Title ON dbo.Employee.TitleID = dbo.Title.TitleID\n" +
            "WHERE LOCName= N'"+ cmbStore.getSelectedItem().toString() +"'and (dbo.Employee.TermDate IS Not NULL)";
            ResultSet rs = c.createStatement().executeQuery(sql);
            while (rs.next()){
                Vector v = new Vector();
                v.add(rs.getString("EIDNbr"));
                v.add(rs.getString("FName"));
                v.add(rs.getString("FNameEng"));                
                v.add(rs.getString("LOCName"));
                v.add(rs.getString("TName"));
                v.add(rs.getString("DName"));             
                v.add(rs.getString("Address"));
                v.add(rs.getString("AddressEng"));
                v.add(rs.getString("MPhone"));
                v.add(rs.getString("HPhone"));                
                v.add(rs.getString("Sex"));
                v.add(rs.getString("BDay"));
                v.add(rs.getString("StartDate"));
                v.add(rs.getString("TermDate"));                
                v.add(rs.getString("EEmail"));
                model.addRow(v);
            }
            jTable1.setModel(model);
         } catch (Exception e) {
            //e.printStackTrace();
        }
    }
    private void ShowMLoc(){
        try {
            DefaultComboBoxModel mode = new DefaultComboBoxModel();
            sql = "Select LOCID, LOCName from Location where LOCName<>'HQ'";
            mode.removeAllElements();
            Loc.clear();
            ResultSet rs = c.createStatement().executeQuery(sql);
            while (rs.next()){
               Loc.add(rs.getString("LOCID"));
                mode.addElement(rs.getString("LOCName"));                
            }
            cmbStore.setModel(mode);
        } catch (Exception e) {
       }
   }
    private void showdata(){
     try{
          int index = jTable1.getRowCount()-1;
            while (index > -1){
                model.removeRow(index--);
            }
            sql = "SELECT dbo.Employee.EIDNbr, dbo.Employee.FName, dbo.Employee.FNameEng, dbo.Location.LOCName, dbo.Title.TName, dbo.Department.DName, dbo.Employee.Address, dbo.Employee.AddressEng, \n" +
            "dbo.Employee.MPhone, dbo.Employee.HPhone, dbo.Employee.Sex, dbo.Employee.BDay, dbo.Employee.StartDate, dbo.Employee.TermDate, dbo.Employee.EEmail\n" +
            "FROM dbo.Employee INNER JOIN\n" +
            "dbo.Department ON dbo.Employee.DPID = dbo.Department.DPID INNER JOIN\n" +
            "dbo.Location ON dbo.Employee.LocID = dbo.Location.LOCID INNER JOIN\n" +
            "dbo.Title ON dbo.Employee.TitleID = dbo.Title.TitleID\n" +
            "WHERE (dbo.Employee.TermDate IS Not NULL)";
            ResultSet rs = c.createStatement().executeQuery(sql);
            while (rs.next()){
                Vector v = new Vector();
                v.add(rs.getString("EIDNbr"));
                v.add(rs.getString("FName"));
                v.add(rs.getString("FNameEng"));                
                v.add(rs.getString("LOCName"));
                v.add(rs.getString("TName"));
                v.add(rs.getString("DName"));             
                v.add(rs.getString("Address"));
                v.add(rs.getString("AddressEng"));
                v.add(rs.getString("MPhone"));
                v.add(rs.getString("HPhone"));                
                v.add(rs.getString("Sex"));
                v.add(rs.getString("BDay"));
                v.add(rs.getString("StartDate"));
                v.add(rs.getString("TermDate"));                
                v.add(rs.getString("EEmail"));
                model.addRow(v);
            }
            jTable1.setModel(model);
         } catch (Exception e) {
            //e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LB_ListOfEmployeeLeave;
    private javax.swing.JComboBox cmbDept;
    private javax.swing.JComboBox cmbStore;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton radDept;
    private javax.swing.JRadioButton radStore;
    // End of variables declaration//GEN-END:variables
}
