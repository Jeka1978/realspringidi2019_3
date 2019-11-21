package never_use_switch;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component("3")
public class HappyBirthdayMailGenerator implements MailGenerator {
    @Override
    public String generateMail(MailInfo mailInfo) {
        //70 lines code
        return "Happy birthday to you....";
    }
}
