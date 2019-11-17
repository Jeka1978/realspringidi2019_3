package never_use_switch;

/**
 * @author Evgeny Borisov
 */
public class MailSender {

    public void sendMail(MailInfo mailInfo) {
        int mailCode = mailInfo.getMailCode();
        switch (mailCode) {
            case 1:
                // 50 lines of code
                System.out.println("Welcome mail was sent");
                break;
            case 2:
                // lines
                System.out.println("Welcome mail was sent");
                break;
        }
    }
}
