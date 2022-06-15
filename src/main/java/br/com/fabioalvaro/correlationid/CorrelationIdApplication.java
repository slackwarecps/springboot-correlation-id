package br.com.fabioalvaro.correlationid;

import br.com.fabioalvaro.correlationid.controller.MarvelRestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableFeignClients
public class CorrelationIdApplication {


    @Autowired
    private static ConfigurableApplicationContext ctx;

    private static final Logger log = LoggerFactory.getLogger(CorrelationIdApplication.class);

    @Autowired
    private static Environment env;

    public CorrelationIdApplication(Environment env) {
        System.out.println("passou.");
        this.env = env;

    }

    public static void main(String[] args) {


       // log.info("MARVEL_TS {}", env.getProperty("MARVEL_TS"));
        if (1==2) {
            System.out.println("encerrando a aplicacao...");
            ctx.close();
        }
        else
        SpringApplication.run(CorrelationIdApplication.class, args);





    }


}
