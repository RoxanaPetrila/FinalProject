package Pages;

import Logger.LoggerUtility;
import ObjectData.AddItemToWishlistObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MyWishlistPage extends BasePage {

    public MyWishlistPage(WebDriver driver) {
        super(driver);
    }
    //elementele din pagina de wishlist
    //tabelul in wishlist cu numele /numarul de linii al tabelului cu produsele


    //gasesti capul de tabel
    @FindBy(css = ".nobr")
    private List<WebElement> tableHeadElements;

    //gaesti body-ul tabelului cand e gol
    @FindBy(css = ".wishlist-empty")
    private WebElement emptyTableBody;

    @FindBy(xpath = "//span[@property='itemListElement']/a[@class='home']")
    private WebElement backToDashboard;

    @FindBy(css= ".wishlist-items-wrapper")
    private WebElement notEmptyTableBody;

    @FindBy(xpath = "//td[@class='product-remove']")
    private WebElement removeProductIcon;

    public void validateEmptyBodyMessage(AddItemToWishlistObject addItemToWishlistObject){
        elementMethods.validateElementMessage(emptyTableBody, addItemToWishlistObject.getTextValue());
        LoggerUtility.info("Checking no entry in table. Validate text " + addItemToWishlistObject.getTextValue() + " is visible");
    }
    public void returnToDashboard(){
        elementMethods.clickElement(backToDashboard);
        LoggerUtility.info("User returns to Dashboard page.");
    }

    //table body elements are visible
    public void tableBodyVisible(){
        elementMethods.scrollByPixels(0,480);
        elementMethods.validateElementVisible(notEmptyTableBody);
        LoggerUtility.info("Validate that table body is not empty and added elements are visible.");
    }

    //validate icons to remove added elements from the table is visible

    public void removeIconVisible(){
        elementMethods.validateElementVisible(removeProductIcon);
        LoggerUtility.info("Validating that icon to remove added item is visible in the table.");

    }










    //in test vei adauga produse

    //de data asta elementele/intrarile din tabel trebuie sa fie vizibile

}
