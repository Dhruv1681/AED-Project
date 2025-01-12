/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInferface;

import MainModel.Course;
import MainModel.CourseHistory;
import MainModel.Professor;
import MainModel.StudentClass;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author dipenpatel
 */
public class CreateCourseProfessorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateCourseProfessorJPanel
     */
//    public CreateCourseProfessorJPanel() {
//        initComponents();
//    }
    private JPanel WorkArea;
    private CourseHistory CourseHistory;
    private Professor Professor;
    
    CreateCourseProfessorJPanel(JPanel WorkArea, CourseHistory CourseHistory,Professor Professor) {
        initComponents();
        this.WorkArea=WorkArea;
        this.CourseHistory=CourseHistory;
        this.Professor=Professor;
        txtFullName.setText(Professor.getFirstName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCourseName = new javax.swing.JTextField();
        txtCourseCode = new javax.swing.JTextField();
        txtCourseDetails = new javax.swing.JTextField();
        txtTerm = new javax.swing.JTextField();
        txtSchedule = new javax.swing.JTextField();
        btnCreateCourse = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();

        setBackground(new java.awt.Color(186, 79, 84));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create Course Professor");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Course Name");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Course Code");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Course Details");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Term ");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Schedule");

        txtCourseName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCourseNameActionPerformed(evt);
            }
        });

        txtTerm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTermActionPerformed(evt);
            }
        });

        btnCreateCourse.setText("Create Course");
        btnCreateCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCourseActionPerformed(evt);
            }
        });

        btnBack.setText("<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel7.setText("Full Name");

        txtFullName.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCreateCourse)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(btnBack)
                            .addComponent(jLabel7))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTerm, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCourseCode, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCourseName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCourseDetails)
                            .addComponent(txtSchedule)
                            .addComponent(txtFullName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))))
                .addGap(278, 278, 278))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4, jLabel5, jLabel6});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCourseCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCourseDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTerm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(btnCreateCourse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(31, 31, 31))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCourseActionPerformed
        // TODO add your handling code here:
        String CourseName=txtCourseName.getText();
        String CourseCode=txtCourseCode.getText();
        String CourseDetails=txtCourseDetails.getText();
        String term=txtTerm.getText();
        String Schedule=txtSchedule.getText();
        String FullName=txtFullName.getText();
        
        Course course=new Course();
        
        course.setCourseCode(CourseCode);
        course.setCourseDescription(CourseDetails);
        course.setTerm(term);
        course.setTime(Schedule);
        course.setCourseName(CourseName);
        course.setProfessor(FullName);
        
        CourseHistory.createCourse(course);
       
        JOptionPane.showMessageDialog(null, "Course is created!!!");
        
        txtCourseCode.setText(null);
        txtCourseDetails.setText(null);
        txtCourseName.setText(null);
        txtSchedule.setText(null);
        txtTerm.setText(null);
        
    }//GEN-LAST:event_btnCreateCourseActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        WorkArea.remove(this);
        CardLayout layout=(CardLayout) WorkArea.getLayout();
        layout.previous(WorkArea);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtTermActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTermActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTermActionPerformed

    private void txtCourseNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCourseNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCourseNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateCourse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtCourseCode;
    private javax.swing.JTextField txtCourseDetails;
    private javax.swing.JTextField txtCourseName;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtSchedule;
    private javax.swing.JTextField txtTerm;
    // End of variables declaration//GEN-END:variables
}
