package mod_tres;

public class Construtores {
    
    public String nome; // Atributo publico da classe
    
    public static void main(String[] args) {
        Construtores obj = new Construtores("eu");
        obj.imprimeNome();
    }

    //  Construtores devem ter o nome da propria classe
    public  Construtores(String nomeParam)
    {
        nome = nomeParam;
    }

    public String imprimeNome()
    {
        System.out.println("teste");

        System.out.println(nome);
        return nome;
    }
}
