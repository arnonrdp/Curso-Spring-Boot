package com.example.curso_spring_boot.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.util.Calendar.FEBRUARY;
import static java.util.Calendar.JANUARY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {

            Student arnon = new Student(
                    1L,
                    "Arnon",
                    "arnon@gmail.com",
                    LocalDate.of(1990, JANUARY, 2)
            );
            Student dariane = new Student(
                    2L,
                    "Dari",
                    "dari@gmail.com",
                    LocalDate.of(1987, FEBRUARY, 1)
            );

            repository.saveAll(
                    List.of(arnon, dariane)
            );
        };
    }
}
