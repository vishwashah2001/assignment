/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.UserInfo;
import model.UserInfoHistory;

/**
 *
 * @author vishwashah
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    UserInfoHistory history;
    UserInfo info;
    public ViewJPanel(UserInfoHistory history, UserInfo info ) {
        initComponents();
        this.history = history;
        this.info = info;
        populateTable();
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPosition = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        lblPhoto = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtEmployeeID = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        lblDate = new javax.swing.JLabel();
        txtLevel = new javax.swing.JTextField();
        lblLevel = new javax.swing.JLabel();
        lblTeam = new javax.swing.JLabel();
        lblPosition = new javax.swing.JLabel();
        txtTeam = new javax.swing.JTextField();
        lblEmployeeID = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jUploadphoto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblView = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        rbtnFemale = new javax.swing.JRadioButton();
        rbtnOther = new javax.swing.JRadioButton();
        rbtnMale = new javax.swing.JRadioButton();
        txtUniversal = new javax.swing.JTextField();
        lblSearch = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));

        lblAge.setText("Age:");

        lblEmail.setText("Email ID:");

        lblTitle.setBackground(new java.awt.Color(255, 204, 204));
        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 102, 102));
        lblTitle.setText("                                                           View /Update User Information");

        lblPhoto.setText("Photo:");

        lblName.setText("Name:");

        lblGender.setText("Gender:");

        lblDate.setText("Start Date:");

        lblLevel.setText("Level:");

        lblTeam.setText("Team Info:");

        lblPosition.setText("Position Title:");

        lblEmployeeID.setText("Employee ID:");

        lblPhone.setText("Phone Number:");

        jUploadphoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jUploadphotoMouseClicked(evt);
            }
        });

        tblView.setBackground(new java.awt.Color(204, 255, 255));
        tblView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Employee ID", "Age", "Gender", "Start Date", "Level", "Team Info", "Position Title", "Phone Number", "Email"
            }
        ));
        tblView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblViewMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblView);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        rbtnFemale.setText("Female");

        rbtnOther.setText("Other");

        rbtnMale.setText("Male");

        txtUniversal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUniversalActionPerformed(evt);
            }
        });
        txtUniversal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUniversalKeyReleased(evt);
            }
        });

        lblSearch.setText("Search:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jUploadphoto, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnView)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpdate)
                        .addGap(734, 734, 734))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblName)
                                        .addGap(41, 41, 41)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblAge)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblGender)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rbtnFemale)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbtnMale)
                                        .addGap(24, 24, 24)
                                        .addComponent(rbtnOther))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblDate)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblLevel)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblTeam)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblEmployeeID)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(lblPhoto)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblEmail)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(lblPosition)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(lblPhone)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblSearch)
                                .addGap(64, 64, 64)
                                .addComponent(txtUniversal, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(119, 119, 119)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 969, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmployeeID)
                            .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAge)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGender)
                            .addComponent(rbtnFemale)
                            .addComponent(rbtnOther)
                            .addComponent(rbtnMale))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDate)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLevel)
                            .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTeam)
                            .addComponent(txtTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPhone)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPosition)
                            .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(lblPhoto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jUploadphoto, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUniversal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSearch))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnView))
                .addGap(92, 92, 92))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jUploadphotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jUploadphotoMouseClicked
        // TODO add your handling code here:
//
//      JFileChooser imageFile = new JFileChooser();
//        imageFile.showOpenDialog(null);
//        File img = imageFile.getSelectedFile();
//        String filePath = img.getAbsolutePath();
//        ImageIcon imgLic = new ImageIcon(filePath);
//        jUploadphoto.setIcon(imgLic);
//        history.setImgUpload(filePath);
    }//GEN-LAST:event_jUploadphotoMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex=tblView.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"Please select a row to delete");
            return;
        }
         DefaultTableModel model = (DefaultTableModel) tblView.getModel();
//         history.remove(selectedUser);
         String selectedUser = model.getValueAt(selectedRowIndex,0).toString();         
         history.getHistory().remove(selectedRowIndex);
         model.removeRow(selectedRowIndex);
       
         JOptionPane.showMessageDialog(this,"Employee detials are deleted successfully!");
         populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
       // try{
        int selectedRowIndex = tblView.getSelectedRow();
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"Please select a row to update");
            System.out.print("1");
            return;
             
        }
        
        DefaultTableModel model = (DefaultTableModel) tblView.getModel();
        UserInfo selectedInfo = (UserInfo) model.getValueAt(selectedRowIndex,0);
        String name=txtName.getText();
//        String employeeid =txtEmployeeID.getText();
       int employeeid = Integer.parseInt(txtEmployeeID.getText().trim());
       int age = Integer.parseInt(txtAge.getText());
        String gender;
        if(rbtnFemale.isSelected()){
            gender= "Female";
        }
        else if (rbtnMale.isSelected()){
           gender= "Male";
        }
        else{
            gender= "Other";
        }
        String date=txtDate.getText();
        //String level = txtLevel.getText();
        int level=Integer.parseInt(txtLevel.getText());
        String teaminfo=txtTeam.getText();
        String positiontitle=txtPosition.getText();
        int cellphone=Integer.parseInt(txtPhone.getText());
        //String cellphone=txtPhone.getText();
        String email=txtEmail.getText();
        //Updating
//        model.setValueAt(name,tblView.getSelectedRow(), 0);
//        model.setValueAt(employeeid,tblView.getSelectedRow(), 1);
//        model.setValueAt(age,tblView.getSelectedRow(), 2);
//        model.setValueAt(gender,tblView.getSelectedRow(), 3);
//        model.setValueAt(date,tblView.getSelectedRow(), 4);
//        model.setValueAt(level,tblView.getSelectedRow(), 5);
//        model.setValueAt(teaminfo,tblView.getSelectedRow(), 6);
//        model.setValueAt(positiontitle,tblView.getSelectedRow(), 7);
//        model.setValueAt(cellphone,tblView.getSelectedRow(), 8);
//        model.setValueAt(email,tblView.getSelectedRow(), 9);
        selectedInfo.setName(name);
        selectedInfo.setEmployeeid(employeeid);
        selectedInfo.setAge(age);
        selectedInfo.setGender(gender);
        selectedInfo.setDate(date);
        selectedInfo.setLevel(level);
        selectedInfo.setPositiontitle(positiontitle);
        selectedInfo.setTeaminfo(teaminfo);
        selectedInfo.setEmail(email);
        
        
        
           
      
        JOptionPane.showMessageDialog(this, "Details updated successfully!");
        txtName.setText("");
        txtEmployeeID.setText("");
        txtAge.setText("");
        txtDate.setText("");
        txtEmail.setText("");
        txtLevel.setText("");
        txtTeam.setText("");
      //  lbljUploadphoto.se
        txtPhone.setText("");
        txtPosition.setText("");
        populateTable(); 
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblViewMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblViewMouseClicked

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
         int selectedRowIndex = tblView.getSelectedRow();
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"Please select a row to update");
           // System.out.print("1");
            return;
             
        }
        
        DefaultTableModel model = (DefaultTableModel) tblView.getModel();
        UserInfo selectedInfo = (UserInfo) model.getValueAt(selectedRowIndex,0);
        txtName.setText(selectedInfo.getName());
        txtAge.setText(String.valueOf(selectedInfo.getAge()));
        txtDate.setText(selectedInfo.getDate());
        txtTeam.setText(selectedInfo.getTeaminfo());
        txtPhone.setText(String.valueOf(selectedInfo.getCellphone()));
        txtPosition.setText(selectedInfo.getPositiontitle());
        txtEmail.setText(selectedInfo.getEmail());
        txtEmployeeID.setText(String.valueOf(selectedInfo.getEmployeeid()));
        txtLevel.setText(String.valueOf(selectedInfo.getLevel()));
       String Gender = selectedInfo.getGender();
       if(Gender=="Female"){
           rbtnFemale.setSelected(true);
       }
       else if (Gender=="Male"){
           rbtnMale.setSelected(true);    
       }
       else{
           rbtnOther.setSelected(true);
       }
       Image img= Toolkit.getDefaultToolkit().createImage(selectedInfo.getPhoto());
       img = img.getScaledInstance(jUploadphoto.getWidth(), jUploadphoto.getHeight(),Image.SCALE_SMOOTH);
       ImageIcon icon= new ImageIcon(img);
       jUploadphoto.setIcon(icon);
        
    
    }//GEN-LAST:event_btnViewActionPerformed

    private void txtUniversalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUniversalActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtUniversalActionPerformed

    private void txtUniversalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUniversalKeyReleased
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tblView.getModel();
        TableRowSorter<DefaultTableModel> rt = new TableRowSorter<DefaultTableModel>(model);
        tblView.setRowSorter(rt);
        rt.setRowFilter(RowFilter.regexFilter(txtUniversal.getText().trim()));
    
    }//GEN-LAST:event_txtUniversalKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jUploadphoto;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmployeeID;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblPosition;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblTeam;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JRadioButton rbtnFemale;
    private javax.swing.JRadioButton rbtnMale;
    private javax.swing.JRadioButton rbtnOther;
    private javax.swing.JTable tblView;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmployeeID;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtPosition;
    private javax.swing.JTextField txtTeam;
    private javax.swing.JTextField txtUniversal;
    // End of variables declaration//GEN-END:variables
private void populateTable() {
   DefaultTableModel model = (DefaultTableModel) tblView.getModel();
        model.setRowCount(0);
        for (UserInfo ui:history.getHistory()){
        Object[] row = new Object[11];
        //row[0]=ui;
        row[0]=ui;
        row[1]=ui.getEmployeeid();
        row[2]=ui.getAge();
        row[3]=ui.getGender();
        row[4]=ui.getDate();
        row[5]=ui.getLevel();
        row[6]=ui.getTeaminfo();
        row[7]=ui.getPositiontitle();
        row[8]=ui.getCellphone();
        row[9]=ui.getEmail();
        row[10]=ui.getPhoto();
        model.addRow(row);
        
                
        }    

   // jUploadphoto.setIcon(info.getImgUpload());
    //Image 
}


}