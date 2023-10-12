package thirdtask;

	public class StringCharacters
	{
	public static void main(String[] args)
	{
	String text = "To be or not to be, that is the question;"
	+"Whether `tis nobler in the mind to suffer" 
	+" the slings and arrows of outrageous fortune,"
	+" or to take arms against a sea of troubles,"
	+" and by opposing end them?";
	int spaces = 0,
	vowels = 0,
	letters = 0;
	for(int i=0;i<text.length();i++)
	{
		if((text.charAt(i)>=97 && text.charAt(i)<= 122)||(text.charAt(i)>=65 && text.charAt(i)<= 90) )
		{
			letters++;
		}
		
		switch (text.charAt(i)){
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			vowels++;
			break;
		case ' ':
			spaces++;
			break;
		default:
			break;
			
		}
		
			
	}
	System.out.println("The text contained vowels: " + vowels + "\n"
	+ "consonants " + (letters - vowels) + "\n"+ spaces + " spaces"+ "\n"+ letters + " letters");
	}
	} 
