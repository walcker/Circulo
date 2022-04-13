package circulo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float raio;

        var scanner = new Scanner(System.in);
        System.out.println("Entre com o raio do circulo.");
        float input = Float.parseFloat(scanner.next());
        raio = input;

        Circulo calc = new Circulo(raio);
        calc.calcular();

    }

}
