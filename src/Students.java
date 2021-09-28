
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author supun
 */
public class Students extends javax.swing.JFrame {

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
    /**
     * Creates new form Students
     */
    public Students() {
        initComponents();
        con = databaseHandling.connection();
    }
    
    private void Reset(){
        
        id.setText("");
        name.setText("");
        address.setText("");
        grade.setSelectedItem("");
        age.setText("");
        bdy.setText("");
        gender.setSelectedItem("");
        admission.setText("");
        gardian.setText("");
        contact.setText("");
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        search = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        bdy = new javax.swing.JTextField();
        grade = new javax.swing.JComboBox<>();
        gender = new javax.swing.JComboBox<>();
        admission = new javax.swing.JTextField();
        gardian = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("STUDENT  DETAILS");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NAME");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ADDRESS");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("GRADE");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("AGE");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("BIRTHDAY");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("GENDER");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ADMISSION DATE");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("GUARDIAN'S NAME");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CONTACT NO:");

        reset.setBackground(new java.awt.Color(0, 0, 0));
        reset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        reset.setForeground(new java.awt.Color(255, 255, 255));
        reset.setText("RESET");
        reset.setBorderPainted(false);
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        submit.setBackground(new java.awt.Color(0, 0, 0));
        submit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("SUBMIT");
        submit.setBorderPainted(false);
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        update.setBackground(new java.awt.Color(0, 0, 0));
        update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("UPDATE");
        update.setBorderPainted(false);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(0, 0, 0));
        delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("DELETE");
        delete.setBorderPainted(false);
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("MAIN MENU");
        jButton5.setBorderPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        search.setBackground(new java.awt.Color(0, 0, 0));
        search.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("SEARCH");
        search.setBorderPainted(false);
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        grade.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        grade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1A", "1B", "1C" }));

        gender.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", " " }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(219, 219, 219)
                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(id, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(address, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(age, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bdy, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(grade, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gender, javax.swing.GroupLayout.Alignment.LEADING, 0, 486, Short.MAX_VALUE)
                            .addComponent(admission, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gardian, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contact, javax.swing.GroupLayout.Alignment.LEADING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(search)
                    .addComponent(jButton5))
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(search)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(grade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(bdy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(admission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(gardian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reset)
                    .addComponent(submit)
                    .addComponent(update)
                    .addComponent(jButton5)
                    .addComponent(delete))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Add Student In data base..........................................
    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
       try{
           stmt = con.createStatement();
           //get data..............
           int sID = Integer.parseInt(id.getText());
           String sName = name.getText();
           String sAddress = address.getText();
           String sGrade = (String) grade.getSelectedItem();
           int sAge = Integer.parseInt(age.getText());
           long Birthday = Date.parse(bdy.getText());
           java.sql.Date sBirthday = new java.sql.Date(Birthday);
           String sGender = (String) gender.getSelectedItem();
           long Admission = Date.parse(admission.getText());
           java.sql.Date sAdmission = new java.sql.Date(Admission);
           String sGuardian = gardian.getText();
           int sContact = Integer.parseInt(contact.getText());
           
           String query = "INSERT INTO student( id, name, address, grade, age, bdy, gender, admission, guadian, contact)VALUES(?,?,?,?,?,?,?,?,?,?)";
           //prepare data...............................
           PreparedStatement preparedStmt = con.prepareStatement(query);
           preparedStmt.setInt(1,sID);
           preparedStmt.setString(2, sName);
           preparedStmt.setString(3, sAddress);
           preparedStmt.setString(4, sGrade);
           preparedStmt.setInt(5, sAge);
           preparedStmt.setDate(6, sBirthday);
           preparedStmt.setString(7, sGender);
           preparedStmt.setDate(8, sAdmission);
           preparedStmt.setString(9,sGuardian);
           preparedStmt.setInt(10, sContact);
           
           preparedStmt.execute();
           
           JOptionPane.showMessageDialog(null, "Student Details Entered in DataBased!");
           Reset();
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
    }//GEN-LAST:event_submitActionPerformed
//Search student's details..............................................
    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        try{
            stmt = con.createStatement();
            int sId = Integer.parseInt(id.getText());//get id......
            
            String query = "SELECT * FROM student";
            rs = stmt.executeQuery(query);
            while(rs.next())
            {
                if(sId == rs.getInt("id"))
                {
                    name.setText(rs.getString("name"));
                    address.setText(rs.getString("address"));
                    grade.setSelectedItem(rs.getString("grade"));
                    age.setText(String.format("%s", rs.getInt("age")));
                    bdy.setText(String.format("%td", rs.getDate("bdy")));
                    gender.setSelectedItem(rs.getString("gender"));
                    admission.setText(String.format("%td", rs.getDate("admission")));
                    gardian.setText(rs.getString("guadian"));
                    contact.setText(String.format(0+"%s", rs.getInt("contact")));
                    
               
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_searchActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        Reset();
    }//GEN-LAST:event_resetActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try{
           stmt = con.createStatement();
           //get data..............
           int sID = Integer.parseInt(id.getText());
           String sName = name.getText();
           String sAddress = address.getText();
           String sGrade = (String) grade.getSelectedItem();
           int sAge = Integer.parseInt(age.getText());
           long Birthday = Date.parse(bdy.getText());
           java.sql.Date sBirthday = new java.sql.Date(Birthday);
           String sGender = (String) gender.getSelectedItem();
           long Admission = Date.parse(admission.getText());
           java.sql.Date sAdmission = new java.sql.Date(Admission);
           String sGuardian = gardian.getText();
           int sContact = Integer.parseInt(contact.getText());
           
           String query = "UPDATE student SET name=?,address=?,grade=?,age=?,bdy=?,gender=?,admission=?,guadian=?,contact=? WHERE id=?";
           //prepare data...............................
           PreparedStatement preparedStmt = con.prepareStatement(query);
           
           preparedStmt.setString(1, sName);
           preparedStmt.setString(2, sAddress);
           preparedStmt.setString(3, sGrade);
           preparedStmt.setInt(4, sAge);
           preparedStmt.setDate(5, sBirthday);
           preparedStmt.setString(6, sGender);
           preparedStmt.setDate(7, sAdmission);
           preparedStmt.setString(8,sGuardian);
           preparedStmt.setInt(9, sContact);
           preparedStmt.setInt(10,sID);
           
           preparedStmt.executeUpdate();
           
           JOptionPane.showMessageDialog(null, "Student Details Updated in DataBased!");
           Reset();
           
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        try{
            
            stmt = con.createStatement();
            
            int sId = Integer.parseInt(id.getText());
            
            String query = "DELETE FROM student WHERE id='"+sId+"'";
            
            stmt.executeUpdate(query);
            
            Reset();
            
            JOptionPane.showMessageDialog(null, "Your Details Deleted!");
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Home hm = new Home();
        hm.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Students().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JTextField admission;
    private javax.swing.JTextField age;
    private javax.swing.JTextField bdy;
    private javax.swing.JTextField contact;
    private javax.swing.JButton delete;
    private javax.swing.JTextField gardian;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JComboBox<String> grade;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField name;
    private javax.swing.JButton reset;
    private javax.swing.JButton search;
    private javax.swing.JButton submit;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
