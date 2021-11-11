package com.bjpowernode;

import com.bjpowernode.ba01.Student;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MyTest {
/*junit单元测试
* 单元：指的是方法，一个类中有很多方法，一个方法称为单元
* 使用单元测试
* 1. 需要加入junit依赖
*   <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.11</version>
            <scope>test</scope>
        </dependency>
* 2. 创建测试作用的类：叫做测试类
*   src/test/java目录中创建类
* 3. 创建测试方法
*   1）public方法
*   2）没有返回值
*   3）方法名称自定义，建议名称test+方法名
*   4）方法没有参数
*   5）方法的上面加入@Test，这样的方法是可以单独执行的，不用使用main方法
* */

    @Test
    public void test05(){
        //使用spring容器创建的对象
        //1. 指定spring配置文件的名称
        String config="ba01/applicationContext.xml";
        //2. 创建表示spring容器的对象，ApplicationContext
        //ApplicationContext就是表示Spring容器，通过容器获取对象
        //ClassPathXmlApplicationContext:表示从类路径中加载Spring的配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //从容器中获取某个对象，你要调用对象的方法
        //getBean("配置文件中的bean的id值")
        Student myStudent = (Student) ac.getBean("myStudent");

        //使用spring创建好的对象
        System.out.println(myStudent);
    }

}
