import java.util.Scanner;

public class Fibo
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número do fibo: ");
        int entrada = input.nextInt();

        System.out.println(entrada);

        int qtd = entrada;

        int contador = 0;
        long v1 = 0;
        long v2 = 1;
        System.out.println(v1);
        System.out.println(v2);

        while (contador < qtd)
        {
            long aux = v2;
            v2 = v1 + v2;
            v1 = aux;
            System.out.println(v2);
            contador++;
        }
    }
}