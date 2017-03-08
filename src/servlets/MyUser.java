package servlets;

public class MyUser {

	private String name;
	private  String password;
	
	public MyUser(String name, String password){
		this.name=name;
		this.password=password;
	}

	public MyUser() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "MyUser [name=" + name + ", password=" + password + "]";
	}

	
}
