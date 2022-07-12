package InternetShop;

/**
 * Преобретение в интернет магазине продукций.
 */
// ctrl + alt + L
public class Purchase {
    public static void main(String[] args) {
        Client client = new Client();
        client.name = "Гриша Ургант";
        client.countryClient = "Украина, Калуш";
        client.numberClient = 380943323;
        client.sumClient = 350;
        client.sizeStep = 40;

        Product product = new Product();
        product.type = "Кроссовки";
        product.nameProd = "Adidas";
        product.cost = 300;
        product.sizeShoes = 40;


        System.out.println("Клиент: " + client.name + " Хочет заказать: " + product.type + " " + product.nameProd);
        System.out.println("Стоимость которых составляет: " + product.cost + "грн");
        System.out.println("У клиента: " + client.name + " " + client.sumClient + "грн");
        if (client.sumClient > product.cost) {
        } else if (product.cost < client.sumClient) {
            System.out.println("Ваших денег недостаточно для покупки товара");
            System.out.println("У " + client.name + " Достаточно денег на преобритение товара, укажите свой размер ноги");
        }
            System.out.println("Размер ноги: " + client.sizeStep);
        if (client.sizeStep == product.sizeShoes) {
            System.out.println("У нас нет Вашего размера, приходите позже!");
            System.out.println("У нас есть Ваш размер: " + client.sizeStep + "Укажите данные для отправки");
            System.out.println("Страна,город: " + client.countryClient);
            System.out.println("Номер телефона: " + client.numberClient);
            System.out.println("Остаток денег после получения покупки: " + (client.sumClient - product.cost) + "грн");
            System.out.println("Хорошего вам дня! Ждем вас еще за покупками!");
        }
    }
}





