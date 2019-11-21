package never_use_switch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author Evgeny Borisov
 */
@Service
public class MailSender {

    @Autowired
    private Map<String,MailGenerator> map;

    public void sendMail(MailInfo mailInfo) {
        String mailCode = String.valueOf(mailInfo.getMailCode());
        MailGenerator mailGenerator = map.get(mailCode);
        if (mailGenerator == null) {
            throw new UnsupportedOperationException(mailCode + " not supported yet");
        }
        String mail = mailGenerator.generateMail(mailInfo);
        send(mail);
    }

    private void send(String mail) {
        System.out.println("mail = " + mail+" was sent...");
    }
}








