
/**
 Faça um algoritmo que leia um valor inteiro e informe se este valor é  igual ou maior do que 10.
 */

import java.util.Scanner;

public class numMaior
{
    public static void main(String[] args) {
        int valor;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um valor desejado: ");
        valor = ler.nextInt();
        
    if (valor >= 10) {
        System.out.println("O número digitado é maior ou igual a 10!");
    }else{
        System.out.println("O número digitado é menor que 10!");
    }
}
}