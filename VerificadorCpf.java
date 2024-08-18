import java.util.Scanner;

public class VerificadorCpf 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite os 9 primeiros dígitos do CPF: ");
        String cpf = scanner.nextLine();

        if (cpf.length() != 9 || !cpf.matches("\\d{9}")) 
        {
            System.out.println("CPF deve ter exatamente 9 dígitos.");
        } 
        else 
        {
            int j = calculaPrimeiroDigito(cpf);

            int k = calculaSegundoDigito(cpf, j);

            System.out.println("Os dígitos verificadores são: " + j + "" + k);
        }
        scanner.close();
    }

    public static int calculaPrimeiroDigito(String cpf) 
    {
        int soma = 0;

        // Cálculo: 10a + 9b + 8c + 7d + 6e + 5f + 4g + 3h + 2i
        for (int i = 0; i < 9; i++) 
        {
            int digito = Character.getNumericValue(cpf.charAt(i));
            soma += digito * (10 - i);
        }

        int resto = soma % 11;
        if (resto == 0 || resto == 1) 
        {
            return 0;
        } else {
            return 11 - resto;
        }
    }

    public static int calculaSegundoDigito(String cpf, int primeiroDigito) 
    {
        int soma = 0;

        // Cálculo: 11a + 10b + 9c + 8d + 7e + 6f + 5g + 4h + 3i + 2j
        for (int i = 0; i < 9; i++) {
            int digito = Character.getNumericValue(cpf.charAt(i));
            soma += digito * (11 - i);
        }

        // Adiciona o primeiro dígito verificador no cálculo
        soma += primeiroDigito * 2;

        int resto = soma % 11;
        if (resto == 0 || resto == 1) 
        {
            return 0;
        } else {
            return 11 - resto;
        }
    }
}