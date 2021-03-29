public class ContinuTeste {
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++) {
            if (i > 50 && i < 60) {
                //break; //para no entra no if
                continue; //Não imprime o valor entre 50 a 60 entra no if pula para o proximo
            }
            System.out.println(i);
        }
    } 
}
