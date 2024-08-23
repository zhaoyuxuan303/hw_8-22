package org.example.week3.studentRestApi.controller;

import org.example.week3.studentRestApi.pojo.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/student")
public class StudentController {

    @GetMapping
    public List<Student> getAllStudent() {
        return Arrays.asList(
                new Student("1", "A", 1),
                new Student("2", "B", 2)
        );
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable("id") String id) {
        return new Student("1", "A", 1);
    }

    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable("id") String id, @RequestBody Student student) {
        return ResponseEntity.ok(student);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable("id") String id) {return ResponseEntity.noContent().build();}
}


