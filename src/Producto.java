public class Producto {

    int id;
    String nombre;

    Producto izquierdo;
    Producto derecho;

    public Producto(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;

        izquierdo = null;
        derecho = null;
    }
}