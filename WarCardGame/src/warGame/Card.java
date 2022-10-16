package warGame;

public class Card {

	private int value;
	private String name;
	
	public Card(int value, String name) {
		this.value = value;
		this.name = name;
	}
	
	//getters and setters
	public void setValue(int value) {
	this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setName(String name) {
	this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	//describe method
	public void describe() {
		System.out.println("The " + name + " was played");
	}
	
	
	
	
}

