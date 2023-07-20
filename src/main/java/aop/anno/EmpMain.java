package aop.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * SPRING AOP 특징
 * 1. Runtime 기반
 * 2. Proxy 기반
 * 3. Interface 기반
 * 
 */
public class EmpMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("aop-anno.xml");
		
		//인터페이스 기반으로 작동시켜야 하므로 
//		Programmer p = context.getBean("programmer", Programmer.class);
		Employee p = context.getBean("programmer", Employee.class);
		p.work();
		
		Employee d = context.getBean("designer", Employee.class);
		d.work();
	}

}
