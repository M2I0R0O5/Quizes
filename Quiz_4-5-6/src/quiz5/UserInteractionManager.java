package quiz5;

import java.util.HashMap;
import java.util.Map;

public class UserInteractionManager {
    private CommunicationManager communicationManager;

    public UserInteractionManager(CommunicationManager communicationManager) {
        this.communicationManager = communicationManager;
    }

    public void interactWithUser(String apiKey, String question, String location, String date) {
        Map<String, String> requestData = new HashMap<>();
        requestData.put("apiKey", apiKey);
        requestData.put("question", question);
        requestData.put("location", location);
        if (date != null && !date.isEmpty()) {
            requestData.put("date", date);
        }

        String response = communicationManager.sendRequest(requestData);
        System.out.println("Chatbot response: " + response);
    }
}