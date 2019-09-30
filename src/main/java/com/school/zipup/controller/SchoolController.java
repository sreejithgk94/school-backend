package com.school.zipup.controller;

import com.school.zipup.dto.SchoolRegistrationDto;
import com.school.zipup.dto.SchoolRegistrationResponse;
import com.school.zipup.services.impl.SchoolServiceImpl;
import com.school.zipup.util.AppResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/school")
public class SchoolController {

    private final SchoolServiceImpl schoolServiceImpl;

    @Autowired
    private SchoolController(final SchoolServiceImpl schoolService) {

        this.schoolServiceImpl = schoolService;
    }

    @PostMapping(value = "/registration")
    public AppResponse<SchoolRegistrationResponse> schoolRegistration(@Valid @RequestBody SchoolRegistrationDto schoolRegistrationDto) {
          SchoolRegistrationResponse schoolRegistrationResponse  =  schoolServiceImpl.schoolRegistrationService(schoolRegistrationDto);

          if(schoolRegistrationResponse == null) {

              return AppResponse.<SchoolRegistrationResponse>builder()
                      .message("Check your Email and school Name already exist on our database!")
                      .success(false)
                      .build();

          }

        return AppResponse.<SchoolRegistrationResponse>builder()
                .data(schoolRegistrationResponse)
                .message("School Registraterd Sucessfully")
                .success(true)
                .build();

    }


}
