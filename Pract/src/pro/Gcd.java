package pro;
import java.util.*;
public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner y=new Scanner(System.in);
		int a=y.nextInt();
		int b=y.nextInt();
		int g=0;
		
		for(int i=1;i<=a&&i<=b;i++)
		{
			if(a%i==0 && b%i==0)
			{
				g=i;
			}
		}
		System.out.println("GCD of number is =" +g);
	}

}
