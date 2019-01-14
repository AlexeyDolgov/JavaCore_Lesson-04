package ua.lviv.lgs.task4_1;

public class Robot {

	private String name;
	private String act;
	
		
	public Robot(String name, String act) {
		this.name = name;
		this.act = act;
	}
	
	public Robot() {
		this.name = "Robot";
		this.act = "просто работаю";
	}

		
	public void work () {
		System.out.println("Я " + this.name + " - я " + this.act + "!");
	}
	
}
