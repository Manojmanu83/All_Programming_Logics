package ProgramsOnRecursion;

public class FactUsingRecursion {

	public static void main(String[] args) {
		int no = 5;
		System.out.println(findFact(no));
	}

	private static int findFact(int no) {
		if(no == 1)
			return no;
		else {
			return no * findFact(no -1);
		}
	}

}
