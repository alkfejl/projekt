package hello.controller;

import hello.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("")
    public String studentList(Model model) {
        model.addAttribute("title", "Student list");
        model.addAttribute("students", studentService.studentNamesStartingWith("John"));
        return "list";
    }
}