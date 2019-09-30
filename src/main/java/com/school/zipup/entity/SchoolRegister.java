package com.school.zipup.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
public class SchoolRegister {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String schoolName;

    private  String schoolAddress;

    private  String schoolRegNo;

    private Long schoolContact;

    private String schoolEmail;

    private String country;

    private String state;

    private String district;

    private String userName;

    private String password;

    private LocalDateTime createdDate;

    @PrePersist
    private void afterCreate() {
        this.createdDate = LocalDateTime.now();
        this.createdDate = LocalDateTime.now();
    }
}
