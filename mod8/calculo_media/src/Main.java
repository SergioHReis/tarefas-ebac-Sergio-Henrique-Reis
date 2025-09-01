public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Sérgio");
        aluno.adicionarNotas(7.5, 8.8, 3.2, 10.00);
        double media = CalculadoraMedia.calcularMedia(aluno.getNotas());
        System.out.println("Média do aluno: " + media);
    }
}