/**
 * Classe principal para testar a classe Cachorro
 * @author Sérgio Henrique Reis
 * @version 1.0
 * @since 1.8
 */
public class Main {
    
    /**
     * Método principal que cria e testa um cachorro
     * @param args argumentos da linha de comando (não utilizados)
     */
    public static void main(String[] args) {

        // Criando um objeto cachorro com todas as propriedades
        Cachorro cachorro = new Cachorro("Luke", "Lulu da Pomerânia", 3, "Bicolor",
                4.20, 0.23, true );

        // Testando todos os métodos de comportamento do cachorro
        cachorro.brincar();
        cachorro.comer();
        cachorro.dormir();
        cachorro.passear();
        cachorro.latir();

    }
}