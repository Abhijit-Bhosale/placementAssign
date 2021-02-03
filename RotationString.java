package jan27;

import java.util.Scanner;

public class RotationString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two String");
		String str1=sc.next();
		String str2=sc.next();
		int flag=0;
		char ch1=str1.charAt(str1.length()-2);
		char ch2=str2.charAt(0);
		//System.out.println(ch1);
		//System.out.println(ch2);
		if(str1.length()!=str2.length())
		{
			System.out.println("False");
		}
		else if(ch1==ch2)
		{
			for(int i=0;i<str1.length()-1;i++)
			{
				for(int j=i+1;j<str2.length();j++)
				{
					//System.out.println(str1.charAt(j-1));
					//System.out.println(str2.charAt(j));
					if(str1.charAt(j) == str2.charAt(j-1))
					{
						flag+=1;
					}
					else {
						break;
					}
				}
				
			}
			//System.out.println(flag);
			if(flag==str1.length())
			{
				System.out.println("True");
			}
			else
			{
				System.out.println("falsee");
			}
		}
		else 
		{
			System.out.println("False");
		}
	}

}
