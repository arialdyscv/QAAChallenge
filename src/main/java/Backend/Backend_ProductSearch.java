package Backend;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

public class Backend_ProductSearch {

    @Test
    public void searchProductAndValidateAttributes() {
        String baseUrl = "https://api.mercadolibre.com/sites/MLA/search?q=celulares";

        // Realizar la búsqueda y obtener la respuesta
        Response response = RestAssured.get(baseUrl);

        // Validar el código de estado de la respuesta
        Assert.assertEquals(200, response.getStatusCode());

        // Obtener el total de productos encontrados y la cantidad de productos devueltos
        int totalProducts = response.path("paging.total");
        int productsReturned = response.path("paging.limit");

        System.out.println("Total de productos encontrados: " + totalProducts);
        System.out.println("Cantidad de productos devueltos: " + productsReturned);

        // Elegir un índice al azar
        int randomIndex = (int) (Math.random() * productsReturned);

        // Obtener el ID del producto al azar
        String productId = response.path("results[" + randomIndex + "].id");

        // Obtener el detalle del producto
        String detalleUrl = "https://api.mercadolibre.com/items/" + productId;
        Response detalleResponse = RestAssured.get(detalleUrl);

        // Validar los atributos del producto
        String title = detalleResponse.path("title");
        int price = detalleResponse.path("price");
        boolean acceptsMercadoPago = detalleResponse.path("accepts_mercadopago");
        String currency = detalleResponse.path("currency_id");
        boolean freeShipping = detalleResponse.path("shipping.free_shipping");

        // Realizar las validaciones de los atributos
        Assert.assertNotNull(title);
        Assert.assertTrue(price > 0);
        Assert.assertTrue(acceptsMercadoPago);
        Assert.assertNotNull(currency);
        Assert.assertTrue(freeShipping);
    }
}
