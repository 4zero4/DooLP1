package mainPackage;

import java.util.Scanner;

import javax.xml.bind.JAXBException;

import biblio.Usuario;

import fileReaderWriter.Escrevinhator;

public class BibioMain {
	
	public static void main(String[]args) throws JAXBException{
		Scanner stdin = new Scanner(System.in);
		String userIn;
		String senha;
		String nome;
		Usuario user = new Usuario();
		
		System.out.println("Bem vindo ao Bibliotecator v.1!");
		System.out.println("Um projeto por Bruno Omella e Gabriel Melo.");
		System.out.println("Lembre-se de ler o arquivo 'readMe' na documenta��o!");
		System.out.println("\nDigite seu nome de usu�rio: ");
		userIn = stdin.next();
		System.out.println("Gibe senha");
		senha = stdin.next();
		System.out.println("Gibe nome");
		nome = stdin.next();
		
		user.setId(userIn);
		user.setNome(nome);
		user.setPass(senha);
		
		Escrevinhator.toXML(user);
		
		
	}

}
