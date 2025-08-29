/**
 * Classe que representa um cachorro com suas propriedades e comportamentos
 * @author Sérgio Henrique Reis
 * @version 1.0
 * @since 1.8
 */
public class Cachorro {

    // Atributos (propriedades) do cachorro
    private String nome;
    private String raca;
    private int idade;
    private String cor;
    private double peso;
    private double altura;
    private boolean vacinado;

    /**
     * Método para obter o nome do cachorro
     * @return nome do cachorro
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método para definir o nome do cachorro
     * @param nome novo nome do cachorro
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método para obter a raça do cachorro
     * @return raça do cachorro
     */
    public String getRaca() {
        return raca;
    }

    /**
     * Método para definir a raça do cachorro
     * @param raca nova raça do cachorro
     */
    public void setRaca(String raca) {
        this.raca = raca;
    }

    /**
     * Método para obter a idade do cachorro
     * @return idade do cachorro em anos
     */
    public int getIdade() {
        return idade;
    }

    /**
     * Método para definir a idade do cachorro
     * @param idade nova idade do cachorro
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * Método para obter a cor do cachorro
     * @return cor do cachorro
     */
    public String getCor() {
        return cor;
    }

    /**
     * Método para definir a cor do cachorro
     * @param cor nova cor do cachorro
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * Método para obter o peso do cachorro
     * @return peso do cachorro em kg
     */
    public double getPeso() {
        return peso;
    }

    /**
     * Método para definir o peso do cachorro
     * @param peso novo peso do cachorro
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * Método para obter a altura do cachorro
     * @return altura do cachorro em metros
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Método para definir a altura do cachorro
     * @param altura nova altura do cachorro
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Método para verificar se o cachorro está vacinado
     * @return true se estiver vacinado, false caso contrário
     */
    public boolean isVacinado() {
        return vacinado;
    }

    /**
     * Método para definir se o cachorro está vacinado
     * @param vacinado status de vacinação do cachorro
     */
    public void setVacinado(boolean vacinado) {
        this.vacinado = vacinado;
    }

    /**
     * Construtor da classe Cachorro
     * @param nome nome do cachorro
     * @param raca raça do cachorro
     * @param idade idade do cachorro em anos
     * @param cor cor do cachorro
     * @param peso peso do cachorro em kg
     * @param altura altura do cachorro em metros
     * @param vacinado status de vacinação do cachorro
     */
    public Cachorro (String nome, String raca, int idade, String cor, double peso, double altura, boolean vacinado ) {

        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.cor = cor;
        this.peso = peso;
        this.altura = altura;
        this.vacinado = vacinado;

    }

    /**
     * Método que faz o cachorro latir
     */
    public void latir() {
        System.out.println("O " + nome + " está latindo...");
    }

    /**
     * Método que faz o cachorro comer
     */
    public void comer() {
        System.out.println("O " + nome + " está comendo...");
    }

    /**
     * Método que faz o cachorro passear
     */
    public void passear() {
        System.out.println("O " + nome + " quer passear!");
    }

    /**
     * Método que faz o cachorro dormir
     */
    public void dormir() {
        System.out.println("O " + nome + " está dormindo...");
    }

    /**
     * Método que faz o cachorro brincar
     */
    public void brincar() {
        System.out.println("O " + nome + " quer brincar!");
    }

}
