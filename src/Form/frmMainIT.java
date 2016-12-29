

package Form;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.sql.Connection;
import java.sql.ResultSet;
import javafx.scene.control.RadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLayeredPane;
import org.apache.poi.ss.usermodel.Textbox;

public class frmMainIT extends javax.swing.JFrame {
    Connection c=DB.getConnection();
    String sql;
    public frmMainIT() {
        initComponents();
        GroupLanguage();
       
    }
private void GroupLanguage(){
    ButtonGroup bg=new ButtonGroup();
    bg.add(TextItemRadLao);
    bg.add(TextItemRadEnglish);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnMenuRecordEquipment = new javax.swing.JButton();
        btnMenuOrderDV = new javax.swing.JButton();
        btnMenuRepairDV = new javax.swing.JButton();
        btnMenuCheckDV = new javax.swing.JButton();
        lbimage = new javax.swing.JLabel();
        btnUseEquipment = new javax.swing.JButton();
        btnMenuAddStock = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        TextMenuManagement = new javax.swing.JMenu();
        TextMenuGroup = new javax.swing.JMenuItem();
        TextItemMenuCategory = new javax.swing.JMenuItem();
        TextItemMenuOs = new javax.swing.JMenuItem();
        TextItemMenuBand = new javax.swing.JMenuItem();
        TextMenuUnit = new javax.swing.JMenuItem();
        TextMenureport = new javax.swing.JMenu();
        TextItemMenuReportDVInactive = new javax.swing.JMenuItem();
        TextItemMenuReportDVTerm = new javax.swing.JMenuItem();
        jMenuItemStock = new javax.swing.JMenuItem();
        TextItemMenuReportRepairDV = new javax.swing.JMenuItem();
        TextItemMenuReportOrderDV = new javax.swing.JMenuItem();
        TextMenuLanguage = new javax.swing.JMenu();
        TextItemRadLao = new javax.swing.JRadioButtonMenuItem();
        TextItemRadEnglish = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IT Inventory Application");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255), 4));

        jLabel1.setText("                                                                       ");

        btnMenuRecordEquipment.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        btnMenuRecordEquipment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/folder_new~1.png"))); // NOI18N
        btnMenuRecordEquipment.setText("ບັນທຶກການໃຊ້ອຸປະກອນ");
        btnMenuRecordEquipment.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMenuRecordEquipment.setMaximumSize(new java.awt.Dimension(131, 33));
        btnMenuRecordEquipment.setMinimumSize(new java.awt.Dimension(131, 33));
        btnMenuRecordEquipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuRecordEquipmentActionPerformed(evt);
            }
        });

        btnMenuOrderDV.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        btnMenuOrderDV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/13 di sieu thi.png"))); // NOI18N
        btnMenuOrderDV.setText("ສັ່ງຊື້ອຸປະກອນ IT");
        btnMenuOrderDV.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMenuOrderDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuOrderDVActionPerformed(evt);
            }
        });

        btnMenuRepairDV.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        btnMenuRepairDV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/options-512.png"))); // NOI18N
        btnMenuRepairDV.setText("ການຊ້ອມແປງ");
        btnMenuRepairDV.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMenuRepairDV.setMaximumSize(new java.awt.Dimension(131, 33));
        btnMenuRepairDV.setMinimumSize(new java.awt.Dimension(131, 33));
        btnMenuRepairDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuRepairDVActionPerformed(evt);
            }
        });

        btnMenuCheckDV.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        btnMenuCheckDV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Search_icon_shrunk.png"))); // NOI18N
        btnMenuCheckDV.setText("ກວດສອບອຸປະກອນ");
        btnMenuCheckDV.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMenuCheckDV.setMaximumSize(new java.awt.Dimension(131, 33));
        btnMenuCheckDV.setMinimumSize(new java.awt.Dimension(131, 33));
        btnMenuCheckDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuCheckDVActionPerformed(evt);
            }
        });

        lbimage.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbimage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbimage.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 153), 1, true));

        btnUseEquipment.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        btnUseEquipment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/box-out-icon.png"))); // NOI18N
        btnUseEquipment.setText("ເບີກອຸປະກອນ");
        btnUseEquipment.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnUseEquipment.setMaximumSize(new java.awt.Dimension(131, 33));
        btnUseEquipment.setMinimumSize(new java.awt.Dimension(131, 33));
        btnUseEquipment.setPreferredSize(new java.awt.Dimension(157, 33));
        btnUseEquipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUseEquipmentActionPerformed(evt);
            }
        });

        btnMenuAddStock.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        btnMenuAddStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Package-add.png"))); // NOI18N
        btnMenuAddStock.setText("ເພີ່ມອຸປະກອນ");
        btnMenuAddStock.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMenuAddStock.setMaximumSize(new java.awt.Dimension(131, 33));
        btnMenuAddStock.setMinimumSize(new java.awt.Dimension(131, 33));
        btnMenuAddStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuAddStockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnMenuAddStock, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUseEquipment, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbimage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMenuCheckDV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMenuRepairDV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMenuRecordEquipment, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMenuOrderDV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbimage, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnMenuOrderDV, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMenuAddStock, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(btnUseEquipment, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMenuRecordEquipment, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(btnMenuCheckDV, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMenuRepairDV, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_START);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 204), 4));
        jPanel1.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 922, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 676, Short.MAX_VALUE)
        );

        jPanel1.add(jDesktopPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        TextMenuManagement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/house-icon_2.png"))); // NOI18N
        TextMenuManagement.setText("ຈັດການຂ້ມູນຫຼັກ");
        TextMenuManagement.setFont(new java.awt.Font("Saysettha OT", 1, 18)); // NOI18N
        TextMenuManagement.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        TextMenuGroup.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        TextMenuGroup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon-product-development.png"))); // NOI18N
        TextMenuGroup.setText("ຂໍ້ມູນກຸ່ມສິນຄາ");
        TextMenuGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextMenuGroupActionPerformed(evt);
            }
        });
        TextMenuManagement.add(TextMenuGroup);

        TextItemMenuCategory.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        TextItemMenuCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/inventory_categories.png"))); // NOI18N
        TextItemMenuCategory.setText("ຂໍ້ມູນປະເພດສິນຄ້າ");
        TextItemMenuCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextItemMenuCategoryActionPerformed(evt);
            }
        });
        TextMenuManagement.add(TextItemMenuCategory);

        TextItemMenuOs.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        TextItemMenuOs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Linux-icon.png"))); // NOI18N
        TextItemMenuOs.setText("ລະບົບປະຕິບັດການ");
        TextItemMenuOs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextItemMenuOsActionPerformed(evt);
            }
        });
        TextMenuManagement.add(TextItemMenuOs);

        TextItemMenuBand.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        TextItemMenuBand.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon-data-recovery.png"))); // NOI18N
        TextItemMenuBand.setText("ຍີ່ຫໍ້");
        TextItemMenuBand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextItemMenuBandActionPerformed(evt);
            }
        });
        TextMenuManagement.add(TextItemMenuBand);

        TextMenuUnit.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        TextMenuUnit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Franci-Product-icon.png"))); // NOI18N
        TextMenuUnit.setText("ຫົວໜ່ວຍ");
        TextMenuUnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextMenuUnitActionPerformed(evt);
            }
        });
        TextMenuManagement.add(TextMenuUnit);

        jMenuBar1.add(TextMenuManagement);

        TextMenureport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/folde.png"))); // NOI18N
        TextMenureport.setText("ລາຍງານ");
        TextMenureport.setFont(new java.awt.Font("Saysettha OT", 1, 18)); // NOI18N

        TextItemMenuReportDVInactive.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        TextItemMenuReportDVInactive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/report-icon.gif"))); // NOI18N
        TextItemMenuReportDVInactive.setText("ລາຍງານອຸປະກອນທີ່ໃຊ້ງານຢູ່");
        TextItemMenuReportDVInactive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextItemMenuReportDVInactiveActionPerformed(evt);
            }
        });
        TextMenureport.add(TextItemMenuReportDVInactive);

        TextItemMenuReportDVTerm.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        TextItemMenuReportDVTerm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/report-3-xxl.png"))); // NOI18N
        TextItemMenuReportDVTerm.setText("ລາຍງານອຸປະກອນໝົດອາຍຸການ");
        TextItemMenuReportDVTerm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextItemMenuReportDVTermActionPerformed(evt);
            }
        });
        TextMenureport.add(TextItemMenuReportDVTerm);

        jMenuItemStock.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        jMenuItemStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/finance.png"))); // NOI18N
        jMenuItemStock.setText("ລາຍງານອຸປະກອນໃນສາງ");
        TextMenureport.add(jMenuItemStock);

        TextItemMenuReportRepairDV.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        TextItemMenuReportRepairDV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/report-3-xxl (1).png"))); // NOI18N
        TextItemMenuReportRepairDV.setText("ລາຍງານການຊ້ອມແປງ");
        TextMenureport.add(TextItemMenuReportRepairDV);

        TextItemMenuReportOrderDV.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        TextItemMenuReportOrderDV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/business-report-icon.png"))); // NOI18N
        TextItemMenuReportOrderDV.setText("ລາຍງານການສັ່ງຊື້ເຄື່ອງ IT");
        TextMenureport.add(TextItemMenuReportOrderDV);

        jMenuBar1.add(TextMenureport);

        TextMenuLanguage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Web-management-icon.png"))); // NOI18N
        TextMenuLanguage.setText("ພາສາ");
        TextMenuLanguage.setFont(new java.awt.Font("Saysettha OT", 1, 18)); // NOI18N

        TextItemRadLao.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        TextItemRadLao.setSelected(true);
        TextItemRadLao.setText("Lao");
        TextItemRadLao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/laos_texture.png"))); // NOI18N
        TextItemRadLao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextItemRadLaoActionPerformed(evt);
            }
        });
        TextMenuLanguage.add(TextItemRadLao);

        TextItemRadEnglish.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        TextItemRadEnglish.setSelected(true);
        TextItemRadEnglish.setText("English");
        TextItemRadEnglish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/English_language_icon.png"))); // NOI18N
        TextItemRadEnglish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextItemRadEnglishActionPerformed(evt);
            }
        });
        TextMenuLanguage.add(TextItemRadEnglish);

        jMenuBar1.add(TextMenuLanguage);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void SelectLanguage(){
        try {
            ButtonGroup bg=new ButtonGroup();
            bg.add(TextItemRadLao);
            bg.add(TextItemRadEnglish);
            //checkbox.setSelected(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
   public void CanngeEToLaosGroup(){
    try {
        sql= "Select Laos from LDClanguage where english  = N'"+ TextMenuGroup.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("Laos");
            TextMenuGroup.setText(a);
        }     
    } catch (Exception e) {
    }
} 
   public void CanngeEToLaobtnUseEquipment(){
    try {
        sql= "Select Laos from LDClanguage where english  = N'"+ btnUseEquipment.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("Laos");
            btnUseEquipment.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void CanngeEToLaosUnit(){
    try {
        sql= "Select Laos from LDClanguage where english  = N'"+ TextMenuUnit.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("Laos");
            TextMenuUnit.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void CanngeLaoToEnBtnUseEquipment(){
    try {
        sql= "Select english from LDClanguage where Laos  = N'"+ btnUseEquipment.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            btnUseEquipment.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void CanngeLaoToEngLishUnit(){
    try {
        sql= "Select english from LDClanguage where Laos  = N'"+ TextMenuUnit.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            TextMenuUnit.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void CanngeLaoToEngLishGroup(){
    try {
        sql= "Select english from LDClanguage where  Laos= N'"+ TextMenuGroup.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            TextMenuGroup.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void CanngeLaoToEngLReportStock(){
    try {
        sql= "Select english from LDClanguage where  Laos= N'"+ jMenuItemStock.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            jMenuItemStock.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void CanngeEngToLaoLReportStock(){
    try {
        sql= "Select Laos from LDClanguage where english = N'"+ jMenuItemStock.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("Laos");
            jMenuItemStock.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void CanngeLaoToEngLishReportDVOrder(){
    try {
        sql= "Select Laos from LDClanguage where english = N'"+ TextItemMenuReportOrderDV.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("Laos");
            TextItemMenuReportOrderDV.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void CanngeLaoToEngLishReportDVRepair(){
    try {
        sql= "Select Laos from LDClanguage where english = N'"+ TextItemMenuReportRepairDV.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("Laos");
            TextItemMenuReportRepairDV.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void CanngeLaoToEngLishReportDVTerm(){
    try {
        sql= "Select Laos from LDClanguage where english = N'"+ TextItemMenuReportDVTerm.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("Laos");
            TextItemMenuReportDVTerm.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void CanngeLaoToEngLishReportDVInactive(){
    try {
        sql= "Select Laos from LDClanguage where english = N'"+ TextItemMenuReportDVInactive.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("Laos");
            TextItemMenuReportDVInactive.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void ChangeLTEItemMenuReport(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ TextItemMenuReportOrderDV.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            TextItemMenuReportOrderDV.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void ChangeLTEItemMenuReportDVRepair(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ TextItemMenuReportRepairDV.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            TextItemMenuReportRepairDV.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void ChangeLTEItemMenuReportDVExpired(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ TextItemMenuReportDVTerm.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            TextItemMenuReportDVTerm.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void ChangeLTEItemMenuReportDVActive(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ TextItemMenuReportDVInactive.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            TextItemMenuReportDVInactive.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void ChangeETLMenuBand(){
    try {
        sql= "Select Laos from LDClanguage where english = N'"+ TextItemMenuBand.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("Laos");
            TextItemMenuBand.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void ChangeETLMenuOS(){
    try {
        sql= "Select Laos from LDClanguage where english = N'"+ TextItemMenuOs.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("Laos");
            TextItemMenuOs.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void ChangeETLMenuCategory(){
    try {
        sql= "Select Laos from LDClanguage where english = N'"+ TextItemMenuCategory.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("Laos");
            TextItemMenuCategory.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void ChangeLTEMenuBand(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ TextItemMenuBand.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            TextItemMenuBand.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void ChangeLTEMenuOS(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ TextItemMenuOs.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            TextItemMenuOs.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void ChangeLTEMenuCategory(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ TextItemMenuCategory.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            TextItemMenuCategory.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void CanngeEnglishToLaoBtnCheckDV(){
    try {
        sql= "Select Laos from LDClanguage where english = N'"+ btnMenuCheckDV.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("Laos");
            btnMenuCheckDV.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void CanngeEnglishToLaoBtnRepairDV(){
    try {
        sql= "Select Laos from LDClanguage where english = N'"+ btnMenuRepairDV.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("Laos");
            btnMenuRepairDV.setText(a);
        }     
    } catch (Exception e) {
    }
} 
   public void CanngeEnglishToLaoBtnRecord1(){
    try {
        sql= "Select Laos from LDClanguage where english = N'"+ btnMenuAddStock.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("Laos");
            btnMenuAddStock.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void CanngeEnglishToLaoBtnAddnewDV(){
    try {
        sql= "Select Laos from LDClanguage where english = N'"+ btnMenuRecordEquipment.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("Laos");
            btnMenuRecordEquipment.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void CanngeEnglishToLaoBtnOrderDV(){
    try {
        sql= "Select Laos from LDClanguage where english = N'"+ btnMenuOrderDV.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("Laos");
            btnMenuOrderDV.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void CanngeEnglishToLaoLanguage(){
    try {
        sql= "Select Laos from LDClanguage where english = N'"+ TextMenuLanguage.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("Laos");
            TextMenuLanguage.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void CanngeEnglishToLaoReport(){
    try {
        sql= "Select Laos from LDClanguage where english = N'"+ TextMenureport.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("Laos");
            TextMenureport.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void CanngeEnglishToLaoMenuManagement(){
    try {
        sql= "Select Laos from LDClanguage where english = N'"+ TextMenuManagement.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("Laos");
            TextMenuManagement.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void showEngbtnEquament(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ btnMenuCheckDV.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            btnMenuCheckDV.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void showEngbtnRepair(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ btnMenuRepairDV.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            btnMenuRepairDV.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void showEngbtnAddnewDV(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ btnMenuAddStock.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            btnMenuAddStock.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void showEngbtnRecordEquipment(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ btnMenuRecordEquipment.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            btnMenuRecordEquipment.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void showEngbtnOrderITDV(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ btnMenuOrderDV.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            btnMenuOrderDV.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void showEngTextMenuLanguage(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ TextMenuLanguage.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            TextMenuLanguage.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void showEngTextMenuReport(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ TextMenureport.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            TextMenureport.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    public void showEngTextMenumanage(){
    try {
        sql= "Select english from LDClanguage where Laos = N'"+ TextMenuManagement.getText() +"'";
        ResultSet rs = c.createStatement().executeQuery(sql);
        if (rs.next()){
            String a = rs.getString("english");
            TextMenuManagement.setText(a);
        }     
    } catch (Exception e) {
    }
} 
    private BufferedImage ResizeSccall(Image im, int w, int h){
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
    
   
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       try {

            Image im = new ImageIcon("src/icon/LDC_Import-Export Logo.jpg").getImage();
            Image icon = ResizeSccall(im, lbimage.getWidth(), lbimage.getHeight());
            lbimage.setIcon(new ImageIcon(icon));     
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_formWindowOpened

    private void TextItemMenuOsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextItemMenuOsActionPerformed
       try {
            frmOperatingSystem e = new frmOperatingSystem();
            e.setVisible(true);
            jDesktopPane1.add(e);
            if(TextItemRadEnglish.isSelected()){
               e.ChangeLTELBDataOS();
               e.ChangeLTELBFindIDName();
               e.ChangeLTEbtnFindOk();
               e.ChangeLTELBOSID();
               e.ChangeLTELBOSName();
               e.ChangeLTELbtnSaveOS();
               e.ChangeLTELbtnEditOS();
               e.ChangeLTELbtnDeleteOS();
               e.ChangeLTELbtnAddOS();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_TextItemMenuOsActionPerformed

    private void TextItemMenuCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextItemMenuCategoryActionPerformed
        try {
            frmCategoryType e = new frmCategoryType();
            e.setVisible(true);
            jDesktopPane1.add(e);
            if(TextItemRadEnglish.isSelected()){
                e.ChangeLTELBDataOfCat();
                e.ChangeLTELBCateFindName();
                e.ChangeLTEbtnFind();
                e.ChangeLTELBCatID();
                e.ChangeLTELBCateName();
                e.ChangeLTEbtnSaveCat();
                e.ChangeLTEbtnEditcate();
                e.ChangeLTEbtnDeletecate();
                e.ChangeLTEbtnAddCat();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_TextItemMenuCategoryActionPerformed

    private void TextItemRadEnglishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextItemRadEnglishActionPerformed
        CanngeLaoToEngLReportStock();       
        showEngTextMenumanage();
        showEngbtnRecordEquipment();
        showEngTextMenuReport();
        showEngTextMenuLanguage();
        showEngbtnOrderITDV();
        showEngbtnAddnewDV();
        showEngbtnRepair();
        showEngbtnEquament();
        ChangeLTEMenuCategory();
        ChangeLTEMenuOS();
        ChangeLTEMenuBand();
        ChangeLTEItemMenuReportDVActive();
        ChangeLTEItemMenuReportDVExpired();
        ChangeLTEItemMenuReportDVRepair();
        ChangeLTEItemMenuReport();
        CanngeLaoToEngLishGroup();
        CanngeLaoToEngLishUnit();
        CanngeLaoToEnBtnUseEquipment();
    }//GEN-LAST:event_TextItemRadEnglishActionPerformed

    private void TextItemRadLaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextItemRadLaoActionPerformed
        CanngeEngToLaoLReportStock();
        CanngeEToLaobtnUseEquipment();
        CanngeEnglishToLaoBtnRecord1();
        CanngeEToLaosGroup();
        CanngeEToLaosUnit();
        CanngeEnglishToLaoMenuManagement();
        CanngeEnglishToLaoReport();
        CanngeEnglishToLaoLanguage();
        CanngeEnglishToLaoBtnOrderDV();
        CanngeEnglishToLaoBtnAddnewDV();
        CanngeEnglishToLaoBtnRepairDV();
        CanngeEnglishToLaoBtnCheckDV();
        ChangeETLMenuCategory();
        ChangeETLMenuOS();
        ChangeETLMenuBand();
        CanngeLaoToEngLishReportDVInactive();
        CanngeLaoToEngLishReportDVTerm();
        CanngeLaoToEngLishReportDVRepair();
        CanngeLaoToEngLishReportDVOrder();
    }//GEN-LAST:event_TextItemRadLaoActionPerformed

    private void TextItemMenuBandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextItemMenuBandActionPerformed
        try {
            frmBand e = new frmBand();
            e.setVisible(true);
            jDesktopPane1.add(e);
            if(TextItemRadEnglish.isSelected()){
                e.ChangeLTELBDataBand();
                e.ChangeLTELBBrandFind();
                e.ChangeLTEbtnFindBandOk();
                e.ChangeLTELBBrandID();
                e.ChangeLTELBBrandName();
                e.ChangeLTEbtnBrandSave();
                e.ChangeLTEbtnBrandEdit();
                e.ChangeLTEbtnBrandDelete();
                e.ChangeLTEbtnBrandAdd();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_TextItemMenuBandActionPerformed

    private void btnMenuRecordEquipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuRecordEquipmentActionPerformed
        try {
            frmAddDevices e = new frmAddDevices();
            e.setVisible(true);
            jDesktopPane1.add(e);
            if(TextItemRadEnglish.isSelected()){
                e.ChangeLTELBEquimentForm();
                e.ChangeLTELBtxtFindDevices();
                e.ChangeLTEbtnAddDVOk();
                e.ChangeLTELBtxtFindDevices3();
                e.ChangeLTELBtxtBarcode();
                e.ChangeLTELBEquipment();
                e.ChangeLTELBColor();
                e.ChangeLTELBQuantity();
                e.ChangeLTELBSize();
                e.ChangeLTELB_Unit();
                e.ChangeLTELB_Price();
                e.ChangeLTELB_Brand();
                e.ChangeLTELB_OS();
                e.ChangeLTELB_EquipmentType();
                e.ChangeLTELB_EquipmentStatus();
                e.ChangeLTELB_EquipmentDesc1();
                e.ChangeLTELB_EquipmentDesc2();
                e.ChangeLTELB_Entrydate();
                e.ChangeLTELB_Enddate();
                e.ChangeLTEbtnAdd();
                e.ChangeLTEbtnSave();
                e.ChangeLTEbtnEdit();
                e.ChangeLTEbtnDelete();
                e.ChangeLTELBSerial();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnMenuRecordEquipmentActionPerformed

    private void TextMenuGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextMenuGroupActionPerformed
        try {
            frmProductGroup e = new frmProductGroup();
            e.setVisible(true);
            jDesktopPane1.add(e);
            if(TextItemRadEnglish.isSelected()){
                e.ChangeLTELBProductGroup();
                e.ChangeLTELBFind();
                e.ChangeLTEbtnFindG();
                e.ChangeLTELBGID();
                e.ChangeLTELBGname();
                e.ChangeLTEbtnAdd();
                e.ChangeLTEbtnSave();
                e.ChangeLTEbtnEdit();
                e.ChangeLTEbtnDelete();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_TextMenuGroupActionPerformed

    private void TextMenuUnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextMenuUnitActionPerformed
       try {
            frmUnit e = new frmUnit();
            e.setVisible(true);
            jDesktopPane1.add(e);
            if(TextItemRadEnglish.isSelected()){
                e.ChangeLTEUnit();
                e.ChangeLTEbtnUnitOk();
                e.ChangeLTEFindUnit();
                e.ChangeLTEUnitID();
                e.ChangeLTEUnitName();
                e.ChangeLTEbtnAdd();
                e.ChangeLTEbtnSave();
                e.ChangeLTEbtnEdit();
                e.ChangeLTEbtnDelete();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_TextMenuUnitActionPerformed

    private void btnMenuOrderDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuOrderDVActionPerformed
         try {
            frmPurches e = new frmPurches();
            e.setVisible(true);
            jDesktopPane1.add(e);
            if(TextItemRadEnglish.isSelected()){
                e.ChangeLTELB_Bill();
               e.ChangeLTELB_Frmorderequipment();
               e.ChangeLTELB_txtFindDevi();
               e.ChangeLTEbtnOrdeFind();
               e.ChangeLTEbtnSaveOrder();
               e.ChangeLTEbtnEdite();
               e.ChangeLTEbtnDelete();
               e.ChangeLTELB_txtBarcode();
               e.ChangeLTELB_Equipment();
               e.ChangeLTELB_Quantity();
               e.ChangeLTELB_Unit();
               e.ChangeLTELB_txtBrand();
               e.ChangeLTELB_txtEquipmentType();
               e.ChangeLTELB_txtStatus();
               e.ChangeLTELB_txtDesc1();
               e.ChangeLTELB_txtOrderdate();
               e.ChangeLTELB_txtPrice();
               e.ChangeLTELB_Department();
               e.ChangeLTELB_Total();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnMenuOrderDVActionPerformed

    private void btnMenuCheckDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuCheckDVActionPerformed
        try {
            frmSearchEquipment e = new frmSearchEquipment();
            e.setVisible(true);
            jDesktopPane1.add(e);
            if(TextItemRadEnglish.isSelected()){

            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnMenuCheckDVActionPerformed

    private void btnMenuRepairDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuRepairDVActionPerformed
       try {
            frmResolve e = new frmResolve();
            e.setVisible(true);
            jDesktopPane1.add(e);
            if(TextItemRadEnglish.isSelected()){

            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnMenuRepairDVActionPerformed

    private void btnUseEquipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUseEquipmentActionPerformed
      try {
            frmEquipmentOut e = new frmEquipmentOut();
            e.setVisible(true);
            jDesktopPane1.add(e);
            //e.txtBar.requestFocus();
            if(TextItemRadEnglish.isSelected()){

            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnUseEquipmentActionPerformed

    private void TextItemMenuReportDVInactiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextItemMenuReportDVInactiveActionPerformed
      frmReportEquipmentActive e = new frmReportEquipmentActive();
            e.setVisible(true);
            jDesktopPane1.add(e);
            //e.txtBar.requestFocus();
            if(TextItemRadEnglish.isSelected()){

            }
    }//GEN-LAST:event_TextItemMenuReportDVInactiveActionPerformed

    private void TextItemMenuReportDVTermActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextItemMenuReportDVTermActionPerformed
       frmReportEquipmentTerm e = new frmReportEquipmentTerm();
            e.setVisible(true);
            jDesktopPane1.add(e);
            //e.txtBar.requestFocus();
            if(TextItemRadEnglish.isSelected()){

            }
    }//GEN-LAST:event_TextItemMenuReportDVTermActionPerformed

    private void btnMenuAddStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuAddStockActionPerformed
        frmEquipmentStock e = new frmEquipmentStock();
            e.setVisible(true);
            jDesktopPane1.add(e);
            //e.txtBar.requestFocus();
            if(TextItemRadEnglish.isSelected()){

            }
    }//GEN-LAST:event_btnMenuAddStockActionPerformed

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
            java.util.logging.Logger.getLogger(frmMainIT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMainIT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMainIT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMainIT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMainIT().setVisible(true);
                

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem TextItemMenuBand;
    private javax.swing.JMenuItem TextItemMenuCategory;
    private javax.swing.JMenuItem TextItemMenuOs;
    private javax.swing.JMenuItem TextItemMenuReportDVInactive;
    private javax.swing.JMenuItem TextItemMenuReportDVTerm;
    private javax.swing.JMenuItem TextItemMenuReportOrderDV;
    private javax.swing.JMenuItem TextItemMenuReportRepairDV;
    private javax.swing.JRadioButtonMenuItem TextItemRadEnglish;
    private javax.swing.JRadioButtonMenuItem TextItemRadLao;
    private javax.swing.JMenuItem TextMenuGroup;
    private javax.swing.JMenu TextMenuLanguage;
    private javax.swing.JMenu TextMenuManagement;
    private javax.swing.JMenuItem TextMenuUnit;
    private javax.swing.JMenu TextMenureport;
    private javax.swing.JButton btnMenuAddStock;
    private javax.swing.JButton btnMenuCheckDV;
    private javax.swing.JButton btnMenuOrderDV;
    private javax.swing.JButton btnMenuRecordEquipment;
    private javax.swing.JButton btnMenuRepairDV;
    private javax.swing.JButton btnUseEquipment;
    public javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemStock;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbimage;
    // End of variables declaration//GEN-END:variables
}
