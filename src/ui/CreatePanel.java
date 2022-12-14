/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Image;
import java.io.File;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import model.UserInfo;
import model.UserInfoHistory;
import java.util.regex.*;  
/**
 *
 * @author vishwashah
 */
public class CreatePanel extends javax.swing.JPanel {

    /**
     * Creates new form CreatePanel
     */
     String filepath=null; 
    UserInfoHistory history;
   //  UserInfo info;
    int i;
    public CreatePanel(UserInfoHistory history, UserInfo info) {
        initComponents();
        this.history = history;
       // this.info = info;
       
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblGender = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        lblDate = new javax.swing.JLabel();
        txtLevel = new javax.swing.JTextField();
        lblLevel = new javax.swing.JLabel();
        lblTeam = new javax.swing.JLabel();
        lblPosition = new javax.swing.JLabel();
        txtTeam = new javax.swing.JTextField();
        lblPhone = new javax.swing.JLabel();
        txtPosition = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblPhoto = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtEmployeeID = new javax.swing.JTextField();
        lblEmployeeID = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lblValName = new javax.swing.JLabel();
        lblValEmployeeID = new javax.swing.JLabel();
        lblValAge = new javax.swing.JLabel();
        lblValDate = new javax.swing.JLabel();
        lblValLevel = new javax.swing.JLabel();
        lblValPositionInfo = new javax.swing.JLabel();
        lblValTeamInfo = new javax.swing.JLabel();
        lblValPhone = new javax.swing.JLabel();
        lblValEmail = new javax.swing.JLabel();
        lblValGender = new javax.swing.JLabel();
        RbtnMale = new javax.swing.JRadioButton();
        RbtnFemale = new javax.swing.JRadioButton();
        RbtnOther = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 204, 204));

        lblGender.setText("Gender:");

        txtDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDateKeyReleased(evt);
            }
        });

        lblDate.setText("Start Date:");

        txtLevel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLevelKeyReleased(evt);
            }
        });

        lblLevel.setText("Level:");

        lblTeam.setText("Team Info:");

        lblPosition.setText("Position Title:");

        txtTeam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTeamKeyReleased(evt);
            }
        });

        lblPhone.setText("Phone Number:");

        txtPosition.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPositionKeyReleased(evt);
            }
        });

        lblEmail.setText("Email ID:");

        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });
        txtPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPhoneKeyReleased(evt);
            }
        });

        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblTitle.setBackground(new java.awt.Color(255, 204, 204));
        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 153, 153));
        lblTitle.setText("                                                User Information");

        lblPhoto.setText("Photo:");

        lblName.setText("Name:");

        txtEmployeeID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmployeeIDKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmployeeIDKeyReleased(evt);
            }
        });

        lblEmployeeID.setText("Employee ID:");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });

        lblAge.setText("Age:");

        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAgeKeyReleased(evt);
            }
        });

        jButton1.setText("Upload");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(RbtnMale);
        RbtnMale.setText("Male");
        RbtnMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbtnMaleActionPerformed(evt);
            }
        });

        buttonGroup1.add(RbtnFemale);
        RbtnFemale.setText("Female");
        RbtnFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbtnFemaleActionPerformed(evt);
            }
        });

        buttonGroup1.add(RbtnOther);
        RbtnOther.setText("Other");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblTeam)
                            .addGap(18, 18, 18)
                            .addComponent(txtTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblValTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblPhoto)
                            .addGap(18, 18, 18)
                            .addComponent(jButton1))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblEmployeeID)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtEmployeeID))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblName)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(32, 32, 32)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblValEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblValName, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblAge)
                            .addGap(18, 18, 18)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblValAge, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblLevel)
                                    .addGap(26, 26, 26)
                                    .addComponent(txtLevel))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblDate)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(lblValLevel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblValDate, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblPhone)
                            .addGap(18, 18, 18)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(lblValPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblPosition)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(134, 134, 134)
                            .addComponent(lblValPositionInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(189, 189, 189))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblEmail)
                                .addComponent(lblGender))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(34, 34, 34)
                                    .addComponent(RbtnFemale)
                                    .addGap(18, 18, 18)
                                    .addComponent(RbtnMale)
                                    .addGap(18, 18, 18)
                                    .addComponent(RbtnOther)
                                    .addGap(115, 115, 115)
                                    .addComponent(lblValGender, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblValEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(147, 147, 147))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSave)
                .addGap(71, 71, 71))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(136, 136, 136))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSave)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblName)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblValEmployeeID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblEmployeeID)
                                        .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(lblValName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblValAge, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblAge)
                                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblDate)
                                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblValDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblLevel)
                                    .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblValLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblTeam)
                                    .addComponent(txtTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblValTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblPhone)
                                        .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblValPhone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblValEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblEmail)
                                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblGender))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(RbtnFemale)
                                    .addComponent(RbtnMale)
                                    .addComponent(RbtnOther))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 347, Short.MAX_VALUE)
                        .addComponent(lblValGender, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPosition)
                            .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblValPositionInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhoto)
                    .addComponent(jButton1))
                .addGap(112, 112, 112))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if(i==1){
                JOptionPane.showMessageDialog(this, "Please Enter Correct data");
        }
        
        String name= txtName.getText();
        int employeeid= Integer.parseInt(txtEmployeeID.getText());
        int age= Integer.parseInt(txtAge.getText());
        String date= txtDate.getText();
        int level = Integer.parseInt(txtLevel.getText());
        String teaminfo= txtTeam.getText();
        String cellphone= txtPhone.getText();
        String email= txtEmail.getText();
        String positiontitle= txtPosition.getText();
        //String gender=txtGender.getText();
        String gender;
        if(RbtnFemale.isSelected()){
            gender="Female";
        }else if (RbtnMale.isSelected()){
            gender="Male";
        }else {
           gender="Other"; 
        }
        String path =filepath;
        //lblPhoto imageLabel =new lblPhoto();
        //ImageIcon
       // if((cellphone.matches(regex:"^[0-9]*$") && cellphone.length()==10) && (date.matches(regex:"^(1 [0-2] |0 [1-9]) / (3[01]|[12][0-9]|0[1-9])/[0-9](4)$")) && (email.matches(regex: "^ [ \\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")));
        UserInfo ui = history.addNewUsers();
   
        ui.setAge(age);
        ui.setDate(date);
        ui.setEmail(email);
        ui.setEmployeeid(employeeid);
        ui.setTeaminfo(teaminfo);
        ui.setPositiontitle(positiontitle);
        ui.setLevel(level);
        ui.setName(name);
        ui.setCellphone(cellphone);
        ui.setGender(gender);
        ui.setPhoto(path);
        
        JOptionPane.showMessageDialog(this, "New User added");
        txtName.setText("");
        txtEmployeeID.setText("");
        txtAge.setText("");
        txtDate.setText("");
        txtLevel.setText("");
        txtTeam.setText("");
        txtPhone.setText("");
        txtEmail.setText("");
//        txtGender.setText("");
        RbtnFemale.setSelected(false);
        RbtnMale.setSelected(false);
        RbtnOther.setSelected(false);
        txtPosition.setText("");
        
        //else 
        //{ 
          //  if(!(cellphone.matches(regex:"^[0-9]*$") && cellphone.length() == 10)){
            //    JOptionPane.showMessageDialog(parentComonent:null, message:"Please enter correct contact number");
                
                   
    }//GEN-LAST:event_btnSaveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
//        String filename = null;
//        byte[] photo = null;
//        JFileChooser chooser = new JFileChooser();
//        chooser.showOpenDialog(null);
//        File f = chooser.getSelectedFile();
//        info.setImgUpload(new ImageIcon(f.toString()));
//        JOptionPane.showMessageDialog(null, "Employee image uploaded successfully.!");
            filepath = retrieveImage();
            JOptionPane.showMessageDialog(this, "Employee image uploaded successfully.!");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed
        // TODO add your handling code here:
        String valName= "^[a-zA-Z ]{0,30}$";
        Pattern Pname= Pattern.compile(valName);
        Matcher m=Pname.matcher(txtName.getText());
        
        if (!m.matches()){
            
        lblValName.setText("Name is Invalid");
        i=1;
      }
        else{
        lblValName.setText(null);
        i=0;
        }
        
    }//GEN-LAST:event_txtNameKeyPressed

    private void txtEmployeeIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmployeeIDKeyPressed

    }//GEN-LAST:event_txtEmployeeIDKeyPressed

    private void txtEmployeeIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmployeeIDKeyReleased
        // TODO add your handling code here:
        String valEmployeeID= "^[0-9]{1,9}$";
        Pattern PEmployeeID= Pattern.compile(valEmployeeID);
        Matcher m=PEmployeeID.matcher(txtEmployeeID.getText()); 
        
        if (!m.matches()){            
        lblValEmployeeID.setText("EmployeeID is Invalid");
        i=1;     
        }
        else{
        lblValEmployeeID.setText(null);
        i=0;
        } 
    }//GEN-LAST:event_txtEmployeeIDKeyReleased

    private void txtAgeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyReleased
        // TODO add your handling code here:
        String valAge= "^[0-9]{1,3}$";
        Pattern PAge= Pattern.compile(valAge);
        Matcher m=PAge.matcher(txtAge.getText());
        
        if (!m.matches()){
            
       lblValAge.setText("Age is Invalid");
        i=1;
      }
        else{
        lblValAge.setText(null);
        i=0;
        }
        
          
    }//GEN-LAST:event_txtAgeKeyReleased

    private void txtDateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDateKeyReleased
        String valDate= "^(?<month>[0-3]?[0-9])(?<day>[0-3]?[0-9])(?<year>(?:[0-9]{2})?[0-9]{2})$";
        Pattern PDate= Pattern.compile(valDate);
        Matcher m=PDate.matcher(txtDate.getText());
        
        if (!m.matches()){
            
       lblValDate.setText("Date is Invalid");
        i=1;
      }
        else{
        lblValDate.setText(null);
        i=0;
        }
    }//GEN-LAST:event_txtDateKeyReleased

    private void txtLevelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLevelKeyReleased
        // TODO add your handling code here:
        String valLevel= "^[1-9 ]{1}$";
        Pattern PLevel= Pattern.compile(valLevel);
        Matcher m=PLevel.matcher(txtLevel.getText());
        
        if (!m.matches()){
            
        lblValLevel.setText("Level is Invalid");
        i=1;
      }
        else{
        lblValLevel.setText(null);
        i=0;
        }
          
    }//GEN-LAST:event_txtLevelKeyReleased

    private void txtTeamKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTeamKeyReleased
        // TODO add your handling code here:
        String valTeamInfo= "^[a-zA-Z]{0,30}$";
        Pattern PTeamInfo= Pattern.compile(valTeamInfo);
        Matcher m=PTeamInfo.matcher(txtTeam.getText());
        
        if (!m.matches()){
            
        lblValTeamInfo.setText("Team info is Invalid");
        i=1;
      }
        else{
        lblValTeamInfo.setText(null);
        i=0;
        }    
    }//GEN-LAST:event_txtTeamKeyReleased

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

    private void txtPhoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneKeyReleased
        // TODO add your handling code here:
        String valPhone= "^[0-9 ]{10}$";
        Pattern PPhone= Pattern.compile(valPhone);
        Matcher m=PPhone.matcher(txtPhone.getText());
        
        if (!m.matches()){
            
        lblValPhone.setText("Number is Invalid");
        i=1;
      }
        else{
        lblValPhone.setText(null);
        i=0;
        }
         
    }//GEN-LAST:event_txtPhoneKeyReleased

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        // TODO add your handling code here:
        String valEmail= "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        Pattern pEmail= Pattern.compile(valEmail);
        Matcher mat=pEmail.matcher(txtEmail.getText());
        
        if (!mat.matches()){
            
        lblValEmail.setText("Email is Invalid");
        i=1;
      }
        else{
        lblValEmail.setText(null);
        i=0;
        }
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtPositionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPositionKeyReleased
        // TODO add your handling code here:
        String valPosition= "^[a-zA-Z]{0,30}$";
        Pattern PPosition= Pattern.compile(valPosition);
        Matcher m=PPosition.matcher(txtTeam.getText());
        
        if (!m.matches()){
            
        lblValPositionInfo.setText("Name is Invalid");
        i=1;
      }
        else{
        lblValPositionInfo.setText(null);
        i=0;
        } 
    }//GEN-LAST:event_txtPositionKeyReleased

    private void RbtnFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbtnFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RbtnFemaleActionPerformed

    private void RbtnMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbtnMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RbtnMaleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RbtnFemale;
    private javax.swing.JRadioButton RbtnMale;
    private javax.swing.JRadioButton RbtnOther;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel lblTeam;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblValAge;
    private javax.swing.JLabel lblValDate;
    private javax.swing.JLabel lblValEmail;
    private javax.swing.JLabel lblValEmployeeID;
    private javax.swing.JLabel lblValGender;
    private javax.swing.JLabel lblValLevel;
    private javax.swing.JLabel lblValName;
    private javax.swing.JLabel lblValPhone;
    private javax.swing.JLabel lblValPositionInfo;
    private javax.swing.JLabel lblValTeamInfo;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmployeeID;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtPosition;
    private javax.swing.JTextField txtTeam;
    // End of variables declaration//GEN-END:variables

public String retrieveImage(){
JFileChooser a =new JFileChooser();
a.showOpenDialog(null);
File file=a.getSelectedFile();
String path= file.getAbsolutePath();
return path;


}
}
