package ca.sait.models;

import java.io.Serializable;

/**
 *
 * @author neild
 */
public class User implements Serializable{
    private String email;
    private boolean active;
    private String firstName;
    private String lastName;
    private String password;
    private Role role; 
    
    //default constructor 
    public User(){
        
    }
    
    //user-defined constructor 
    public User(String email, boolean active, String firstName, String lastName, String password, Role role){
        this.email = email;
        this.active = active;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.role = role; 
    }

    //getters 
    public String getEmail() {
        return email;
    }

    public boolean isActive() {
        return active;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public Role getRole() {
        return role;
    }

    
    //setters 
    public void setEmail(String email) {
        this.email = email;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    
    
}
