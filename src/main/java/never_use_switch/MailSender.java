package never_use_switch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.toMap;

/**
 * @author Evgeny Borisov
 */
@Service
public class MailSender {


    private Map<Integer, MailGenerator> map;


    @Autowired
    public MailSender(List<MailGenerator> mailGenerators) {
        map = mailGenerators.stream().collect(toMap(MailGenerator::getMyCode, identity()));
    }

    public void sendMail(MailInfo mailInfo) {
        int mailCode = mailInfo.getMailCode();
        MailGenerator mailGenerator = map.get(mailCode);
        if (mailGenerator == null) {
            throw new UnsupportedOperationException(mailCode + " not supported yet");
        }
        String mail = mailGenerator.generateMail(mailInfo);
        send(mail);
    }

    private void send(String mail) {
        System.out.println("mail = " + mail + " was sent...");
    }
}








