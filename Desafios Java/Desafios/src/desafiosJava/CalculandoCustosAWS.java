package desafiosJava;

import java.util.Scanner;

public class CalculandoCustosAWS {
    public static void main(String[] args) {
        // Definindo as taxas
        double custoPorHoraServidor = 0.15;
        double custoPorHoraBancoDados = 0.05;

        // Criando um objeto Scanner para receber as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Recebendo as informações do usuário
        System.out.println("Infororme a quantidade de servidores: ");
        int quantidadeServidores = scanner.nextInt();
        System.out.println("Infororme a quantidade de banco de dados: ");
        int quantidadeBancosDados = scanner.nextInt();

        //TODO: Calcule os custos
        double custoTotal = 0F;
        custoTotal = (quantidadeServidores * custoPorHoraServidor) + (quantidadeBancosDados * custoPorHoraBancoDados);


        System.out.printf("Custo total de uso da AWS por hora: R$ %.2f%n", custoTotal);

        // Fechando o Scanner
        scanner.close();
    }
}