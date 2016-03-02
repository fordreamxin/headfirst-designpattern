public class Light{

	private String name = "light";

	public Light(String name){
		this.name = name;	
	}
	public void on(){
		System.out.println("" + name + " Light on");	
	}	

	public void off(){
		System.out.println("" + name + " Light off");	
	}
}
