public class NoCommand implements Command{
	public void execute(){
		System.out.println("no command");	
	}	

	public void undo(){
		System.out.println("do nothing");	
	}
}
