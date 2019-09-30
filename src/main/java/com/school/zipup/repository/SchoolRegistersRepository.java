package com.school.zipup.repository;

import com.school.zipup.entity.SchoolRegister;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SchoolRegistersRepository extends JpaRepository<SchoolRegister , Long> {

    SchoolRegister findBySchoolNameAndSchoolEmail(String schoolName,String schoolEmail);
}
