package ObjectData;

import java.util.HashMap;

public class AddItemToWishlistObject {

    private String textValue;

    public String getTextValue() {
        return textValue;
    }

    public void setTextValue(String textValue) {
        this.textValue = textValue;
    }

    public AddItemToWishlistObject(HashMap<String, String> testData){
        populateObject(testData);

    }

    private void populateObject(HashMap<String, String> testData){
        for (String key: testData.keySet()){
            switch (key){
                case "textValue":
                    setTextValue(testData.get(key));
                    break;
            }
        }
    }
}
