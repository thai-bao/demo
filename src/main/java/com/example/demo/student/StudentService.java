package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student("Nguyen Thi Thai Bao",
                        LocalDate.of(1998, 11, 7),
                        "baont.fbis@gmail.com",
                        22 )
        );
    }
}
