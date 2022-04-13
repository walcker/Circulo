package circulo;

public class Circulo {

    float perimetro;
    float area;
    float raio;

    Circulo(float raio){
        this.raio = raio;
    }

    public void calcular(){
        perimetro = (float) (2 * Math.PI * raio);
        area = (float) (Math.PI*Math.pow(raio,2));

        System.out.println(perimetro);
        System.out.println(area);
    }
}
