package pro;

import java.util.Arrays;

public class Anagram {
	
	public static boolean Anna(String s1,String s2)
	{
		s1=s1.replaceAll("\\s", "").toLowerCase();
		s2=s2.replace("\\s", "").toLowerCase();
		
		if(s1.length()!=s2.length())
		{
			return false;
		}
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		return Arrays.equals(c1, c2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean res=Anna("now","won");
		System.out.println("String is " +res);
	}

}
