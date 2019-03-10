package package1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0,num2=1,num3,i;    
		 System.out.print(num1+" "+num2);    
		    
		 for(i=2;i<10;++i) 
		 {    
		  num3=num1+num2;    
		  System.out.print(" "+num3);    
		  num1=num2;    
		  num2=num3;    
		 }    
	}

}
