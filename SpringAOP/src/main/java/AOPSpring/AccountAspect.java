package AOPSpring;

public class AccountAspect {
	
	public void Authenticate()
	{
		System.out.println("are u trying to do some transaction");
	}
	public void update()
	{
		System.out.println("your transaction r update successfully");		
	}
}
