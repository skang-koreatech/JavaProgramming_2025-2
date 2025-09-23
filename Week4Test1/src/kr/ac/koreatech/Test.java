package kr.ac.koreatech;

class Car {
	String company = "Hyundai";
    String model;
    String color;
   
    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    void showInfo() {
        System.out.println("제조사: " + company + ", 모델: " + model + ", 색상: " + color);
    }
}

public class Test {
    public static void main(String[] args) {
    	// 자동차 생산 - 객체 생성하는 것을 자동차 생산하는 것으로 생각해보자
        Car c1 = new Car("Sonata", "White");
        Car c2 = new Car("Avante", "Black");

        c1.showInfo();
        c2.showInfo();
    }
}

