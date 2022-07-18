public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double index = service.calculate(service.weight, service.high); // индекс массы тела

        System.out.println();
        System.out.println("Вес: 70 кг");
        System.out.println("Рост: 170 см");
        System.out.println();
        System.out.println("ИМТ: " + index + " - Норма");
    }
}