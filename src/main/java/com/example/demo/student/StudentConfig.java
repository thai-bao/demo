package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student nguyen_thi_thai_bao = new Student(
                    1L,
                    "Nguyen Thi Thai Bao",
                    LocalDate.of(1998, 11, 7)
            );

            Student nguyen_thai_bao = new Student(
                    2L,
                    "Nguyen Thai Bao",
                    LocalDate.of(1999, 11, 7)
            );

            repository.saveAll(List.of(nguyen_thi_thai_bao, nguyen_thai_bao)

            );
        };
    }
}
