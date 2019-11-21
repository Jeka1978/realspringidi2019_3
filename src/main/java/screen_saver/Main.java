package screen_saver;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Conf.class);
        while (true) {
            context.getBean(ColorFrame.class).moveToRandomLocation();
            Thread.sleep(80);
        }
    }
}
