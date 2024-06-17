import quiz5.*;
import quiz6.*;

public class Main {
    public static void main(String[] args) {
        // Test with dummy manager
        CommunicationManager dummyManager = new DummyCommunicationManager();
        UserInteractionManager userInteractionManager = new UserInteractionManager(dummyManager);
        userInteractionManager.interactWithUser("dummyApiKey", "What's the current weather?", "Tbilisi", null);

        // Test with special communication manager
        CommunicationManager specialManager = new SpecialCommunicationManager("http://commonservice.com", "http://specialservice.com");
        userInteractionManager = new UserInteractionManager(specialManager);
        userInteractionManager.interactWithUser("realApiKey", "What's the temperature?", "Batumi", null);
        userInteractionManager.interactWithUser("realApiKey", "help me with the weather forecast", "Zugdidi", "2024-06-18");
    }
}
