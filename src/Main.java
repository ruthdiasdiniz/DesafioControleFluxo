import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int parametroUm = scanner.nextInt();
        int parametroDois = scanner.nextInt();
        int calculo = parametroDois - parametroUm;
        System.out.println(calculo);
        int contador = 0;

        if (parametroDois < parametroUm)
        {
            System.out.println("O segundo parâmetro não dever ser menor que o primeiro.");
        }else {
            for (int numero = 0; numero < calculo; numero++) {
                contador++;
            }
            System.out.println("O número de interações foram: " + contador );
        }


    }
}