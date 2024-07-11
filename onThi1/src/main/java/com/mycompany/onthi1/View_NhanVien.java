
package com.mycompany.onthi1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class View_NhanVien extends javax.swing.JFrame {

 Repository_NhanVien ql = new Repository_NhanVien();
    
    public View_NhanVien() {
        initComponents();
        ql.loadDatabase();
        loadTable();
    }
    
    private void loadTable(){
        DefaultTableModel dtm = (DefaultTableModel) this.tblNhanVien.getModel();
        dtm.setRowCount(0);
        
        for (Model_NhanVien nv : this.ql.getDS()) {
            Object [] row = {
                nv.getMaNV(),
                nv.getHoTen(),
                nv.getMatKhau(),
                nv.getVaiTro() == 1 ? "Quản lý" : "Nhân viên"
            };
            dtm.addRow(row);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        txtMatKhau = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rdoQL = new javax.swing.JRadioButton();
        rdoNV = new javax.swing.JRadioButton();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mã nhân viên");

        jLabel2.setText("Họ tên");

        jLabel3.setText("Mật khẩu");

        jLabel4.setText("Vai trò");

        buttonGroup1.add(rdoQL);
        rdoQL.setSelected(true);
        rdoQL.setText("Quản lý");

        buttonGroup1.add(rdoNV);
        rdoNV.setText("Nhân Viên");

        btnThem.setText("Add");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setText("Remove");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã NV", "Họ tên", "Mật khẩu", "Vai trò"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNhanVien);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnThem)
                                .addGap(123, 123, 123)
                                .addComponent(btnXoa))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                        .addComponent(txtHoTen)
                                        .addComponent(txtMa))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdoQL, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rdoNV, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rdoQL)
                    .addComponent(rdoNV))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
       String maNV = this.txtMa.getText();
       String hoTen = this.txtHoTen.getText();
       String matKhau = this.txtMatKhau.getText();
       int vaiTro = this.rdoQL.isSelected() ? 1 : 0;
       
       if(maNV.trim().isEmpty() || hoTen.trim().isEmpty() || matKhau.trim().isEmpty()){
           JOptionPane.showMessageDialog(this, "Ko để trống");
           return;
       }
       
       if(!matKhau.contains("A") && !matKhau.contains("B")){
            JOptionPane.showMessageDialog(this, "mật khẩu cần có chữ hoa");
            return;
       }
       
        if(!matKhau.contains("%") && !matKhau.contains("$")){
            JOptionPane.showMessageDialog(this, "mật khẩu cần có ký tự đặc biệt");
            return;
       }
        
        if(matKhau.length() < 8 || matKhau.length() > 12){
            JOptionPane.showMessageDialog(this, "mật khẩu chỉ từ 8 đến 12 ký tự");
            return;
        }
        
//        if (!matKhau.matches("0[0-9]{9}")) {
//        JOptionPane.showMessageDialog(this, "Mật khẩu phải có đúng 10 chữ số và bắt đầu bằng số 0");
//        return;
//    }
       
       
       
       try{
            DatabaseConnectionManager dcm = new DatabaseConnectionManager("QuanLyTrungTamTinHoc_SOF2041", "sa", "123456");
            Connection con = dcm.getConnection();
            String sql = "Insert into NhanVien(MaNV,HoTen,MatKhau,VaiTro) values(?,?,?,?)";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, maNV);
            pre.setString(2, hoTen);
            pre.setString(3, matKhau);
            pre.setInt(4, vaiTro);
            
            pre.executeUpdate();
                
             Model_NhanVien nv = new Model_NhanVien(maNV, hoTen, matKhau, vaiTro);
             this.ql.add(nv);
             loadTable();
            }
            
        catch (SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Trùng mã rồi");
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int dong = this.tblNhanVien.getSelectedRow();
        if(dong==-1){
            return;
        }
        Model_NhanVien nv = this.ql.getDS().get(dong);
        
        try{
            DatabaseConnectionManager dcm = new DatabaseConnectionManager("QuanLyTrungTamTinHoc_SOF2041", "sa", "123456");
            Connection con = dcm.getConnection();
            String sql = "Delete from NhanVien where MaNV= ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, nv.getMaNV());          
            pre.executeUpdate();             
             this.ql.xoa(dong);
             loadTable();
            }
            
        catch (SQLException e){
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_btnXoaActionPerformed

    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMouseClicked
        int dong = this.tblNhanVien.getSelectedRow();
        if(dong==-1){
            return;
        }
         Model_NhanVien nv = this.ql.getDS().get(dong);
         this.txtMa.setText(nv.getMaNV());
         this.txtHoTen.setText(nv.getHoTen());
         this.txtMatKhau.setText(nv.getMatKhau());
         this.rdoQL.setSelected(nv.getVaiTro()==1);
         this.rdoNV.setSelected(nv.getVaiTro()==0);
    }//GEN-LAST:event_tblNhanVienMouseClicked

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
            java.util.logging.Logger.getLogger(View_NhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_NhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_NhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_NhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_NhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdoNV;
    private javax.swing.JRadioButton rdoQL;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtMatKhau;
    // End of variables declaration//GEN-END:variables
}
