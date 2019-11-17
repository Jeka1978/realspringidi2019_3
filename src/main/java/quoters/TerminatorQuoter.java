package quoters;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * @author Evgeny Borisov
 */

@Film

public class TerminatorQuoter implements Quoter {


    private List<String> messages;

    @Value("${terminator}")
    public void setMessages(String[] messages) {
        this.messages = asList(messages);
    }

    public void sayQuote() {
        messages.forEach(System.out::println);
    }



    @PreDestroy
    public void killAll() {
        System.out.println("you are terminated...");
    }








}
