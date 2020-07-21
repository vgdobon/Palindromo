import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una palabra y te digo si es un palindromo");
        String palabra = sc.nextLine();

        Palindromo miPalindromo = new Palindromo(palabra);
        if(miPalindromo.comprobar()){
            System.out.println("La palabra"+ palabra +" es un palindromo.");
        }else{
            System.out.println("La palabra"+ palabra +" no es un palindromo.");
        }
    }
}
