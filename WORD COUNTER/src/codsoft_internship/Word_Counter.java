package codsoft_internship;

import java.util.Scanner;

public class Word_Counter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter a Word");
String str = sc.nextLine();
int count = countWords(str);
System.out.println("Number of words in your text = : " +count);
sc.close();
	}
	private static int countWords(String text)
	{
		if(text == null || text.isEmpty())
		{
			return 0;
		}
		String[]words = text.trim().split("\\s+");
		return words.length;
	}
}
