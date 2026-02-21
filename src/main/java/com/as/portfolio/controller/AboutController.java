package com.as.portfolio.controller;

import com.as.portfolio.model.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class AboutController {

    @GetMapping({"/", "/about"})
    public String about(Model model) {
        Profile profile = new Profile(
                "Ajit Sonawane", 
                "Full Stack Java Developer | MCA Student", 
                "Shirdi, India", 
                "ajitsonawane124@gmail.com",
                "+91-8010809271",
                "https://www.linkedin.com/in/ajit-sonawane-8939832b1/",
                "https://github.com/ajit470",
                "#", 
                "I am an MCA student at Savitribai Phule Pune University specializing in Java development. I build clean, scalable web applications using Spring Boot and REST APIs. Also completing java full stack course in hyderabad",
                List.of(
                        "Full stack development: Spring Boot + Thymeleaf + Bootstrap",
                        "REST API design and PostgreSQL/MySQL data modeling"                        
                ),
                List.of("Java 17", "Spring Boot", "Spring Data JPA", "Hibernate", "Maven"),
                List.of("HTML5", "CSS3", "Bootstrap 5", "Thymeleaf", "JavaScript"),
                List.of("MySQL", "Oracle", "PostgreSQL"),
                List.of("Git/GitHub", "Eclipse", "Vscode", "IntelliJ IDEA", "Postman"),
                List.of("SOLID Principles", "Design Patterns", "Clean Code")
        );

        model.addAttribute("p", profile);
        return "about";
    }
}