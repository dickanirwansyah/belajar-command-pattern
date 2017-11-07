package dicka.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"dicka"})
@EntityScan(basePackages = {"dicka"})
@ComponentScan(basePackages = {"dicka"})
public class DemoApp {

    public static void main(String[]arg){
        SpringApplication.run(DemoApp.class);
    }
}
