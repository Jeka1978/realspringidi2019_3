package qualifiers_examples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class MainService {
    @IdiDao(DBType.MONGO)
    private Dao mainDao;

    @IdiDao(DBType.SYBASE)
    private Dao backupDao;




    @Scheduled(fixedDelay = 500)
    public void doSave(){
        mainDao.saveAll();
    }

    @Scheduled(fixedDelay = 1500)
    public void doBackup(){
        backupDao.saveAll();
    }








}
