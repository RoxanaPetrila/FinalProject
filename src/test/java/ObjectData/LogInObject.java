package ObjectData;

import java.util.HashMap;

public class LogInObject {

    private String usernameValue;
    private String passwordValue;
    private String expectedMessage;


    public LogInObject (HashMap<String, String> testData){
        populateObject(testData);
    }

    private void populateObject(HashMap<String, String> testData) {
        for (String key : testData.keySet()) {
            switch (key) {
                case "usernameValue":
                    setUsernameValue(testData.get(key));
                    break;
                case "passwordValue":
                    setPasswordValue(testData.get(key));
                    break;
                case "expectedMessage":
                    setExpectedMessage(testData.get(key));
                    break;
            }
        }
    }

    public String getUsernameValue() {
        return usernameValue;
    }

    public void setUsernameValue(String usernameValue) {
        this.usernameValue = usernameValue;
    }

    public String getPasswordValue() {
        return passwordValue;
    }

    public void setPasswordValue(String passwordValue) {
        this.passwordValue = passwordValue;
    }

    public String getExpectedMessage() {
        return expectedMessage;
    }

    public void setExpectedMessage(String expectedMessage) {
        this.expectedMessage = expectedMessage;
    }
}
