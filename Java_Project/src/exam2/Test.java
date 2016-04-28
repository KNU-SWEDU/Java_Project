package exam2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=7;i++){
			for(int j=1;j<=6;j++){
				if((5<=j  && j<=6)&&(1<=i && i<=2))
					break;
				if((4<=j && j<=5)&&(3<=i && i<=5))
					continue;
				if((4<=j && j<=5)&&(i==7)){
					System.out.print("    ");
					continue;
				}
				System.out.print((j*100+i)+" ");
			}
			System.out.println("");
		}

	}

}
