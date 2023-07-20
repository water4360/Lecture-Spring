package di.anno;

import org.springframework.stereotype.Component;

@Component("keumho")
public class KeumhoTire implements Tire {
	
	public String getBrand() {
		return "금호타이어";
	}
	
}
