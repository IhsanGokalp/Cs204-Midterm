package com.Midterm.Exam.Dao;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class CustomerCreateDao {
    @NotBlank
    private String firstname;
    @NotBlank
    private String lastname;
    @NotBlank
    @Email
    private String emailaddress;
    @NotBlank
    private String jobtitle;
    private String mobilePhone;
    @NotBlank
    private String city;
    @NotBlank
    private String webpage;
}
