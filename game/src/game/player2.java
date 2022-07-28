package game;

public class player2 extends player1 {
	
	private int health;
	private boolean armor;
	
	public player2(String name, String wepon, int health,boolean armor) {
		super(name, wepon, health);
		this.health=health;
		this.armor=armor;
	}
	@Override
	 public void damagebygun1() {
		if(armor) {
		this.health-=20;
		if(this.health<=0) {
			 this.health=0;
		 }
		System.out.println("armor is on  ,got hit by gun 1 health is reduced by 20 and new health is"+this.health);
		}
		 if(!armor) {
			 this.health-=30;
				if(this.health<=0) {
					 this.health=0;
				 }
				System.out.println("armor is off  ,got hit by gun 1 health is reduced by 30 and new health is"+this.health);
		 }
		 if(this.health==0) {
			 System.out.println(getName()+" is dead");
		 }
		 
	 }
	@Override
	 public void damagebygun2() {
		if(armor) {
		this.health-=40;
		if(this.health<=0) {
			 this.health=0;
		 }
		System.out.println("armor is on  ,got hit by gun 2 health is reduced by 40 and new health is "+this.health);
		}
		 if(!armor) {
			 this.health-=50;
				if(this.health<=0) {
					 this.health=0;
				 }
				System.out.println("armor is off  ,got hit by gun 1 health is reduced by 50 and new health is "+this.health);
		 }
		 if(this.health==0) {
			 System.out.println(getName()+" is dead");
		 }
	 }
}
