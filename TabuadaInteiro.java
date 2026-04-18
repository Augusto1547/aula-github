import java.util.Scanner;

public class TabuadaInteiro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Infome um número inteiro qualquer");
        int numero = sc.nextInt();
        if (numero < 0 || numero == 0) {

            System.out.println("Informe um número inteiro positivo.");

        } else {
            
            for (int i = 1; i < 11; i++) {
               
                System.out.printf("%d x %d = %d\n", numero, i, numero * i);
 
            }
        }

        sc.close();

    }
}