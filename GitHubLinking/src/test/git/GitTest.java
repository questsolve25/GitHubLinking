package test.git;

public class GitTest {
	
	public static int findConflict(int x, int y) {
		System.out.println(x);
		System.out.println(y);
		System.out.println(x+y);
		return x+y;
	}
	public static void main(String args[]) {
		
		char upperChar = 's';
		char lowerChar ='a';
		
		for (int i = 0; i < 26; i++) {
			System.out.printf("%c",upperChar+i);
			System.out.printf("%c",lowerChar+i);
			System.out.print("  ");
			
		}
			
		
	}
}
