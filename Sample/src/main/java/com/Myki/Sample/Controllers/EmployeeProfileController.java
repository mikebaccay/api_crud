package com.Myki.Sample.Controllers;

import com.Myki.Sample.Models.EmployeeProfile;
import com.Myki.Sample.Repositories.EmployeeProfileRepo;
import com.Myki.Sample.Services.EmployeeProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/employee")

public class EmployeeProfileController {
    private final EmployeeProfileService EmpService;

    @GetMapping
    @RequestMapping("/list")
    List<EmployeeProfile> GetEmployeeProfiles(){
        return EmpService.GetEmployeeProfiles();
    }

    @GetMapping
    @RequestMapping("/employee-id")
    EmployeeProfile GetEmployeeProfileById(
            @RequestParam(value = "id") Integer id
    ){
        return EmpService.GetEmployeeProfileById(id);
    }

    @PostMapping
    @RequestMapping("/create")
    Boolean PostEmployeeProfile(
            @RequestBody EmployeeProfile employeeProfile
    ){
        return EmpService.PostEmployeeProfile(employeeProfile);
    }

    @PutMapping
    @RequestMapping("/update")
    Boolean PostUpdateEmployeeProfile(
            @RequestBody EmployeeProfile employeeProfile
    ){
        return EmpService.PostUpdateEmployeeProfile(employeeProfile);
    }

    @DeleteMapping
    @RequestMapping("/delete")
    Boolean PostDeleteEmployeeProfile(
            @RequestParam(value = "id") Integer id
    ){
        return EmpService.PostDeleteEmployeeProfile(id);
    }
}
