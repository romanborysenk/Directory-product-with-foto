package project.kuper.fotodownload.application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import project.kuper.fotodownload.application.model.Group;
import java.util.LinkedList;
import java.util.List;

@Controller
@RequestMapping("/main/group")
public class GroupScreenController {
    private List<Group> list;

    @GetMapping
    public String getGroupScreen(Model model) {
        list = new LinkedList<>();
        list.add(new Group(1,"a"));
        list.add(new Group(2,"b"));
        list.add(new Group(3,"c"));
        list.add(new Group(4,"d"));
        list.add(new Group(5,"e"));
        model.addAttribute("list",list);
        return "group";
    }

    @RequestMapping(params="insert", method = RequestMethod.POST)
    public String addItemListGroup(@RequestParam("nameGroup") String nameGroup, Model model) {
        Integer id = list.size();
        id++;
        list.add(new Group(id,nameGroup));
        model.addAttribute("list",list);
        model.addAttribute("name",id);
        return "group";
    }
}
