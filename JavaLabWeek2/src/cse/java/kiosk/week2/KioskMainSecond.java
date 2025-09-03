package cse.java.kiosk.week2;

import java.util.Scanner;

public class KioskMainSecond {
	public static void main(String[] args) {
        System.out.println("=== (2주차) 주문 키오스크 프로그램을 시작합니다! ===");

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            // 메뉴 출력
            System.out.println("\n원하시는 항목을 선택하세요:");
            System.out.println("1. 메뉴 보기");
            System.out.println("2. 장바구니 담기");
            System.out.println("3. 주문하기 (장바구니 결제)");
            System.out.println("4. 종료");

            System.out.print("선택: ");
            int choice;

            // 입력값 검증
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                System.out.println("잘못된 입력입니다! 숫자를 입력하세요.");
                scanner.next(); // 잘못된 입력 제거
                continue;
            }

            // switch 문으로 기능 분기
            switch (choice) {
                case 1 -> {
                    System.out.println("\n[메뉴 보기]");
                    System.out.println("현재는 메뉴 보기 기능이 준비되지 않았습니다.");
                }
                  
                case 2 -> {
                    System.out.println("\n[장바구니 담기]");
                    System.out.println("현재는 장바구니 담기 기능이 준비되지 않았습니다.");
                }
                case 3 -> {
                    System.out.println("\n[주문하기]");
                    System.out.println("현재는 주문하기 기능이 준비되지 않았습니다.");
                }
                case 4 -> {
                    System.out.println("\n프로그램을 종료합니다. 감사합니다!");
                    running = false;
                }
                default -> System.out.println("\n잘못된 입력입니다. 1~4 중에서 선택하세요.");
            }
        }
        scanner.close();
        System.out.println("\n=== (2주차) 주문 키오스크 프로그램을 종료합니다! ===");
    }
}

