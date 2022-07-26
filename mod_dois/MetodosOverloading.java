package mod_dois;

public class MetodosOverloading {
    public static void main(String[] args) {
        teste(1); //Chamando int
        teste(1d); //Chamando double
    }
   
    // COm sobercarga de metodos, uma clase pode ter varios metodos com nome igual mas com parametros de tipos diferentes
    public static int teste(int ha){
        System.out.println("chamando int");
        return ha;
    }

    public static double teste(double ha){
        System.out.println("Chamando double");
        return ha;
    }
}
