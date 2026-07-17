
// se declara la clase hija
public class EstudianteInternacional extends estudiante {

    //se declaran las atributos de la clase hija
    private String paisOrigen;

    public EstudianteInternacional(String nombre, int edad, String matricula, String materia, String paisOrigen) {

        super(nombre, edad, matricula, materia);
        this.paisOrigen = paisOrigen;
    }

    public void mostrarPais() {
        System.out.println("El estudiante " + nombre + " proviene de: " + paisOrigen);
    }
    //se indica que se va a sobre escribir en la clase padre
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("País de Origen: " + paisOrigen);
        System.out.println("---------------------------");
    }
}