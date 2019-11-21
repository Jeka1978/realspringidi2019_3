package profiles_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import qualifiers_examples.IdiDao;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Service
public class IDIMainService {
    @Autowired
    private IDIDao dao;

    @Value("${platform}")
    private String platform;

    @EventListener(ContextRefreshedEvent.class)
    public void doWork(){
        System.out.println(platform);
        dao.saveAll();
    }
}



