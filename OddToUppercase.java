package week1.day2;

public class OddToUppercase {

	public static void main(String[] args) {
		String str = "changeme";
		char[] charArr = str.toCharArray();
		for(int i = 0; i<charArr.length;i++)
		{
			char oddcase = charArr[i];
			char uppercase=Character.toUpperCase(oddcase);
			charArr[i]=uppercase;
		}
				
		System.out.println(charArr);

	}

}
