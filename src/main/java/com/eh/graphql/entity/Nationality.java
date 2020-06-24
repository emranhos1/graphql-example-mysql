package com.eh.graphql.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * @author Md. Emran Hossain <emranhos1@gmail.com>
 * @version 1.0.00
 * @since   1.0.00
 */
@Entity
@Table(name = "nationality")
public class Nationality {

    @Id
    @Column(name = "nationality_code")
    private String nationalityCode;
    @Column(name = "update_date")
    private Date updateDate;
    @Column(name = "update_user")
    private String updateUser;
    @Column(name = "entry_date")
    private Date entryDate;
    @Column(name = "entry_user")
    private String entryUser;
    @Column(name = "nationality_name")
    private String nationalityName;
    @Column(name = "nationality_short_name")
    private String nationalityShortName;

    public String getNationalityCode() {
        return nationalityCode;
    }

    public void setNationalityCode(String nationalityCode) {
        this.nationalityCode = nationalityCode;
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

    public String getNationalityName() {
        return nationalityName;
    }

    public void setNationalityName(String nationalityName) {
        this.nationalityName = nationalityName;
    }

    public String getNationalityShortName() {
        return nationalityShortName;
    }

    public void setNationalityShortName(String nationalityShortName) {
        this.nationalityShortName = nationalityShortName;
    }
}
