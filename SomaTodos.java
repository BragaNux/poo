import java.util.Scanner;

public class SomaTodos
{
    public static void main(String[] args)
    {
        System.out.println("Digite o número para ser somado: ");
        Scanner input = new Scanner(System.in);
        int entrada = input.nextInt();


        int soma = 0;

        for (int i = 0; i <= entrada; i++)
        {
            soma = soma + i;
        
        }
        System.out.println("Somado! * " + soma);
    }
}