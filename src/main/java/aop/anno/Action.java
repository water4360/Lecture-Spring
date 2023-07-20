package aop.anno;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Service;

@Aspect
public class Action {

	@Before("execution(* work())")
	public void gotoOffice() {
		System.out.println("출근합니다");
	}
	
	@After("execution(* work())")
	public void getoffOffice() {
		System.out.println("퇴근합니다");
	}
}
