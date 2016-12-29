package Form;

import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmEmployee extends javax.swing.JInternalFrame {
    Connection c=DB.getConnection();
    String sql;
    String path;
    String sex;
    int PartTime1;
    int Active;
    String sql2015;
    DefaultTableModel model = new DefaultTableModel();
    ArrayList MLoc = new ArrayList();
    ArrayList Title = new ArrayList();
    ArrayList Dept = new ArrayList();
    ArrayList Dept1 = new ArrayList();
    ArrayList Dept2 = new ArrayList();
    ArrayList Mgs = new ArrayList();
    public frmEmployee() {
        initComponents();
        groupButton();
    }
  public  void showEngLB_EmpPicture(){
    try {
        sql2015= "Select English from LDCLanguage where  Laos = N'"+ LB_EmpPicture.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql2015);
        if (rs.next()){
            String a = rs.getString("English");
            LB_EmpPicture.setText(a);
        }     
    } catch (Exception e) {
    }
}  
    public  void showEngLB_ForFinfToEdit(){
    try {
        sql2015= "Select English from LDCLanguage where  Laos = N'"+ LB_EmpForFind.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql2015);
        if (rs.next()){
            String a = rs.getString("English");
            LB_EmpForFind.setText(a);
        }     
    } catch (Exception e) {
    }
}  
    public  void showEngBtnFindEmp(){
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
    public  void showEngLBEmpLBFindName(){
    try {
        sql2015= "Select English from LDCLanguage where  Laos = N'"+ LB_EmpFindbyName.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql2015);
        if (rs.next()){
            String a = rs.getString("English");
            LB_EmpFindbyName.setText(a);
        }     
    } catch (Exception e) {
    }
}  
    public  void showEngLBEmpLBFindDept(){
    try {
        sql2015= "Select English from LDCLanguage where  Laos = N'"+ LB_FindDepName.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql2015);
        if (rs.next()){
            String a = rs.getString("English");
            LB_FindDepName.setText(a);
        }     
    } catch (Exception e) {
    }
}  
    public  void showEngLBEmpBtnDelete(){
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
    public  void showEngLBEmpBtnEdit(){
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
    public  void showEngLBEmpBtnSave(){
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
    public  void showEngLBEmpEnddate(){
    try {
        sql2015= "Select English from LDCLanguage where  Laos = N'"+ LB_EmpEndWork.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql2015);
        if (rs.next()){
            String a = rs.getString("English");
            LB_EmpEndWork.setText(a);
        }     
    } catch (Exception e) {
    }
}  
    public  void showEngLBEmpStartdate(){
    try {
        sql2015= "Select English from LDCLanguage where  Laos = N'"+ LB_EmpStartW.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql2015);
        if (rs.next()){
            String a = rs.getString("English");
            LB_EmpStartW.setText(a);
        }     
    } catch (Exception e) {
    }
}  
    public  void showEngLBEmpBDay(){
    try {
        sql2015= "Select English from LDCLanguage where  Laos = N'"+ LB_BDayEmp.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql2015);
        if (rs.next()){
            String a = rs.getString("English");
            LB_BDayEmp.setText(a);
        }     
    } catch (Exception e) {
    }
}  
    public  void showEngLBEmpTel(){
    try {
        sql2015= "Select English from LDCLanguage where  Laos = N'"+ LB_EmpPhone.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql2015);
        if (rs.next()){
            String a = rs.getString("English");
            LB_EmpPhone.setText(a);
        }     
    } catch (Exception e) {
    }
}  
    public  void showEngLBEmpMobile(){
    try {
        sql2015= "Select English from LDCLanguage where  Laos = N'"+ LB_EmpMobile.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql2015);
        if (rs.next()){
            String a = rs.getString("English");
            LB_EmpMobile.setText(a);
        }     
    } catch (Exception e) {
    }
}  
    public  void showEngLBEmpSexFeMale(){
    try {
        sql2015= "Select English from LDCLanguage where  Laos = N'"+ radFemale.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql2015);
        if (rs.next()){
            String a = rs.getString("English");
            radFemale.setText(a);
        }     
    } catch (Exception e) {
    }
}  
    public  void showEngLBEmpSexMale(){
    try {
        sql2015= "Select English from LDCLanguage where  Laos = N'"+ radMale.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql2015);
        if (rs.next()){
            String a = rs.getString("English");
            radMale.setText(a);
        }     
    } catch (Exception e) {
    }
}  
    public  void showEngLBEmpSex(){
    try {
        sql2015= "Select English from LDCLanguage where  Laos = N'"+ LB_SexEmp.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql2015);
        if (rs.next()){
            String a = rs.getString("English");
            LB_SexEmp.setText(a);
        }     
    } catch (Exception e) {
    }
}  
    public  void showEngLBEmpAddressEng(){
    try {
        sql2015= "Select English from LDCLanguage where  Laos = N'"+ LB_AddressEng.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql2015);
        if (rs.next()){
            String a = rs.getString("English");
            LB_AddressEng.setText(a);
        }     
    } catch (Exception e) {
    }
}  
    public  void showEngLBEmpAddress(){
    try {
        sql2015= "Select English from LDCLanguage where  Laos = N'"+ LB_Address.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql2015);
        if (rs.next()){
            String a = rs.getString("English");
            LB_Address.setText(a);
        }     
    } catch (Exception e) {
    }
}  
    public  void showEngLBEmpMgs(){
    try {
        sql2015= "Select English from LDCLanguage where  Laos = N'"+ LB_Mgs.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql2015);
        if (rs.next()){
            String a = rs.getString("English");
            LB_Mgs.setText(a);
        }     
    } catch (Exception e) {
    }
}  
    public  void showEngLBEmpDept(){
    try {
        sql2015= "Select English from LDCLanguage where  Laos = N'"+ LB_EmpDpt.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql2015);
        if (rs.next()){
            String a = rs.getString("English");
            LB_EmpDpt.setText(a);
        }     
    } catch (Exception e) {
    }
}  
    public  void showEngLBEmpTitle(){
    try {
        sql2015= "Select English from LDCLanguage where  Laos = N'"+ LB_EmpTitle.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql2015);
        if (rs.next()){
            String a = rs.getString("English");
            LB_EmpTitle.setText(a);
        }     
    } catch (Exception e) {
    }
}  
    public  void showEngLBEmpLoc(){
    try {
        sql2015= "Select English from LDCLanguage where  Laos = N'"+ LB_EmpGroup.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql2015);
        if (rs.next()){
            String a = rs.getString("English");
            LB_EmpGroup.setText(a);
        }     
    } catch (Exception e) {
    }
}  
    public  void showEngLBEmpFullNameEng(){
    try {
        sql2015= "Select English from LDCLanguage where  Laos = N'"+ LB_EmpNameEng.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql2015);
        if (rs.next()){
            String a = rs.getString("English");
            LB_EmpNameEng.setText(a);
        }     
    } catch (Exception e) {
    }
}  
    public  void showEngLBEmpFullName(){
    try {
        sql2015= "Select English from LDCLanguage where  Laos = N'"+ LB_EmpName.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql2015);
        if (rs.next()){
            String a = rs.getString("English");
            LB_EmpName.setText(a);
        }     
    } catch (Exception e) {
    }
}  
    public  void showEngLBEmpNbr(){
    try {
        sql2015= "Select English from LDCLanguage where  Laos = N'"+ LB_EmpNbr.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql2015);
        if (rs.next()){
            String a = rs.getString("English");
            LB_EmpNbr.setText(a);
        }     
    } catch (Exception e) {
    }
}  
    public  void showEngLBfrmEmp(){
    try {
        sql2015= "Select English from LDCLanguage where  Laos = N'"+ LB_FrmofEmp.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql2015);
        if (rs.next()){
            String a = rs.getString("English");
            LB_FrmofEmp.setText(a);
        }     
    } catch (Exception e) {
    }
}  
    public void showEmployee_name(){
        try {

            String tmp=(String)cmbFilterEmp.getSelectedItem();
            sql = "SELECT dbo.Employee.EID, dbo.Employee.EIDNbr, dbo.Employee.FName, dbo.Employee.FNameEng, dbo.Location.LOCName, dbo.Title.TName, dbo.Department.DName, dbo.Employee.MgrName, dbo.Employee.Address, \n" +
            "dbo.Employee.AddressEng, dbo.Employee.MPhone, dbo.Employee.HPhone, dbo.Employee.Sex, dbo.Employee.BDay, dbo.Employee.StartDate, dbo.Employee.TermDate, dbo.Employee.NotActive, \n" +
            "dbo.Employee.EEmail, dbo.Employee.PartTime\n" +
            "FROM dbo.Employee INNER JOIN\n" +
            "dbo.Department ON dbo.Employee.DPID = dbo.Department.DPID INNER JOIN\n" +
            "dbo.Location ON dbo.Employee.LocID = dbo.Location.LOCID INNER JOIN\n" +
            "dbo.Title ON dbo.Employee.TitleID = dbo.Title.TitleID where dbo.Employee.FnameEng = N'"+ cmbFilterEmp.getSelectedItem().toString() +"'";            

          ResultSet rs = c.createStatement().executeQuery(sql);
            if (rs.next()) {
                    String ID  = rs.getString("EID");
                    txtID.setText(ID);
                    String Nbr = rs.getString("EIDNbr");
                    txtNrb.setText(Nbr);
                    String Name = rs.getString("FName");
                    txtName.setText(Name);
                    String NameEng = rs.getString("FNameEng");
                    txtEngName.setText(NameEng);
                    String Loc = rs.getString("LOCName");
                    cmbLoc.setSelectedItem(Loc);
                    String Title = rs.getString("TName");
                    cmbTitle.setSelectedItem(Title);                          
                    String a = rs.getString("Dname");
                    cmbDept.setSelectedItem(a);
                    String Adr = rs.getString("Address");
                    txtAddress.setText(Adr);
                    String AdrEng = rs.getString("AddressEng");
                    txtEngAddress.setText(AdrEng);
                    String MB = rs.getString("MPhone");
                    txtMobile.setText(MB);
                    String PH = rs.getString("HPhone");
                    txtPhone.setText(PH);                  
                    dtpBirth.setDate(rs.getDate("BDay"));                              
                    dtpStartW.setDate(rs.getDate("StartDate"));
                    dtpLeaveW.setDate(rs.getDate("TermDate"));
                   
                     
                }          
              
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        public void radioSelected(){
          
        try {
            String tmp =(String)cmbFilterEmp.getSelectedItem();
            sql = "select Sex from Employee where FNameEng = N'"+ cmbFilterEmp.getSelectedItem().toString() +"'";            
            ResultSet rs = c.createStatement().executeQuery(sql);
            if (rs.next()) {
                 String genderEdit=rs.getString("Sex"); 
               if(genderEdit.equals("ຊາຍ Male"))
                    {
                         radMale.setSelected(true); 
                    }
                    else if(genderEdit.equals("ຍິງ Female"))
                    {
                         radFemale.setSelected(true);
                    }
                    else
                    {
                    JOptionPane.showMessageDialog(null, "error !");
                    }                     
                }          
              
        } catch (Exception e) {
            e.printStackTrace();
        }
      }
        public void checkTerm(){
            try {
            String tmp =(String)cmbFilterEmp.getSelectedItem();
            sql = "select NotActive from Employee where FNameEng = N'"+ cmbFilterEmp.getSelectedItem().toString() +"'";            
            ResultSet rs = c.createStatement().executeQuery(sql);
            if (rs.next()) {
                 int NotACt=rs.getInt("NotActive"); 
                    if(NotACt==1)
                    {
                         cbLeave.setSelected(true);
                    }
                    else 
                         cbLeave.setSelected(false);       
                }          
              
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
         public void checkPartTime(){
            try {
            String tmp =(String)cmbFilterEmp.getSelectedItem();
            sql = "select PartTime from Employee where FNameEng = N'"+ cmbFilterEmp.getSelectedItem().toString() +"'";            
            ResultSet rs = c.createStatement().executeQuery(sql);
            if (rs.next()) {
                 int PT=rs.getInt("PartTime"); 
                    if(PT==1)
                    {
                         cbParttime.setSelected(true);
                    }
                    else 
                         cbParttime.setSelected(false);       
                }          
              
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
        public void showManager(){
        try {
            String tmp=(String)cmbFilterEmp.getSelectedItem();
            sql = "select b.BossEngName from EmpBoss b left join Employee e on e.MgrName = b.BossID \n" +
                    "where e.FNameEng = N'"+ cmbFilterEmp.getSelectedItem().toString() +"'";            

          ResultSet rs = c.createStatement().executeQuery(sql);
            if (rs.next()) {
                    String Mng = rs.getString("BossEngName");
                    cmbMgs.setSelectedItem(Mng);
                }          
              
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void groupButton(){
        ButtonGroup bg=new ButtonGroup();
        bg.add(radMale);
        bg.add(radFemale);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        LB_EmpNbr = new javax.swing.JLabel();
        txtNrb = new javax.swing.JTextField();
        LB_EmpName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        LB_EmpNameEng = new javax.swing.JLabel();
        txtEngName = new javax.swing.JTextField();
        LB_Address = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        LB_EmpDpt = new javax.swing.JLabel();
        cmbDept = new javax.swing.JComboBox();
        LB_EmpGroup = new javax.swing.JLabel();
        cmbLoc = new javax.swing.JComboBox();
        LB_EmpTitle = new javax.swing.JLabel();
        LB_Mgs = new javax.swing.JLabel();
        cmbMgs = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtEngAddress = new javax.swing.JTextArea();
        LB_AddressEng = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        LB_FindDepName = new javax.swing.JLabel();
        btnFilter = new javax.swing.JButton();
        cmbFilterDept = new javax.swing.JComboBox();
        cmbFilterEmp = new javax.swing.JComboBox();
        LB_EmpFindbyName = new javax.swing.JLabel();
        LB_EmpForFind = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        cmbTitle = new javax.swing.JComboBox();
        txtID = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        LB_SexEmp = new javax.swing.JLabel();
        radMale = new javax.swing.JRadioButton();
        radFemale = new javax.swing.JRadioButton();
        txtMobile = new javax.swing.JTextField();
        LB_EmpMobile = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        LB_EmpPhone = new javax.swing.JLabel();
        LB_BDayEmp = new javax.swing.JLabel();
        dtpBirth = new com.toedter.calendar.JDateChooser();
        LB_EmpStartW = new javax.swing.JLabel();
        dtpStartW = new com.toedter.calendar.JDateChooser();
        dtpLeaveW = new com.toedter.calendar.JDateChooser();
        cbLeave = new javax.swing.JCheckBox();
        LB_EmpEndWork = new javax.swing.JLabel();
        LB_Email = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        cbParttime = new javax.swing.JCheckBox();
        Lb_Image = new javax.swing.JLabel();
        LB_EmpPicture = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        LB_FrmofEmp = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameIconified(evt);
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102), 3));
        jPanel1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        LB_EmpNbr.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_EmpNbr.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_EmpNbr.setText("ລະຫັດ:");

        txtNrb.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        LB_EmpName.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_EmpName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_EmpName.setText("ຊື່ແລະນາມສະກຸນ:");

        txtName.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        LB_EmpNameEng.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_EmpNameEng.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_EmpNameEng.setText("ຊື່ແລະນາມສະກຸນ Eng:");

        txtEngName.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        LB_Address.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_Address.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_Address.setText("ທີ່ຢູ່:");

        txtAddress.setColumns(20);
        txtAddress.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        LB_EmpDpt.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_EmpDpt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_EmpDpt.setText("ພະແນກ:");

        cmbDept.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        LB_EmpGroup.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_EmpGroup.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_EmpGroup.setText("ສາຂາ:");

        cmbLoc.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        LB_EmpTitle.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_EmpTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_EmpTitle.setText("ຕຳແໜ່ງ:");

        LB_Mgs.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_Mgs.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_Mgs.setText("ຊື່ຜູ້ຈັດການ:");

        cmbMgs.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbMgs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMgsActionPerformed(evt);
            }
        });

        txtEngAddress.setColumns(20);
        txtEngAddress.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtEngAddress.setRows(5);
        jScrollPane2.setViewportView(txtEngAddress);

        LB_AddressEng.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_AddressEng.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_AddressEng.setText("ທີ່ຢູ່ Eng:");

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102)));

        LB_FindDepName.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_FindDepName.setText("ພະແນກ:");

        btnFilter.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnFilter.setText("ຄົ້ນຫາ");
        btnFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterActionPerformed(evt);
            }
        });

        cmbFilterDept.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbFilterDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFilterDeptActionPerformed(evt);
            }
        });

        cmbFilterEmp.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbFilterEmp.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmbFilterEmpPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cmbFilterEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFilterEmpActionPerformed(evt);
            }
        });

        LB_EmpFindbyName.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_EmpFindbyName.setText("ຊື່ພະນັກງານ:");

        LB_EmpForFind.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_EmpForFind.setText("ຄົ້ນຫາພະນັກງານທີ່ຕ້ອງການແກ້ໄຂ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(LB_EmpFindbyName, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(LB_FindDepName)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbFilterEmp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbFilterDept, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LB_EmpForFind, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(btnFilter)))
                .addContainerGap(170, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(LB_EmpForFind)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbFilterDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LB_FindDepName))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(LB_EmpFindbyName))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(cmbFilterEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnFilter)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        cmbTitle.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        txtID.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtID.setEnabled(false);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102)));

        LB_SexEmp.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_SexEmp.setText("ເພດ:");

        radMale.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        radMale.setText("ຊາຍ");
        radMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radMaleActionPerformed(evt);
            }
        });

        radFemale.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        radFemale.setText("ຍິງ");
        radFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radFemaleActionPerformed(evt);
            }
        });

        txtMobile.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        LB_EmpMobile.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_EmpMobile.setText("ເບີໂທມືຖື:");

        txtPhone.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        LB_EmpPhone.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_EmpPhone.setText("ເບີໂທລະສັບ:");

        LB_BDayEmp.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_BDayEmp.setText("ວັນ,ເດືອນ,ປີເກີດ:");

        dtpBirth.setDateFormatString("dd-MM-yyyy");

        LB_EmpStartW.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_EmpStartW.setText("ວັນທີ່ເຂົ້່າວຽກ:");

        dtpStartW.setDateFormatString("dd-MM-yyyy");

        dtpLeaveW.setDateFormatString("dd-MM-yyyy");
        dtpLeaveW.setEnabled(false);

        cbLeave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLeaveActionPerformed(evt);
            }
        });

        LB_EmpEndWork.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_EmpEndWork.setText("ວັນທີ່ອອກວຽກ:");

        LB_Email.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_Email.setText("Email:");

        txtEmail.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        cbParttime.setText(" Part Time");
        cbParttime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbParttimeActionPerformed(evt);
            }
        });

        Lb_Image.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        Lb_Image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102)));
        Lb_Image.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Lb_Image.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lb_ImageMouseClicked(evt);
            }
        });

        LB_EmpPicture.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_EmpPicture.setText("ຮູບພາບ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LB_SexEmp, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LB_EmpMobile, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LB_EmpPhone, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LB_Email, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LB_EmpEndWork, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LB_EmpStartW, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LB_BDayEmp, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dtpBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dtpStartW, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dtpLeaveW, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbParttime)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(cbLeave)
                                .addGap(18, 18, 18)
                                .addComponent(Lb_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(radMale)
                        .addGap(37, 37, 37)
                        .addComponent(radFemale)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LB_EmpPicture)
                        .addGap(93, 93, 93))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radFemale)
                            .addComponent(radMale)
                            .addComponent(LB_SexEmp))
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(LB_EmpPicture)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LB_EmpMobile))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LB_EmpPhone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LB_BDayEmp)
                            .addComponent(dtpBirth, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dtpStartW, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LB_EmpStartW, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dtpLeaveW, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LB_EmpEndWork, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(cbLeave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(Lb_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB_Email)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbParttime)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LB_EmpNbr, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LB_EmpName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LB_EmpNameEng, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LB_EmpGroup, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LB_EmpTitle, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LB_EmpDpt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LB_Mgs, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LB_Address, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LB_AddressEng, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNrb, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEngName, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDept, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMgs, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete)
                .addGap(568, 568, 568))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LB_EmpNbr)
                            .addComponent(txtNrb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LB_EmpName)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LB_EmpNameEng)
                            .addComponent(txtEngName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LB_EmpGroup)
                            .addComponent(cmbLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LB_EmpTitle)
                            .addComponent(cmbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LB_EmpDpt)
                            .addComponent(cmbDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LB_Mgs)
                            .addComponent(cmbMgs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LB_Address))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LB_AddressEng)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSave))))
                .addGap(40, 40, 40))
        );

        jPanel4.setBackground(new java.awt.Color(255, 153, 153));

        LB_FrmofEmp.setFont(new java.awt.Font("Saysettha OT", 1, 18)); // NOI18N
        LB_FrmofEmp.setText("ໜ້າຟຼອມຂອງພະນັກງານ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LB_FrmofEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(354, 354, 354))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(LB_FrmofEmp)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        ShowMLoc();
        ShowTtile();
        ShowDept();
        ShowMgs();
        ShowFilter();
    }//GEN-LAST:event_formInternalFrameOpened
    private static BufferedImage ResizeScall(Image im , int w, int h){
        try {
            BufferedImage buff = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
            Graphics2D g = buff.createGraphics();
            g.drawImage(im, 0, 0, w, h, null);
            g.dispose();
            return buff;
            
        } catch (Exception e) {
        }
        return null;
    }
    private void formInternalFrameIconified(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameIconified
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameIconified

    private void cbLeaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLeaveActionPerformed
        if(cbLeave.isSelected()){
            Active=1;
            dtpLeaveW.setEnabled(true);
        }
        else{
            Active=0;
            dtpLeaveW.setEnabled(false);
        }

    }//GEN-LAST:event_cbLeaveActionPerformed

    private void radFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radFemaleActionPerformed
        if(radFemale.isSelected())
        sex="ຍິງ Female";
    }//GEN-LAST:event_radFemaleActionPerformed

    private void radMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radMaleActionPerformed
        if(radMale.isSelected())
        sex="ຊາຍ Male";

    }//GEN-LAST:event_radMaleActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try {
            if (txtID.getText().equals("")||txtName.getText().equals("")){
                int type = JOptionPane.WARNING_MESSAGE;
                String a = "Error...Please Check your data again.";
                String b = "MESSAGE";
                JOptionPane.showMessageDialog(null, a,b,type);
                return;
            }
            java.util.Date dt1, dt2,dt3;
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            dt1 = dtpBirth.getDate();
            dt2 = dtpStartW.getDate();
            dt3= dtpLeaveW.getDate();
            String str1 = (String) df.format(dtpBirth.getDate());
            String str2 = (String) df.format(dtpStartW.getDate());
            //String str3 = (String) df.format(dtpLeaveW.getDate());
            int Loc =cmbLoc.getSelectedIndex();
            int Tit =cmbTitle.getSelectedIndex();
            int Dtp =cmbDept.getSelectedIndex();
            int Mg =cmbMgs.getSelectedIndex();
            if (JOptionPane.showConfirmDialog(null, "Do you like to Save ?", "Message", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
                sql = "Update Employee Set EIDNbr=?,FName=?,FNameEng=?,LocID=?,TitleID=?\n" +
                ",DPID=?,MgrName=?,Address=?,AddressEng=?,MPhone=?,HPhone=?,Sex=?,BDay=?\n" +
                ",StartDate=?,NotActive=?,EEmail=? where EID=(?)";
                PreparedStatement p = c.prepareStatement(sql);
                p.setString(1, txtNrb.getText());
                p.setString(2, txtName.getText());
                p.setString(3, txtEngName.getText());
                p.setString(4, MLoc.get(Loc).toString());
                p.setString(5, Title.get(Tit).toString());
                p.setString(6, Dept.get(Dtp).toString());
                p.setString(7, Mgs.get(Mg).toString());
                p.setString(8, txtAddress.getText());
                p.setString(9, txtEngAddress.getText());
                p.setString(10, txtMobile.getText());
                p.setString(11, txtPhone.getText());
                p.setString(12, sex);
                p.setString(13, str1);
                p.setString(14, str2);
                p.setInt(15, Active);
                p.setString(16, txtEmail.getText());
                p.setString(17, txtID.getText());
                if (p.executeUpdate()!=-1){
                    int type = JOptionPane.OK_OPTION;
                    String a = "Finished.";
                    String b = "MESSAGE";
                    JOptionPane.showMessageDialog(null, a,b,type);
                    //  AllClear();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            //int type = JOptionPane.WARNING_MESSAGE;
            //      String a = "Error...Check your data again.";
            //       String b = "MESSAGE";
            //      JOptionPane.showMessageDialog(null, a,b,type);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        try {
            if (txtNrb.getText().equals("")||txtName.getText().equals("")){
                int type = JOptionPane.WARNING_MESSAGE;
                String a = "Error...Please Check your data again.";
                String b = "MESSAGE";
                JOptionPane.showMessageDialog(null, a,b,type);
                return;
            }
            java.util.Date dt1, dt2,dt3,dt4;
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            dt1 = dtpBirth.getDate();
            dt2 = dtpStartW.getDate();
            dt3= dtpLeaveW.getDate();
            String str1 = (String) df.format(dtpBirth.getDate());
            String str2 = (String) df.format(dtpStartW.getDate());

            int Loc =cmbLoc.getSelectedIndex();
            int Tit =cmbTitle.getSelectedIndex();
            int Dtp =cmbDept.getSelectedIndex();
            int Mg =cmbMgs.getSelectedIndex();
            if (JOptionPane.showConfirmDialog(null, "Do you like to Save ?", "Message", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
                sql = "Insert into Employee(EIDNbr,FName,FNameEng,LocID,TitleID,DPID,MgrName,Address,AddressEng,MPhone,HPhone,Sex,BDay,StartDate,NotActive,EEmail,PartTime)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement p = c.prepareStatement(sql);
                p.setString(1, txtNrb.getText());
                p.setString(2, txtName.getText());
                p.setString(3, txtEngName.getText());
                p.setString(4, MLoc.get(Loc).toString());
                p.setString(5, Title.get(Tit).toString());
                p.setString(6, Dept.get(Dtp).toString());
                p.setString(7, Mgs.get(Mg).toString());
                p.setString(8, txtAddress.getText());
                p.setString(9, txtEngAddress.getText());
                p.setString(10, txtMobile.getText());
                p.setString(11, txtPhone.getText());
                p.setString(12, sex);
                p.setString(13, str1);
                p.setString(14, str2);
                //                 if(cbLeave.isSelected()){
                    //                     String str3 = (String) df.format(dtpLeaveW.getDate());
                    //                    p.setString(15, str3);
                    //                    }
                //                    else{
                    //                        String str3 =  (String) df.format(dt3.getDate());
                    //                        p.setString(15, str3);
                    //                        }
                p.setInt(15, Active);
                p.setString(16, txtEmail.getText());
                p.setInt(17, PartTime1);
                if (p.executeUpdate()!=-1){
                    int type = JOptionPane.OK_OPTION;
                    String a = "Finished.";
                    String b = "MESSAGE";
                    JOptionPane.showMessageDialog(null, a,b,type);
                    //  AllClear();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            //int type = JOptionPane.WARNING_MESSAGE;
            //      String a = "Error...Check your data again.";
            //       String b = "MESSAGE";
            //      JOptionPane.showMessageDialog(null, a,b,type);
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void cmbFilterEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFilterEmpActionPerformed
        try {
            showEmployee_name();
            showManager();
            radioSelected();
            checkTerm();
            checkPartTime();
        } catch (Exception e) {
            //e.printStackTrace();
        }
    }//GEN-LAST:event_cmbFilterEmpActionPerformed

    private void cmbFilterEmpPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmbFilterEmpPopupMenuWillBecomeInvisible

    }//GEN-LAST:event_cmbFilterEmpPopupMenuWillBecomeInvisible

    private void cmbFilterDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFilterDeptActionPerformed
        try {
            int Emp =cmbFilterDept.getSelectedIndex();
            DefaultComboBoxModel mode = new DefaultComboBoxModel();
            sql = "SELECT dbo.Employee.EID, dbo.Employee.FNameEng\n" +
            "FROM dbo.Employee INNER JOIN\n" +
            " dbo.Department ON dbo.Employee.DPID = dbo.Department.DPID\n" +
            "WHERE (dbo.Employee.DPID ='"+ Dept1.get(Emp) +"')";
            mode.removeAllElements();
            Dept2.clear();
            ResultSet rs = c.createStatement().executeQuery(sql);
            while (rs.next()){
                Dept2.add(rs.getString("EID"));
                mode.addElement(rs.getString("FNameEng"));
            }
            cmbFilterEmp.setModel(mode);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cmbFilterDeptActionPerformed

    private void btnFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterActionPerformed

    }//GEN-LAST:event_btnFilterActionPerformed

    private void cbParttimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbParttimeActionPerformed
        if(cbParttime.isSelected()){
            PartTime1=1;}
        else{
            PartTime1=0;}
    }//GEN-LAST:event_cbParttimeActionPerformed

    private void cmbMgsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMgsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMgsActionPerformed

    private void Lb_ImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lb_ImageMouseClicked
        try {
            if (evt.getClickCount()==2){
                JFileChooser choose = new JFileChooser();
                choose.showOpenDialog(this);
                path = choose.getSelectedFile().getAbsolutePath();
                ImageIcon icon = new ImageIcon(path);
                Image im = new ImageIcon(path).getImage();
                Image ico = ResizeScall(im, Lb_Image.getWidth(), Lb_Image.getHeight());
                Lb_Image.setIcon(new ImageIcon(ico));

            }

        } catch (Exception e) {
            // e.printStackTrace();
        }
    }//GEN-LAST:event_Lb_ImageMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       
    }//GEN-LAST:event_btnDeleteActionPerformed
     private void ShowFilter(){
        try {
            DefaultComboBoxModel mode = new DefaultComboBoxModel();
            sql = "Select DPID, DName from Department ";
            mode.removeAllElements();
            Dept1.clear();
            ResultSet rs = c.createStatement().executeQuery(sql);
            while (rs.next()){
               Dept1.add(rs.getString("DPID"));
                mode.addElement(rs.getString("DName"));                
            }
            cmbFilterDept.setModel(mode);
        } catch (Exception e) {
       }
    }
    private void ShowMLoc(){
        try {
            DefaultComboBoxModel mode = new DefaultComboBoxModel();
            sql = "Select LOCID, LOCName from Location ";
            mode.removeAllElements();
            MLoc.clear();
            ResultSet rs = c.createStatement().executeQuery(sql);
            while (rs.next()){
               MLoc.add(rs.getString("LOCID"));
                mode.addElement(rs.getString("LOCName"));                
            }
            cmbLoc.setModel(mode);
        } catch (Exception e) {
       }
    }
     private void ShowTtile(){
        try {
            DefaultComboBoxModel mode = new DefaultComboBoxModel();
            sql = "Select TitleID, TName from Title ";
            mode.removeAllElements();
            Title.clear();
            ResultSet rs = c.createStatement().executeQuery(sql);
            while (rs.next()){
               Title.add(rs.getString("TitleID"));
                mode.addElement(rs.getString("TName"));                
            }
            cmbTitle.setModel(mode);
        } catch (Exception e) {
       }
     }
      private void ShowDept(){
        try {
            DefaultComboBoxModel mode = new DefaultComboBoxModel();
            sql = "Select DPID, DName from Department ";
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
      private void ShowMgs(){
        try {
            DefaultComboBoxModel mode = new DefaultComboBoxModel();
            sql = "Select EID, FNameEng from Employee where TitleID=10 or TitleID=11 or TitleID=12 or TitleID=13";
            mode.removeAllElements();
            Mgs.clear();
            ResultSet rs = c.createStatement().executeQuery(sql);
            while (rs.next()){
               Mgs.add(rs.getString("EID"));
                mode.addElement(rs.getString("FNameEng"));                
            }
            cmbMgs.setModel(mode);
        } catch (Exception e) {
       }
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LB_Address;
    private javax.swing.JLabel LB_AddressEng;
    private javax.swing.JLabel LB_BDayEmp;
    private javax.swing.JLabel LB_Email;
    private javax.swing.JLabel LB_EmpDpt;
    private javax.swing.JLabel LB_EmpEndWork;
    private javax.swing.JLabel LB_EmpFindbyName;
    private javax.swing.JLabel LB_EmpForFind;
    private javax.swing.JLabel LB_EmpGroup;
    private javax.swing.JLabel LB_EmpMobile;
    private javax.swing.JLabel LB_EmpName;
    private javax.swing.JLabel LB_EmpNameEng;
    private javax.swing.JLabel LB_EmpNbr;
    private javax.swing.JLabel LB_EmpPhone;
    private javax.swing.JLabel LB_EmpPicture;
    private javax.swing.JLabel LB_EmpStartW;
    private javax.swing.JLabel LB_EmpTitle;
    private javax.swing.JLabel LB_FindDepName;
    private javax.swing.JLabel LB_FrmofEmp;
    private javax.swing.JLabel LB_Mgs;
    private javax.swing.JLabel LB_SexEmp;
    private javax.swing.JLabel Lb_Image;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnFilter;
    private javax.swing.JButton btnSave;
    private javax.swing.JCheckBox cbLeave;
    private javax.swing.JCheckBox cbParttime;
    private javax.swing.JComboBox cmbDept;
    private javax.swing.JComboBox cmbFilterDept;
    private javax.swing.JComboBox cmbFilterEmp;
    private javax.swing.JComboBox cmbLoc;
    private javax.swing.JComboBox cmbMgs;
    private javax.swing.JComboBox cmbTitle;
    private com.toedter.calendar.JDateChooser dtpBirth;
    private com.toedter.calendar.JDateChooser dtpLeaveW;
    private com.toedter.calendar.JDateChooser dtpStartW;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton radFemale;
    private javax.swing.JRadioButton radMale;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextArea txtEngAddress;
    private javax.swing.JTextField txtEngName;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNrb;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
