package project.kuper.fotodownload.application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main/tovar")
public class TovarScreenController {

    @GetMapping
    public String getTovarScreen() {
        return "tovar";
    }
}
