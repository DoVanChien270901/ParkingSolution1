/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fpt.aptech.ParkingApi.dto.response;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author CHIEN
 */
public class ProfileRes implements Serializable {

    private Integer identitycard;
    private String fullname;
    private LocalDate dob;
    private Double balance;
    private String email;
    private Integer phone;
    private byte[] qrContent;

    public ProfileRes() {
    }

    public Integer getIdentitycard() {
        return identitycard;
    }

    public void setIdentitycard(Integer identitycard) {
        this.identitycard = identitycard;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public byte[] getQrContent() {
        return qrContent;
    }

    public void setQrContent(byte[] qrContent) {
        this.qrContent = qrContent;
    }

}
