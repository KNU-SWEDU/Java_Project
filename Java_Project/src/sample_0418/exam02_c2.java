package sample_0418;

import java.util.*;

public class exam02_c2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int menu;
		do{
			exam02_c1 ec1 = new exam02_c1();
			
			System.out.println("1. Input String");
			System.out.println("2. Input Operation");
			System.out.println("3. Quit");
			
			Scanner input = new Scanner(System.in);
			menu = input.nextInt();
			
			if(menu==1) ec1.function1();
			else if(menu==2) ec1.function2();
			else if(menu == 3) System.out.println("Quit.......");
			else System.out.println("re-input menu number");
			
		}while(menu !=3);
	}

}
