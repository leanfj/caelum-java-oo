public class VerificaIdade {
    public static void main(String[] args) {
        int idade = 15;
        boolean amigoDoDono = true;

        if (idade < 18 && !amigoDoDono) {
            System.out.println("Não pode entrar!!");
        } else {
            System.out.println("Pode entrar!!");
        }

    }
}