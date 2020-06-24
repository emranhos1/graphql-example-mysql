package com.eh.graphql.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * @author Md. Emran Hossain <emranhos1@gmail.com>
 * @version   1.0.00
 * @since     1.0.00
 */
@Entity
@Table(name = "gender")
public class Gender {

    @Id
    @Column(name = "sex_code")
    private String sexCode;
    @Column(name = "update_date")
    private Date updateDate;
    @Column(name = "update_user")
    private String updateUser;
    @Column(name = "entry_date")
    private Date entryDate;
    @Column(name = "entry_user")
    private String entryUser;
    @Column(name = "gender_name")
    private String genderName;
    @Column(name = "short_gender_name")
    private String shortGenderName;

    public String getSexCode() {
        return sexCode;
    }

    public void setSexCode(String sexCode) {
        this.sexCode = sexCode;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public String getEntryUser() {
        return entryUser;
    }

    public void setEntryUser(String entryUser) {
        this.entryUser = entryUser;
    }

    public String getGenderName() {
        return genderName;
    }

    public void setGenderName(String genderName) {
        this.genderName = genderName;
    }

    public String getShortGenderName() {
        return shortGenderName;
    }

    public void setShortGenderName(String shortGenderName) {
        this.shortGenderName = shortGenderName;
    }
}
