package screen_saver;

import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.awt.*;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@ComponentScan
@Configuration
@EnableScheduling
@ImportResource("classpath:context.xml")
public class Conf {

    @Bean
    public ColorFrame colorFrame(){
        return new ColorFrame();
    }



    @Bean
    public Random random() {
        System.out.println(123);
        return new Random();
    }


    @Bean
    @Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
    @Primary
    public Color randomColor(Random random) {
        return new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
    }


}







