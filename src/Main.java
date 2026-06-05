import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArbolInventario inventario =
                new ArbolInventario();

        int opcion;

        do {

            System.out.println("\n=== TREE STOCK ===");
            System.out.println("1. Registrar producto");
            System.out.println("2. Mostrar inventario");
            System.out.println("3. Buscar producto");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");

            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print(
                            "Ingrese ID: ");
                    int id =
                            teclado.nextInt();
                    teclado.nextLine();

                    System.out.print(
                            "Ingrese nombre: ");
                    String nombre =
                            teclado.nextLine();

                    inventario.insertar(
                            id,
                            nombre);

                    System.out.println(
                            "Producto registrado");

                    break;

                case 2:

                    inventario.mostrarInventario();

                    break;

                case 3:

                    System.out.print(
                            "Ingrese ID a buscar: ");

                    int buscar =
                            teclado.nextInt();

                    Producto encontrado =
                            inventario.buscar(
                                    buscar);

                    if (encontrado != null) {

                        System.out.println(
                                "Producto encontrado");

                        System.out.println(
                                "ID: "
                                        + encontrado.id);

                        System.out.println(
                                "Nombre: "
                                        + encontrado.nombre);
                    }

                    else {

                        System.out.println(
                                "Producto no encontrado");
                    }

                    break;

                case 0:

                    System.out.println(
                            "Saliendo...");

                    break;

                default:

                    System.out.println(
                            "Opcion invalida");
            }

        } while (opcion != 0);

        teclado.close();
    }
}