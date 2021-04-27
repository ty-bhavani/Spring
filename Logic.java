package com.te.personpass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Logic 
{
	public static void main(String[] args) {
		
	
	ApplicationContext  context= new ClassPathXmlApplicationContext("person.xml");
	
	Person person = (Person) context.getBean("per");
	
	System.out.println(person.getPid());
	System.out.println(person.getPname());
	System.out.println(person.getPassport().getId());
	System.out.println(person.getPassport().getAddress());
	}
}
