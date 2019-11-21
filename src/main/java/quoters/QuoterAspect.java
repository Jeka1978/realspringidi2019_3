package quoters;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
@Aspect
public class QuoterAspect {


    @Before("execution(* quoters..*.say*(..))")
    public void handleSayMethods(JoinPoint jp){
        String simpleName = jp.getTarget().getClass().getSimpleName();
        System.out.println("This is quote of "+simpleName+" : " );
    }
}
