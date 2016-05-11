package main.java.vutichenko.play.processors;

import main.java.vutichenko.play.annots.RandomInt;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.util.ReflectionUtils;
import sun.plugin.javascript.ReflectUtil;

import java.lang.reflect.Field;
import java.util.Random;

/**
 * Created by vutichenko on 11.05.2016.
 */
public class RandomIntAnnotationPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        final Field[] fields = o.getClass().getDeclaredFields();
        for (Field field : fields) {
            if(field.getAnnotation(RandomInt.class)!=null){
                final int max = field.getAnnotation(RandomInt.class).max();
                final int min = field.getAnnotation(RandomInt.class).min();
                field.setAccessible(true);
                ReflectionUtils.setField(field,o,max-min);
            }
        }
        return o;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        return o;
    }
}
