package io.github.com.kalilventura;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    /*
     * Essa anotação permite que utilizemos em toda a aplicação
     **/
    @Bean(name = "applicationName")
    public String applicationName() {
        return "Sistema de Vendas";
    }
}