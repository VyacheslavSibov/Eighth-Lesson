package Parking;

/**
 * Заезд на парковку клиентом.
 */
// ctrl + alt + L
public class CheckIn {
    public static void main(String[] args) {
        BaseClient client = new BaseClient();
        client.client = "Robby Williams";
        client.auto = "KIA";
        client.sumClient = 330;

        Tariffs tarrifs = new Tariffs();
        tarrifs.sum1h = 25;
        tarrifs.sum5h = 100;
        tarrifs.sum10h = 210;

        System.out.println(client.client + " Хочет припарковать: " + client.auto);
        System.out.println("Кол-во денег у " + client.client + " " + client.sumClient + "грн");
        System.out.println("Тарифы парковки :");
        System.out.println("1 Час: " + tarrifs.sum1h + "грн");
        System.out.println("5 Час: " + tarrifs.sum5h + "грн");
        System.out.println("10 Часов: " + tarrifs.sum10h + "грн");
        System.out.println("                              ");
        if (client.sumClient > tarrifs.sum1h) {
            System.out.println("Вы можете припарковать автомобиль на 1 час");
            System.out.println("После 1 часа парковки остаток: " + (client.sumClient - tarrifs.sum1h) + "грн");
            System.out.println("                              ");
        }
        if (client.sumClient > tarrifs.sum5h) {
            System.out.println("Вы можете припарковать автомобиль на 5 час");
            System.out.println("После 5 часов парковки остаток: " + (client.sumClient - tarrifs.sum5h) + "грн");
            System.out.println("                              ");
        }
        if (client.sumClient > tarrifs.sum10h) {
            System.out.println("Вы можете припарковать автомобиль на 10 час");
            System.out.println("После 10 часов парковки остаток: " + (client.sumClient - tarrifs.sum10h)+ "грн");
            System.out.println("                              ");
        }
    }
}