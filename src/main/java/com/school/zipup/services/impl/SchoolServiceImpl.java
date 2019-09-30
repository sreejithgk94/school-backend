package com.school.zipup.services.impl;

import com.school.zipup.dto.SchoolRegistrationDto;
import com.school.zipup.dto.SchoolRegistrationResponse;
import com.school.zipup.entity.SchoolRegister;
import com.school.zipup.repository.SchoolRegistersRepository;
import com.school.zipup.services.SchoolServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolServiceImpl implements SchoolServices {

    
    private final SchoolRegistersRepository schoolRegisterRepos;


    @Autowired
    private SchoolServiceImpl(final SchoolRegistersRepository schoolRepo) {

        this.schoolRegisterRepos = schoolRepo;
    }

    @Override
    public SchoolRegistrationResponse schoolRegistrationService(SchoolRegistrationDto schoolRegistrationDto) {

        SchoolRegistrationResponse schoolRegistrationResponse = new SchoolRegistrationResponse();

        SchoolRegister schoolRegister = new SchoolRegister();
        SchoolRegister data = schoolRegisterRepos.findBySchoolNameAndSchoolEmail(schoolRegistrationDto.getSchoolName(),
                schoolRegistrationDto.getSchoolEmail());

        if (data == null) {
            schoolRegister.setSchoolName(schoolRegistrationDto.getSchoolName());
            schoolRegister.setSchoolAddress(schoolRegistrationDto.getSchoolAddress());
            schoolRegister.setSchoolRegNo(schoolRegistrationDto.getSchoolRegNo());
            schoolRegister.setSchoolContact(schoolRegistrationDto.getSchoolContact());
            schoolRegister.setSchoolEmail(schoolRegistrationDto.getSchoolEmail());
            schoolRegister.setCountry(schoolRegistrationDto.getCountry());
            schoolRegister.setState(schoolRegistrationDto.getState());
            schoolRegister.setDistrict(schoolRegistrationDto.getDistrict());
            schoolRegister.setUserName(schoolRegistrationDto.getUserName());
            schoolRegister.setPassword(schoolRegistrationDto.getPassword());

            /*save data to db*/

            schoolRegisterRepos.save(schoolRegister);

            schoolRegistrationResponse.setSchoolName(schoolRegister.getSchoolName());
            schoolRegistrationResponse.setSchoolAddress(schoolRegister.getSchoolAddress());
            schoolRegistrationResponse.setSchoolRegNo(schoolRegister.getSchoolRegNo());
            schoolRegistrationResponse.setSchoolContact(schoolRegister.getSchoolContact());
            schoolRegistrationResponse.setSchoolEmail(schoolRegister.getSchoolEmail());
            schoolRegistrationResponse.setCountry(schoolRegister.getCountry());
            schoolRegistrationResponse.setState(schoolRegister.getState());
            schoolRegistrationResponse.setDistrict(schoolRegister.getDistrict());
            schoolRegistrationResponse.setUserName(schoolRegister.getUserName());

            return schoolRegistrationResponse;

        }
            return null;

    }
}
