package never_use_switch;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.List;
import java.util.Map;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.toMap;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
@EnableScheduling
public class Conf {



    @Bean
    public Map<Integer,MailGenerator> generatorMap(List<MailGenerator> mailGenerators){
       return mailGenerators.stream().collect(toMap(MailGenerator::getMyCode, identity()));
    }


}
