import java.util.ArrayList;
import java.util.List;

public class Piramidais {
    public static void main(String[] args) 
    {
        List<Integer> numerosPiramidais = new ArrayList<>();
        int count = 0;
        int numero = 2;

        while (count < 100) 
        {
            if (isPrimo(numero) && isPrimo(numero + 2) && isPrimo(numero + 4)) 
            {
                int piramidal = numero + (numero + 2) + (numero + 4);
                numerosPiramidais.add(piramidal);
                count++;
            }
            numero++;
        }

        System.out.println("Os cem primeiros números piramidais são:");
        for (int piramidal : numerosPiramidais) 
        {
            System.out.println(piramidal);
        }
    }

    public static boolean isPrimo(int numero) 
    {
        if (numero < 2) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) 
        {
            if (numero % i == 0) return false;
        }
        return true;
    }
}