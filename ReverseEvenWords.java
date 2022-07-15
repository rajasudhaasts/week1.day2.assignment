package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "I am a software tester";
	    String reverse;
	    String[] split = text.split(" ");

	    int length = split.length;
	    for (int i = 1; i < length; i++)
	    {   
	    	if(i%2!=0)
	    	{   
	    		reverse="";
	    		char[] Word = split[i].toCharArray();
	    		for (int j = Word.length-1; j>=0; j--) 
	    		{	
	    		    reverse= reverse+ Word[j];
	    		    split[i]=reverse;
				}
	  
	    	}
		}
	   
	     for (String words : split) 
	     {
		    System.out.print(words+" ");
	     }
	    
	  }

	}