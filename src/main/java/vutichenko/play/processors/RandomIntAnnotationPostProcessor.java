package main.java.vutichenko.play.processors;

import main.java.vutichenko.play.annots.RandomInt;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;

/**
 * Created by vutichenko on 11.05.2016.
 */
public class RandomIntAnnotationPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        final Field[] fields = o.getClass().getDeclaredFields();
        for (Field field : fields) {
            if(field.getAnnotation(RandomInt.class)!=null){
                final int max = field.getAnnotation(RandomInt.class).max();
                field.setAccessible(true);
                int value = (int) (Math.random() * max);

                ReflectionUtils.setField(field,o, value);
            }
        }
        return o;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        return o;
    }
}
