package com.eh.graphql.entity;

import java.sql.Date;

import javax.persistence.*;
/**
 * @author Md. Emran Hossain <emranhos1@gmail.com>
 * @version   1.0.00
 * @since     1.0.00
 */
@Entity
@Table(name = "patient")
public class Patient {

    @Id
    @Column(name = "patient_no")
    private String patientNo;
    @Column(name = "update_date")
    private Date updateDate;
    @Column(name = "update_user")
    private String updateUser;
    @Column(name = "entry_date")
    private Date entryDate;
    @Column(name = "entry_user")
    private String entryUser;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "phone")
    private String phoneNo;
    @Column(name = "email")
    private String email;

    @Column(name = "gender_code")
    private String genderCode;

    @Column(name = "nationality_code")
    private String nationalityCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="gender_code", referencedColumnName = "sex_code", insertable = false, updatable = false)
    private Gender gender;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="nationality_code", referencedColumnName = "nationality_code", insertable = false, updatable = false)
    private Nationality nationality;

    public String getPatientNo() {
        return patientNo;
    }

    public void setPatientNo(String patientNo) {
        this.patientNo = patientNo;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGenderCode() {
        return genderCode;
    }

    public void setGenderCode(String genderCode) {
        this.genderCode = genderCode;
    }

    public String getNationalityCode() {
        return nationalityCode;
    }

    public void setNationalityCode(String nationalityCode) {
        this.nationalityCode = nationalityCode;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }
}
