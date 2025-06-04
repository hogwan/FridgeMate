package Entity;

import java.sql.Timestamp;

public class Users {
    private int user_id;
    private String username;
    private String email;
    private String password;
    private Timestamp created_at;
    
    public int getUser_id() {
        return user_id;
    }
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Timestamp getCreated_at() {
        return created_at;
    }
    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }
    @Override
    public String toString() {
        return "users [user_id=" + user_id + ", username=" + username + ", email=" + email + ", password=" + password
                + ", created_at=" + created_at + "]";
    }
}