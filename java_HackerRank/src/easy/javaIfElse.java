package easy;

public class javaIfElse {

	public static void main(String[] args) {
		int N = 20;
		//aa
		if (N % 2 == 1) {
			System.out.println("Weird");
		}else if(N % 2 == 0 && N > 2 && N < 5) {
			System.out.println("Not Weird");
		}else if(N % 2 == 0 && N > 6 && N <= 20){
			System.out.println("Weird");
		}else {
			System.out.println("Not Weird");
		}

	}

//if (i > 0 && i < 100) 
}
