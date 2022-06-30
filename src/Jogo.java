import java.util.Random;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        Random sorteiaNumero = new Random();
        int numeroSorteado = sorteiaNumero.nextInt(50) + 1;
        int somaPontos = 0;
        boolean continuaJogo = true;
        while (continuaJogo) {


            System.out.println("Adivinhe em que número estou pensando!");
            System.out.println("Digite um número de 0 a 50: ");
            Scanner input = new Scanner(System.in);
            int insereNumero = input.nextInt();
            int numeroMaior = numeroSorteado++;
            int numeroMenor = numeroSorteado--;
            int numeroCorreto = numeroSorteado;
            if (insereNumero == numeroMaior) {
                somaPontos = somaPontos + 5;
                System.out.println("você ganhou" + somaPontos + " pontos");

            } else if (insereNumero == numeroMaior) {
                somaPontos = somaPontos + 5;
                System.out.println("você ganhou " + somaPontos + " pontos");
            } else if (insereNumero == numeroCorreto) {
                somaPontos = somaPontos + 10;
                System.out.println("Parabéns, você acertou e ganhou " + somaPontos + " pontos");

            } else {

                System.out.println("Número incorreto, o jogo acabou. Seu total de pontos foi: " + somaPontos);
                continuaJogo = false;
            }
        }
    }
}
