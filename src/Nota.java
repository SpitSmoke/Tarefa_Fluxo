import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double somaNotas = 0.0;


        for (int i = 1; i <= 4; i++) {
            System.out.print("Digite a nota " + i + ": ");
            double nota = scanner.nextDouble();
            somaNotas += nota;
        }

        // Calcula a média
        double media = somaNotas / 4;

        System.out.println("A média das notas é: " + media);


        if (media >= 7) {
            System.out.println("Parabéns! Você passou.");
        } else if (media < 5) {
            System.out.println("Você está de recuperação.");
        } else {
            System.out.println("Você está de exame final.");
        }

        scanner.close();
    }
}