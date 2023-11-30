
package DKDN;

import SinhVienView.SinhVienView;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
                

public class DN_DK_View extends javax.swing.JFrame {
    accountService Service = new accountService();
    List<Account> list = Service.getListaAccounts();

    
    public DN_DK_View() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Form đăng kí, đăng nhập");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnDangKy = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtDKUsn = new javax.swing.JTextField();
        txtDKPwd = new javax.swing.JPasswordField();
        txtDKPwd2 = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDNUsn = new javax.swing.JTextField();
        txtDNPwd = new javax.swing.JPasswordField();
        btnDangNhap = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/User.png"))); // NOI18N
        jLabel2.setText("Tên đăng nhập:");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/Lock.png"))); // NOI18N
        jLabel3.setText("Mật khẩu:");

        btnDangKy.setText("Đăng kí");
        btnDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangKyActionPerformed(evt);
            }
        });

        jLabel1.setText("Nhập lại mật khẩu:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(btnDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)))
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDKUsn, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                            .addComponent(txtDKPwd)
                            .addComponent(txtDKPwd2))))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDKUsn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDKPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDKPwd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(btnDangKy)
                .addGap(45, 45, 45))
        );

        jTabbedPane1.addTab("Đăng kí", jPanel1);

        jLabel4.setText("Tên đăng nhập:");

        jLabel6.setText("Mật khẩu:");

        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDNUsn)
                            .addComponent(txtDNPwd, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(btnDangNhap)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDNUsn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDNPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(btnDangNhap)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Đăng nhập", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jTabbedPane1)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangKyActionPerformed
        String usn = txtDKUsn.getText();
        String pwd = txtDKPwd.getText();
        String cpwd = txtDKPwd2.getText();
        for (Account ac : list) {
            if (usn.equals(ac.getUserName())) {
                JOptionPane.showMessageDialog(this, "tài khoản này đã tồn tại !!!");
                return;
            }
        }
        if (usn.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "tài khoản không được bỏ trống");
            return;
        }
        if (pwd.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "mật khẩu không được bỏ trống");
            return;
        }
        if (!cpwd.equals(pwd)) {
            JOptionPane.showMessageDialog(this, "Nhập lại mật khẩu sai !");
        } else {
            Account newUser = new Account(usn, pwd, cpwd);
            list.add(newUser);
            JOptionPane.showMessageDialog(this, "Đăng ký thành công !");
        }


    }//GEN-LAST:event_btnDangKyActionPerformed

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        // TODO add your handling code here:
        String usn = txtDNUsn.getText();
        String pwd = txtDNPwd.getText();
        boolean found = false;

        if (usn.isEmpty() || pwd.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tên đăng nhập và mật khẩu không được để trống !");
        } else {

            for (Account acc : list) {
                if (usn.equals(acc.getUserName())) {
                    if (pwd.equals(acc.getPassWord())) {
                        JOptionPane.showMessageDialog(this, "Đăng nhập thành công !");
                        found = true;
                       SinhVienView mainView = new SinhVienView();
                       mainView.setVisible(true);
                       mainView.setLocationRelativeTo(null);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, "Sai mật khẩu !");
                        found = false;
                        return;
                    }
                }
            }
            if (!found) {
                JOptionPane.showMessageDialog(this, "Tài khoản không tồn tại !");
            }
        }
    }//GEN-LAST:event_btnDangNhapActionPerformed

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
            java.util.logging.Logger.getLogger(DN_DK_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DN_DK_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DN_DK_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DN_DK_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DN_DK_View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangKy;
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPasswordField txtDKPwd;
    private javax.swing.JPasswordField txtDKPwd2;
    private javax.swing.JTextField txtDKUsn;
    private javax.swing.JPasswordField txtDNPwd;
    private javax.swing.JTextField txtDNUsn;
    // End of variables declaration//GEN-END:variables
}
