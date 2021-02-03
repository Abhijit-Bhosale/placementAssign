package jan27;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class PriDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string");
		Set<Character> sett = new LinkedHashSet();
		String str = sc.nextLine();
		char ch[]= str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]!=' ' && ch[i]!='*')
				{
					if(ch[i]== ch[j])
					{
						ch[j]='*';
						sett.add(ch[i]);
					}
				}
			}
		}
		
		Iterator<Character> it= sett.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
