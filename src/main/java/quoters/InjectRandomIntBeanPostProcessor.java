package quoters;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Component
public class InjectRandomIntBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Class<?> type = bean.getClass();
        Random random = new Random();

        Field[] declaredFields = type.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            InjectRandomInt annotation = declaredField.getAnnotation(InjectRandomInt.class);
            if (annotation != null) {
                int min = annotation.min();
                int max = annotation.max();
                int value = random.nextInt(max - min) + min;
                declaredField.setAccessible(true);
                try {
                    declaredField.set(bean, value);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }


            }
        }
        return bean;
    }
}
