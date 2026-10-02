public interface Estudiante {
    String nombre ();
    int codigo ();
    String direccion ();

    String identifiable ();
    String escribir ();

    public class Estudiante {


        // Constructor con parámetro
        public Estudiante(String nombre) {
            this.nombre = nombre;
        }
    }


}



