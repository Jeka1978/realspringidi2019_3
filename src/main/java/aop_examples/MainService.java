package aop_examples;

import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class MainService {
    @SendMailIfException
    public void doX(){
        System.out.println("X");
        throw new DBNotFoundException("andrey we need you");
    }
}
