public class Main {
    public static void main(String[] args) {

        int ticket = 58_862;   // стоимость авиабилета
        int x = 20;            // количество рублей для одной бонусной мили
        int mile = ticket / x; // количество бонусных миль за приобретенный авиабилет

        System.out.println(mile + " бонусные мили за приобретенный авиабилет");
    }
}