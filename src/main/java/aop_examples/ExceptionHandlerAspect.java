package aop_examples;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

/**
 * @author Evgeny Borisov
 */
@Aspect
public class ExceptionHandlerAspect {

    @AfterThrowing(pointcut = "@annotation(SendMailIfException)", throwing = "ex")
    public void handleDBException(DBNotFoundException ex) {
        System.out.println("sending mail to Anrey " + ex.getMessage());
    }
}
