package com.Midterm.Exam.Dao;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerReturnDao {
    private Long id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String jobTitle;
    private String mobilePhone;
    private String city;
    private String webPage;

    @Override
    public String toString() {
        return "CustomerReturnDao{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", city='" + city + '\'' +
                ", webPage='" + webPage + '\'' +
                '}';
    }
}
