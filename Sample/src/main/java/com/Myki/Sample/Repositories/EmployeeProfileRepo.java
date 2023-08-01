package com.Myki.Sample.Repositories;

import com.Myki.Sample.Models.EmployeeProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EmployeeProfileRepo extends JpaRepository<EmployeeProfile, Integer> {
}
