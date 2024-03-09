package co.com.reliquias.software.pages;

import co.com.reliquias.software.pages.mapeos.GeneralPage;
import co.com.reliquias.software.steps.AseaStep;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.List;

@DefaultUrl("https://shop.aseastage.com/")
public class AseaPage extends GeneralPage {
    @FindBy(xpath = "//input[@id='email']")
    public WebElementFacade txtLabelCorreo;

    @FindBy(xpath = "//div[contains(text(),'Thank you')]")
    public WebElementFacade txtCongratulations;

    //BOTONES
    @FindBy(xpath = "//div[5]/div/div/div/div/div[5]/button")
    public WebElementFacade btnShoHere;


    @FindBy(xpath = "//div[@class='v-input__append-outer']/button")
    public WebElementFacade btnPlus;

    @FindBy(xpath = "//div[@class='v-input--selection-controls__ripple']")
    public WebElementFacade checkBoxAddToOrder;

    @FindBy(xpath = "//div//button[@data-cy='modify-product-from-detail']")
    public WebElementFacade btnAddToCart;

    @FindBy(xpath = "//div[@data-cy='show-cart-btn']/button")
    public WebElementFacade btnPopUpCarrito;

    @FindBy(xpath = "//aside/div[1]/div[2]/div[2]/div[2]")
    public WebElementFacade btnCheckOut;

    @FindBy(xpath = "//input[@data-test='email-field']")
    public WebElementFacade txtEmail;

    @FindBy(xpath = "//input[@data-test='firstName-field']")
    public WebElementFacade txtFirstName;

    @FindBy(xpath = "//input[@data-test='lastName-field']")
    public WebElementFacade txtLastName;

    @FindBy(xpath = "//input[@data-test='Phone-field']")
    public WebElementFacade txtMobilNumer;

    @FindBy(xpath = "//input[@data-test='AddressLine1-field']")
    public WebElementFacade txtAddresLine1;

    @FindBy(xpath = "//input[@data-test='AddressLine2-field']")
    public WebElementFacade txtAddresLine2;

    @FindBy(xpath = "//input[@data-test='CountryCity-field']")
    public WebElementFacade txtCity;

    @FindBy(xpath = "//input[@data-test='State-field']")
    public WebElementFacade txtState;

    @FindBy(xpath = "//input[@data-test='Zip-field']")
    public WebElementFacade txtZip;
    @FindBy(xpath = "//input[@data-test='siteId-field']")
    public WebElementFacade txtUserName;

    @FindBy(xpath = "//input[@data-test='password-field']")
    public WebElementFacade txtPasword;

    @FindBy(xpath = "//input[@data-test='confirmPassword-field']")
    public WebElementFacade txtPaswordAgain;


//BOTONES

    @FindBy(xpath = "//form/div[2]//div[3]//button//span[@class='v-btn__content']")
    public WebElementFacade btnSaveAddress;

    @FindBy(xpath = "//div[@class='v-input__icon v-input__icon--append']//i")
    public WebElementFacade btnDespliegue;

    @FindBy(xpath = "//div[@data-cy='checkout-button']//button")
    public WebElementFacade btnContinueCheckout;

    @FindBy(xpath = "//button[@data-test='continue']")
    public WebElementFacade btnContinueCheckout2;
    @FindBy(xpath = "//div[@class='d-flex align-start rounded-1 text-caption col col-12']//div[@class='v-input--selection-controls__ripple']//..//..//label")
    public WebElementFacade btnAgree;

    //TXTLABEL
    @FindBy(xpath = "//input[@data-test='cardName-field']")
    public WebElementFacade txtNameCard;

    @FindBy(xpath = "//input[@data-test='cardNumber-field']")
    public WebElementFacade txtCardNumber;

    @FindBy(xpath = "//input[@data-test='expMonth-field']")
    public WebElementFacade txtExpMonth;

    @FindBy(xpath = "//input[@data-test='expYear-field']")
    public WebElementFacade txtExpYear;

    @FindBy(xpath = "//input[@data-test='ccv-field']")
    public WebElementFacade txtCVV;


    @FindBy(xpath = "//div[contains(text(),'Who referred you')]")
        public WebElementFacade apartado;


    //LISTAS
    @FindBy(xpath = "//li[@class='pt-4 pb-4 nav-list-item']//p")
    public List<WebElementFacade> lstCategoria;

    @FindBy(xpath = "//div[@data-item-id='129']//div[@data-cy='card-info']//span//a")
    public List<WebElementFacade> lstProductos;

    @FindBy(xpath = "//div[@class='v-list-item v-list-item--link theme--light']//div[@class='v-list-item__content']/div[@class='v-list-item__title']")
    public List<WebElementFacade> lstStates;

    private static final Logger LOGGER = LoggerFactory.getLogger(AseaStep.class);
    public void Esperar(Integer tiempo){
        try {
            Thread.sleep(tiempo);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void ingresoLaInformacionNecesariaEnBACICINFO(String email, String firstname, String lastname, String mobilNumber) {

        waitOnPage().withTimeout(Duration.ofSeconds(4)).
                pollingEvery(Duration.ofMillis(300)).
                ignoring(ElementNotInteractableException.class);

        waitOnPage().until(
                d -> {
                    txtEmail.sendKeys(email);
                    return true;
                });

      Esperar(800);
        //FIRSTNAME
      //  moveToElement(txtFirstName);
        waitOnPage().withTimeout(Duration.ofSeconds(4)).
                pollingEvery(Duration.ofMillis(300)).
                ignoring(ElementNotInteractableException.class);

        waitOnPage().until(
                d -> {
                    txtFirstName.sendKeys(firstname);
                    return true;
                });
        Esperar(800);
        //LASTNAME
      //  moveToElement(txtLastName);
        waitOnPage().withTimeout(Duration.ofSeconds(2)).
                pollingEvery(Duration.ofMillis(300)).
                ignoring(ElementNotInteractableException.class);

        waitOnPage().until(
                d -> {
                    txtLastName.sendKeys(lastname);
                    return true;
                });
        Esperar(800);
//MOBILNUMMBER
       // moveToElement(txtMobilNumer);
        waitOnPage().withTimeout(Duration.ofSeconds(2)).
                pollingEvery(Duration.ofMillis(300)).
                ignoring(ElementNotInteractableException.class);

        waitOnPage().until(
                d -> {
                    txtMobilNumer.sendKeys(mobilNumber);
                    return true;
                });
    }

    public void ingresoLosDatosParaShippingAddres(String adresLine1, String adresLine2, String city, String state, String zi) {

        //ADDRES1
        moveToElement(txtAddresLine1);
        waitOnPage().withTimeout(Duration.ofSeconds(2)).
                pollingEvery(Duration.ofMillis(300)).
                ignoring(ElementNotInteractableException.class);

        waitOnPage().until(
                d -> {

                    txtAddresLine1.sendKeys(adresLine1);
                    return true;
                });

        //ADDRESLINE2
        moveToElement(txtAddresLine2);
        waitOnPage().withTimeout(Duration.ofSeconds(2)).
                pollingEvery(Duration.ofMillis(300)).
                ignoring(ElementNotInteractableException.class);

        waitOnPage().until(
                d -> {

                    txtAddresLine2.sendKeys(adresLine2);
                    return true;
                });

        //CITY
        moveToElement(txtCity);
        waitOnPage().withTimeout(Duration.ofSeconds(2)).
                pollingEvery(Duration.ofMillis(300)).
                ignoring(ElementNotInteractableException.class);

        waitOnPage().until(
                d -> {

                    txtCity.sendKeys(city);
                    return true;
                });
//STATE

        waitOnPage().withTimeout(Duration.ofSeconds(2)).
                pollingEvery(Duration.ofMillis(300)).
                ignoring(ElementNotInteractableException.class);

        waitOnPage().until(
                d -> {
                    btnDespliegue.click();
                    txtState.sendKeys(state);
                    for(WebElement element:lstStates){
                        moveToElement(element);
                        if (element.getText().trim().toLowerCase().contains(state.trim().toLowerCase())){
                            System.out.println("elemento:"+element.getText());
                            System.out.println("elemento ingresado: "+state);
                            Esperar(800);
                            element.click();
                        break;
                        }

                    }
                    return true;

                });
//ZI
        moveToElement(txtZip);
        waitOnPage().withTimeout(Duration.ofSeconds(2)).
                pollingEvery(Duration.ofMillis(300)).
                ignoring(ElementNotInteractableException.class);

        waitOnPage().until(
                d -> {
                txtZip.click();
                    txtZip.sendKeys(zi);
                    return true;
                });
    }

    public void ingresoLosDatosDeCreditCard(String nameCard, String carNumer, String month, String year, String cvv) {

        Esperar(2000);
        waitOnPage().withTimeout(Duration.ofSeconds(5)).
                pollingEvery(Duration.ofMillis(500)).
                ignoring(ElementNotInteractableException.class);

        waitOnPage().until(
                d -> {

                    txtNameCard.sendKeys(nameCard);
                    return true;
                });

        //CARNUMERO
      //  moveToElement(txtCardNumber);
        waitOnPage().withTimeout(Duration.ofSeconds(4)).
                pollingEvery(Duration.ofMillis(300)).
                ignoring(ElementNotInteractableException.class);

        waitOnPage().until(
                d -> {
                 //   txtCardNumber.click();
                    txtCardNumber.sendKeys(carNumer);
                    return true;
                });

        //EXP MONTH
       // moveToElement(txtExpMonth);
        waitOnPage().withTimeout(Duration.ofSeconds(4)).
                pollingEvery(Duration.ofMillis(300)).
                ignoring(ElementNotInteractableException.class);

        waitOnPage().until(
                d -> {
                   // txtExpMonth.click();
                    txtExpMonth.sendKeys(month);
                    return true;
                });
//EXP YEAR
       // moveToElement(txtExpYear);
        waitOnPage().withTimeout(Duration.ofSeconds(4)).
                pollingEvery(Duration.ofMillis(300)).
                ignoring(ElementNotInteractableException.class);

        waitOnPage().until(
                d -> {
                   // txtExpYear.click();
                    txtExpYear.sendKeys(year);
                    return true;
                });
//CVV
     //   moveToElement(txtCVV);
        waitOnPage().withTimeout(Duration.ofSeconds(4)).
                pollingEvery(Duration.ofMillis(300)).
                ignoring(ElementNotInteractableException.class);

        waitOnPage().until(
                d -> {
                   // txtCVV.click();
                    txtCVV.sendKeys(cvv);
                    return true;
                });
    }


    public void moveToElement(WebElement element){
        JavascriptExecutor js =(JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView();",element);

    }

    public void desplazarPagina(String numero) {
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("window.scrollBy(0," + numero + ")");
    }
}
