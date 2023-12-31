package di.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DIMain {
	
	public static void main(String[] args) {
		

//	ApplicationContext context = new GenericXmlApplicationContext("di-anno.xml");
//	ApplicationContext context = new GenericXmlApplicationContext("di-anno2.xml");
	//이제 xml 파일 안 쓰니까.
	ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
	//'car'라는 이름으로 생성된 'Car' 타입의 '클래스'를 c로 받겠음
	Car c = context.getBean("car", Car.class);
	c.printTireBrand();	
	
	/*
	 	Tire tire = new HankookTire();
	 	Car c = new Car();
	 	c.setTire(tire);
	 	
	 */
	
	}
}
