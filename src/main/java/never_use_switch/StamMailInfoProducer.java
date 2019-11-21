package never_use_switch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Component
public class StamMailInfoProducer {
    @Autowired
    private MailSender mailSender;

    private Random random = new Random();

    @Scheduled(fixedDelay = 500)
    public void generateMailInfo() {
        int mailCode = random.nextInt(4)+1;
        mailSender.sendMail(new MailInfo(mailCode));
    }

}






