
package Form;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;

public class frmSearchEquipment extends javax.swing.JInternalFrame {
    Connection c=DB.getConnection();
    String sql;
    DefaultTableModel model =new DefaultTableModel();
    public frmSearchEquipment() {
        initComponents();
         model = (DefaultTableModel)jTable1.getModel();
        jTable1.getTableHeader().setFont(new java.awt.Font("Saysettha OT", java.awt.Font.BOLD, 12));
        ButtonGroup();
    }
    public void ButtonGroup(){
        ButtonGroup bg=new ButtonGroup();
        bg.add(radActive);
        bg.add(radTerm);
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        LB_txtFindDevi = new javax.swing.JLabel();
        txtFindDevices = new javax.swing.JTextField();
        btnOrdeFind = new javax.swing.JButton();
        radActive = new javax.swing.JRadioButton();
        radTerm = new javax.swing.JRadioButton();
        LB_Frmorderequipment = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setPreferredSize(new java.awt.Dimension(910, 670));
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

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 2, true));

        LB_txtFindDevi.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        LB_txtFindDevi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LB_txtFindDevi.setText("ຄົ້ນຫາ");

        txtFindDevices.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtFindDevices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFindDevicesActionPerformed(evt);
            }
        });

        btnOrdeFind.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnOrdeFind.setText("ຕົກລົງ");
        btnOrdeFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdeFindActionPerformed(evt);
            }
        });

        radActive.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        radActive.setText("ໃຊ້ງານໄດ້");
        radActive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radActiveActionPerformed(evt);
            }
        });

        radTerm.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        radTerm.setText("ໃຊ້ງານບໍ່ໄດ້");
        radTerm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radTermActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(LB_txtFindDevi, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFindDevices, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOrdeFind)
                .addGap(27, 27, 27)
                .addComponent(radActive)
                .addGap(18, 18, 18)
                .addComponent(radTerm)
                .addContainerGap(320, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB_txtFindDevi)
                    .addComponent(txtFindDevices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOrdeFind)
                    .addComponent(radActive)
                    .addComponent(radTerm))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LB_Frmorderequipment.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        LB_Frmorderequipment.setText("ຮູບແບບຄົ້ນຫາຂໍ້ມູນອຸປະກອນ");

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 2, true));

        jTable1.setBackground(new java.awt.Color(0, 51, 51));
        jTable1.setFont(new java.awt.Font("Lao Unicode", 0, 11)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Barcode", "ProductName", "BrandName", "OSName", "CDesc", "IPAddress", "SerialNbr", "Color", "Size", "UnitName", "Desc1", "Desc2", "Status", "FNameEng", "LOCName", "DName"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.setRowHeight(25);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(120);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(170);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(8).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(9).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(10).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(11).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(12).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(13).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(14).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(15).setPreferredWidth(150);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(LB_Frmorderequipment, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(LB_Frmorderequipment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
      
    }//GEN-LAST:event_formInternalFrameOpened

    private void radActiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radActiveActionPerformed
        showDataActive();
    }//GEN-LAST:event_radActiveActionPerformed

    private void radTermActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radTermActionPerformed
        showDataTerm();
    }//GEN-LAST:event_radTermActionPerformed

    private void btnOrdeFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdeFindActionPerformed
        try {
            if (radActive.isSelected()){
                FilterDataActive();
            }else{
                FilterDataTerm();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnOrdeFindActionPerformed

    private void txtFindDevicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFindDevicesActionPerformed
       btnOrdeFindActionPerformed(evt);
    }//GEN-LAST:event_txtFindDevicesActionPerformed
    public void showDataActive(){
        try {
            int index = jTable1.getRowCount()-1;
            while (index > -1){
                model.removeRow(index--);
            }
            sql="SELECT dbo.IV_Equipment.Barcode, dbo.IV_Equipment.ProductName, dbo.IV_Brands.BrandName, dbo.IV_OperatingSystem.OSName, dbo.CATType.CDesc, dbo.IV_Equipment.IPAddress, dbo.IV_Equipment.SerialNbr, \n" +
            "dbo.IV_Equipment.Color, dbo.IV_Equipment.Size, dbo.IV_Unit.UnitName, dbo.IV_Equipment.Desc1, dbo.IV_Equipment.Desc2, dbo.IV_Equipment.Status, dbo.Employee.FNameEng, \n" +
            "dbo.Location.LOCName, dbo.Department.DName\n" +
            "FROM dbo.IV_Equipment INNER JOIN\n" +
            "dbo.IV_Brands ON dbo.IV_Equipment.BrandID = dbo.IV_Brands.BrandID INNER JOIN\n" +
            "dbo.IV_OperatingSystem ON dbo.IV_Equipment.OSID = dbo.IV_OperatingSystem.OSID INNER JOIN\n" +
            "dbo.CATType ON dbo.IV_Equipment.CATID = dbo.CATType.CATID INNER JOIN\n" +
            "dbo.IV_Unit ON dbo.IV_Equipment.UnitID = dbo.IV_Unit.UnitID INNER JOIN\n" +
            "dbo.Employee ON dbo.IV_Equipment.EID = dbo.Employee.EID INNER JOIN\n" +
            "dbo.Department ON dbo.Employee.DPID = dbo.Department.DPID INNER JOIN\n" +
            "dbo.Location ON dbo.Employee.LocID = dbo.Location.LOCID\n" +
            "where dbo.IV_Equipment.Status=N'ໃຊ້ງານຢູ່'";
            ResultSet rs = c.createStatement().executeQuery(sql);
            while (rs.next()){
                Vector v = new Vector();
                v.add(rs.getString("Barcode"));
                v.add(rs.getString("ProductName"));
                v.add(rs.getString("BrandName"));
                v.add(rs.getString("OSName"));
                v.add(rs.getString("CDesc"));
                v.add(rs.getString("IPAddress"));
                v.add(rs.getString("SerialNbr"));
                v.add(rs.getString("Color"));
                v.add(rs.getString("Size"));
                v.add(rs.getString("UnitName"));
                v.add(rs.getString("Desc1"));
                v.add(rs.getString("Desc2"));
                v.add(rs.getString("Status"));
                v.add(rs.getString("FNameEng"));
                v.add(rs.getString("LOCName"));
                v.add(rs.getString("DName"));
                model.addRow(v);
            }
            jTable1.setModel(model);
        } catch (Exception e) {
        }
    }
    public void showDataTerm(){
        try {
            int index = jTable1.getRowCount()-1;
            while (index > -1){
                model.removeRow(index--);
            }
            sql="SELECT dbo.IV_Equipment.Barcode, dbo.IV_Equipment.ProductName, dbo.IV_Brands.BrandName, dbo.IV_OperatingSystem.OSName, dbo.CATType.CDesc, dbo.IV_Equipment.IPAddress, dbo.IV_Equipment.SerialNbr, \n" +
            "dbo.IV_Equipment.Color, dbo.IV_Equipment.Size, dbo.IV_Unit.UnitName, dbo.IV_Equipment.Desc1, dbo.IV_Equipment.Desc2, dbo.IV_Equipment.Status, dbo.Employee.FNameEng, \n" +
            "dbo.Location.LOCName, dbo.Department.DName\n" +
            "FROM dbo.IV_Equipment INNER JOIN\n" +
            "dbo.IV_Brands ON dbo.IV_Equipment.BrandID = dbo.IV_Brands.BrandID INNER JOIN\n" +
            "dbo.IV_OperatingSystem ON dbo.IV_Equipment.OSID = dbo.IV_OperatingSystem.OSID INNER JOIN\n" +
            "dbo.CATType ON dbo.IV_Equipment.CATID = dbo.CATType.CATID INNER JOIN\n" +
            "dbo.IV_Unit ON dbo.IV_Equipment.UnitID = dbo.IV_Unit.UnitID INNER JOIN\n" +
            "dbo.Employee ON dbo.IV_Equipment.EID = dbo.Employee.EID INNER JOIN\n" +
            "dbo.Department ON dbo.Employee.DPID = dbo.Department.DPID INNER JOIN\n" +
            "dbo.Location ON dbo.Employee.LocID = dbo.Location.LOCID\n" +
            "where dbo.IV_Equipment.Status=N'ໃຊ້ງານບໍ່ໄດ້'";
            ResultSet rs = c.createStatement().executeQuery(sql);
            while (rs.next()){
                Vector v = new Vector();
                v.add(rs.getString("Barcode"));
                v.add(rs.getString("ProductName"));
                v.add(rs.getString("BrandName"));
                v.add(rs.getString("OSName"));
                v.add(rs.getString("CDesc"));
                v.add(rs.getString("IPAddress"));
                v.add(rs.getString("SerialNbr"));
                v.add(rs.getString("Color"));
                v.add(rs.getString("Size"));
                v.add(rs.getString("UnitName"));
                v.add(rs.getString("Desc1"));
                v.add(rs.getString("Desc2"));
                v.add(rs.getString("Status"));
                v.add(rs.getString("FNameEng"));
                v.add(rs.getString("LOCName"));
                v.add(rs.getString("DName"));
                model.addRow(v);
            }
            jTable1.setModel(model);
        } catch (Exception e) {
        }
    }
    public void FilterDataActive(){
        try {
            int index = jTable1.getRowCount()-1;
            while (index > -1){
                model.removeRow(index--);
            }
            sql="SELECT dbo.IV_Equipment.Barcode, dbo.IV_Equipment.ProductName, dbo.IV_Brands.BrandName, dbo.IV_OperatingSystem.OSName, dbo.CATType.CDesc, dbo.IV_Equipment.IPAddress, dbo.IV_Equipment.SerialNbr, \n" +
            "dbo.IV_Equipment.Color, dbo.IV_Equipment.Size, dbo.IV_Unit.UnitName, dbo.IV_Equipment.Desc1, dbo.IV_Equipment.Desc2, dbo.IV_Equipment.Status, dbo.Employee.FNameEng, \n" +
            "dbo.Location.LOCName, dbo.Department.DName\n" +
            "FROM dbo.IV_Equipment INNER JOIN\n" +
            "dbo.IV_Brands ON dbo.IV_Equipment.BrandID = dbo.IV_Brands.BrandID INNER JOIN\n" +
            "dbo.IV_OperatingSystem ON dbo.IV_Equipment.OSID = dbo.IV_OperatingSystem.OSID INNER JOIN\n" +
            "dbo.CATType ON dbo.IV_Equipment.CATID = dbo.CATType.CATID INNER JOIN\n" +
            "dbo.IV_Unit ON dbo.IV_Equipment.UnitID = dbo.IV_Unit.UnitID INNER JOIN\n" +
            "dbo.Employee ON dbo.IV_Equipment.EID = dbo.Employee.EID INNER JOIN\n" +
            "dbo.Department ON dbo.Employee.DPID = dbo.Department.DPID INNER JOIN\n" +
            "dbo.Location ON dbo.Employee.LocID = dbo.Location.LOCID\n" +
            "where dbo.IV_Equipment.Status=N'ໃຊ້ງານຢູ່' and dbo.IV_Equipment.Barcode like '%"+ txtFindDevices.getText() +"%' or dbo.IV_Equipment.SerialNbr like '%"+ txtFindDevices.getText() +"%'\n" +
            "or dbo.Location.LOCName like '%"+ txtFindDevices.getText() +"%' or dbo.Department.DName like '%"+ txtFindDevices.getText() +"%'";
            ResultSet rs = c.createStatement().executeQuery(sql);
            while (rs.next()){
                Vector v = new Vector();
                v.add(rs.getString("Barcode"));
                v.add(rs.getString("ProductName"));
                v.add(rs.getString("BrandName"));
                v.add(rs.getString("OSName"));
                v.add(rs.getString("CDesc"));
                v.add(rs.getString("IPAddress"));
                v.add(rs.getString("SerialNbr"));
                v.add(rs.getString("Color"));
                v.add(rs.getString("Size"));
                v.add(rs.getString("UnitName"));
                v.add(rs.getString("Desc1"));
                v.add(rs.getString("Desc2"));
                v.add(rs.getString("Status"));
                v.add(rs.getString("FNameEng"));
                v.add(rs.getString("LOCName"));
                v.add(rs.getString("DName"));
                model.addRow(v);
            }
            jTable1.setModel(model);
        } catch (Exception e) {
        }
    }
    public void FilterDataTerm(){
        try {
            int index = jTable1.getRowCount()-1;
            while (index > -1){
                model.removeRow(index--);
            }
            sql="SELECT dbo.IV_Equipment.Barcode, dbo.IV_Equipment.ProductName, dbo.IV_Brands.BrandName, dbo.IV_OperatingSystem.OSName, dbo.CATType.CDesc, dbo.IV_Equipment.IPAddress, dbo.IV_Equipment.SerialNbr, \n" +
            "dbo.IV_Equipment.Color, dbo.IV_Equipment.Size, dbo.IV_Unit.UnitName, dbo.IV_Equipment.Desc1, dbo.IV_Equipment.Desc2, dbo.IV_Equipment.Status, dbo.Employee.FNameEng, \n" +
            "dbo.Location.LOCName, dbo.Department.DName\n" +
            "FROM dbo.IV_Equipment INNER JOIN\n" +
            "dbo.IV_Brands ON dbo.IV_Equipment.BrandID = dbo.IV_Brands.BrandID INNER JOIN\n" +
            "dbo.IV_OperatingSystem ON dbo.IV_Equipment.OSID = dbo.IV_OperatingSystem.OSID INNER JOIN\n" +
            "dbo.CATType ON dbo.IV_Equipment.CATID = dbo.CATType.CATID INNER JOIN\n" +
            "dbo.IV_Unit ON dbo.IV_Equipment.UnitID = dbo.IV_Unit.UnitID INNER JOIN\n" +
            "dbo.Employee ON dbo.IV_Equipment.EID = dbo.Employee.EID INNER JOIN\n" +
            "dbo.Department ON dbo.Employee.DPID = dbo.Department.DPID INNER JOIN\n" +
            "dbo.Location ON dbo.Employee.LocID = dbo.Location.LOCID\n" +
            "where dbo.IV_Equipment.Status=N'ໃຊ້ງານບໍ່ໄດ້' and dbo.IV_Equipment.Barcode like '%"+ txtFindDevices.getText() +"%' or dbo.IV_Equipment.SerialNbr like '%"+ txtFindDevices.getText() +"%'\n" +
            "or dbo.Location.LOCName like '%"+ txtFindDevices.getText() +"%' or dbo.Department.DName like '%"+ txtFindDevices.getText() +"%'";
            ResultSet rs = c.createStatement().executeQuery(sql);
            while (rs.next()){
                Vector v = new Vector();
                v.add(rs.getString("Barcode"));
                v.add(rs.getString("ProductName"));
                v.add(rs.getString("BrandName"));
                v.add(rs.getString("OSName"));
                v.add(rs.getString("CDesc"));
                v.add(rs.getString("IPAddress"));
                v.add(rs.getString("SerialNbr"));
                v.add(rs.getString("Color"));
                v.add(rs.getString("Size"));
                v.add(rs.getString("UnitName"));
                v.add(rs.getString("Desc1"));
                v.add(rs.getString("Desc2"));
                v.add(rs.getString("Status"));
                v.add(rs.getString("FNameEng"));
                v.add(rs.getString("LOCName"));
                v.add(rs.getString("DName"));
                model.addRow(v);
            }
            jTable1.setModel(model);
        } catch (Exception e) {
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LB_Frmorderequipment;
    private javax.swing.JLabel LB_txtFindDevi;
    private javax.swing.JButton btnOrdeFind;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton radActive;
    private javax.swing.JRadioButton radTerm;
    private javax.swing.JTextField txtFindDevices;
    // End of variables declaration//GEN-END:variables
}
