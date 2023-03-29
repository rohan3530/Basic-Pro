package pro;

public class SecLarge {
     public static int sl(int a[], int total)
     {
    	 int temp;
    	 
    	 for(int i=0;i<total;i++)
    	 {
    		 for(int j=i+1;j<total;j++)
    		 {
    			 if(a[i]>a[j])
    			 {
    				 temp=a[i];
    				 a[i]=a[j];
    				 a[j]=temp;
    			 }
    		 }
    	 }
    	 return a[total-2];
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int q[]= {3,1,7,8,4,9};
          System.out.println("second largest number is--"+sl(q,6));
          //System.out.println(6);
	}

}
