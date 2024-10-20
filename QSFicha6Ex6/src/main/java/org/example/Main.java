package org.example;

public class Main {
    public double mediaDigitos(int numero) {
        int soma = 0;
        int contador = 0;
        int num = Math.abs(numero); // Garantir que o número é positivo para contar os dígitos corretamente

        // Loop para extrair cada dígito do número
        while (num > 0) {
            int digito = num % 10; // Obtém o último dígito
            soma += digito; // Soma dos dígitos
            contador++; // Incrementa o contador de dígitos
            num /= 10; // Remove o último dígito
        }

        // Retorna a média dos dígitos
        if (contador == 0) {
            return 0; // Se o número for 0
        }
        return (double) soma / contador;
    }
}