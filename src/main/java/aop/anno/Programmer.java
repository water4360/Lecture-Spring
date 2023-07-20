package aop.anno;

import org.springframework.stereotype.Component;

public class Programmer implements Employee {
	
	@Override
	public void work() {
		System.out.println("오류를 수정하고 수정하고 또 수정하고 남는 시간에 개발합니다..");
	}
}
