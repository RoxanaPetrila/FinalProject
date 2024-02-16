package ObjectData;

import java.util.HashMap;

public class AddItemToCartObject {

    private String expectedMessage;

    public AddItemToCartObject (HashMap<String, String> testData){
        populateObject(testData);
    }

    private void populateObject(HashMap<String, String> testData) {
        for (String key : testData.keySet()) {
            switch (key) {
                case "expectedMessage":
                    setExpectedMessage(testData.get(key));
                    break;
            }
        }
    }


    public String getExpectedMessage() {
        return expectedMessage;
    }

    public void setExpectedMessage(String expectedMessage) {
        this.expectedMessage = expectedMessage;
    }
}
