package project.kuper.fotodownload.application.model;

import lombok.Data;

@Data
public class Group {
    private Integer id;
    private String name;

    public Group(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
