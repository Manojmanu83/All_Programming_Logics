package string_programs;

import java.util.Arrays;

public class First_letter_upper {

	public static void main(String[] args) {
		String str = "hell hi how are you";
		char ch[] = str.toCharArray();
		if(ch[0]!=' ') {
			ch[0] = (char)(ch[0]-32);
		}
		for(int i=1;i<ch.length;i++)
		{
			if(ch[i] == ' ') {
				if (ch[i+1]>=97 && ch[i+1]<=122)
			{
				ch[i+1] = (char) (ch[i+1]-32);
			}
		}
	}
	System.out.println(ch);
	}

}
