package never_use_switch;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component("1")
public class WelcomeMailGenerator implements MailGenerator {
    @Override
    public String generateMail(MailInfo mailInfo) {
        //50 lines of code to prepare welcome mail
        return "Welcome new client";
    }
}
