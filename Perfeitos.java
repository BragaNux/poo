import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/// Coloquei 4 inputs, pois >= 5 o código fica lento.

public class Perfeitos {
    public static void main(String[] args) 
    {
        int cont = 0;
        List<Long> listaDePerfeitos = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while (cont < 4) 
        {
            System.out.println("Informe um número: ");
            long numero = input.nextLong();

            if (isNumeroPerfeito(numero)) 
            {
                listaDePerfeitos.add(numero);
                cont++;
                System.out.println(numero + " é um número perfeito!");
            } 
            else 
                System.out.println(numero + " não é um número perfeito.");
        }

        long menorNumeroPerfeito = listaDePerfeitos.get(0);

        for (Long numero : listaDePerfeitos) 
        {
            if (numero < menorNumeroPerfeito) 
            {
                menorNumeroPerfeito = numero;
            }
        }

        System.out.println("O menor número perfeito informado foi: " + menorNumeroPerfeito);

        input.close();
    }

    public static boolean isNumeroPerfeito(long numero) 
    {
        long somaDivisores = 0;

        for (long i = 1; i <= numero / 2; i++) 
        {
            if (numero % i == 0) 
            {
                somaDivisores += i;
            }
        }

        return somaDivisores == numero;
    }
}