package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionReaderUtils;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MainClass
{
    @Deprecated
    public static void main( String[] args )
    {
        ClassPathResource resource= new ClassPathResource("beans.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        Movie movie= (Movie) beanFactory.getBean("movies");
        System.out.println("Actor information using bean factory:\n "+movie);
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        Movie mv=(Movie) applicationContext.getBean("movies");
        System.out.println("Actor information using application context:\n "+mv);
        BeanDefinitionRegistry beanDefinitionRegistry=new DefaultListableBeanFactory();
        BeanDefinitionReader  beanDefinitionReader=new XmlBeanDefinitionReader(beanDefinitionRegistry);
        beanDefinitionReader.loadBeanDefinitions(new ClassPathResource("beans.xml"));
        Movie mo=(Movie)((DefaultListableBeanFactory)beanDefinitionRegistry).getBean("movies1");
        System.out.println("Actor information using application context:\n "+mo);
    }
}
