package quiz5;

import java.util.Map;

public class DummyCommunicationManager implements CommunicationManager {
    @Override
    public String sendRequest(Map<String, String> requestData) {
        return "The current weather in Tbilisi is 30°C with clear skies..";
    }
}