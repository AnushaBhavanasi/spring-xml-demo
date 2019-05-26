package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass
{
    public static void main( String[] args )
    {
        ApplicationContext application=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie=(Movie)application.getBean("movies");
        System.out.println("Actor details \n"+movie);

    }
}
