package com.taskwebapp.controller;

import com.taskwebapp.entity.ColumnEntity;
import com.taskwebapp.service.ColumnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/")
public class ColumnController {
    @Autowired
    ColumnService columnService;

    @GetMapping
    public String getBoard() {
        return "column-board";
    }

    @GetMapping("/columns")
    public ModelAndView getColumns(String columnName, @RequestParam(defaultValue = "false") Boolean unique) {
        ModelAndView modelAndView = new ModelAndView("column-board::columns");
        List<ColumnEntity> allColumns = columnService.findAllByParam(columnName, unique);
        modelAndView.addObject("columns", allColumns);
        return modelAndView;
    }
}
