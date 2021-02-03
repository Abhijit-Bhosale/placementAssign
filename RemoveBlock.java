package jan27;

import java.util.Scanner;

public class RemoveBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  two String");
		String Str1=sc.nextLine();
		String Str2=sc.nextLine();
		String repStr= Str1.replace(Str2,"");
		System.out.println(repStr);
		
	}

}
