package Transportation;
/**
 * Расстояние с точки "А" в точку "Б"
 */
// ctrl + alt + L
public class Logistics {
    public static void main(String[] args) {
        MachineInformation machine = new MachineInformation();
        machine.car = "VOLVO";
        machine.gasСonsumption = 38;

        Trailer trailer = new Trailer();
        trailer.cargo = "Овощи";
        trailer.type = "Легковой прицеп";
        trailer.weight = 1_000.320;

        System.out.println("Машина: " + machine.car + ", Потребления бензина: " + machine.gasСonsumption + "л на 100км" );
        System.out.println("Оснащение: " + trailer.type + " Груз: " + trailer.cargo + " весом " + trailer.weight + "тонн");

        int x1 = 20;
        int y1 = 31;
        int x2 = 24;
        int y2 = 13;
        int a = Math.abs((y1-x1)*(y1-x1)+(y2-x2)*(y2-x2));
        double cost = machine.gasСonsumption*a/100;
        System.out.println("Для того чтобы проехать растояние в: " + a + " км, понадобится: " + cost + "л. бензина");
    }

}
