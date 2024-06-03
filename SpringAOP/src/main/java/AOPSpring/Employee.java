package AOPSpring;

public class Employee {
	private String name;

	public String getName() {
		System.out.println("getter method is called");
		return name;
	}

	public void setName(String name) {
		System.out.println("setter method is called");
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}
	
}
