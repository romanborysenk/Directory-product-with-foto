package project.kuper.fotodownload.application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/main")
public class MainScreenController {

    @GetMapping
    public String getMainScreen() {
        return "main";
    }

    @RequestMapping(params="group", method=RequestMethod.POST)
    public String getGroupScreen()
    {
        return "redirect:/main/group";

    }

    @RequestMapping(params="tovar", method=RequestMethod.POST)
    public String getTovarScreen()
    {
        return "redirect:/main/tovar";
    }

    @RequestMapping(params="foto", method=RequestMethod.POST)
    public String getFotoScreen() {
        return"redirect:/main/foto";
    }

    @RequestMapping(params="view", method=RequestMethod.POST)
    public String  getViewScreen() {
        return "redirect:/main/view";
    }
}
