
// se declara la clase hija
public class EstudianteBecado extends estudiante {

    //se declaran las atributos de la clase hija
    private double porcentajeDeBeca;

    public EstudianteBecado (String nombre, int edad,String matricula, String materia, double porcentajeDeBeca){

        super(nombre, edad, matricula, materia);
        this.porcentajeDeBeca = porcentajeDeBeca;
    }


    //se indica que se va a sobre escribir en la clase padre
    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Porcentaje de Beca: " + porcentajeDeBeca + "%");
        System.out.println("---------------------------");
    }
}














