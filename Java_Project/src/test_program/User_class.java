package test_program;

import java.util.Scanner;

public class User_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu;
		do{
			
			Process_class pc = new Process_class();
			
			System.out.println("1. AM O");
			System.out.println("2.Append String");
			System.out.println("3. quit");
			
			Scanner input = new Scanner(System.in);
			
			menu = input.nextInt();
			
			switch(menu){
				case 1:
					pc.amm();
					break;
				case 2:
					pc.asm();
					break;
				case 3:
					System.out.println("quit");
				
			}
		}while(menu!=3);
			
		

	}

}
