package test_program;

public class Print_class {
	
	void pr_process(int x, int y, String op){
		int result;
		if(op.equals("+"))
			result = x+y;
		else if(op.equals("-"))
			result = x-y;
		else if(op.equals("*"))
			result = x*y;
		else if(op.equals("/"))
			result = x/y;
		else result = x%y;
		
		System.out.println(x+op+y+"="+result);
	}
	
	void pr_process(String s){
		String temp;
		
		System.out.println(s);
	}

}
