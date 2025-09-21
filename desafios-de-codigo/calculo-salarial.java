// Para ler e escrever dados em Java, padronizaremos da seguinte forma:
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println(): imprime um texto de Saída (Output) e pulando linha.

import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        // Lê os valores de Entrada:
        Scanner leitorDeEntradas = new Scanner(System.in);
        float valorSalario = leitorDeEntradas.nextFloat();
        float valorBeneficios = leitorDeEntradas.nextFloat();

        float valorImposto = 0;
        if (valorSalario >= 0 && valor valorSalario <= 1100) {
            // Atriui a aliquota de 5% mediante o salário:
            valorImposto = 0.05f * valorSalario;
        }
        else if (valorSalario >= 1100.01 && valor valorSalario <= 2500) {
            // Atriui a aliquota de 10% mediante o salário:
            valorImposto = 0.10f * valorSalario;
        }
        else (valorSalario > 2500) {
            // Atriui a aliquota de 15% mediante o salário:
            valorImposto = 0.15f * valorSalario;
        }
    // TODO Criar as demais condicoes para as aliquotas de 10% e 15%

    // Calcula e imprime a Saída (com 2 casas decimais):
    float saida = valorSalario - valorImposto + valorBeneficios;
    System.out.println(String.format("%.2f", saida));
    }
}