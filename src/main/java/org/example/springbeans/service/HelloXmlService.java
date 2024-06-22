package org.example.springbeans.service;

import lombok.Setter;

@Setter
public class HelloXmlService {
    private UtilService utilService;


    public String hello() {
        return utilService.append("Hello from xml!");
    }
}
