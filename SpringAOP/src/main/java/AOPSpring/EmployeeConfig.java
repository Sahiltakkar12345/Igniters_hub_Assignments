package AOPSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration// class has bean defined method
@ComponentScan// scanning component use in program
@EnableAspectJAutoProxy// if u need to apply its behaviour at multiple level
public class EmployeeConfig {

	@Bean// it can be called by directly
	public Employee geEmployee()
	{
		return new Employee();
	}
}
