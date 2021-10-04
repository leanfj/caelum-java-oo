public class CalculaGastos {
    public static void main(String[] args) {
        System.out.println("Calcula Gastos");
        double gastosJaneiro = 15000;
        double gastosFevereiro = 23000;
        double gastosMarco = 17000;

        double gastoTotalTrimestral = gastosJaneiro + gastosFevereiro + gastosMarco;
        System.out.println("Gastos totais do trimestres => " + gastoTotalTrimestral);

        double media = gastoTotalTrimestral / 3;
        System.out.println("Média dos gastos trimestrais => " + media);
    }
}
