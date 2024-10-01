import java.util.Scanner;

public class SistemaReservaVuelos {
    public static void main(String[] args) {
        boolean[][] asientos = new boolean[10][6];
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Mostrar asientos disponibles");
            System.out.println("2. Reservar asiento");
            System.out.println("3. Cancelar reserva");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = sc.nextInt();

            if (opcion == 1) {
                // Mostrar asientos
                System.out.println("\nEstado de los asientos:");
                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 6; j++) {
                        System.out.print(asientos[i][j] ? "X " : "O ");
                    }
                    System.out.println();
                }
            } else if (opcion == 2) {
                // Reservar asiento
                System.out.print("Ingrese fila (1-10): ");
                int fila = sc.nextInt() - 1;
                System.out.print("Ingrese número de asiento (1-6): ");
                int asiento = sc.nextInt() - 1;

                if (fila >= 0 && fila < 10 && asiento >= 0 && asiento < 6) {
                    if (!asientos[fila][asiento]) {
                        asientos[fila][asiento] = true;
                        System.out.println("Asiento reservado con éxito");
                    } else {
                        System.out.println("El asiento ya está ocupado");
                    }
                } else {
                    System.out.println("Asiento no válido");
                }
            } else if (opcion == 3) {
                // Cancelar reserva
                System.out.print("Ingrese fila (1-10): ");
                int fila = sc.nextInt() - 1;
                System.out.print("Ingrese número de asiento (1-6): ");
                int asiento = sc.nextInt() - 1;

                if (fila >= 0 && fila < 10 && asiento >= 0 && asiento < 6) {
                    if (asientos[fila][asiento]) {
                        asientos[fila][asiento] = false;
                        System.out.println("Reserva cancelada con éxito");
                    } else {
                        System.out.println("El asiento no estaba reservado");
                    }
                } else {
                    System.out.println("Asiento no válido");
                }
            } else if (opcion == 4) {
                break;
            } else {
                System.out.println("Opción no válida");
            }
        }
        sc.close();
    }
}
