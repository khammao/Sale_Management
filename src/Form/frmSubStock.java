

package Form;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class frmSubStock extends javax.swing.JDialog {
    Connection c=DB.getConnection();
    String sql;
     DefaultTableModel model = new DefaultTableModel();
     public String Barcode;
     public String EquipmentName;
     public String Price;
     public String qty;
     public String unit;
     public String brand;
     public String categ;
     public String dtpm;
    public frmSubStock(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
         model = (DefaultTableModel)jTable1.getModel();
        jTable1.getTableHeader().setFont(new java.awt.Font("Saysettha OT", java.awt.Font.BOLD, 12));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255), 3));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 153), 2));

        jTable1.setFont(new java.awt.Font("Lao Unicode", 0, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Barcode", "Equipment", "Prices", "Quantity", "Unit", "Brands", "Category", "Department"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Float.class, java.lang.Float.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.setRowHeight(25);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(105);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(130);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Saysettha OT", 1, 12)); // NOI18N
        jLabel1.setText("Select the device you want");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       showdata();
    }//GEN-LAST:event_formWindowOpened

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {   
                if (evt.getClickCount()==2){
                 
                    int index = jTable1.getSelectedRow();
                    Barcode = jTable1.getValueAt(index, 0).toString();
                    frmEquipmentStock f = new frmEquipmentStock();
                    f.txtBar.setText(Barcode);
                    //----------for Name -------------------
                    EquipmentName = jTable1.getValueAt(index, 1).toString();
                    frmEquipmentStock f1 = new frmEquipmentStock();
                    f1.txtName.setText(EquipmentName);
                    //----------for Price -------------------
                    Price = jTable1.getValueAt(index, 2).toString();
                    frmEquipmentStock f2 = new frmEquipmentStock();
                    f2.txtAmount.setText(Price);
                    //----------for quantity -------------------
                    qty = jTable1.getValueAt(index, 3).toString();
                    frmEquipmentStock f3 = new frmEquipmentStock();
                    f3.txtQty.setText(qty);
                    //---------- for Unit--------------------------------
                    unit = jTable1.getValueAt(index, 4).toString();
                    frmEquipmentStock f4 = new frmEquipmentStock();
                    f4.cmbUnit.setSelectedItem(unit);
                    //---------------for Brand ------------------------
                    brand = jTable1.getValueAt(index, 5).toString();
                    frmEquipmentStock f5 = new frmEquipmentStock();
                    f5.cmbBrand.setSelectedItem(brand);
                    //------------for cate-----------------------
                    categ = jTable1.getValueAt(index, 6).toString();
                    frmEquipmentStock f6 = new frmEquipmentStock();
                    f6.cmbcate.setSelectedItem(categ);
                    //------------for detp-----------------------
                    dtpm = jTable1.getValueAt(index, 7).toString();
                    frmEquipmentStock f7 = new frmEquipmentStock();
                    f7.cmbDept.setSelectedItem(dtpm);
                    dispose();
                }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jTable1MouseClicked

    /**
     * @param args the command line arguments
     */
    public void showdata(){
        try {
            int index = jTable1.getRowCount()-1;
            while (index > -1){
                model.removeRow(index--);
            }
            String s="SELECT dbo.IV_PurchaseDetail.Barcode, dbo.IV_PurchaseDetail.EquipmentName,dbo.IV_PurchaseDetail.Prices, dbo.IV_PurchaseDetail.Qty, dbo.IV_Unit.UnitName, dbo.IV_Brands.BrandName, dbo.CATType.CDesc, \n" +
            "dbo.Department.DName\n" +
            "FROM dbo.IV_Purchase INNER JOIN\n" +
            "dbo.IV_PurchaseDetail ON dbo.IV_Purchase.Bill = dbo.IV_PurchaseDetail.Bill INNER JOIN\n" +
            "dbo.IV_Brands ON dbo.IV_PurchaseDetail.BrandID = dbo.IV_Brands.BrandID INNER JOIN\n" +
            "dbo.IV_Unit ON dbo.IV_PurchaseDetail.UnitID = dbo.IV_Unit.UnitID INNER JOIN\n" +
            "dbo.Department ON dbo.IV_PurchaseDetail.DPID = dbo.Department.DPID INNER JOIN\n" +
            "dbo.CATType ON dbo.IV_PurchaseDetail.CATID = dbo.CATType.CATID";
            ResultSet rs = c.createStatement().executeQuery(s);
            while (rs.next()){
                Vector v = new Vector();
                v.add(rs.getString("Barcode"));
                v.add(rs.getString("EquipmentName"));
                v.add(rs.getFloat("Prices"));
                v.add(rs.getFloat("Qty"));
                v.add(rs.getString("UnitName"));
                v.add(rs.getString("BrandName"));
                v.add(rs.getString("CDesc"));
                v.add(rs.getString("DName"));
                model.addRow(v);
            }
            jTable1.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
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
            java.util.logging.Logger.getLogger(frmSubStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSubStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSubStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSubStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmSubStock dialog = new frmSubStock(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
