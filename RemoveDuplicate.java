package week1.day2;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		int count; 
		text=text.toLowerCase();
		String ch[]=text.split(" ");
		for(int i = 0; i < ch.length; i++)
		{
			count = 1;
			for(int j=i+1; j<ch.length; j++)
			{
				if(ch[i].equals(ch[j]))
						{
					count++;
					ch[j]="0";
						}
		
		}
		
		if(count<=1 && ch[i]!="0")
		{
			System.out.println(ch[i]+ "");
		}
			

	}
	}
}
