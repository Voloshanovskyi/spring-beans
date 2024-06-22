package org.example.springbeans.config;

import org.example.springbeans.service.JavaConfigService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.OffsetDateTime;

@Configuration
public class JavaConfig {

    @Bean
    public JavaConfigService javaConfigService(){
        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        JavaConfigService javaConfigService = new JavaConfigService(offsetDateTime.toString());
        javaConfigService.setDayOfMonth(offsetDateTime.getDayOfMonth());
        return javaConfigService;
    }

}
