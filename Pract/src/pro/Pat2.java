package pro;

public class Pat2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		
		for(int i=1;i<=n;i++)  //This loop is for rows.
		{
			for(int j=i;j<=n;j++)   //This loop is for columns.
			{
				System.out.print("* ");
			}System.out.println();
		}
	}

}
