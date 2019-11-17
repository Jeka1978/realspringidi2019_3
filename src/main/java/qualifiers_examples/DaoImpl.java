package qualifiers_examples;

import org.springframework.stereotype.Repository;

/**
 * @author Evgeny Borisov
 */

@IdiDao(DBType.MONGO)
public class DaoImpl implements Dao {
    @Override
    public void saveAll() {
        System.out.println("saving to mongo");
    }
}
