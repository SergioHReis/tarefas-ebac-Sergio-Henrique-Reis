public class CalculadoraMedia {

public static double calcularMedia(double[] notas) {
    double soma = notas[0] + notas[1] + notas[2] + notas[3];
    double media = soma / 4;
    return media;
}

}
