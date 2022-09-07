package com.essendant.spring.tutorial.SpringTutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args ){
       ApplicationContext context = new ClassPathXmlApplicationContext("com/essendant/spring/tutorial/SpringTutorial/beans/beans.xml");
    	Person person = (Person)context.getBean("person");
    	//Person person2 = (Person)context.getBean("person");
    	
    	person.setTaxId(666);
    	
    	System.out.println(person);
//    	person.speak();
//    	
//    	Address address = (Address)context.getBean("address");
//    	System.out.println(address);
//    	
//    	System.out.println(person);
    	
    	((ClassPathXmlApplicationContext)context).close();
    }
}
