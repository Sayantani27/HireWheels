package com.upgrad.hirewheels.entities;

import javax.persistence.*;

@Entity
public class users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int user_id;

    @Column(length = 50 , nullable = false)
    private String first_name;
    @Column(length = 50)
    private String last_name;
    @Column(length = 50 , nullable = false)
    private String password;
    @Column(length = 50 , nullable = false , unique = true)
    private String email;
    @Column(length = 50 , nullable = false)
    private String mobile_no;
    private float wallet_money = 10000.00f;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    public float getWallet_money() {
        return wallet_money;
    }

    public void setWallet_money(float wallet_money) {
        this.wallet_money = wallet_money;
    }

    @Override
    public String toString() {
        return "users{" +
                "user_id=" + user_id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", mobile_no='" + mobile_no + '\'' +
                ", wallet_money=" + wallet_money +
                '}';
    }
}
