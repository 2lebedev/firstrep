public class Autopilot {

    public static void main(String args[]) {
        String color = "red";
        if (color == "green") {
            System.out.println("Ехать!");
        } else if (color == "yellow") {
            System.out.println("Подождать");
        } else if (color == "red") {
            System.out.println("Остановиться");
        } else {
            System.out.println("Неверный цвет");
        }
    }
}