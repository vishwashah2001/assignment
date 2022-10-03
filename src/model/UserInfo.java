/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import javax.swing.ImageIcon;

/**
 *
 * @author vishwashah
 */
public class UserInfo {
//    public UserInfo(){
//    this.name = n;
//}
    
    private String name; 
    private int employeeid;
    private int age;
    private String date;
    private int level;
    private String teaminfo;
    private String positiontitle;
    private String cellphone;
    private String email;
    private String gender;
    private String photo; //photo

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }


    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getTeaminfo() {
        return teaminfo;
    }

    public void setTeaminfo(String teaminfo) {
        this.teaminfo = teaminfo;
    }

    public String getPositiontitle() {
        return positiontitle;
    }

    public void setPositiontitle(String positiontitle) {
        this.positiontitle = positiontitle;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString(){
        return name;
    }
    
}
