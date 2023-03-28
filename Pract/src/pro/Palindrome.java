package pro;

import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner c=new Scanner(System.in);
          System.out.println("Enter a number");
          int q=c.nextInt();
          int temp=q;
          int rev=0;
          int rem;
          while(temp!=0)
          {
        	  rem=temp%10;
        	  rev=rev*10+rem;
        	  temp=temp/10;
          }
          
          if(q==rev)
          {
        	System.out.println("Given number is palindrome");  
          }
          else
          {
        	  System.out.println("Given number is not palindrome");
          }
	}

}
