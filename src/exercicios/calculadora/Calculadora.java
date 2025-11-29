// Exercício 2 (corrigido) da P2 da disciplina de POO do professor Alexandre Mello Ferreira do curso de ADS matutino da Fatec Campinas

package exercicios.calculadora;

public class Calculadora {

    public static abstract class Operacao {
        public abstract double calcular(double a, double b);
    }

    public static class Soma extends Operacao {
        @Override
        public double calcular(double a, double b) {
            double c = a + b;
            return c;
        }
    }

    public static class Divisao extends Operacao {
        @Override
        public double calcular(double a, double b) {
            if (b == 0) {
                throw new ArithmeticException("Erro: Divisão por zero não é permitida.");
            } else {
                double c = a / b;
                return c;
            }
        }
    }

    public static double executarOperacao(Operacao op, double a, double b) {
        double resultado = op.calcular(a, b);
        System.out.println("Resultado: " + resultado);
        return resultado;
    }

    public static void main(String[] args) {
        Operacao s1 = new Soma();
        Operacao d1 = new Divisao();

        double a = 10;
        double b = 5;
        double c = 0.0;

        try {
            executarOperacao(s1, a, b);
            executarOperacao(d1, a, b);
            executarOperacao(d1, a, c);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

}
