package com.chengw.tiafs.controller;

import com.chengw.tiafs.util.Excel2JSON;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;

@RestController
@RequestMapping(value = "/api/excel2JSON")
public class UtilCtrl {

    @RequestMapping("/1")
    public Object getResult() throws FileNotFoundException {
        Object o = Excel2JSON.excel2Json();
        return o;
    }
}
