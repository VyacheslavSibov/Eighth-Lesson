package internet.shop;

/**
 * Преобретение в интернет магазине продукций.
 */
// ctrl + alt + L
public class Purchase {
    public static void main(String[] args) {
        Client client = new Client();
        client.name = "name";
        client.countryClient = "country";
        client.numberClient = 380943323;
        client.sumClient = 350;
        client.sizeStep = 40;

        Product product = new Product();
        product.type = "type";
        product.nameProd = "nameProd";
        product.cost = 300;
        product.sizeShoes = 40;

        }
    }






