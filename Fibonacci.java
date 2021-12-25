package week1.day1.assignments;

public class Fibonacci {

	public static void main(String[] args) {
		int num=8;
		int f=0, s=1,t;
		System.out.println("Fibonacci series of" + num + "is:");
		System.out.println(f);
		System.out.println(s);
		for (int i = 1; i <=num ; i++) {
			t=f+s;
			System.out.println(t);
			f=s;
			s=t;
		}

	}

}
