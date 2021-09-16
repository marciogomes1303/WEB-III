//4. Criar um algoritmo onde digita-se:
//- Nome do aluno
//- Disciplina;
//-  Nota1, nota2 e nota3;
//- Frequência do aluno;
//O programa deverá retornar o nome, a disciplina, a média final (n1 + n2 + n3 / 3) 
//e se o aluno está aprovado (aprovado com frequência igual e superior a 75% e média >= 6).

import java.util.Scanner;

public class nota {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String nome, disciplina;
        Double n1, n2, n3, freq;
        // Double media = (n1,n2,n3) / 3;

        System.out.println("Digite o nome do aluno: ");
        nome = ler.nextLine();
        System.out.println("Digite a disciplina do aluno: ");
        disciplina = ler.nextLine();
        System.out.println("Digite a frequência do aluno: ");
        freq = ler.nextDouble();

        System.out.println("Digite a nota 1: ");
        n1 = ler.nextDouble();
        System.out.println("Digite a nota 2: ");
        n2 = ler.nextDouble();
        System.out.println("Digite a nota 3: ");
        n3 = ler.nextDouble();
        System.out.println("Qual a frequência do aluno? " + freq + "%");

        Double media = (n1 + n2 + n3) / 3;
        System.out.println("A média final é: " + media);

        System.out.println("O nome do aluno é: " + nome + "\n" + "A Diciplina é: " + disciplina + "\n"
                + "A frequência do aluno é: " + freq + "\n" + "A média do aluno é: " + media);

        if (media >= 6 && freq >= 75) {
            System.out.println("O aluno está APROVADO");
        } else {
            System.out.println("O aluno está REPROVADO");
        }

    }
}
