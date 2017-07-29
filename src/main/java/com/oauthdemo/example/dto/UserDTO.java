package com.oauthdemo.example.dto;

import com.oauthdemo.example.domain.Authority;
import com.oauthdemo.example.domain.User;

import java.util.List;

public class UserDTO {

    Integer id;
    String username;
    String password;
    Boolean enabled;
    List<Authority> authorityList;
    String email;

    public UserDTO() {
    }

    public UserDTO(User user) {
        this(user.getId(),user.getUsername(),user.getPassword(),user.getEnabled(),user.getAuthorityList(),user.getEmail());
    }

    public UserDTO(Integer id, String username, String password, Boolean enabled, List<Authority> authorityList,String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.authorityList = authorityList;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public List<Authority> getAuthorityList() {
        return authorityList;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", enabled=" + enabled +
                ", authorityList=" + authorityList +
                ", email='" + email + '\'' +
                '}';
    }
}
