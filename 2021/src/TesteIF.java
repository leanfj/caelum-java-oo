public class TesteIF {
    public static void main(String[] args) {
        System.out.println("Teste IF");
        for (int i = 0; i < 100; i++) {
            if (i > 50 && i < 60) {
                continue;
            }
            System.out.println(i);
        }
    }
}
