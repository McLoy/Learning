package ua.vtkachenko.dao;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InController {

    @RequestMapping("/")
    public String hello(){
        return "index";
    }
}