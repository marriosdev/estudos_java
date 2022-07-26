package mod_um;

public class Variaveis {
    public static void main (String[] args){
        // Tipos de dados
        // Float armazena numero com ponto flutuante 1.43
        // Char armazena apenas 1 caracter "a", "b"
        // String armazena textos "Meu nome é Edmário"
        // Boolean Armazena valores true ou false
        // byte	8 bits	-128 a 127
        //  short	16 bits	-32.768 a 32.767
        // int	32 bits	-2.147.483.648 a 2.147.483.647
        // long	64 bits	-9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
        // Declarando variaveis 

        int inteiro = 12;
        float comPontoFlutuante = 1.0f;
        double doubleNumero = 1.0;
        byte nByte = 123;
        short nShort = 12312;
        long nLong = 12L;
        char umaCaracter = 'e';
        String texto = "Olá mundo";

        System.out.println(nLong - nByte);

        // Concatenando variaveis
        System.out.println(umaCaracter + texto);
    }  
}
