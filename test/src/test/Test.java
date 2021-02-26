package test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "Hello";
		int count = 0 ;
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)!=' ') {
				count++;
			}
		}
		
		System.out.print(+count);
	}

}
