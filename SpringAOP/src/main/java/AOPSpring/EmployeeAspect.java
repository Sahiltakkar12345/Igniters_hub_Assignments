package AOPSpring;


import java.util.Arrays;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EmployeeAspect {
	@Before("setadvice()")
	public void Authentication(JoinPoint jp)
	{
		System.out.println("are you trying to set employee");
		System.out.println(jp.toString());
		System.out.println(Arrays.toString(jp.getArgs()));
	}
	@After("setadvice()")
	public void update()
	{
		System.out.println("employee detail set successfully");
	}
	@Pointcut("execution(* AOPSpring.Employee.set*(..))")
	private void setadvice()
	{
		
	}
	@Pointcut("execution(* AOPSpring.Employee.get*())")
	private void getadvice()
	{
		
	}
	@Around("getadvice()")
	public void aroundadvice(ProceedingJoinPoint point)
	{
		System.out.println("currently we are in around advice");
		System.out.println("this is before call task");
		try {
			Object result= point.proceed();
			System.out.println("result received " + result);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
