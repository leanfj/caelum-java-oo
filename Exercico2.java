//2. Imprima a soma de 1 até 1000. 0 + 1 + 2 + 3 + 4 + 5 = 15
public class Exercico2 {
    public static void main(String[] args) {
        int soma = 0;
        for(int i = 0; i <= 1000; i++){
            soma = soma + i;
            System.out.println(soma);
        }

    }
}
