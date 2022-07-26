package mod_tres;
import java.util.ArrayList;
import mod_dois.Metodos;

public class Arrays {
    public static void main(String[] args) {
        ArrayList<Metodos> metodos = new ArrayList();
        
        metodos.add(new Metodos());
        metodos.add(new Metodos());
        System.out.println(metodos);
    }
}
