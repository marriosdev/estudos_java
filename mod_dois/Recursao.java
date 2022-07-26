package mod_dois;

public class Recursao {
    public static void main(String[] args) {
        chama(10);
    }

    static float chama(float number) {
        System.out.println("Teste");
        return 1;
    }

    static int chama(int num){
        System.out.println(num);
        num -= 1;
        if(num <= 0){
            return 0;
        }else{
            return chama(num);
        }
    }
}
