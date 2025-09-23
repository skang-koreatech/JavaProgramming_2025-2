package kr.ac.koreatech;

class Car {
    String model;
    String color;

    // 전체 생산된 자동차 수 (공유 데이터)
    static int totalCars = 0;

    Car(String model, String color) {
        this.model = model;
        this.color = color;
        totalCars++;
    }

    void showInfo() {
        System.out.println("모델: " + model + ", 색상: " + color);
    }

    static void showTotalCars() {
        System.out.println("총 생산된 자동차 수: " + totalCars);
    }
}

public class Test {
    public static void main(String[] args) {
        Car c1 = new Car("Sonata", "White");
        Car c2 = new Car("Avante", "Black");

        c1.showInfo();
        c2.showInfo();

        Car.showTotalCars(); // 총 생산된 자동차 수: 2
    }
}
