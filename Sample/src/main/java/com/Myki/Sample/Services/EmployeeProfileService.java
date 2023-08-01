package com.Myki.Sample.Services;

import com.Myki.Sample.Models.EmployeeProfile;
import com.Myki.Sample.Repositories.EmployeeProfileRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeProfileService {
    private final EmployeeProfileRepo EmpRepo;
    public List<EmployeeProfile> GetEmployeeProfiles(){
        return EmpRepo.findAll();
    }

    public EmployeeProfile GetEmployeeProfileById(Integer id){
        return EmpRepo.findById(id).orElse(null);
    }

    public Boolean PostEmployeeProfile(EmployeeProfile employeeProfile){
        try {
            var employeeProfileNew = new EmployeeProfile();
                employeeProfileNew.setFirstName( employeeProfile.getFirstName() );
                employeeProfileNew.setLastName( employeeProfile.getLastName() );
                employeeProfileNew.setAddress( employeeProfile.getAddress() );
                employeeProfileNew.setBirthday( employeeProfile.getBirthday() );
                employeeProfileNew.setCreatedAt( employeeProfile.getCreatedAt() );

            EmpRepo.save(employeeProfileNew);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public Boolean PostUpdateEmployeeProfile(EmployeeProfile employeeProfile){
        try {
            var getEmployee = EmpRepo.findById(employeeProfile.getId()).orElse(null);

            getEmployee.setFirstName( employeeProfile.getFirstName() );
            getEmployee.setLastName( employeeProfile.getLastName() );
            getEmployee.setAddress( employeeProfile.getAddress() );
            getEmployee.setBirthday( employeeProfile.getBirthday() );
            getEmployee.setCreatedAt( employeeProfile.getCreatedAt() );

            EmpRepo.save(getEmployee);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public Boolean PostDeleteEmployeeProfile(Integer id){
        try {
            EmpRepo.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }

}
