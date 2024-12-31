import java.util.Arrays;
import java.util.Comparator;

public class Main {

    // Клас Літак
    static class Airplane {
        private String model;   // Модель літака
        private double weight;   // Вага літака (в тоннах)
        private int passengers;  // Кількість пасажирів
        private double maxSpeed; // Максимальна швидкість (в км/год)
        private double wingspan; // Розмах крил (в метрах)

        // Конструктор класу
        public Airplane(String model, double weight, int passengers, double maxSpeed, double wingspan) {
            this.model = model;
            this.weight = weight;
            this.passengers = passengers;
            this.maxSpeed = maxSpeed;
            this.wingspan = wingspan;
        }

        // Геттери та сеттери
        public String getModel() {
            return model;
        }

        public double getWeight() {
            return weight;
        }

        public int getPassengers() {
            return passengers;
        }

        public double getMaxSpeed() {
            return maxSpeed;
        }

        public double getWingspan() {
            return wingspan;
        }

        // Метод для виведення інформації про літак
        @Override
        public String toString() {
            return "Airplane{" +
                    "model='" + model + '\'' +
                    ", weight=" + weight +
                    ", passengers=" + passengers +
                    ", maxSpeed=" + maxSpeed +
                    ", wingspan=" + wingspan +
                    '}';
        }
    }

    public static void main(String[] args) {
        // Створення масиву літаків
        Airplane[] airplanes = {
            new Airplane("Boeing 747", 183500, 660, 920, 64.4),
            new Airplane("Airbus A320", 41500, 180, 830, 34.1),
            new Airplane("Concorde", 40800, 100, 2180, 25.6),
            new Airplane("Boeing 777", 350000, 396, 905, 61.3),
            new Airplane("Airbus A380", 560000, 555, 1020, 79.75)
        };

        // Сортування за вагою (за зростанням)
        Arrays.sort(airplanes, Comparator.comparingDouble(Airplane::getWeight));
        System.out.println("Sorted by weight (ascending):");
        for (Airplane airplane : airplanes) {
            System.out.println(airplane);
        }

        System.out.println();

        // Сортування за кількістю пасажирів (за спаданням)
        Arrays.sort(airplanes, (a1, a2) -> Integer.compare(a2.getPassengers(), a1.getPassengers()));
        System.out.println("Sorted by passengers (descending):");
        for (Airplane airplane : airplanes) {
            System.out.println(airplane);
        }
    }
}
