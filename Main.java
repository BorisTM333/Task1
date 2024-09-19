import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz kartę graficzną");
        String[] tab = new String[10];
        tab[0] = "NVIDIA GeForce GTX 1060";
        tab[1] = "NVIDIA GeForce RTX 2060";
        tab[2] = "NVIDIA GeForce RTX 3060";
        tab[3] = "NVIDIA GeForce RTX 4060";
        tab[4] = "NVIDIA GeForce GTX 1080 Ti";
        tab[5] = "NVIDIA GeForce RTX 2080 Ti";
        tab[6] = "NVIDIA GeForce RTX 3090";
        tab[7] = "NVIDIA GeForce RTX 4090";
        tab[8] = "NVIDIA GeForce GTX 1080";
        tab[9] = "NVIDIA GeForce RTX 2080";

        System.out.println("Wybierz numer karty graficznej (od 1 do 10):");
        int num = scanner.nextInt();

        if (num < 1 || num > 10) {
            System.out.println("Nieprawidłowy numer karty. Wprowadź numer od 1 do 10.");
        } else {
            System.out.println(tab[num - 1]);
        }
        scanner.close();
    }
}