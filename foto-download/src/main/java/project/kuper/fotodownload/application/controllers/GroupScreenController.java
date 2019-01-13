package project.kuper.fotodownload.application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main/group")
public class GroupScreenController {

    @GetMapping
    public String getGroupScreen(Model model) {
        return"group";
    }
}
