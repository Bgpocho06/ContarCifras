import java.util.Scanner;

public class ContarCifras {
    public static int contarCifras(int num) {
        if (num == 0) {
            return 1;
        }

        int contador = 0;
        int temp = Math.abs(num);

        while (temp > 0) {
            temp = temp / 10;
            contador++;
        }

        return contador;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero positivo: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Por favor, introduce un número entero positivo.");
        } else {
            int cifras = contarCifras(num);
            System.out.println("El número " + num + " tiene " + cifras + " cifra(s).");
        }

        System.out.println("Pulsa Enter para salir...");
        scanner.nextLine();
        scanner.nextLine();
        scanner.close();
    }
}