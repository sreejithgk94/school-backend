package com.school.zipup.dto;

import lombok.Data;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class SchoolRegistrationDto {

    @NotNull(message = "schoolName must not be null!")
    @NotEmpty(message = "schoolName must not be empty!")
    private String schoolName;

    @NotNull(message = "schoolAddress must not be null!")
    @NotEmpty(message = "schoolAddress must not be empty!")
    private  String schoolAddress;

    @NotNull(message = "schoolRegNo must not be null!")
    @NotEmpty(message ="schoolRegNo must not be empty!")
    private  String schoolRegNo;

    private Long schoolContact;

    @NotNull(message = "schoolEmail must not be null!")
    @NotEmpty(message ="schoolEmail must not be empty!")
    private String schoolEmail;

    @NotNull(message = "country must not be null!")
    @NotEmpty(message ="country must not be empty!")
    private String country;

    @NotNull(message = "state must not be null!")
    @NotEmpty(message = "state must not be empty!")
    private String state;

    @NotNull(message = "district must not be null!")
    @NotEmpty(message = "district must not be empty!")
    private String district;

    @NotNull(message = "userName must not be null!")
    @NotEmpty(message = "userName must not be empty!")
    private String userName;

    @NotNull(message = "password must not be null!")
    @NotEmpty(message = "password must not be empty!")
    private String password;

}
