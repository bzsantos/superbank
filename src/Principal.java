import java.util.Scanner;

import javax.swing.JOptionPane;


public class Principal {

public static void main(String[] args){


    JOptionPane.showMessageDialog(null, "teste Swing");

    Scanner teclado = new Scanner(System.in);

    //Iniciando o objeto da classe Corrente
    Corrente corrente = new Corrente();

    

    System.out.println("Digite seu nome: ");

    String nome = teclado.nextLine();

    corrente.setNomecli(nome);

    System.out.println("Digite seu CPF: ");

    String cpf = teclado.nextLine();
   
    corrente.setCpfcli(cpf);

    corrente.abrirConta();

}

}
