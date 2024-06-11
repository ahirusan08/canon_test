package taochan;

import java.util.Scanner;

public class tao1 {

	public static void main(String[] args) {
		System.out.println("Hello");

		System.out.println("愛ください");

		Scanner scan1 = new Scanner(System.in);
		System.out.println("書いてくれたのは？:");
		String name = scan1.next();

		Scanner scan2 = new Scanner(System.in);
		System.out.println("message1");
		String ai1 = scan2.next();

		Scanner scan3 = new Scanner(System.in);
		System.out.println("message2");
		String ai2 = scan3.next();

		System.out.println("---");

		System.out.println("こんにちは" + name + "です。");

		String[] ary = { ai1, ai2 };
		for (String data : ary) {
			System.out.println("・" + data);
		}
		System.out.println("thankyou by tao");

	}

}
