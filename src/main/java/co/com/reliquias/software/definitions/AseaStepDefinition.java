package co.com.reliquias.software.definitions;

import co.com.reliquias.software.steps.AseaStep;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;

import java.util.List;
import java.util.Map;

public class AseaStepDefinition {
    @Steps
    private AseaStep aseaStep;

    @Dado("que ingreso a la pagina Asea")
    public void UsuarioNavegaPaginaInicioDeSesion() {
        aseaStep.openLoginPage();
    }

    @Cuando("la pagina este haciendo tal cosa")
    public void laPaginaEsteHaciendoTalCosa() {
        aseaStep.laPaginaEsteHaciendoTalCosa();
    }

    @Cuando("la pagina este abierta realizo click en Shop Here")
    public void laPaginaEsteAbiertaRealizoClickEnShopHere() {
        aseaStep.laPaginaEsteAbiertaRealizoClickEnShopHere();
    }

    @Y("selecciono la Categoria {string}")
    public void seleccionoLaCategoria(String categoria) {
        aseaStep.seleccionoLaCategoria(categoria);
    }

    @Y("selecciono el producto {string}")
    public void seleccionoElProducto(String producto) {
        aseaStep.seleccionoElProducto(producto);
    }

    @Y("selecciono la cantidad del producto {string}")
    public void seleccionoLaCantidadDelProducto(String cant) {
        aseaStep.seleccionoLaCantidadDelProducto(cant);
    }

    @Y("selecciono el checkbox para agregar el producto al carrito")
    public void seleccionoElCheckboxParaAgregarElProductoAlCarrito() {
        aseaStep.seleccionoElCheckboxParaAgregarElProductoAlCarrito();
    }

    @Y("selecciono el boton Add to Cart")
    public void seleccionoElBotonAddToCart() {
        aseaStep.seleccionoElBotonAddToCart();
    }

    @Y("abro el popup del carrito de compras")
    public void abroElPopupDelCarritoDeCompras() {
        aseaStep.abroElPopupDelCarritoDeCompras();
    }

    @Y("hago click en el boton CHECKOUT")
    public void hagoClickEnElBotonCHECKOUT() {
        aseaStep.hagoClickEnElBotonCHECKOUT();
    }

    @Y("ingreso la informacion necesaria en BACIC INFO")
    public void ingresoLaInformacionNecesariaEnBACICINFO(DataTable dataTable) {
        List<Map<String, String>> sEmaildata = dataTable.asMaps();
        List<Map<String, String>> sFirtsNamedata = dataTable.asMaps();
        List<Map<String, String>> sLastNamedata = dataTable.asMaps();
        List<Map<String, String>> sMobilnumberdata = dataTable.asMaps();
        for (int i = 0; i < sEmaildata.size(); i++) {
            System.out.println(sEmaildata.get(i).get("sEmail"));//nombre del producto Celular...
           // System.out.println(listU.get(i).get("sUnidades"));//numero de veces o unidades
            aseaStep.ingresoLaInformacionNecesariaEnBACICINFO(sEmaildata.get(i), sFirtsNamedata.get(i),sLastNamedata.get(i),sMobilnumberdata.get(i));
        }
        System.out.println("Termine de seleccionar todos mis productos");


    }

    @Y("ingreso los datos para Shipping Addres")
    public void ingresoLosDatosParaShippingAddres(DataTable dataTable) {
        List<Map<String, String>> sAddresLine1data = dataTable.asMaps();
        List<Map<String, String>> sAddresLine2data = dataTable.asMaps();
        List<Map<String, String>> sCitydata = dataTable.asMaps();
        List<Map<String, String>> sStatedata = dataTable.asMaps();
        List<Map<String, String>> sZidata= dataTable.asMaps();

        for (int i = 0; i < sAddresLine1data.size(); i++) {
            System.out.println(sAddresLine1data.get(i).get("sAddresLine1"));//nombre del producto Celular...
            // System.out.println(listU.get(i).get("sUnidades"));//numero de veces o unidades
            aseaStep.ingresoLosDatosParaShippingAddres(sAddresLine1data.get(i), sAddresLine2data.get(i),sCitydata.get(i),sStatedata.get(i),sZidata.get(i));
        }
        System.out.println("Termine de seleccionar todos mis productos");

    }

    @Y("guardo la informacion")
    public void guardoLaInformacion() {
        aseaStep.guardoLaInformacion();
    }

//    @Y("selecciono SHIPPING METHOD por defecto")
//    public void seleccionoSHIPPINGMETHODPorDefecto() {
//        aseaStep.seleccionoSHIPPINGMETHODPorDefecto();
//    }

    @Y("continuo con el checkout")
    public void continuoConElCheckout() {
        aseaStep.continuoConElCheckout();
    }

    @Y("ingreso los datos de Credit Card")
    public void ingresoLosDatosDeCreditCard(DataTable dataTable) {
        List<Map<String, String>> sNameCarddata = dataTable.asMaps();
        List<Map<String, String>> sCardNumerdata = dataTable.asMaps();
        List<Map<String, String>> sExpMonthdata = dataTable.asMaps();
        List<Map<String, String>> sExpYeardata = dataTable.asMaps();
        List<Map<String, String>>  sCVVdata= dataTable.asMaps();

        for (int i = 0; i < sNameCarddata.size(); i++) {
            System.out.println(sNameCarddata.get(i).get("sNameCard"));//nombre del producto Celular...
            // System.out.println(listU.get(i).get("sUnidades"));//numero de veces o unidades
            aseaStep.ingresoLosDatosDeCreditCard(sCardNumerdata.get(i), sCardNumerdata.get(i),sExpMonthdata.get(i),sExpYeardata.get(i),sCVVdata.get(i));
        }
        System.out.println("Termine de seleccionar todos mis productos");


    }

    @Y("selecciono la opcion {string}")
    public void seleccionoLaOpcion(String opcion) {
        aseaStep.seleccionoLaOpcion(opcion);
    }

    @Y("hag click en el checkbox de terminos legales")
    public void hagClickEnElCheckboxDeTerminosLegales() {
        aseaStep.hagClickEnElCheckboxDeTerminosLegales();
    }

    @Y("finalizo la orden")
    public void finalizoLaOrden() {
    }

    @Entonces("valido que se muestra toda la informacion completa")
    public void validoQueSeMuestraTodaLaInformacionCompleta() {
        aseaStep.validoQueSeMuestraTodaLaInformacionCompleta();
    }

    @Y("ingreso usuario y contraseña validas")
    public void ingresoUsuarioYContrasenaValidas() {
        aseaStep.ingresoUsuarioYContrasenaValidas();
    }

    @Y("selecciono la opcion who refered {string}")
    public void seleccionoLaOpcionWhoRefered(String opcion) {
        aseaStep. seleccionoLaOpcionWhoRefered(opcion);
    }

    @Y("selecciono la opcion {string} en el apartado de {string}")
    public void seleccionoLaOpcionEnElApartadoDe(String opcion, String apartado) {
        aseaStep.seleccionoLaOpcionEnElApartadoDe(opcion,apartado);
    }

    @Y("continuo con el checkout para finalizar")
    public void continuoConElCheckoutParaFinalizar() {
        aseaStep.continuoConElCheckoutParaFinalizar();
    }

    @Entonces("valido que se haya completado la compra")
    public void validoQueSeHayaCompletadoLaCompra() {
        aseaStep.validoQueSeHayaCompletadoLaCompra();
    }
}
