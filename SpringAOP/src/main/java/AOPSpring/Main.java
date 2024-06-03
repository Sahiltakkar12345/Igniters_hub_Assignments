package AOPSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String args[])
	{
//		ApplicationContext context=new ClassPathXmlApplicationContext("AOPSpring/Config.xml");
		
//		Account a =(Account) context.getBean("acc1");
//		System.out.println(a);
//		a.deposit(3000);
//		System.out.println(a);
//		a.withdrawl();
//		System.out.println(a);
		
		//ye alg use hoga kuki java code with annotation use kiya h
		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		
		Employee e=(Employee) context.getBean(Employee.class);
		e.setName("utsha ");
		System.out.println(e);
		e.getName();
	}
}
