import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu pedo (kg):");
        double peso = sc.nextDouble();

        System.out.println("Digite sua altura (m):");
        double altura = sc.nextDouble();
        sc.close();

        double imc = peso / (altura * altura);
        System.out.printf("Seu IMC é: %.2f\n", imc);

        if (imc < 20) {
            System.out.println("Abaixo do peso.");

        } else if (imc >= 20 && imc < 25) {

            System.out.println("Peso Normal");

        } else if (imc < 30) {

            System.out.println("Sobrepeso");

        } else if (imc < 40) {

            System.out.println("Obseo.");

        } else {

            System.out.println("Obeso mórbido.");
        }
    }
}
