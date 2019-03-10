package pkk;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char y = 0;
        
        if(y % 400 == 0 && y % 4 == 0)
        {
            System.out.println("year is a leap year");
        }
        else if (y % 100 == 0)
        {
            System.out.println("year is not leap year");
        }
        
	}

}
