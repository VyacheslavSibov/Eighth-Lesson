package parking;

/**
 * Заезд на парковку клиентом.
 */
// ctrl + alt + L
public class CheckIn {
    public static void main(String[] args) {
        BaseClient client = new BaseClient();
        client.client = "name client";
        client.auto = "auto client";
        client.sumClient = 330;

        Tariffs tarrifs = new Tariffs();
        tarrifs.sum1h = 25;
        tarrifs.sum5h = 100;
        tarrifs.sum10h = 210;
    }
}