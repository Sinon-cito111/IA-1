import java.util.Scanner;

public class algoritmo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese los tres números: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        int mayor, menor, medio;

        if (x > y && x > z) {
            mayor = x;
            medio = y > z ? y : z;
            menor = y < z ? y : z;
        } else if (y > z) {
            mayor = y;
            medio = x > z ? x : z;
            menor = x < z ? x : z;
        } else {
            mayor = z;
            medio = x > y ? x : y;
            menor = x < y ? x : y;
        }

        scanner.close();

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número medio es: " + medio);
        System.out.println("El número menor es: " + menor);
    }
}