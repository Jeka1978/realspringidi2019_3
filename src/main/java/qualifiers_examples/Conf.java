package qualifiers_examples;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfiguration;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
@EnableScheduling
public class Conf {
}
