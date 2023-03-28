package pro;
import java.util.*;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
          Scanner a=new Scanner(System.in);
          System.out.println("Enter a Number");
          int b=a.nextInt();
          int temp=0;
          for(int i=2;i<b-1;i++) {
        	  if(b%i==0)
        	  {
        		  temp=temp+1;
        	  }
          }
          if(temp==0)
          {
        	  System.out.println("Given number is Prime");
          }
          else
          {
        	  System.out.println("Given number is not prime");
          }
	}

}
