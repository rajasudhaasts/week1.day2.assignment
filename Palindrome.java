package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "madam";
		String rev =""; 
	
		int s = name.length();
		for(int i=s-1; i>=0; i--)
		{
			
			rev = rev+name.charAt(i);
		}
		if (name.equals(rev))
			
				{
			System.out.println ("Palindrome");
		}
		else System.out.println("Not Palindrome");
	}

}
