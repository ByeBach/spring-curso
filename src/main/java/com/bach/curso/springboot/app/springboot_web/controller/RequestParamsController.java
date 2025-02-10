package com.bach.curso.springboot.app.springboot_web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bach.curso.springboot.app.springboot_web.models.dto.ParamDto;
import com.bach.curso.springboot.app.springboot_web.models.dto.ParamMixDto;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/params")
public class RequestParamsController {
    
    @GetMapping("/foo")
    public ParamDto foo(@RequestParam(required = false, defaultValue = "default param") String message){
        ParamDto param = new ParamDto();
        param.setMassage(message);
        return param;
    }
    @GetMapping("/bar")
    public ParamMixDto bar(@RequestParam String text, @RequestParam Integer code){
        ParamMixDto params = new ParamMixDto();
        params.setMassage(text);
        params.setCode(code);
        return params;
    }
    @GetMapping("/request")
    public ParamMixDto request(HttpServletRequest request){
        Integer code = 10;
        try{
            code = Integer.parseInt(request.getParameter("code"));
        }catch (NumberFormatException e) {
        }
        ParamMixDto params = new ParamMixDto();
        params.setCode(code);
        params.setMassage(request.getParameter("message"));
        return params;
    }
}
