import java.util.*;
class Switch

{
	public static void main (String [] args)
	{
		
		Scanner sc = new Scanner (System.in);
		int a =sc.nextInt();
		int b = sc.nextInt();
		char c = sc.next().charAt(0);	
		switch (c)
		{
			case '+' :
			System.out.print(a+b);
			break;
			case '-' :
			System.out.print(a-b);
			break;
			case '/' : 
			System.out.print((float)a/b);
			break;
			case '*' :
			System.out.print(a*b);
			default :
			System.out.print("Wrong input");

		
	}
}