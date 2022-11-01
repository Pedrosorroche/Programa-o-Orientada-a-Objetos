package poo;

import java.util.Scanner;

public class FixacaoAula2B {

	public static void main(String[] args) {
		
		int a, b;
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		b = sc1.nextInt();
		
		int soma = a + b;
		int sub = a - b;
		int mult = a * b;
		int div = a / b;
		int pot = a ^ b;
		
		System.out.println(soma);
		System.out.println(sub);
		System.out.println(mult);
		System.out.println(div);
		System.out.println(pot);
		

	}

}
