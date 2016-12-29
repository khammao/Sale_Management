
package Form;

import static com.lowagie.text.xml.simpleparser.EntitiesToSymbol.map;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;

public class frmReportEquipmentTerm extends javax.swing.JInternalFrame {
    Connection c=DB.getConnection();
    String sql;
    ArrayList empAll =new ArrayList();
    ArrayList empDeto=new ArrayList();
    ArrayList empstore =new ArrayList();
    ArrayList Dept=new ArrayList();
    ArrayList Store=new ArrayList();
    ArrayList Cate=new ArrayList();
    public frmReportEquipmentTerm() {
        initComponents();
        ButtonGroup();
    }
    public void ButtonGroup(){
        ButtonGroup bg=new ButtonGroup();
        bg.add(radDept);
        bg.add(radStore);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        radDept = new javax.swing.JRadioButton();
        radStore = new javax.swing.JRadioButton();
        cmbLoc = new javax.swing.JComboBox();
        cmbCat = new javax.swing.JComboBox();
        btnReport = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Equipment InActive");
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

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255), 3));

        radDept.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        radDept.setText("ພະແນກ");
        radDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radDeptActionPerformed(evt);
            }
        });

        radStore.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        radStore.setText("ສາຂາ");
        radStore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radStoreActionPerformed(evt);
            }
        });

        cmbLoc.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbLoc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "----------Select Location------------" }));
        cmbLoc.setToolTipText("Select Location");
        cmbLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLocActionPerformed(evt);
            }
        });

        cmbCat.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmbCat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "----------Select Category------------" }));
        cmbCat.setToolTipText("Select Employee");
        cmbCat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbCatMouseClicked(evt);
            }
        });
        cmbCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCatActionPerformed(evt);
            }
        });

        btnReport.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnReport.setText("ລາຍງານ");
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbLoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(radDept)
                                .addGap(18, 18, 18)
                                .addComponent(radStore))
                            .addComponent(cmbCat, 0, 241, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(btnReport)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radDept)
                    .addComponent(radStore))
                .addGap(18, 18, 18)
                .addComponent(cmbLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnReport)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLocActionPerformed
   
    }//GEN-LAST:event_cmbLocActionPerformed

    private void radDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radDeptActionPerformed
      ShowDept();
    }//GEN-LAST:event_radDeptActionPerformed

    private void radStoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radStoreActionPerformed
       ShowStore();
    }//GEN-LAST:event_radStoreActionPerformed

    private void cmbCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCatActionPerformed
       
    }//GEN-LAST:event_cmbCatActionPerformed

    private void cmbCatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbCatMouseClicked
       
    }//GEN-LAST:event_cmbCatMouseClicked

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        Showcategory();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
       if (radDept.isSelected()){
           ShowReportDept();
       }else if (radStore.isSelected()){
            ShowReportStore();
    }
    }//GEN-LAST:event_btnReportActionPerformed
    public void ShowReportStore(){
        try {
            String dtp =cmbLoc.getSelectedItem().toString();
            String cat=cmbCat.getSelectedItem().toString();
            map.put("Store", dtp);
            map.put("Cate", cat);
                JasperPrint print = JasperFillManager.fillReport("Report\\ReportEquipmentTermStore.jasper",map, c);
                JFrame fr = new JFrame();
                fr.setTitle("IT Equipment Term Report");
                Dimension dr = Toolkit.getDefaultToolkit().getScreenSize();
                int w = (int)dr.getWidth();
                int h = (int)dr.getHeight();
                fr.setBounds(0,0,w,h);
                fr.getContentPane().add(new JRViewer(print));
                fr.setVisible(true);               
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void ShowReportDept(){
        try {
            String dtp =cmbLoc.getSelectedItem().toString();
            String cat=cmbCat.getSelectedItem().toString();
            map.put("dept", dtp);
            map.put("Cate", cat);
                JasperPrint print = JasperFillManager.fillReport("Report\\ReportEquipmentTerm.jasper",map, c);
                JFrame fr = new JFrame();
                fr.setTitle("IT Equipment Inactive Report");
                Dimension dr = Toolkit.getDefaultToolkit().getScreenSize();
                int w = (int)dr.getWidth();
                int h = (int)dr.getHeight();
                fr.setBounds(0,0,w,h);
                fr.getContentPane().add(new JRViewer(print));
                fr.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void ShowDept(){
        try {
            DefaultComboBoxModel mode = new DefaultComboBoxModel();
            sql = "SELECT DPID, DName FROM Department order by DName";
            mode.removeAllElements();
            Dept.clear();
            ResultSet rs = c.createStatement().executeQuery(sql);
            while (rs.next()){
               Dept.add(rs.getString("DPID"));
                mode.addElement(rs.getString("DName"));                
            }
            cmbLoc.setModel(mode);
        } catch (Exception e) {
       }
    }
    private void ShowStore(){
        try {
            DefaultComboBoxModel mode = new DefaultComboBoxModel();
            sql = "SELECT LOCID, LOCName FROM dbo.Location WHERE (LOCName <> N'HQ')";
            mode.removeAllElements();
            Store.clear();
            ResultSet rs = c.createStatement().executeQuery(sql);
            while (rs.next()){
               Store.add(rs.getString("LOCID"));
                mode.addElement(rs.getString("LOCName"));                
            }
            cmbLoc.setModel(mode);
        } catch (Exception e) {
       }
    }
 public void Showcategory(){
        try {
            DefaultComboBoxModel mode = new DefaultComboBoxModel();
            sql = "SELECT CATID, CDesc FROM  dbo.CATType";
            mode.removeAllElements();
            Cate.clear();
            ResultSet rs = c.createStatement().executeQuery(sql);
            while (rs.next()){
               Cate.add(rs.getString("CATID"));
                mode.addElement(rs.getString("CDesc"));                
            }
            cmbCat.setModel(mode);
        } catch (Exception e) {
       }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReport;
    private javax.swing.JComboBox cmbCat;
    private javax.swing.JComboBox cmbLoc;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton radDept;
    private javax.swing.JRadioButton radStore;
    // End of variables declaration//GEN-END:variables
}
