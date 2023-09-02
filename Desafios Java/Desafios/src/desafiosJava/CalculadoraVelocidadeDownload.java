package desafiosJava;
import java.util.Scanner;

public class CalculadoraVelocidadeDownload {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Solicitar a entrada do usuário para a distância física e a velocidade do plano de internet
            System.out.println("Informe a distancia do servidor: ");
            double distanciaServidores = scanner.nextDouble();

            System.out.println("informe a velocidade do plano: ");
            double velocidadePlano = scanner.nextDouble();

            //TODO: Calcule a velocidade de download estimada
            double velocidadeDownloadEstimada = calcularVelocidadeDownload(distanciaServidores, velocidadePlano);

            // Apresentar o resultado
            System.out.println("\nVelocidade de Download Estimada: " + String.format("%.2f", velocidadeDownloadEstimada) + " Mbps");

            scanner.close();
        }
        public static double calcularVelocidadeDownload(double distanciaServidores, double velocidadePlano) {
            // TODO: Crie a fórmula de cálculo para a velocidade de download estimada
            double vd = 0F;
             vd = velocidadePlano / (1 + (distanciaServidores/100));
            return vd;

        }
    }
