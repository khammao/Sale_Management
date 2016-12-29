/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Form;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import javax.swing.ButtonGroup;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author khammaox
 */
public class frmMain extends javax.swing.JFrame {

    Connection c=DB.getConnection();
    String sql;
     public String LB_Department1;
    public frmMain() {
        initComponents();
    }

    public void showMenuReportLocPosition(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ MenuItem_ReportPosition.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            MenuItem_ReportPosition.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void showMenuReportLocGroup(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ MenuItem_ReportLocGroup.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            MenuItem_ReportLocGroup.setText(a);
        }     
    } catch (Exception e) {
    }
}
    public void showMenuCheckOut(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ btnEmgGetLeaved.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            btnEmgGetLeaved.setText(a);
        }     
    } catch (Exception e) {
    }
}     
 //==========================================For English Languege================================================
    public void showMenuReportLocType(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ MenuItem_ReportTypeLoc.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            MenuItem_ReportTypeLoc.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void showMenuReportLoc(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ MenuItem_ReportLoc.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            MenuItem_ReportLoc.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void showMenuReportDept(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ MenuItem_ReportDept.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            MenuItem_ReportDept.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void showMenuReportEmpTerm(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ MenuItem_ReportLeaveEmp.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            MenuItem_ReportLeaveEmp.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void showMenuReportEmpAct(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ MenuItem_ReportActiveEmp.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            MenuItem_ReportActiveEmp.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void showMenuReportMain(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ Menu_Report.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            Menu_Report.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void showMenuPosition(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ MenuItem_Position.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            MenuItem_Position.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void showMenuLoc(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ MenuItem_Loc.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            MenuItem_Loc.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void showMenuLocType(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ MenuItem_LocType.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            MenuItem_LocType.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void showMenuLocGroup(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ MenuItem_LocGroup.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            MenuItem_LocGroup.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void showMenuDept(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ MenuItem_Dept.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            MenuItem_Dept.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void showManage(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ Menu_Manage.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            Menu_Manage.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void showAddEmg(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ btnAddEmp.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            btnAddEmp.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void showEngActive(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ btnEngActive.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            btnEngActive.setText(a);
        }     
    } catch (Exception e) {
    }
} 
   public void showMenuAbout(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ Menu_Abount.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            Menu_Abount.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void showEngLeaved(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ btnEmpTerm.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            btnEmpTerm.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    
   //==========================================For Laos Languege================================================
    public void showlaosMenuAbout(){
    try {
        sql= "Select Laos from LDClanguage where English = N'"+ Menu_Abount.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("Laos");
            Menu_Abount.setText(a);
        }     
    } catch (Exception e) {
    }
}  
    public void showlaosCheckOut(){
    try {
        sql= "Select Laos from LDClanguage where English = N'"+ btnEmgGetLeaved.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("Laos");
            btnEmgGetLeaved.setText(a);
        }     
    } catch (Exception e) {
    }
}  
    public void showlaosReportLocPosition(){
    try {
        sql= "Select Laos from LDClanguage where English = N'"+ MenuItem_ReportPosition.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("Laos");
            MenuItem_ReportPosition.setText(a);
        }     
    } catch (Exception e) {
    }
}  
   public void showlaosReportLocGroup(){
    try {
        sql= "Select Laos from LDClanguage where English = N'"+ MenuItem_ReportLocGroup.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("Laos");
            MenuItem_ReportLocGroup.setText(a);
        }     
    } catch (Exception e) {
    }
}   
   public void showlaosReportLocType(){
    try {
        sql= "Select Laos from LDClanguage where English = N'"+ MenuItem_ReportTypeLoc.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("Laos");
            MenuItem_ReportTypeLoc.setText(a);
        }     
    } catch (Exception e) {
    }
}   
   public void showlaosReportLocation(){
    try {
        sql= "Select Laos from LDClanguage where English = N'"+ MenuItem_ReportLoc.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("Laos");
            MenuItem_ReportLoc.setText(a);
        }     
    } catch (Exception e) {
    }
}   
   public void showlaosReportDept(){
    try {
        sql= "Select Laos from LDClanguage where English = N'"+ MenuItem_ReportDept.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("Laos");
            MenuItem_ReportDept.setText(a);
        }     
    } catch (Exception e) {
    }
}   
   public void showlaosReportEmpTerm(){
    try {
        sql= "Select Laos from LDClanguage where English = N'"+ MenuItem_ReportLeaveEmp.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("Laos");
            MenuItem_ReportLeaveEmp.setText(a);
        }     
    } catch (Exception e) {
    }
}   
   public void showlaosReportEmpAct(){
    try {
        sql= "Select Laos from LDClanguage where English = N'"+ MenuItem_ReportActiveEmp.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("Laos");
            MenuItem_ReportActiveEmp.setText(a);
        }     
    } catch (Exception e) {
    }
}   
   public void showlaosReport(){
    try {
        sql= "Select Laos from LDClanguage where English = N'"+ Menu_Report.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("Laos");
            Menu_Report.setText(a);
        }     
    } catch (Exception e) {
    }
}   
   public void showlaosPosition(){
    try {
        sql= "Select Laos from LDClanguage where English = N'"+ MenuItem_Position.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("Laos");
            MenuItem_Position.setText(a);
        }     
    } catch (Exception e) {
    }
}  
   public void showlaosLocat(){
    try {
        sql= "Select Laos from LDClanguage where English = N'"+ MenuItem_Loc.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("Laos");
            MenuItem_Loc.setText(a);
        }     
    } catch (Exception e) {
    }
}  
   public void showlaosLocType(){
    try {
        sql= "Select Laos from LDClanguage where English = N'"+ MenuItem_LocType.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("Laos");
            MenuItem_LocType.setText(a);
        }     
    } catch (Exception e) {
    }
}  
   public void showlaosLocGroup(){
    try {
        sql= "Select Laos from LDClanguage where English = N'"+ MenuItem_LocGroup.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("Laos");
            MenuItem_LocGroup.setText(a);
        }     
    } catch (Exception e) {
    }
} 
   public void showlaosDept(){
    try {
        sql= "Select Laos from LDClanguage where English = N'"+ MenuItem_Dept.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("Laos");
            MenuItem_Dept.setText(a);
        }     
    } catch (Exception e) {
    }
} 
   public void showlaosManage(){
    try {
        sql= "Select Laos from LDClanguage where English = N'"+ Menu_Manage.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("Laos");
            Menu_Manage.setText(a);
        }     
    } catch (Exception e) {
    }
} 
   public void showlaosATermEmg(){
    try {
        sql= "Select Laos from LDClanguage where English = N'"+ btnEmpTerm.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("Laos");
            btnEmpTerm.setText(a);
        }     
    } catch (Exception e) {
    }
} 
   public void showlaosAddEmg(){
    try {
        sql= "Select Laos from LDClanguage where English = N'"+ btnAddEmp.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("Laos");
            btnAddEmp.setText(a);
        }     
    } catch (Exception e) {
    }
    
} 
   public void showlaosActiveEmg(){
    try {
        sql= "Select Laos from LDClanguage where English = N'"+ btnEngActive.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("Laos");
            btnEngActive.setText(a);
        }     
    } catch (Exception e) {
    } 
} 
   //===============================================================================================================
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnEngActive = new javax.swing.JButton();
        btnAddEmp = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnEmpTerm = new javax.swing.JButton();
        radLaos = new javax.swing.JRadioButton();
        radEng = new javax.swing.JRadioButton();
        btnEmgGetLeaved = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        Menu_Manage = new javax.swing.JMenu();
        MenuItem_Dept = new javax.swing.JMenuItem();
        MenuItem_LocGroup = new javax.swing.JMenuItem();
        MenuItem_LocType = new javax.swing.JMenuItem();
        MenuItem_Loc = new javax.swing.JMenuItem();
        MenuItem_Position = new javax.swing.JMenuItem();
        Menu_Report = new javax.swing.JMenu();
        MenuItem_ReportActiveEmp = new javax.swing.JMenuItem();
        MenuItem_ReportLeaveEmp = new javax.swing.JMenuItem();
        MenuItem_ReportDept = new javax.swing.JMenuItem();
        MenuItem_ReportLoc = new javax.swing.JMenuItem();
        MenuItem_ReportTypeLoc = new javax.swing.JMenuItem();
        MenuItem_ReportLocGroup = new javax.swing.JMenuItem();
        MenuItem_ReportPosition = new javax.swing.JMenuItem();
        Menu_Abount = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnEngActive.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        btnEngActive.setText("ພະນັກງານທີ່ຍັງຢູ່");
        btnEngActive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEngActiveActionPerformed(evt);
            }
        });

        btnAddEmp.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        btnAddEmp.setText("ເພີ່ມພະນັກງານໃໝ່");
        btnAddEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEmpActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(92, 157, 157));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 195, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        btnEmpTerm.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        btnEmpTerm.setText("ພະນັກງານທີ່ອອກແລ້ວ");
        btnEmpTerm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpTermActionPerformed(evt);
            }
        });

        radLaos.setText("Lao");
        radLaos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radLaosActionPerformed(evt);
            }
        });

        radEng.setText("English");
        radEng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radEngActionPerformed(evt);
            }
        });

        btnEmgGetLeaved.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        btnEmgGetLeaved.setText("ເອົາພະນັກງານອອກ");
        btnEmgGetLeaved.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmgGetLeavedActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(radLaos)
                        .addGap(34, 34, 34)
                        .addComponent(radEng)
                        .addGap(14, 14, 14))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEmgGetLeaved, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEmpTerm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEngActive, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAddEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radLaos)
                    .addComponent(radEng))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEmgGetLeaved, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEngActive, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEmpTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jButton1)
                .addContainerGap(316, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_START);

        jPanel3.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 699, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 604, Short.MAX_VALUE)
        );

        jPanel3.add(jDesktopPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        Menu_Manage.setMnemonic('f');
        Menu_Manage.setText("ຈັດການຂ້ມູນຫຼັກ");
        Menu_Manage.setFont(new java.awt.Font("Saysettha OT", 1, 18)); // NOI18N

        MenuItem_Dept.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        MenuItem_Dept.setMnemonic('o');
        MenuItem_Dept.setText("ຂໍ້ມູນພະແນກ");
        MenuItem_Dept.setToolTipText("");
        MenuItem_Dept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_DeptActionPerformed(evt);
            }
        });
        Menu_Manage.add(MenuItem_Dept);

        MenuItem_LocGroup.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        MenuItem_LocGroup.setText("ຂໍ້ມູນກຸ່ມສາຂາ");
        MenuItem_LocGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_LocGroupActionPerformed(evt);
            }
        });
        Menu_Manage.add(MenuItem_LocGroup);

        MenuItem_LocType.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        MenuItem_LocType.setText("ຂໍ້ມູນປະເພດສາຂາ");
        MenuItem_LocType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_LocTypeActionPerformed(evt);
            }
        });
        Menu_Manage.add(MenuItem_LocType);

        MenuItem_Loc.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        MenuItem_Loc.setMnemonic('a');
        MenuItem_Loc.setText("ຂໍ້ມູນສາຂາ");
        MenuItem_Loc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_LocActionPerformed(evt);
            }
        });
        Menu_Manage.add(MenuItem_Loc);

        MenuItem_Position.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        MenuItem_Position.setText("ຕຳແໜ່ງພະນັກງານ");
        MenuItem_Position.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_PositionActionPerformed(evt);
            }
        });
        Menu_Manage.add(MenuItem_Position);

        menuBar.add(Menu_Manage);

        Menu_Report.setMnemonic('e');
        Menu_Report.setText("ລາຍງານ");
        Menu_Report.setFont(new java.awt.Font("Saysettha OT", 1, 18)); // NOI18N

        MenuItem_ReportActiveEmp.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        MenuItem_ReportActiveEmp.setMnemonic('t');
        MenuItem_ReportActiveEmp.setText("ລາຍງານພະນັກງານທີ່ຍັງຢູ່");
        MenuItem_ReportActiveEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_ReportActiveEmpActionPerformed(evt);
            }
        });
        Menu_Report.add(MenuItem_ReportActiveEmp);

        MenuItem_ReportLeaveEmp.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        MenuItem_ReportLeaveEmp.setText("ລາຍງານພະນັກງານທີ່ອອກແລ້ວ");
        MenuItem_ReportLeaveEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_ReportLeaveEmpActionPerformed(evt);
            }
        });
        Menu_Report.add(MenuItem_ReportLeaveEmp);

        MenuItem_ReportDept.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        MenuItem_ReportDept.setText("ລາຍງານພະແນກ");
        MenuItem_ReportDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_ReportDeptActionPerformed(evt);
            }
        });
        Menu_Report.add(MenuItem_ReportDept);

        MenuItem_ReportLoc.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        MenuItem_ReportLoc.setText("ລາຍງານສາຂາ");
        MenuItem_ReportLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_ReportLocActionPerformed(evt);
            }
        });
        Menu_Report.add(MenuItem_ReportLoc);

        MenuItem_ReportTypeLoc.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        MenuItem_ReportTypeLoc.setText("ລາຍງານປະເພດສາຂາ");
        MenuItem_ReportTypeLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_ReportTypeLocActionPerformed(evt);
            }
        });
        Menu_Report.add(MenuItem_ReportTypeLoc);

        MenuItem_ReportLocGroup.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        MenuItem_ReportLocGroup.setText("ລາຍງານກຸ່ມສາຂາ");
        MenuItem_ReportLocGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_ReportLocGroupActionPerformed(evt);
            }
        });
        Menu_Report.add(MenuItem_ReportLocGroup);

        MenuItem_ReportPosition.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        MenuItem_ReportPosition.setText("ລາຍງານຕຳແໜ່ງຂອງພະນັກງານ");
        MenuItem_ReportPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_ReportPositionActionPerformed(evt);
            }
        });
        Menu_Report.add(MenuItem_ReportPosition);

        menuBar.add(Menu_Report);

        Menu_Abount.setMnemonic('h');
        Menu_Abount.setText("ກ່ຽວກັບລະບົບ");
        Menu_Abount.setFont(new java.awt.Font("Saysettha OT", 1, 18)); // NOI18N
        Menu_Abount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_AbountActionPerformed(evt);
            }
        });
        menuBar.add(Menu_Abount);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
            int w = (int)d.getWidth();
            int h = (int)d. getHeight();
            setBounds(0,0,w,h);
            groupButton();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_formWindowOpened
     public void groupButton(){
        ButtonGroup bg=new ButtonGroup();
        bg.add(radLaos);
        bg.add(radEng);
    }
    private void btnEngActiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEngActiveActionPerformed
         try {
            frmEmpActiveList e = new frmEmpActiveList();
            e.setVisible(true);
            jDesktopPane1.add(e);
            if(radEng.isSelected()){
               e.showEngLB_EmpDeptSelect();
               e.showEngLB_EmpStoreSelect();
               e.showEngLB_EmpActiveList();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnEngActiveActionPerformed

    private void btnAddEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEmpActionPerformed
        try {
            frmEmployee e = new frmEmployee();
            e.setVisible(true);
            jDesktopPane1.add(e);
            if(radEng.isSelected()){
                e.showEngLBfrmEmp();
                e.showEngLBEmpNbr();
                e.showEngLBEmpFullName();
                e.showEngLBEmpFullNameEng();
                e.showEngLBEmpLoc();
                e.showEngLBEmpTitle();
                e.showEngLBEmpDept();
                e.showEngLBEmpMgs();
                e.showEngLBEmpAddress();
                e.showEngLBEmpAddressEng();
                e.showEngLBEmpSex();
                e.showEngLBEmpSexMale();
                e.showEngLBEmpSexFeMale();
                e.showEngLBEmpMobile();
                e.showEngLBEmpTel();
                e.showEngLBEmpBDay();
                e.showEngLBEmpStartdate();
                e.showEngLBEmpEnddate();
                e.showEngLBEmpBtnSave();
                e.showEngLBEmpBtnEdit();
                e.showEngLBEmpBtnDelete();
                e.showEngLBEmpLBFindDept();
                e.showEngLBEmpLBFindName();
                e.showEngBtnFindEmp();
                e.showEngLB_ForFinfToEdit();
                e.showEngLB_EmpPicture();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnAddEmpActionPerformed

    private void btnEmpTermActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpTermActionPerformed
        try {
            frmEmpTermList e = new frmEmpTermList();
            e.setVisible(true);
            jDesktopPane1.add(e);
             if(radEng.isSelected()){
                e.showEngLB_EmpTermListtStore();
                e.showEngLB_EmpTermListDept();
                e.showEngLB_EmpListofOut();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnEmpTermActionPerformed

    private void MenuItem_DeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_DeptActionPerformed
        try {
            frmDepartment e = new frmDepartment();
            e.setVisible(true);
                
            jDesktopPane1.add(e);
            if (radEng.isSelected()){
                e.showEngDepartment();
                e.showEngbtnDptFind();
                e.showEngbtnDptName();
                e.showEngbtnDptNameLong();
                e.showEngbtndtpNew();
                e.showEngbtndtpSave();
                e.showEngbtndtpEdit();
                e.showEngbtndtpDelete();
            }
             
       
        } catch (Exception e) {
        }
    }//GEN-LAST:event_MenuItem_DeptActionPerformed

    private void MenuItem_LocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_LocActionPerformed
      try {
            frmLocation e = new frmLocation();
            e.setVisible(true);
            jDesktopPane1.add(e);
            if(radEng.isSelected()){
            e.showEngLBLocNbr();
            e.showEngLBStoreName();
            e.showEngLBStoreType();
            e.showEngLBStoreGroup();
            e.showEngstorebtnNew();
            e.showEngstorebtnSave();
            e.showEngstorebtnEdit();
            e.showEngstorebtnDelete();
            e.showEngstorebtnFind();
            e.showEngstoreLBFindNameorID();
            }
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_MenuItem_LocActionPerformed

    private void MenuItem_LocGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_LocGroupActionPerformed
       try {
            frmLocType e = new frmLocType();
            e.setVisible(true);
            jDesktopPane1.add(e);
            if (radEng.isSelected()){
                e.showEngbtnFindGST();
                e.showEngbtnFindGST1();
                e.showEngbtnSave();
                e.showEngbtnEdit();
                e.showEngbtnDelete();
                e.showEngbtnNew();
                e.showEngLBGSTID();
                e.showEngLBGSTName();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_MenuItem_LocGroupActionPerformed

    private void MenuItem_LocTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_LocTypeActionPerformed
          try {
            frmLocStoreType e = new frmLocStoreType();
            e.setVisible(true);
            jDesktopPane1.add(e);
            if(radEng.isSelected()){
                e.showEngLBFindLocType();
                e.showEngbtnFilterLocType();
                e.showEngLBLocTypeID();
                e.showEngLBLocTypeName();
                e.showEngbtnLocTypeNew();
                e.showEngbtnLocTypeSave();
                e.showEngbtnLocTypeEdit();
                e.showEngbtnLocTypeDelete();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_MenuItem_LocTypeActionPerformed

    private void Menu_AbountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_AbountActionPerformed
        try {
            frmAbout e = new frmAbout();
            e.setVisible(true);
            jDesktopPane1.add(e);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_Menu_AbountActionPerformed

    private void MenuItem_PositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_PositionActionPerformed
        try {
            frmPosition e = new frmPosition();
            e.setVisible(true);
            jDesktopPane1.add(e);
            if (radEng.isSelected()){
                e.showEngstoreLBnumorname();
                e.showEngbtnTileFilter();
                e.showEngLBTileNameS();    
                e.showEngLBTileNameF();
                e.showEngLBTileLevel();
                e.showEngLBTileSubLevel();
                e.showEngbtnTileAdd();
                e.showEngbtnTileSave();
                e.showEngbtnTileEdit();
                e.showEngbtnTileDelete();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_MenuItem_PositionActionPerformed

    private void MenuItem_ReportDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_ReportDeptActionPerformed
        showReportDept();
    }//GEN-LAST:event_MenuItem_ReportDeptActionPerformed

    private void MenuItem_ReportActiveEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_ReportActiveEmpActionPerformed
       showReportEmp();
    }//GEN-LAST:event_MenuItem_ReportActiveEmpActionPerformed

    private void MenuItem_ReportLeaveEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_ReportLeaveEmpActionPerformed
        showReportEmpTerm();
    }//GEN-LAST:event_MenuItem_ReportLeaveEmpActionPerformed

    private void MenuItem_ReportLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_ReportLocActionPerformed
       showReportStore();
    }//GEN-LAST:event_MenuItem_ReportLocActionPerformed

    private void radEngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radEngActionPerformed

        try {
            
             showMenuCheckOut();
        showAddEmg();
        showEngActive();
        showEngLeaved();
        showManage();
        showMenuDept();
        showMenuLocGroup();
        showMenuLocType();
        showMenuLoc();
        showMenuPosition();
        showMenuReportMain();
        showMenuReportEmpAct();
        showMenuReportEmpTerm();
        showMenuReportDept();
        showMenuReportLoc();
        showMenuReportLocType();
        showMenuReportLocGroup();
        showMenuReportLocPosition();
        showMenuAbout();
        //===========Department==================================
      
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        //frame.showEngDepartment();
    }//GEN-LAST:event_radEngActionPerformed

    private void radLaosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radLaosActionPerformed
        showlaosCheckOut(); 
        showlaosMenuAbout();
        showlaosATermEmg();
        showlaosAddEmg();
        showlaosActiveEmg();
        showlaosManage();
        showlaosDept();
        showlaosLocGroup();
        showlaosLocType();
        showlaosLocat();
        showlaosPosition();
        showlaosReport();
        showlaosReportEmpAct();
        showlaosReportEmpTerm();
        showlaosReportDept();
        showlaosReportLocation();
        showlaosReportLocType();
        showlaosReportLocGroup();
        showlaosReportLocPosition();
    }//GEN-LAST:event_radLaosActionPerformed

    private void MenuItem_ReportPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_ReportPositionActionPerformed
        showReportPosition();
    }//GEN-LAST:event_MenuItem_ReportPositionActionPerformed

    private void MenuItem_ReportTypeLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_ReportTypeLocActionPerformed
       showReportStoreType();
    }//GEN-LAST:event_MenuItem_ReportTypeLocActionPerformed

    private void MenuItem_ReportLocGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_ReportLocGroupActionPerformed
       showReportStoreGroup();
    }//GEN-LAST:event_MenuItem_ReportLocGroupActionPerformed

    private void btnEmgGetLeavedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmgGetLeavedActionPerformed
        try {
            frmEmpOut e = new frmEmpOut();
            e.setVisible(true);
            jDesktopPane1.add(e);
            if(radEng.isSelected()){
                e.showEngLB_EmpOutForm();
                e.showEngLB_EmpOutSelectLoc();
                e.showEngLB_EmpOutRadDept();
                e.showEngLB_EmpOutRadStore();
                e.showEngLB_EmpOutSelectDeptName();
                e.showEngLB_EmpOutID();
                e.showEngLB_EmpOutNameToShow();
                e.showEngLB_EmpOutDateTerm();
                e.showEngLB_EmpOutbtnOk();
                e.showEngLB_EmpOutbtnCancel();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnEmgGetLeavedActionPerformed
    public void showReportStoreGroup(){
        try {
            //Map param = new HashMap();
            JasperPrint print = JasperFillManager.fillReport("Report\\ReportStore_Group.jasper", null, c);
            JFrame fr = new JFrame();
            fr.setTitle("REPORT Store Group");
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
    public void showReportStoreType(){
        try {
            //Map param = new HashMap();
            JasperPrint print = JasperFillManager.fillReport("Report\\ReportStoreType.jasper", null, c);
            JFrame fr = new JFrame();
            fr.setTitle("REPORT Store Type");
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
    public void showReportPosition(){
        try {

            //Map param = new HashMap();
            JasperPrint print = JasperFillManager.fillReport("Report\\ReportPosition.jasper", null, c);
            JFrame fr = new JFrame();
            fr.setTitle("REPORT Position");
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
    public void showReportStore(){
        try {

            //Map param = new HashMap();
            JasperPrint print = JasperFillManager.fillReport("Report\\Report_Store.jasper", null, c);
            JFrame fr = new JFrame();
            fr.setTitle("REPORT Store");
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
    public void showReportEmpTerm(){
        try {

            //Map param = new HashMap();
            JasperPrint print = JasperFillManager.fillReport("Report\\Report_EmpTerm.jasper", null, c);
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
    public void showReportEmp(){
        try {

            //Map param = new HashMap();
            JasperPrint print = JasperFillManager.fillReport("Report\\Report_Emp.jasper", null, c);
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
    public void showReportDept(){
        try {

            //Map param = new HashMap();
            JasperPrint print = JasperFillManager.fillReport("Report\\Report_Department.jasper", null, c);
            JFrame fr = new JFrame();
            fr.setTitle("REPORT Department");
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
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);             
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuItem_Dept;
    private javax.swing.JMenuItem MenuItem_Loc;
    private javax.swing.JMenuItem MenuItem_LocGroup;
    private javax.swing.JMenuItem MenuItem_LocType;
    private javax.swing.JMenuItem MenuItem_Position;
    private javax.swing.JMenuItem MenuItem_ReportActiveEmp;
    private javax.swing.JMenuItem MenuItem_ReportDept;
    private javax.swing.JMenuItem MenuItem_ReportLeaveEmp;
    private javax.swing.JMenuItem MenuItem_ReportLoc;
    private javax.swing.JMenuItem MenuItem_ReportLocGroup;
    private javax.swing.JMenuItem MenuItem_ReportPosition;
    private javax.swing.JMenuItem MenuItem_ReportTypeLoc;
    private javax.swing.JMenu Menu_Abount;
    private javax.swing.JMenu Menu_Manage;
    private javax.swing.JMenu Menu_Report;
    private javax.swing.JButton btnAddEmp;
    private javax.swing.JButton btnEmgGetLeaved;
    private javax.swing.JButton btnEmpTerm;
    private javax.swing.JButton btnEngActive;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JRadioButton radEng;
    private javax.swing.JRadioButton radLaos;
    // End of variables declaration//GEN-END:variables

}
