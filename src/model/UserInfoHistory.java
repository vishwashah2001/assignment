/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author vishwashah
 */
public class UserInfoHistory {
    private ArrayList<UserInfo>history;
    private String imgUpload;
    //Constructor
    public UserInfoHistory(){
        this.history = new ArrayList<UserInfo>();
            
    }

    public ArrayList<UserInfo> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<UserInfo> history) {
        this.history = history;
    }
    public UserInfo addNewUsers(){
      UserInfo newUsers = new UserInfo();
      history.add(newUsers);
       return newUsers;
    }

//     public String getImgUpload() {
//        //String imgUpload = null;
//        return imgUpload;
    //}
     public void deleteUser(UserInfo ui){
        history.remove(ui);
    }
    
    public void updateUser(int i, UserInfo ui){
        history.set(i,ui);}

//    public void setImgUpload(String imgUpload) {
//        this.imgUpload = imgUpload;
//    }

    
}

    
