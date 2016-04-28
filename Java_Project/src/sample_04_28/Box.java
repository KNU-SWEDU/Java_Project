package sample_04_28;

public class Box {
	
	int i;
	String name;
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	{
		i=0;
		name = "test";
	}
	
	void method1(){
		Box obj1 = new Box();
		Box obj2 = method2();
		
		System.out.println(obj1 + " "+obj1.getI());
		System.out.println(obj2 + " "+obj2.getI());
		
	}
	
	Box method2(){
		Box temp = new Box();
		
		temp.setI(999);
		System.out.println(temp);
		
		return temp; 
	}

}
