package profiles_example;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Evgeny Borisov
 */
@Configuration
@Profile("PROD")
@PropertySource("classpath:prod.properties")
public class ProdConfig {
}
