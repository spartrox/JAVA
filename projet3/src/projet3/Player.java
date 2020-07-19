package projet3;

public class Player {
	
	private String name;
	private double health;
	private double attack;
	
	public Player(String name, int attack, int health) {
		this.name = name;
		this.attack = attack;
		this.health = health;
	}

	public String getName() {
		return name;
	}
	
	public void damage(double damage) {
		this.health -= damage;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		this.health = health;
	}

	public double getAttack() {
		return attack;
	}

	public void setAttack(double attack) {
		this.attack = attack;
	}
	
	
	
}
