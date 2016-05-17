package main.java.vutichenko.play.processors;

import main.java.vutichenko.play.annots.Juxtapose;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import java.util.Iterator;

/**
 * Created by vutichenko on 17.05.2016.
 */
public class JuxtaposeBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        final String[] beanDefinitionNames = configurableListableBeanFactory.getBeanDefinitionNames();
        for(String name:beanDefinitionNames){
            final BeanDefinition beanDefinition = configurableListableBeanFactory.getBeanDefinition(name);
            try {
                final Class<?> beanClass = Class.forName(beanDefinition.getBeanClassName());
                final Juxtapose annotation = beanClass.getAnnotation(Juxtapose.class);
                if(annotation!=null){
                    beanDefinition.setBeanClassName(annotation.jux().getName());
                }


            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
