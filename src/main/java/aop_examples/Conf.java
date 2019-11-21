package aop_examples;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.*;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
@EnableAspectJAutoProxy
@ImportResource("classpath:context.xml")
public class Conf {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Conf.class);
        try {
            context.getBean(MainService.class).doX();
        } catch (Exception e) {
            System.out.println("There is a problem, this method will work again automaticly in 2 minutes");
        }
    }
}
