package poo;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class HelloWorld {
	
	public static void main(String[] args) {
		
		String nome;
		int idade, nascimento;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome:");
		nome = sc.next();
		
		String strnascimento = JOptionPane.showInputDialog("Informe o ano de nascimento: ");
		nascimento = Integer.parseInt(strnascimento);
		
		idade = 2022 - nascimento;
		
		JOptionPane.showMessageDialog(null , "Olá, " + nome + " " +"você tem " + idade + " anos" );
		
	}
}
