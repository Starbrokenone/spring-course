package com.bjpowernode.ba01;

public class Student {
    private String name;
    private int age;
/*
* 需要有set方法，没有set方法是报错的
* set方法中的内容不重要
* 先执行类的无参构造方法，再执行set方法
* */
    public void setName(String name) {
        this.name = name;
        System.out.println("name:"+name);
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("age:"+age);
    }

    public void setEmail(String email) {

        System.out.println("email:"+email);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
