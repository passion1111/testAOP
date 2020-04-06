package a.b.c;

import org.aspectj.lang.ProceedingJoinPoint;

public class AOP {
	
	public Object testAOP(ProceedingJoinPoint joinpoint) throws Throwable{
		
		String check=joinpoint.getSignature().toLongString();
		System.out.println(System.currentTimeMillis()+"체크중 "+check);
		
		try {
			
			Object obj=joinpoint.proceed();
			return obj;
			
			
		} finally{
			
			
			System.out.println("테스트 끝");
		}
		
		
		
		
	}
}
