import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ApiClient apiClient = new ApiClient();
        CurrencyConverter converter = new CurrencyConverter(apiClient);

        System.out.println("************************************************");
        System.out.println("Bienvenido a nuestro Conversor de Moneda :)");
        System.out.println("");
        System.out.println("Seleccione la opción deseada:");
        System.out.println("1) --> Dólar a Peso Argentino");
        System.out.println("2) --> Peso Argentino a Dolar");
        System.out.println("3) --> Dólar a Real Brasileño");
        System.out.println("4) --> Real Brasileño a Dólar");
        System.out.println("5) --> Dólar a Peso Colombiano");
        System.out.println("6) --> Peso Colombiano a Dólar");
        System.out.println("7) --> Salir");
        System.out.println("************************************************");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Elija una opción valida:");
        String opcion = scanner.next();
        String fromCurrency = "";
        String toCurrency = "";

        switch (opcion) {
            case "1":
                fromCurrency = "USD";
                toCurrency = "ARS";
                break;

            case "2":
                fromCurrency = "ARS";
                toCurrency = "USD";
                break;

            case "3":
                fromCurrency = "USD";
                toCurrency = "BRL";
                break;

            case "4":
                fromCurrency = "BRL";
                toCurrency = "USD";
                break;

            case "5":
                fromCurrency = "USD";
                toCurrency = "COP";
                break;

            case "6":
                fromCurrency = "COP";
                toCurrency = "USD";
                break;

            case "7":
                System.out.println("Gracias por utilizar nuestros Servicios");
                System.out.println("Hasta Pronto!");
                return;


            default:
                System.out.println("Opción invalida!");
                return;
        }

        System.out.println("Convertir de " + fromCurrency + " a " + toCurrency);
        System.out.println("Digite valor en " + fromCurrency );
        double amount = scanner.nextDouble();

        try {
            double convertedAmount = converter.convert(amount, fromCurrency, toCurrency);
            System.out.println(amount + " " + fromCurrency + " son " + convertedAmount + " " + toCurrency);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


    }
}
