package never_use_switch;

/**
 * @author Evgeny Borisov
 */
public class MailInfo {

    public MailInfo(int mailCode) {
        this.mailCode = mailCode;
    }

    public int getMailCode() {
        return mailCode;
    }

    public void setMailCode(int mailCode) {
        this.mailCode = mailCode;
    }

    private int mailCode;
}
