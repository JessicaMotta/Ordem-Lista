package Interface;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
    public class ListaOrdem {
        public static void main(String[] args ) {

            //leitura do teclado
            Scanner input = new Scanner(System.in);

            //definindo o tamanho do vetor
            String[] nome = new String[2];
            String[] idade = new String[2];

            //solicita nome
            System.out.println("\t=== CONTROLADOR DE FILA ===");
            System.out.println("Digite os nomes:");

            for(int i = 0; i<nome.length; ++i) {

            System.out.print("Digite o " +(i+1) + "º nome: ");
            nome[i] = input.nextLine();
            }

            //solicita idade
            System.out.println("Digite as idades:");
            for(int i = 0; i<idade.length; ++i) {
            System.out.print("Digite a idade da(o) "+nome[i]+ ":");
            idade[i] = input.nextLine();

            }

        System.out.println(" ");

        //ordenando nomes e idades
        Arrays.sort(nome);
        Arrays.sort(idade);

        //exibindo resultado da ordem
        System.out.println("\t=== RESULTADO DA ORDEM ===");
        for (int i=0; i< nome.length; i++){
            System.out.print("Nome: "+nome[i]+"| Idade: "+idade[i]+"\n");
        }

        input.close();

        }       
    }
