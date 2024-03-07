public class Calc {
    //Calculadora via args
    public static void main(String[] args) {
        Double x = Double.parseDouble(args[0]);
        Double y = Double.parseDouble(args[2]);
        Double res = 0.0;
        switch (args[1]) {
            case "+":
                res = somar(x, y);

                break;
            case "-":
                res = subtrair(x, y);

                break;
            case "x":
                res = multiplicar(x, y);

                break;
            case "/":
                res = somar(x, y);

                break;
 
            default: System.out.println("operação invalida");
                break;

        }
        System.out.println("Resultado: "+res);
    }

    public static double somar(Double x, Double y) {
        return x + y;

    }

    public static double subtrair(Double x, Double y) {
        return x - y;

    }

    public static double multiplicar(Double x, Double y) {
        return x * y;

    }

    public static double dividir(Double x, Double y) {
        if (y == 0) {
            return 0;
        } else
            return x / y;

    }
}
