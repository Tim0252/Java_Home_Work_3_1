public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 15_000;
        int miles = service.calculate(price);
        System.out.println(" Бонусов начиленно: " + miles);
    }
}