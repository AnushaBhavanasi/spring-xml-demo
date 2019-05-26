package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("initilazing the bean using intializing bean interface");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean destroyed using disposablebean interface");

    }
    public void customInit(){
        System.out.println("Custom init method");

    }
    public void customDestroy(){
        System.out.println("Custom destroy method");

    }
}
