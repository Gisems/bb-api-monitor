package com.bb.app.error.controller;

import com.bb.app.error.models.ErrorMonitor;
import com.bb.app.error.service.IErrorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ErrorController {

    @Autowired
    private IErrorService errorService;

    @PostMapping
    public ResponseEntity<Object> create(@RequestBody ErrorMonitor errorMonitor){
        Map<String, Object> map = new HashMap<String, Object>();
        System.out.println(errorMonitor.toString());
        try {
            ErrorMonitor res = errorService.registrar(errorMonitor);
            return new ResponseEntity<Object>(res,HttpStatus.OK);
        }
        catch (Exception e) {
            map.put("message", e.getMessage());
            return new ResponseEntity<>( map, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
