package never_use_switch;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import quoters.Quoter;

/**
 * @author Evgeny Borisov
 */
public class Start {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Conf.class);
        System.out.println();
    }
}
