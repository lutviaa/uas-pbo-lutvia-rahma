/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main.Model;

public class UserModel {
    private String username;
    private String password;
    private String role; 

    public UserModel(String username, String password) {
        this.username = username;
        this.password = password;
        this.role = "USER";
    }

    // Getters and setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getRole(){
        return role;
    }
    
    public void setRole(){
        this.role = "USER";
    }   
}

