package controller;

import entity.Columns;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.ColumnsService;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/postgressTask")
public class ApplicationController {
    @Resource
    ColumnsService columnsService;

    @GetMapping(value = "/columns")
    public List<Columns> getColumns(){
        return columnsService.findAll();
    }
}
