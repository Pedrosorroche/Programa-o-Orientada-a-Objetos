package poo;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class FixacaoAula2 {
	
	public static void main(String[] args) {
		
		String nome;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe seu nome: ");
		nome = sc.next();
		
		System.out.println("Olá, " + nome + " " + "seja bem vindo.");
		
		String strnome = JOptionPane.showInputDialog("Informe seu nome: ");
		
		JOptionPane.showMessageDialog(null, "Olá, " + nome + " seja bem vindo!");
		
	}
}
