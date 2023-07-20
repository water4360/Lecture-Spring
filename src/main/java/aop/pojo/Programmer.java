package aop.pojo;

public class Programmer implements Employee {
	
	@Override
	public void work() {
//		System.out.println("����� �մϴ�");
//		System.out.println("���α׷��� �����մϴ�");
//		System.out.println("����� �մϴ�");
		
		Action.gotoOffice();
		System.out.println("개발합니다");
		Action.getoffOffice();
	}
}
