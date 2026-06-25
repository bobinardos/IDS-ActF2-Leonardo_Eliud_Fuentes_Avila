
// Aqui se declara la clase principal
public class estudiante {

    //Se declara cada atributo del objeto
    private String nombre;
    private int edad;
    private String matricula;
    private String materia;

    //se inicializan los atributos cuando se crea un nuevo objeto de clase estudiante
    public estudiante(String nombre, int edad, String matricula, String materia) {
        this.nombre = nombre;
        this.edad = edad;
        this.matricula = matricula;
        this.materia = materia;
    }

    //Es el comportamiento de como se mostraran los datos del objeto
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Materia: " + materia);
        System.out.println("---------------------------");
    }
}
