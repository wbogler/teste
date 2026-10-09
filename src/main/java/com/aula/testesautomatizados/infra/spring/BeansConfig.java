package com.aula.testesautomatizados.infra.spring;

import com.aula.testesautomatizados.service.CalculadoraService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public CalculadoraService calculadoraService() {
        return new CalculadoraService();
    }
}
