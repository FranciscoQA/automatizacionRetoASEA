package co.com.reliquias.software.steps;

import co.com.reliquias.software.pages.AseaPage;
import io.cucumber.datatable.DataTable;
import org.apache.commons.lang3.RandomStringUtils;
import org.fluentlenium.core.annotation.Page;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.Map;

public class AseaStep {
    WebDriver driver;
    private static final Logger LOGGER = LoggerFactory.getLogger(AseaStep.class);
    @Page
    private AseaPage aseaPage;

    public void openLoginPage() {
        aseaPage.open();
        LOGGER.info("user open login page");


    }

    public void laPaginaEsteHaciendoTalCosa() {

        aseaPage.waitOnPage().withTimeout(Duration.ofSeconds(2)).
                pollingEvery(Duration.ofMillis(300)).
                ignoring(ElementNotInteractableException.class);

        aseaPage.waitOnPage().until(
                d -> {
                    aseaPage.txtLabelCorreo.sendKeys("fjimenezr@unprg.edu.pe");
                    return true;
                });

        Assertions.assertEquals("fjimenezr@unprg.edu.pe", aseaPage.txtLabelCorreo.getValue());
    }

    public void laPaginaEsteAbiertaRealizoClickEnShopHere() {
        aseaPage.waitOnPage().withTimeout(Duration.ofSeconds(2)).
                pollingEvery(Duration.ofMillis(300)).
                ignoring(ElementNotInteractableException.class);

        aseaPage.waitOnPage().until(
                d -> {
                    aseaPage.btnShoHere.click();
                    return true;
                });

    }


    public void ingresoLaInformacionNecesariaEnBACICINFO(Map<String, String> sEmaildata, Map<String, String> sFirstnamedata, Map<String, String> sLastNamedata, Map<String, String> sMobilnumberdata) {
        String email = sEmaildata.get("sEmail");
        String firstname = sFirstnamedata.get("sFirstname");
        String lastname = sLastNamedata.get("sLastName");
        String mobilNumber = sMobilnumberdata.get("sMobileNumber");
        aseaPage.ingresoLaInformacionNecesariaEnBACICINFO(email, firstname, lastname, mobilNumber);

    }

    public void ingresoLosDatosParaShippingAddres(Map<String, String> sAddresLine1, Map<String, String> sAddresLine2, Map<String, String> sCity, Map<String, String> sState, Map<String, String> sZi) {

        String adresLine1 = sAddresLine1.get("sAddresLine1");
        String adresLine2 = sAddresLine2.get("sAddresLine2");
        String city = sCity.get("sCity");
        String state = sState.get("sState");
        String zi = sZi.get("sZi");

        aseaPage.ingresoLosDatosParaShippingAddres(adresLine1, adresLine2, city, state, zi);

    }

    public void ingresoLosDatosDeCreditCard(Map<String, String> sNameCard, Map<String, String> sCardNumer, Map<String, String> sExpMonth, Map<String, String> sExpYear, Map<String, String> sCVV) {
        String nameCard = sNameCard.get("sNameCard");
        String carNumer = sCardNumer.get("sCardNumer");
        String month = sExpMonth.get("sExpMonth");
        String year = sExpYear.get("sExpYear");
        String cvv = sCVV.get("sCVV");

        aseaPage.ingresoLosDatosDeCreditCard(nameCard, carNumer, month, year, cvv);


    }

    public void seleccionoLaCategoria(String categoria) {
        for (WebElement element : aseaPage.lstCategoria) {
            aseaPage.moveToElement(element);
            if (element.getText().trim().toLowerCase().contains(categoria.trim().toLowerCase())) {
                aseaPage.waitOnPage().withTimeout(Duration.ofSeconds(2)).
                        pollingEvery(Duration.ofMillis(300)).
                        ignoring(ElementNotInteractableException.class);

                aseaPage.waitOnPage().until(
                        d -> {
                            element.click();
                            return true;
                        });
                break;
            }


        }
    }

    public void seleccionoElProducto(String producto) {
        for (WebElement element : aseaPage.lstProductos) {

            if (element.getText().trim().toLowerCase().contains(producto.trim().toLowerCase())) {
                aseaPage.waitOnPage().withTimeout(Duration.ofSeconds(4)).
                        pollingEvery(Duration.ofMillis(300)).
                        ignoring(ElementNotInteractableException.class);
                //   aseaPage.desplazarPagina("200");
                aseaPage.waitOnPage().until(
                        d -> {
                            element.click();
                            return true;
                        });
                break;
            }

        }
    }

    public void seleccionoLaCantidadDelProducto(String cant) {
        Integer cantidad = Integer.parseInt(cant);

        for (int i = 0; i < cantidad - 1; i++) {
            aseaPage.waitOnPage().withTimeout(Duration.ofSeconds(4)).
                    pollingEvery(Duration.ofMillis(300)).
                    ignoring(ElementNotInteractableException.class);

            aseaPage.waitOnPage().until(
                    d -> {
                        aseaPage.btnPlus.click();
                        return true;
                    });
        }
    }

    public void seleccionoElCheckboxParaAgregarElProductoAlCarrito() {

        aseaPage.moveToElement(aseaPage.checkBoxAddToOrder);
        aseaPage.waitOnPage().withTimeout(Duration.ofSeconds(5)).
                pollingEvery(Duration.ofMillis(500)).
                ignoring(ElementNotInteractableException.class);
        aseaPage.desplazarPagina("-400");
        aseaPage.waitOnPage().until(
                d -> {
                    aseaPage.checkBoxAddToOrder.click();
                    return true;
                });
    }

    public void seleccionoElBotonAddToCart() {
        aseaPage.waitOnPage().withTimeout(Duration.ofSeconds(10)).
                pollingEvery(Duration.ofMillis(300)).
                ignoring(ElementNotInteractableException.class);

        aseaPage.waitOnPage().until(
                d -> {
                    aseaPage.btnAddToCart.click();
                    return true;
                });
    }

    public void abroElPopupDelCarritoDeCompras() {
        aseaPage.waitOnPage().withTimeout(Duration.ofSeconds(2)).
                pollingEvery(Duration.ofMillis(300)).
                ignoring(ElementNotInteractableException.class);

        aseaPage.waitOnPage().until(
                d -> {
                    aseaPage.btnPopUpCarrito.click();
                    return true;
                });
    }

    public void hagoClickEnElBotonCHECKOUT() {
        aseaPage.moveToElement(aseaPage.btnCheckOut);
        aseaPage.waitOnPage().withTimeout(Duration.ofSeconds(2)).
                pollingEvery(Duration.ofMillis(300)).
                ignoring(ElementNotInteractableException.class);

        aseaPage.waitOnPage().until(
                d -> {
                    aseaPage.btnCheckOut.click();
                    return true;
                });
    }

    public void seleccionoLaOpcion(String opcion) {
        //  aseaPage.desplazarPagina("400");
        aseaPage.moveToElement(aseaPage.apartado);
        //aseaPage.desplazarPagina("300");
        WebElement checkOpcion = aseaPage.getDriver().findElement(By.xpath("//div[contains(text(),'Who')]//..//div[@class='v-input--selection-controls__input']//..//label[contains(text(),'" + opcion + "')]"));
        aseaPage.moveToElement(checkOpcion);
        aseaPage.waitOnPage().withTimeout(Duration.ofSeconds(5)).
                pollingEvery(Duration.ofMillis(500)).
                ignoring(ElementNotInteractableException.class);

        aseaPage.waitOnPage().until(
                d -> {
                    aseaPage.Esperar(1200);
                    checkOpcion.click();
                    return true;
                });

    }

    public void seleccionoLaOpcionWhoRefered(String opcion) {
        //  aseaPage.moveToElement(aseaPage.apartado.getText().replace("producto",opcion));
        WebElement checkOpcion = aseaPage.getDriver().findElement(By.xpath("//div[@class='text-subtitle-1' and contains(text(),'" + opcion + "')]//..//div[@class='v-input--selection-controls__input']"));
        aseaPage.moveToElement(checkOpcion);
        aseaPage.waitOnPage().withTimeout(Duration.ofSeconds(20)).
                pollingEvery(Duration.ofMillis(300)).
                ignoring(ElementNotInteractableException.class);

        aseaPage.waitOnPage().until(
                d -> {
                    checkOpcion.click();
                    return true;
                });
    }

    public void ingresoUsuarioYContrasenaValidas() {
        //USUARIO
        String usuarioRandom = RandomStringUtils.randomAlphanumeric(15).toUpperCase();
        //   aseaPage.moveToElement(aseaPage.txtUserName);
        aseaPage.waitOnPage().withTimeout(Duration.ofSeconds(5)).
                pollingEvery(Duration.ofMillis(500)).
                ignoring(ElementNotInteractableException.class);

        aseaPage.waitOnPage().until(
                d -> {
                    aseaPage.txtUserName.sendKeys(usuarioRandom);
                    return true;
                });

        //CONTRASEÑA

        //  aseaPage.moveToElement(aseaPage.txtPasword);
        aseaPage.waitOnPage().withTimeout(Duration.ofSeconds(2)).
                pollingEvery(Duration.ofMillis(300)).
                ignoring(ElementNotInteractableException.class);

        aseaPage.waitOnPage().until(
                d -> {
                    aseaPage.txtPasword.sendKeys("Asea.2024@P3r4");
                    return true;
                });


        //CONTRASEÑA NUEVAMENTE

        //   aseaPage.moveToElement(aseaPage.txtPasword);
        aseaPage.waitOnPage().withTimeout(Duration.ofSeconds(2)).
                pollingEvery(Duration.ofMillis(300)).
                ignoring(ElementNotInteractableException.class);

        aseaPage.waitOnPage().until(
                d -> {
                    aseaPage.txtPaswordAgain.sendKeys("Asea.2024@P3r4");
                    return true;
                });


    }

    public void guardoLaInformacion() {
        aseaPage.moveToElement(aseaPage.btnSaveAddress);
        aseaPage.waitOnPage().withTimeout(Duration.ofSeconds(5)).
                pollingEvery(Duration.ofMillis(500)).
                ignoring(ElementNotInteractableException.class);

        aseaPage.waitOnPage().until(
                d -> {
                    aseaPage.btnSaveAddress.click();
                    return true;
                });


    }


    public void continuoConElCheckout() {

        //aseaPage.moveToElement(aseaPage.btnContinueCheckout);
        // aseaPage.desplazarPagina("800");
        aseaPage.waitOnPage().withTimeout(Duration.ofSeconds(5)).
                pollingEvery(Duration.ofMillis(500)).
                ignoring(ElementNotInteractableException.class);

        aseaPage.desplazarPagina("300");
        aseaPage.moveToElement(aseaPage.btnContinueCheckout);
        aseaPage.waitOnPage().until(ExpectedConditions.elementToBeClickable(aseaPage.btnContinueCheckout)).click();

//        aseaPage.waitOnPage().until(
//                d -> {
//                   // aseaPage.moveToElement(aseaPage.btnContinueCheckout);
//                    aseaPage.moveTo(aseaPage.btnContinueCheckout.getText());
//                    aseaPage.Esperar();
//                    aseaPage.btnContinueCheckout.click();
//                    return true;
//                });

    }

    public void hagClickEnElCheckboxDeTerminosLegales() {

        aseaPage.moveToElement(aseaPage.btnAgree);
        aseaPage.waitOnPage().withTimeout(Duration.ofSeconds(5)).
                pollingEvery(Duration.ofMillis(500)).
                ignoring(ElementNotInteractableException.class);

        aseaPage.waitOnPage().until(
                d -> {
                    aseaPage.btnAgree.click();
                    return true;
                });

    }

    public void seleccionoLaOpcionEnElApartadoDe(String opcion, String apartado) {
        //aseaPage.

    }

    public void continuoConElCheckoutParaFinalizar() {
        aseaPage.waitOnPage().withTimeout(Duration.ofSeconds(5)).
                pollingEvery(Duration.ofMillis(500)).
                ignoring(ElementNotInteractableException.class);

        aseaPage.waitOnPage().until(
                d -> {
                    aseaPage.btnContinueCheckout2.click();
                    return true;
                });
    }

    public void validoQueSeMuestraTodaLaInformacionCompleta() {

    }

    public Boolean validoQueSeHayaCompletadoLaCompra() {
        aseaPage.Esperar(3000);
        Boolean validacion = false;

        aseaPage.waitOnPage().withTimeout(Duration.ofSeconds(20)).
                pollingEvery(Duration.ofMillis(500)).
                ignoring(ElementNotInteractableException.class);

        aseaPage.waitOnPage().until(
                d -> {
                    aseaPage.txtCongratulations.isDisplayed();
                    return true;
                });
        if (aseaPage.txtCongratulations.getText().contains("Thank you")) {
            validacion = true;
        }
        return validacion;
    }
}

