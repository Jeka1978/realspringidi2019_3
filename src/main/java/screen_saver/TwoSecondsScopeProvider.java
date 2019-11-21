package screen_saver;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import lombok.SneakyThrows;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @author Evgeny Borisov
 */
@Component
public class TwoSecondsScopeProvider implements Scope {


    private Cache<String, Object> cache =
            CacheBuilder.newBuilder().expireAfterWrite(2, TimeUnit.SECONDS).build();


    @Override
    @SneakyThrows
    public Object get(String beanName, ObjectFactory<?> objectFactory) {
        return cache.get(beanName, objectFactory::getObject);
    }


    @Override
    public Object remove(String s) {
        return null;
    }

    @Override
    public void registerDestructionCallback(String s, Runnable runnable) {

    }

    @Override
    public Object resolveContextualObject(String s) {
        return null;
    }

    @Override
    public String getConversationId() {
        return null;
    }
}
