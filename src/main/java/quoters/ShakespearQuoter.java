package quoters;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Book
public class ShakespearQuoter implements Quoter {

    @InjectRandomInt(min = 3, max = 7)
    private int repeat;

    @Value("${shake2}")
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println(message);
        }
    }
}
