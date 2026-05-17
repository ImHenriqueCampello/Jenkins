public class OperacoesExtras {

    public double potencia(double base, double expoente) {
        return Math.pow(base, expoente);
    }

    public double raizQuadrada(double numero) {

        if (numero < 0) {
            System.out.println("Erro: número negativo!");
            return 0;
        }

        return Math.sqrt(numero);
    }
}