package game;

public class player1 {
	private String name;
	private String wepon;
	private int health;
	
	
	 public player1(String name,String wepon,int health) {
		 this.name=name;
		 this.wepon=wepon;
		
		 if(health<0||health>100) {
			 this.health=100; 
		 }else  this.health=health;
	 }
	 
	 public void damagebygun1() {
		 this.health-=30;
		 if(this.health<=0) {
			 this.health=0;
		 }
		 System.out.println("got hit by gun 1 and health reduce by 30 "+"new health is "+this.health);
		 if(this.health==0) {
			 System.out.println(getName()+" is dead");
		 }
	 }
	 public void damagebygun2() {
		 this.health-=50;
		 if(this.health<=50) {
			 this.health=0;
		 }
		 System.out.println("got hit by gun 2 and health reduce by 50 "+"new health is "+this.health);
		 if(this.health==0) {
			 System.out.println(getName()+" is dead");
		 }
	 }
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name=name;
	 }
	 public String getwepon() {
		 return wepon;
	 }
	 public void setwepon(String wepon) {
		 this.wepon=wepon;
	 }
	 public int gethealth() {
		 return health;
	 }
	 public void sethealth() {
		 this.health=health;
	 }
}
