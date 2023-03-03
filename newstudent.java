import java.sql.*;
import static java.lang.Class.forName;
import javax.swing.JOptionPane;
public class newstudent extends javax.swing.JFrame {
    public newstudent() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        StudentID = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        fatherName = new javax.swing.JTextField();
        courseName = new javax.swing.JComboBox<>();
        branchName = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(325, 125));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Student ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 104, 97, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 156, 97, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Father Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 213, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Course Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 275, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Branch Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 330, 100, -1));

        StudentID.setBackground(new java.awt.Color(255, 255, 204));
        StudentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentIDActionPerformed(evt);
            }
        });
        getContentPane().add(StudentID, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 102, 202, -1));

        name.setBackground(new java.awt.Color(255, 255, 204));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 154, 202, -1));

        fatherName.setBackground(new java.awt.Color(255, 255, 204));
        getContentPane().add(fatherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 211, 202, -1));

        courseName.setEditable(true);
        courseName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        courseName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "B.Tech", "B.E.", " " }));
        getContentPane().add(courseName, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 272, 202, -1));

        branchName.setEditable(true);
        branchName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        branchName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CSE", "IT", "ENTC", "MECHANICAL", "CIVIL", " " }));
        getContentPane().add(branchName, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 327, 202, -1));

        jButton1.setBackground(new java.awt.Color(153, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 153, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management_system/save-icon--1.png"))); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 384, -1, -1));

        jButton2.setBackground(new java.awt.Color(204, 255, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 51, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management_system/red-x-mark-transparent-background-3.png"))); // NOI18N
        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 384, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management_system/123456.png"))); // NOI18N
        jLabel6.setText("..");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StudentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StudentIDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String studentID=StudentID.getText();
        String Name=name.getText();
        String FatherName=fatherName.getText();
        String CourseName=(String)courseName.getSelectedItem();
        String BranchName=(String)branchName.getSelectedItem();
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","");
        Statement st=con.createStatement();
        String sql="insert into student_details(StudentID,studentName,fatherName,courseName,branchName)"+"values('"+studentID+"','"+Name+"','"+FatherName+"','"+CourseName+"','"+BranchName+"')";
        int rs=st.executeUpdate(sql);
        if(rs>0){
        JOptionPane.showMessageDialog(null,"Successfully updated");
        }
        setVisible(false);
        new newstudent().setVisible(true);
        
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null,"Student ID already exits");
        setVisible(false);
        new newstudent().setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(newstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newstudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField StudentID;
    private javax.swing.JComboBox<String> branchName;
    private javax.swing.JComboBox<String> courseName;
    private javax.swing.JTextField fatherName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField name;
    // End of variables declaration//GEN-END:variables
}
