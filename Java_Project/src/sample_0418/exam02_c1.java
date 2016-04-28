package sample_0418;

import java.util.*;

public class exam02_c1 {
	
	Scanner input = new Scanner(System.in);
	
	void function1(){
		//System.out.println("f1");
		int i1, i2, result=0;
		String op;
		System.out.println("input number1");
		i1 = input.nextInt();
		System.out.println("input number2");
		i2 = input.nextInt();
		System.out.println("input operation");
		//op = input.next();
		op = input.next();
		//op = System.in.toString();
		
		if(op.equals("+")) result = i1 + i2;
		else if(op.equals("-")) result = i1-i2;
		else if(op.equals("*")) result = i1*i2;
		else if(op.equals("/")){
			if(i2==0) return;
			result = i1 / i2;
		}else if(op.equals("%")) result = i1 % i2;
		else {
			System.out.println("Error input opeariont");
			return;
		}
		
		//System.out.println(" Result : "+ result);
		
		sm(i1, i2, op, result);
	}
	
	void function2(){
		//System.out.println("f2");
		sm("test");
	}
	
	void sm(int x, int y, String op, int r){
		System.out.println(x+op+y+" = "+r);
		System.out.println("--------------------------");
	}
	
	void sm(String s){
		System.out.println("sm String "+s);
	}

}
