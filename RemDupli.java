package jan27;

import java.util.Scanner;

public class RemDupli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.next();
	
		int n=0;
		char ch[]= str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
	
			for(int j=i+1;j<str.length();j++)
			{
				if(ch[i]== ch[j])
				{
					ch[i]='*';
					ch[j]='*';
				}
			}
			
		}
		for(int m=0;m<ch.length;m++)
		{
			if(ch[m]!='*')
			System.out.print(ch[m]);
		}
	}

}
