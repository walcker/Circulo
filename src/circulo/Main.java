package circulo;

public class Main {

    public static void main(String[] args) {
        float raio = 5;
        Circulo calc = new Circulo();

        calc.perimetro = (float) (2 * Math.PI * raio);
        calc.area = (float) (Math.PI*Math.pow(raio,2));

        System.out.println(calc.perimetro);
        System.out.println(calc.area);

    }

}
