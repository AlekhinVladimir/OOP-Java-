 public class Main {


    public static void main(String[] args) {
        System.out.println("Введите заказ:");

        Order order = new Order();
        NewOrderBuilding orderBuilding = new NewOrderBuilding();
        Saver saver = new Saver();


        orderBuilding.inputFromConsole(order);
        saver.saveToJson(order);

    }
}




