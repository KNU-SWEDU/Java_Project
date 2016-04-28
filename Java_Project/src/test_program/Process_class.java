package test_program;

import java.util.Scanner;

public class Process_class {
	
	Print_class prc = new Print_class();
	
	Scanner input = new Scanner(System.in);
	
	void amm(){
		
		int x, y;
		String op;
		
		System.out.println("AMM");
		System.out.println("Input num1");
		x = input.nextInt();
		System.out.println("Input num2");
		y = input.nextInt();
		System.out.println("Input op");
		op = input.next();
		
		prc.pr_process(x, y, op);
		
	}
	
	void asm(){
		System.out.println("APM");
		
		String instr1, instr2;
		
		System.out.println("Input String1");
		instr1 = input.next();
		System.out.println("Input String2");
		instr2 = input.next();
		
		String temp = instr1.concat(instr2);
		
		prc.pr_process(temp);
	}

}
