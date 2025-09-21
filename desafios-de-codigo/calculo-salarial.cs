// Para ler e escrever dados em C#, utilizamos os seguintes métodos da classe Console:
// - Console.ReadLine(): Lê UMA linha com dado(s) de Entrada (Inputs) do usuário;
// - Console.WriteLine(): Imprime um texto de Saída (Output) e pulando uma linha.

using System;

public class Desafio
{
    public static void Main()
    {
        // Lê os valores de Entrada:
        float valorSalario = float.Parse(Console.ReadLine());
        float valorBeneficios = float.Parse(Console.ReadLine());

        float valorImposto = 0;
        if (valorSalario >= 0 && valorSalario <= 1100)
        {
            valorImposto = 0.05F * valorSalario;
        }
        else if (valorSalario >= 1100.01 && valor valorSalario <= 2500) {
            valorImposto = 0.10f * valorSalario;
        }
        else (valorSalario > 2500) 
        {
            valorImposto = 0.15f * valorSalario;
        }

        //  Calcula e imprime a Saída (com 2 casas decimais):
        float saida = valorSalario - valorImposto + valorBeneficios;
        Console.WriteLine(saida.ToString("0.00"));
    }
}