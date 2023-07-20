package di.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class Car {

	@Autowired
	@Qualifier("hankook")
	private Tire tire;
	
	
	public Car() {
		System.out.println("Car() ������ ȣ��...");
	}
	
	
//	@Autowired
	public Car(Tire tire) {
		this.tire = tire;
		System.out.println("constructor ����...");
	}
	
//	@Autowired
	public Car(@Qualifier("hankook")Tire tire, @Qualifier("keumho")Tire tire2) {
		this.tire = tire;
		System.out.println("Car(Tire, Tire) ������ ����...");
		System.out.println(tire.getBrand());
		System.out.println(tire2.getBrand());
	}
	
//	@Autowired
//	@Qualifier("hankook")
	public void setTire(Tire tire) {
		this.tire = tire;
		System.out.println("setter����...");
	}


	public void printTireBrand() {
		System.out.println("������ Ÿ�̾� : " + tire.getBrand());
	}
	
	
}
