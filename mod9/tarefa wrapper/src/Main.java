public class Main {
    public static void main(String[] args) {
        // Casting implícito seguro (sem perda de dados) - ordem crescente de tamanho
        byte valorByte = 100; // 8 bits (menor)
        short valorShort = valorByte; // byte (8 bits) para short (16 bits) - short é maior
        int valorInteiro = valorShort; // short (16 bits) para int (32 bits) - int é maior
        long valorLongo = valorInteiro; // int (32 bits) para long (64 bits) - long é maior
        float valorFlutuante = valorLongo; // long (64 bits) para float (32 bits) - float é menor mas aceita
        double valorDecimal = valorFlutuante; // float (32 bits) para double (64 bits) - double é maior
        
        System.out.println("Casting implícito (ordem crescente de tamanho):");
        System.out.println("Byte (8 bits): " + valorByte);
        System.out.println("Short (16 bits): " + valorShort);
        System.out.println("Int (32 bits): " + valorInteiro);
        System.out.println("Long (64 bits): " + valorLongo);
        System.out.println("Float (32 bits): " + valorFlutuante);
        System.out.println("Double (64 bits): " + valorDecimal);
        
        // Casting explícito (pode perder dados)
        double numeroComDecimais = 123.45; // double (64 bits) - maior
        int numeroSemDecimais = (int) numeroComDecimais; // double para int (32 bits) - int é menor
        
        System.out.println("Casting explícito (pode perder dados):");
        System.out.println("Número com decimais: " + numeroComDecimais);
        System.out.println("Número sem decimais: " + numeroSemDecimais);
        
        // Autoboxing (primitivo para wrapper automático)
        Integer wrapperInteiro = valorInteiro; // int (32 bits) para Integer (wrapper)
        System.out.println("Autoboxing:");
        System.out.println("Wrapper inteiro: " + wrapperInteiro);
        
        // Unboxing (wrapper para primitivo automático)
        int primitivoInteiro = wrapperInteiro; // Integer (wrapper) para int (32 bits)
        System.out.println("Unboxing:");
        System.out.println("Primitivo inteiro: " + primitivoInteiro);
    }
}