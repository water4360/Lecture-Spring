package aop.anno;

import org.springframework.stereotype.Component;

public class Designer implements Employee {
	
	@Override
	public void work() {
		System.out.println("디자인을 수정하고 수정하고 수정한 다음에 제일 첫 디자인으로 돌아갑니다.");
	}
}
