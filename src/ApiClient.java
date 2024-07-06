import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiClient {
    private Gson gson;
    private HttpClient httpClient;

    public ApiClient() {
        this.gson = new Gson();
        this.httpClient = HttpClient.newHttpClient();
    }

    public ExchangeRateRecord getExchangeRate(String fromCurrency, String toCurrency, double amount) throws Exception {
        String urlStr = ApiConfig.getApiUrl() + ApiConfig.getApiKey() + "/pair/" + fromCurrency + "/" + toCurrency + "/" + amount;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(urlStr))
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() != 200) {
            throw new RuntimeException("HTTP error code : " + response.statusCode());
        }

        ExchangeRateRecord exchangeRateRecord = gson.fromJson(response.body(), ExchangeRateRecord.class);
        return exchangeRateRecord;
    }
}
