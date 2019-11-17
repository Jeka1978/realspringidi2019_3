package quoters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * @author Evgeny Borisov
 */
@Component

public class TalkingRobotImpl implements TalkingRobot {


    @Autowired
    private List<Quoter> quoters = asList(() -> System.out.println("this is default quote"));



    public void setQuoters(List<Quoter> quoters) {
        this.quoters = quoters;
    }

    @Override
    @PostConstruct
    public void talk() {
        quoters.forEach(Quoter::sayQuote);
    }
}
