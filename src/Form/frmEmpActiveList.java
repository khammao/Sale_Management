/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package Form;

/**
 *
 * @author khammaox
 */
import com.lowagie.text.Font;
import java.awt.Dimension;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.awt.Font.*;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;

public class frmEmpActiveList extends javax.swing.JInternalFrame {
    Connection c=DB.getConnection();
    String sql;
    String sql1;
    String sql2;
    String sql3;
    String sql2015;
    PreparedStatement p;
    DefaultTableModel model = new DefaultTableModel();
     ArrayList Dept = new ArrayList();
     ArrayList Loc = new ArrayList();
    public frmEmpActiveList() {
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        cmbDept = new javax.swing.JComboBox();
        radDept = new javax.swing.JRadioButton();
        radStore = new javax.swing.JRadioButton();
        cmbStore = new javax.swing.JComboBox();
        btnRefresh = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        LB_ListOfEmployeeLeave = new javax.swing.JLabel();
        LB_EmpList = new javax.swing.JLabel();

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

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 153), 2));

        jTable1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ລະຫັດ", "ຊື່ແລະນາມສະກຸນ", "ຊື່ແລະນາມສະກຸນ Eng", "ສາຂາ", "ຕຳແໜ່ງ", "ພະແນກ", "ທີ່ຢູ່", "ທີ່ຢູ່ Eng", "ເບີມືຖື", "ເບີໂທລະສັບ", "ເພດ", "ວັນ,ເດືອນ,ປີ", "ວັນທີ່ເຂົ້າວຽກ", "ວັນທີ່ອອກວຽກ", "E-mail"
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
            jTable1.getColumnModel().getColumn(1).setMinWidth(150);
            jTable1.getColumnModel().getColumn(2).setMinWidth(150);
            jTable1.getColumnModel().getColumn(3).setMinWidth(110);
            jTable1.getColumnModel().getColumn(4).setMinWidth(120);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(5).setMinWidth(120);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(180);
            jTable1.getColumnModel().getColumn(6).setMinWidth(120);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(300);
            jTable1.getColumnModel().getColumn(7).setMinWidth(120);
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(300);
            jTable1.getColumnModel().getColumn(8).setMinWidth(120);
            jTable1.getColumnModel().getColumn(9).setMinWidth(120);
            jTable1.getColumnModel().getColumn(10).setMinWidth(120);
            jTable1.getColumnModel().getColumn(10).setPreferredWidth(10);
            jTable1.getColumnModel().getColumn(11).setMinWidth(120);
            jTable1.getColumnModel().getColumn(12).setMinWidth(120);
            jTable1.getColumnModel().getColumn(13).setMinWidth(120);
            jTable1.getColumnModel().getColumn(14).setMinWidth(120);
            jTable1.getColumnModel().getColumn(14).setPreferredWidth(200);
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
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
                .addContainerGap())
        );

        cmbDept.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbDept.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbDept.setEnabled(false);
        cmbDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDeptActionPerformed(evt);
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
        cmbStore.setEnabled(false);
        cmbStore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbStoreActionPerformed(evt);
            }
        });

        btnRefresh.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnPrint.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        LB_ListOfEmployeeLeave.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_ListOfEmployeeLeave.setText("ລາຍຊື່ພະນັກງານທີ່ອອກ");

        LB_EmpList.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_EmpList.setText("ລາຍຊື່ພະນັກງານທີ່ຍັງເຮັດວຽກ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radDept)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbDept, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(LB_EmpList, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)))
                        .addComponent(radStore)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbStore, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(btnPrint)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRefresh)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(469, 469, 469)
                    .addComponent(LB_ListOfEmployeeLeave, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(469, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radStore)
                        .addComponent(cmbStore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRefresh)
                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbDept, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(radDept)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LB_EmpList, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(331, 331, 331)
                    .addComponent(LB_ListOfEmployeeLeave)
                    .addContainerGap(331, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        showdata();
        ShowDept();
        ShowMLoc();
    }//GEN-LAST:event_formInternalFrameOpened
     public  void showEngLB_EmpActiveList(){
    try {
        sql2015= "Select English from LDCLanguage where  Laos = N'"+ LB_EmpList.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql2015);
        if (rs.next()){
            String a = rs.getString("English");
            LB_EmpList.setText(a);
        }     
    } catch (Exception e) {
    }
}              
    public  void showEngLB_EmpStoreSelect(){
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
    public  void showEngLB_EmpDeptSelect(){
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
    private void radDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radDeptActionPerformed
        if(radDept.isSelected()){             
            cmbDept.setEnabled(true);
            cmbStore.setEnabled(false);
        }
    }//GEN-LAST:event_radDeptActionPerformed

    private void radStoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radStoreActionPerformed
        if(radStore.isSelected()){             
            cmbStore.setEnabled(true);
            cmbDept.setEnabled(false);
        }

    }//GEN-LAST:event_radStoreActionPerformed

    private void cmbDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDeptActionPerformed
        showFilterD();
    }//GEN-LAST:event_cmbDeptActionPerformed

    private void cmbStoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStoreActionPerformed
       showFilterE();
    }//GEN-LAST:event_cmbStoreActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
       showdata();
       cmbDept.setEnabled(false);
       cmbStore.setEnabled(false);
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
       try {
             DeleteDept();
            int rows=jTable1.getRowCount();    
            sql1 = "Insert into EmppByDept(EIDNbr,FName,FNameEng,LocName,Title,Dept,Address,AddressEng,MPhone,HPhone,Sex,BDay,StartDate,TermDate,EEmail) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            p = c.prepareStatement(sql1);
             for(int row = 0; row<rows; row++){
            String Nrb =(String) jTable1.getValueAt(row, 0);
            String EName = (String)jTable1.getValueAt(row, 1);
            String ENameEng = (String)jTable1.getValueAt(row, 2);
            String Loc1 = (String)jTable1.getValueAt(row, 3);
            String Positon = (String)jTable1.getValueAt(row, 4);
            String Depart = (String)jTable1.getValueAt(row, 5);
            String add = (String)jTable1.getValueAt(row, 6);
            String addeng = (String)jTable1.getValueAt(row, 7);
            String MB = (String)jTable1.getValueAt(row, 8);
            String MH = (String)jTable1.getValueAt(row, 9);
            String SX = (String)jTable1.getValueAt(row, 10);
            String BD = (String)jTable1.getValueAt(row, 11);
            String ST = (String)jTable1.getValueAt(row, 12);     
            String ED = (String)jTable1.getValueAt(row, 13);
            String EM = (String)jTable1.getValueAt(row, 14);
            p.setString(1,Nrb);
            p.setString(2,EName);
            p.setString(3,ENameEng);
            p.setString(4,Loc1);
            p.setString(5,Positon);
            p.setString(6,Depart);
            p.setString(7,add);
            p.setString(8,addeng);
            p.setString(9,MB);
            p.setString(10,MH);
            p.setString(11,SX);
            p.setString(12,BD);
            p.setString(13,ST);
            p.setString(14,ED);
            p.setString(15,EM);
           
            p.addBatch();
            }
            p.executeBatch();
            c.commit();
            
        } catch (Exception e) {
             e.printStackTrace();
        }
        try {
            if(radDept.isSelected()){
                showReportEmpByDept();
            }else
            {
                showReportEmpByStore1();
            }
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnPrintActionPerformed
     public void DeleteDept(){
          try {
              
           String del = "Delete from EmppByDept";
           ResultSet rs = c.createStatement().executeQuery(del);
           if (rs.next()){
               int type = JOptionPane.OK_OPTION;
               String a = "Deleted.";
               String b = "MESSAGE";
               JOptionPane.showMessageDialog(null, a,b,type);
               return;
           }
    
       } catch (Exception e) {
           //e.printStackTrace();           
       }
    
   }
    public void showReportEmpByStore1(){
        try {

            //Map param = new HashMap();
            JasperPrint print = JasperFillManager.fillReport("Report\\ReportEmpByStore.jasper", null, c);
            JFrame fr = new JFrame();
            fr.setTitle("REPORT Employee");
            Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
            int h = (int)d.getHeight();
            int w = (int)d.getWidth();
            fr.setBounds(0,0,w,h);
            fr.getContentPane().add(new JRViewer(print));  
            fr.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
     public void showReportEmpByDept(){
        try {

            //Map param = new HashMap();
            JasperPrint print = JasperFillManager.fillReport("Report\\ReportEmgByLoc.jasper", null, c);
            JFrame fr = new JFrame();
            fr.setTitle("REPORT Employee");
            Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
            int h = (int)d.getHeight();
            int w = (int)d.getWidth();
            fr.setBounds(0,0,w,h);
            fr.getContentPane().add(new JRViewer(print));  
            fr.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
    private void showFilterE(){
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
            "WHERE LOCName= N'"+ cmbStore.getSelectedItem().toString() +"'and (dbo.Employee.TermDate IS NULL)";
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
    private void showFilterD(){
     try{
          int index = jTable1.getRowCount()-1;
            while (index > -1){
                model.removeRow(index--);
            }
            sql = "SELECT dbo.Employee.EIDNbr, dbo.Employee.FName, dbo.Employee.FNameEng, dbo.Location.LOCName, dbo.Title.TName, dbo.Department.DName, dbo.Employee.Address, dbo.Employee.AddressEng, \n" +
            "dbo.Employee.MPhone, dbo.Employee.HPhone, dbo.Employee.Sex, Format(dbo.Employee.BDay,'yyyy-MM-dd')AS BDate, Format(dbo.Employee.StartDate,'yyyy-MM-dd') As StartD, Format(dbo.Employee.TermDate,'yyyy-MM-dd')as EDate, dbo.Employee.EEmail\n" +
            "FROM dbo.Employee INNER JOIN\n" +
            "dbo.Department ON dbo.Employee.DPID = dbo.Department.DPID INNER JOIN\n" +
            "dbo.Location ON dbo.Employee.LocID = dbo.Location.LOCID INNER JOIN\n" +
            "dbo.Title ON dbo.Employee.TitleID = dbo.Title.TitleID\n" +
            "WHERE DName= N'"+ cmbDept.getSelectedItem().toString() +"'and (dbo.Employee.TermDate IS NULL)";
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
                v.add(rs.getString("BDate"));
                v.add(rs.getString("StartD"));
                v.add(rs.getString("EDate"));                
                v.add(rs.getString("EEmail"));
                model.addRow(v);
            }
            jTable1.setModel(model);
         } catch (Exception e) {
            //e.printStackTrace();
        }
    }
    private void showdata(){
     try{
          int index = jTable1.getRowCount()-1;
            while (index > -1){
                model.removeRow(index--);
            }
            sql = "SELECT dbo.Employee.EIDNbr, dbo.Employee.FName, dbo.Employee.FNameEng, dbo.Location.LOCName, dbo.Title.TName, dbo.Department.DName, dbo.Employee.Address, dbo.Employee.AddressEng, \n" +
            "dbo.Employee.MPhone, dbo.Employee.HPhone, dbo.Employee.Sex, Format(dbo.Employee.BDay,'yyyy-MM-dd')AS BDate, Format(dbo.Employee.StartDate,'yyyy-MM-dd') As StartD, Format(dbo.Employee.TermDate,'yyyy-MM-dd')as EDate, dbo.Employee.EEmail\n" +
            "FROM dbo.Employee INNER JOIN\n" +
            "dbo.Department ON dbo.Employee.DPID = dbo.Department.DPID INNER JOIN\n" +
            "dbo.Location ON dbo.Employee.LocID = dbo.Location.LOCID INNER JOIN\n" +
            "dbo.Title ON dbo.Employee.TitleID = dbo.Title.TitleID\n" +
            "WHERE (dbo.Employee.TermDate IS NULL)";
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
                v.add(rs.getString("BDate"));
                v.add(rs.getString("StartD"));
                v.add(rs.getString("EDate"));                
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LB_EmpList;
    private javax.swing.JLabel LB_ListOfEmployeeLeave;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JComboBox cmbDept;
    private javax.swing.JComboBox cmbStore;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton radDept;
    private javax.swing.JRadioButton radStore;
    // End of variables declaration//GEN-END:variables
}
