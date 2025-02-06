import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		String input = in.nextLine();
		System.out.println(input.charAt(0));
	}

	public static void q2() {
		//Write question 2 code here
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		boolean bool = in.nextBoolean();
		System.out.println(!bool);
	}

	public static void q3() {
		//Write question 3 code here
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		int num = in.nextInt();
		System.out.println(num > 5);
	}

	public static void q4() {
		//Write question 4 code here
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		double num = in.nextDouble();
		System.out.println(-2 <= num && num <= 2);
	}

	public static void q5() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		String input = in.nextLine();
		System.out.println(input.equals("Hello World"));
	}

	public static void q6() {
		//Write question 6 code here
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		int firstNum = in.nextInt();
		System.out.print("In: ");
		int secondNum = in.nextInt();
		System.out.println(firstNum <= secondNum);
	}

	public static void q7() {
		//Write question 7 code here
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		double firstNum = in.nextDouble();
		System.out.print("In: ");
		double secondNum = in.nextDouble();
		System.out.println(firstNum > secondNum);
	}

}
