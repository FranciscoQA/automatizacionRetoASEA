#language:es
Característica: Inicio de Sesion
  Como candidato a pruebas QA
  Quiero ingresar a la pagina X
  Para realizar una prueba de automatizacion

  @Cas01
  Esquema del escenario: Prueba QA ASEA
    Dado que ingreso a la pagina Asea
    Cuando la pagina este abierta realizo click en Shop Here
    Y selecciono la Categoria "<sCategoria>"
    Y selecciono el producto "<sProducto>"
    Y selecciono el checkbox para agregar el producto al carrito
    Y selecciono la cantidad del producto "<sCantidad>"
    Y selecciono el boton Add to Cart
    Y abro el popup del carrito de compras
    Y hago click en el boton CHECKOUT
    Y ingreso la informacion necesaria en BACIC INFO
      | sEmail                | sFirstname | sLastName | sMobileNumber |
      | alonsoaguirre@bcp.com | Alosno     | Aguirre   | 955-201-3021  |
    Y ingreso los datos para Shipping Addres
      | sAddresLine1           | sAddresLine2 | sCity              | sState | sZi   |
      | 9277 S. Peruvian Drive | Unit 2112    | COTTONWOOD HEIGHTS | Utah   | 84093 |
    Y guardo la informacion
  #  Y selecciono SHIPPING METHOD por defecto
    Y continuo con el checkout
    Y ingreso los datos de Credit Card
      | sNameCard | sCardNumer       | sExpMonth | sExpYear | sCVV |
      | test      | 5454545454545454 | 01        | 2030     | 456  |
  #  Y selecciono la opcion "Use my shipping address"
      # Y selecciono la opcion "USE MY SHIPPING ADDRESS" en el apartado de "Billing Address"
    Y selecciono la opcion "No one referred me"
    Y ingreso usuario y contraseña validas
    Y hag click en el checkbox de terminos legales
    Y continuo con el checkout para finalizar
    Entonces valido que se haya completado la compra
    Ejemplos:
      | sCategoria       | sProducto | sCantidad |
      | Cell Performance | REDOXMood | 3         |