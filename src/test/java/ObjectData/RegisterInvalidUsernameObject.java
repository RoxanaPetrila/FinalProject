package ObjectData;

import java.util.HashMap;

public class RegisterInvalidUsernameObject {

    private String regUsernameValue;
    private String regEmailValue;
    private String regPasswordValue;

    private String invalidUsernameError;

    public RegisterInvalidUsernameObject (HashMap<String, String> testData){
        populateObject(testData);
    }

    public void populateObject(HashMap<String, String> testData){
        for(String key: testData.keySet()){
            switch (key){
                case "regUsernameValue":
                    setRegUsernameValue(testData.get(key));
                    break;
                case "regEmailValue":
                    setRegEmailValue(testData.get(key));
                    break;
                case "regPasswordValue":
                    setRegPasswordValue(testData.get(key));
                    break;
                case "invalidUsernameError":
                    setInvalidUsernameError(testData.get(key));
                    break;
            }
        }

    }

    public String getRegUsernameValue() {
        return regUsernameValue;
    }

    public void setRegUsernameValue(String regUsernameValue) {
        this.regUsernameValue = regUsernameValue;
    }

    public String getRegEmailValue() {
        return regEmailValue;
    }

    public void setRegEmailValue(String regEmailValue) {
        this.regEmailValue = regEmailValue;
    }

    public String getRegPasswordValue() {
        return regPasswordValue;
    }

    public void setRegPasswordValue(String regPasswordValue) {
        this.regPasswordValue = regPasswordValue;
    }

    public String getInvalidUsernameError() {
        return invalidUsernameError;
    }

    public void setInvalidUsernameError(String invalidUsernameError) {
        this.invalidUsernameError = invalidUsernameError;
    }
}
