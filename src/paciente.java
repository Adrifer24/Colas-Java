// GitHub: Adrifer24
public class paciente {
    private String nombre;
    private int edad;
    private int idEspecialidad;
    private String gravedad;


    // Constructor
    public paciente(String nombre, int edad, int idEspecialidad, String gravedad) {
        this.nombre = nombre;
        this.edad = edad;
        this.idEspecialidad = idEspecialidad;
        this.gravedad = gravedad;
    }


    // GET
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}
