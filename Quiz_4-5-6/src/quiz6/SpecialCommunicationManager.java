package quiz6;

import quiz5.CommunicationManager;

import java.util.Map;

public class SpecialCommunicationManager implements CommunicationManager {
    private final String commonServiceUrl;
    private final String specialServiceUrl;

    public SpecialCommunicationManager(String commonServiceUrl, String specialServiceUrl) {
        this.commonServiceUrl = commonServiceUrl;
        this.specialServiceUrl = specialServiceUrl;
    }

    @Override
    public String sendRequest(@org.jetbrains.annotations.NotNull Map<String, String> requestData) {
        String url = commonServiceUrl;

        // Check if the message contains "help"
        if (requestData.get("question").toLowerCase().contains("help")) {
            url = specialServiceUrl;
        }

        // Simulating a REST API call
        return simulateApiCall(url, requestData);
    }

    private String simulateApiCall(String url, Map<String, String> requestData) {
        return "Simulated response from " + url + " with data: " + requestData.toString();
    }
}
