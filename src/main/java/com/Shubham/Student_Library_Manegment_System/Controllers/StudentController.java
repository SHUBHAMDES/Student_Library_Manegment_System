package com.Shubham.Student_Library_Manegment_System.Controllers;

import com.Shubham.Student_Library_Manegment_System.DTOs.StudentUpdateMobRequestDto;
import com.Shubham.Student_Library_Manegment_System.Services.StudentService;
import com.Shubham.Student_Library_Manegment_System.modles.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public String createStudent(@RequestBody Student student){

        return studentService.createStudent(student);
    }


    @GetMapping("/get_user")
    public String getNameByEmail(@RequestParam("email")String email){

        return studentService.findNameByEmail(email);
    }


    @PutMapping("/update_mob")
    public String updateMob(@RequestBody StudentUpdateMobRequestDto studentReqDto){
        return studentService.updateMobNo(studentReqDto);
    }

}