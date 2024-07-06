public class CurrencyConverter {
    private ApiClient apiClient;

    public CurrencyConverter(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public double convert(double amount, String fromCurrency, String toCurrency) throws Exception {
        ExchangeRateRecord exchangeRateRecord = apiClient.getExchangeRate(fromCurrency, toCurrency, amount);
        return exchangeRateRecord.conversion_result();
    }
}
