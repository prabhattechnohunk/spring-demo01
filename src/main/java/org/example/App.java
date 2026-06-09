package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//main class
public class App 
{
    public static void main( String[] args )
    {
        //create container and beans inside it
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//Hey container--give me student1 bean
        Student student01 = (Student) context.getBean("student1");
        System.out.println(student01);
        //Hey container--give me student2 bean
        Student student02 = (Student) context.getBean("student2");
        System.out.println(student02);

// new line

    }
}
