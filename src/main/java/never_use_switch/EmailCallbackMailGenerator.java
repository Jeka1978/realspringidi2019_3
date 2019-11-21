package never_use_switch;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class EmailCallbackMailGenerator implements MailGenerator {
    @Override
    public String generateMail(MailInfo mailInfo) {
        //60 lines of code to prepare welcome mail
        return "don't call us we call you";
    }

    @Override
    public int getMyCode() {
        return 2;
    }
}
