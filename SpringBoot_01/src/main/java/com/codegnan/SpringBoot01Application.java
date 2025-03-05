package com.codegnan;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.codegnan.beans.Person;

@SpringBootApplication
public class SpringBoot01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cac=SpringApplication.run(SpringBoot01Application.class, args);
		
		System.out.println("\n"+"\t"+"\t"+"\t"+"\t"+"\t"+"Hello Lokesh! How are You ? ");
		
		
		Person person=cac.getBean(Person.class);
		Person person1=cac.getBean(Person.class);
		
		
		System.out.println(person);
		
		person1.setId(2);
		person1.setName("Sai");
		person1.setEmail("Sai@123");
		
		System.out.println(person1);
		if(person==person1) {
		  System.out.println("Both are same ");
		}else {
			System.out.println("Both are different ");
		}
	
	}

}
