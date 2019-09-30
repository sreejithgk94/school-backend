package com.school.zipup.services;

import com.school.zipup.dto.SchoolRegistrationDto;
import com.school.zipup.dto.SchoolRegistrationResponse;

public interface SchoolServices {

    SchoolRegistrationResponse schoolRegistrationService(SchoolRegistrationDto schoolRegistrationDto);


}
