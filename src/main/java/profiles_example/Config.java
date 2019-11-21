package profiles_example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
public class Config {

    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "PROD");


        new AnnotationConfigApplicationContext(Config.class);
    }
}
