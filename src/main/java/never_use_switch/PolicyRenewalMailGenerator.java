package never_use_switch;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component("4")
public class PolicyRenewalMailGenerator implements MailGenerator {
    @Override
    public String generateMail(MailInfo mailInfo) {
        //100 lines code
        return "Don't forget to renew your policy....";
    }
}
