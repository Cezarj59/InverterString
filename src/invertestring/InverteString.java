package invertestring;

import java.util.Scanner;

public class InverteString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a entrada da string
        System.out.println("Digite uma string para ser invertida:");
        String input = scanner.nextLine();

        // Converte a string para um array de caracteres
        char[] charArray = input.toCharArray();

        // Inverte os caracteres do array
        for (int i = 0, j = charArray.length - 1; i < j; i++, j--) {
            char temporario = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temporario;
        }

        // Converte o array de caracteres de volta para uma string
        String output = new String(charArray);

        // Exibe a string invertida
        System.out.println("A string invertida é: " + output);
    }
}
