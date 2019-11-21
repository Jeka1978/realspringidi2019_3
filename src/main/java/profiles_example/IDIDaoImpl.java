package profiles_example;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

/**
 * @author Evgeny Borisov
 */
@Repository
@Profile("PROD")
public class IDIDaoImpl implements IDIDao {
    @Override
    public void saveAll() {
        System.out.println("Saved to prod");
    }
}
