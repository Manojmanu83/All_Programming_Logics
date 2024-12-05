package ExtraProgs;

public class Mobile_no {

	public static void main(String[] args) {
		String str = "where we are";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) != ' ')
			{
				printno(str.charAt(i));
			}
		}
	}

	private static void printno(char ch) {
		switch(ch) {
		case 'a':
		case 'b':{
			System.out.print(1);
		}
		break;
		case 'c':
		case 'd':
		case 'e':{
			System.out.print(2);
		}break;
		case 'f':
		case 'g':
		case 'h':{
			System.out.print(3);
		}break;
		case 'i':
		case 'j':
		case 'k':{
			System.out.print(4);
		}break;
		case 'l':
		case 'm':
		case 'n':{
			System.out.println(5);
		}break;
		case 'o':
		case 'p':
		case 'q':{
			System.out.print(6);
		}break;
		case 'r':
		case 's':
		case 't':{
			System.out.print(7);
		}break;
		case 'u':
		case 'v':
		case 'w':{
			System.out.print(8);
		}break;
		case 'x':
		case 'y':
		case 'z':{
			System.out.print(9);
		}break;
		default: System.out.println("invalid");
		
		}
	}
}
