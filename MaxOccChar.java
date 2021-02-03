package jan27;

import java.util.Scanner;

public class MaxOccChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.next();
		//char ch[]=str.split(",");
		int s=str.length();
		int arr[]=new int[s];
		int count;
		int largest=0;
		int index=0;
		for(int i=0;i<str.length();i++)
		{ 
			count=0;
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					count++;
				}
			}
			arr[i]=count;
		}
		
		for(int k=0;k<arr.length;k++)
		{
			if(largest < arr[k])
			{
				largest = arr[k];
				index =k;
			}
		}
		char ch=str.charAt(index);
		System.out.println(ch);
		
	}

}
