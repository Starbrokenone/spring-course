package com.bjpowernode.service.impl;

import com.bjpowernode.service.Someservice;
import jdk.nashorn.internal.parser.JSONParser;

public class SomeserviceImpl implements Someservice {
    public SomeserviceImpl() {
        System.out.println("这是SomeserviceTmpl的无参构造方法");
    }

    @Override
    public void doSome() {
        System.out.println("执行了SomeserviceImpl的doSome方法");
    }
}
