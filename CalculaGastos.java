public class CalculaGastos {
    public static void main(String[] args) {
        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;

        int gastoTotal;

        gastoTotal = gastosJaneiro + gastosFevereiro + gastosMarco ;

        System.out.println(gastoTotal);

        double mediaTrimestral;

        mediaTrimestral = gastoTotal / 3;

        System.out.println(mediaTrimestral);

    }
}
