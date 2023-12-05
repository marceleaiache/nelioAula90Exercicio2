package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //DECLARAÇÃO DA VARIAVEL QUE VAI RECEBER A QUANTIDADE DE NUMEROS QUE SERAO INSERIDOS
        int n;

        //IMPRESSÃO NA TELA PARA O USUARIO INSERIR A QUANTIDADE DE NUMEROS INSERIDOS
        System.out.println("Quantos números você vai digitar?");
        n = sc.nextInt();

        //DECLARAÇÃO DO VETOR
        double[] vect = new double[n];

        //IMPRESSÃO NA TELA PRO USUARIO INSERIR OS NUMEROS
        for (int i=0; i<vect.length; i++) {
            System.out.println("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        //DECLARAÇÃO DA VARIÁVEL DA SOMA
        double sum = 0;

        //SOMA DE TODOS OS NUMEROS DOS VETORES
        for (int i=0; i< vect.length; i++) {
            sum += vect[i];
        }

        //DECLARAÇÃO DA VARIÁVEL MÉDIA COM ATRIBUIÇÃO DO SEU VALOR
        double avg = sum / n;

        //IMPRESSÃO NA TELA DE TODOS OS VALORES DO VETOR
        System.out.println("VALORES = ");
        for (int i=0; i<vect.length; i++) {
            System.out.print(vect[i] + " ");
        }

        //IMPRESSÃO NA TELA DA SOMA E DA MEDIA
        System.out.println();
        System.out.printf("SOMA = %.2f%n", sum);
        System.out.printf("MEDIA = %.2f%n", avg);



        sc.close();
    }
}
