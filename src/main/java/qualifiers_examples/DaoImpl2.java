package qualifiers_examples;

import org.springframework.stereotype.Repository;

/**
 * @author Evgeny Borisov
 */
@IdiDao(DBType.SYBASE)
public class DaoImpl2 implements Dao {
    @Override
    public void saveAll() {
        System.out.println("saving to sybase");
    }
}
