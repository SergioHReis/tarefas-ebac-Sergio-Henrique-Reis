public class Aluno {

    private String nome;
    private double[] notas;

    public Aluno(String nome) {
        this.nome = nome;
        this.notas = new double[4];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public void adicionarNotas(double notaUm, double notaDois, double notaTres, double notaQuatro) {
        this.notas[0] = notaUm;
        this.notas[1] = notaDois;
        this.notas[2] = notaTres;
        this.notas[3] = notaQuatro;
    }
}
