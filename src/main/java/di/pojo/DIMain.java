package di.pojo;

public class DIMain {
	
	public static void main(String[] args) {
		
		HankookTire hankook = new HankookTire();
		KeumhoTire keumho = new KeumhoTire();
		
//		Car c = new Car(hankook);
		Car c = new Car(keumho);
		c.printTireBrand();
		
		Car c2 = new Car();
		c2.setTire(hankook);
		c2.printTireBrand();
	}
	
}
