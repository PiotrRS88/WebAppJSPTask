package com.taskwebapp.controller;

import com.taskwebapp.entity.ColumnEntity;
import com.taskwebapp.service.ColumnsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/")
public class ColumnController {
    @Autowired
    ColumnsService columnsService;

    @GetMapping
    public String getBoard(){
        return "column-board";
    }

    @GetMapping("/columns")
    public ModelAndView getColumns(String columnName) {
        ModelAndView modelAndView = new ModelAndView("column-board::columns");
        List<ColumnEntity> allColumns = columnsService.findAll(columnName);
        modelAndView.addObject("columns", allColumns);
        System.out.println(allColumns.size());
        return modelAndView;
    }
}
