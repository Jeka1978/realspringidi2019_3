import org.springframework.scheduling.annotation.Scheduled;

/**
 * @author Evgeny Borisov
 */

public class StamServie {
    @Scheduled(fixedDelay = 1000*60)
    public void doX(){

    }
}
