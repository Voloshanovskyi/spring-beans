package org.example.springbeans.service;

import lombok.Setter;

public class JavaConfigService {

    private final String timeOfInitializing;
    @Setter
    private Integer dayOfMonth;

    public JavaConfigService(String timeOfInitializing) {
        this.timeOfInitializing = timeOfInitializing;
    }

    public String hello(){
        return "Hello from java config!" + " time: " + timeOfInitializing + " dayOfMonth: " + dayOfMonth;
    }

}
