package com.bjpowernode;

import com.bjpowernode.service.Someservice;
import com.bjpowernode.service.impl.SomeserviceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class MyTest {


    @Test
    public void test01(){
        /*Someservice service = new SomeserviceImpl();
            service.doSome();*/

    }
    /*
    * spring默认创建对象的时间：在创建spring的容器时，会创建配置文件中所有的对象
    * */
    @Test
    public void test02(){
        //使用spring容器创建的对象
        //1. 指定spring配置文件的名称
        String config="beans.xml";
        //2. 创建表示spring容器的对象，ApplicationContext
        //ApplicationContext就是表示Spring容器，通过容器获取对象
        //ClassPathXmlApplicationContext:表示从类路径中加载Spring的配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //从容器中获取某个对象，你要调用对象的方法
        //getBean("配置文件中的bean的id值")
        Someservice service = (Someservice) ac.getBean("someService");

        //使用spring创建好的对象
        service.doSome();

    }
    @Test
    public void test03(){
        String config="beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //使用spring提供的方法，获取容器中定义的对象的数量
        int nums = ac.getBeanDefinitionCount();
        System.out.println("容器中定义的对象数量："+nums);
        //容器中定义的每个对象的名称
        String names[] = ac.getBeanDefinitionNames();
        for(String name:names){
            System.out.println(name);
        }
    }
    @Test
    //获取一个非自定义的类的对象
    public void test04(){
        String config="beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //使用getBean
        Date my  = (Date) ac.getBean("mydate");
        System.out.println("Date"+my);
    }
}
