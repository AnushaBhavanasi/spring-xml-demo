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

    public static void main( String[] args )
    {
        ApplicationContext application=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie=(Movie)application.getBean("movies");
        System.out.println("Changing the Actor constructor to autowire \n"+movie);
        Movie movie1=(Movie)application.getBean("movie");
        System.out.println("Changing the Actor constructor to autowire to byType \n"+movie1);

    }
}
