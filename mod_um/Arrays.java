package mod_um;

public class Arrays {
    public static void main(String[] args) {
        int[] arrayInt = {1,2,3};
        String[][][] stringArray = {{{"edmario", "marrios"}, {"teste"}}};        
        float[] floatArray = {1,3,4};

        for (String f : stringArray[0][0]) {
            System.out.println(f);
        }
    }
}
