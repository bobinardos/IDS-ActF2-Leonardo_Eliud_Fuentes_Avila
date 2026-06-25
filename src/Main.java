
public class Main {

    //Aqui incia el programa
    public static void main(String[] args) {

        //Se crean nuevos objetos a partir de la clase "estudiante"
        estudiante estudiante1 = new estudiante("Ana Lopez", 20, "A010203","Matematicas");
        estudiante estudiante2 = new estudiante("Carlos Ruiz", 22, "A090807","Español");
        estudiante estudiante3 = new estudiante("Jose Madero",25,"1234567","Derecho");

        //Simplemente se imprimen los detalles de cada objeto
        System.out.println("Lista de Estudiantes Registrados:");
        estudiante1.mostrarDetalles();
        estudiante2.mostrarDetalles();
        estudiante3.mostrarDetalles();

    }
}