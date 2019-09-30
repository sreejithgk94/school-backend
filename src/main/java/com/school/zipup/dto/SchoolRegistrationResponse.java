package com.school.zipup.dto;

import lombok.Data;

@Data
public class SchoolRegistrationResponse {

    private String schoolName;

    private  String schoolAddress;

    private  String schoolRegNo;

    private Long schoolContact;

    private String schoolEmail;

    private String country;

    private String state;

    private String district;

    private String userName;
}
