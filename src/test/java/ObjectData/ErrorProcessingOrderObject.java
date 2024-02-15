package ObjectData;

import java.util.HashMap;

public class ErrorProcessingOrderObject {

    private String firstNameValue;
    private String lastNameValue;
    private String countryValue;
    private String addressValue;
    private String addressValue2;
    private String townValue;
    private String stateValue;
    private String postalCodeValue;
    private String phoneValue;
    private String emailValue;
    private String usernameValue;
    private String passwordValue;
    private String expectedMessage;

    public ErrorProcessingOrderObject (HashMap<String, String> testData){
        populateObject(testData);
    }

    //A method which maps values from properties to variables from this class

    private void populateObject(HashMap<String, String> testData){
        for (String key: testData.keySet()){
            switch (key){
                case "firstNameValue":
                    setFirstNameValue(testData.get(key));
                    break;
                case "lastNameValue":
                    setLastNameValue(testData.get(key));
                    break;
                case "countryValue":
                    setCountryValue(testData.get(key));
                    break;
                case "addressValue":
                    setAddressValue(testData.get(key));
                    break;
                case "addressValue2":
                    setAddressValue2(testData.get(key));
                    break;
                case "townValue":
                    setTownValue(testData.get(key));
                    break;
                case "stateValue":
                    setStateValue(testData.get(key));
                    break;
                case "postalCodeValue":
                    setPostalCodeValue(testData.get(key));
                    break;
                case "phoneValue":
                    setPhoneValue(testData.get(key));
                    break;
                case "emailValue":
                    setEmailValue(testData.get(key));
                    break;
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

    public String getFirstNameValue() {
        return firstNameValue;
    }

    public void setFirstNameValue(String firstNameValue) {
        this.firstNameValue = firstNameValue;
    }

    public String getLastNameValue() {
        return lastNameValue;
    }

    public void setLastNameValue(String lastNameValue) {
        this.lastNameValue = lastNameValue;
    }

    public String getCountryValue() {
        return countryValue;
    }

    public void setCountryValue(String countryValue) {
        this.countryValue = countryValue;
    }

    public String getAddressValue() {
        return addressValue;
    }

    public void setAddressValue(String addressValue) {
        this.addressValue = addressValue;
    }

    public String getAddressValue2() {
        return addressValue2;
    }

    public void setAddressValue2(String addressValue2) {
        this.addressValue2 = addressValue2;
    }

    public String getTownValue() {
        return townValue;
    }

    public void setTownValue(String townValue) {
        this.townValue = townValue;
    }

    public String getStateValue() {
        return stateValue;
    }

    public void setStateValue(String stateValue) {
        this.stateValue = stateValue;
    }

    public String getPostalCodeValue() {
        return postalCodeValue;
    }

    public void setPostalCodeValue(String postalCodeValue) {
        this.postalCodeValue = postalCodeValue;
    }

    public String getPhoneValue() {
        return phoneValue;
    }

    public void setPhoneValue(String phoneValue) {
        this.phoneValue = phoneValue;
    }

    public String getEmailValue() {
        return emailValue;
    }

    public void setEmailValue(String emailValue) {
        this.emailValue = emailValue;
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
