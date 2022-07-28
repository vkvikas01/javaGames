package stonePaperSecsior;
import java.util.*;
public class sps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
//		System.out.println(r.nextInt(1,10));
		Scanner sc=new Scanner(System.in);
		System.out.println("*******Welcome to Rock paper scisor game ******* ");
		
		System.out.println("enter your choice");
		System.out.println("Press 1 for rock");
		System.out.println("Press 2 for paper");
		System.out.println("Press 3 for scisor");
		int user_inpt=sc.nextInt();
	
		switch(user_inpt) {
		case 1:
			System.out.println("you choose rock");
			break;
		case 2:
			System.out.println("you choose paper");
			break;
		case 3:
			System.out.println("you choose scisor");
			break;
		default:
		
			System.out.println("you choose wrong value");
			
		}
		System.out.println("Now computer turn");
		int comp_inpt=r.nextInt(1,10);
		if(comp_inpt==1||comp_inpt==4||comp_inpt==7||comp_inpt==10) {
			System.out.println("computer choose rock");
			if(user_inpt==1) {
				System.out.println("match drawn");
			}else if(user_inpt==3) {
				System.out.println("*********you won the match*********");
			}else {
				System.out.println("oops you lost match ");
				System.out.println("beter luck next time");
			}
		}else if(comp_inpt==2||comp_inpt==5||comp_inpt==8) {
			System.out.println("computer choose paper");
			if(user_inpt==2) {
				System.out.println("match drawn");
			}else if(user_inpt==1) {
				System.out.println("*********you won the match*********");
			}else {
				System.out.println("oops you lost match ");
				System.out.println("beter luck next time");
			}
		}else {
			System.out.println("computer choose scisor");
			if(user_inpt==3) {
				System.out.println("match drawn");
			}else if(user_inpt==2) {
				System.out.println("*********you won the match*********");
			}else {
				System.out.println("oops you lost match ");
				System.out.println("beter luck next time");
			}
		}
	}

}
