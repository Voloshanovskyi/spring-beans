package org.example.springbeans.config;

import org.example.springbeans.service.JavaConfigService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public JavaConfigService javaConfigService(){
        return new JavaConfigService();
    }

}
