package di.pojo;

public class Car {

	private Tire tire;
	
	public Car() {
		super();
	}


	public Car(Tire tire) {
//		tire = new HankookTire();
//		tire = new KeumhoTire();
		this.tire = tire;
	}
	

	public void setTire(Tire tire) {
		this.tire = tire;
	}


	public void printTireBrand() {
		System.out.println("장착된 타이어 : " + tire.getBrand());
	}
}
