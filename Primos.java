public class Primos
{
    public static void main(String[] args)
    {
        int contador = 0;
        int x = 1;
        
        while (contador < 10)
        {
            int cont = 0;
            for (int i = 1; i < x; i++)
            {
                if (x % i == 0)
                cont++;
            }
            if (cont == 1)
            {
                System.out.println(x);
                contador++;
            }
            x++;
        }
    }
}