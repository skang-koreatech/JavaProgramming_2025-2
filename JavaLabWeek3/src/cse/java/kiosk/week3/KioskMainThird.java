package cse.java.kiosk.week3;

import java.util.Scanner;

public class KioskMainThird {
	public static void main(String[] args) {
        System.out.println("=== (3주차) 주문 키오스크 프로그램을 시작합니다! ===");

        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        // 메뉴 데이터 (배열)
        String[] menuNames  = {"김치찌개", "불고기", "된장찌개", "제육볶음", "콜라", "사이다", "아메리카노"};
        int[]    menuPrices = {7000,       9000,      6500,       8000,       2000,   2000,    3000};
        String[] menuCategories = {"식사", "식사", "식사", "식사", "음료", "음료", "커피"};

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
                case 1:
                	// 메뉴 출력
                	System.out.println("\n[메뉴 보기]");
                    
                	//printMenu(menuNames, menuPrices);
                	printMenu(menuNames, menuPrices, menuCategories);
                   
                    break;
                case 2:
                	// 장바구니 담기                    
                    System.out.println("\n[장바구니 담기]");
                    System.out.println("현재는 장바구니 담기 기능이 준비되지 않았습니다.");
                    break;
                case 3:
                    System.out.println("\n[주문하기]");
                    System.out.println("현재는 주문하기 기능이 준비되지 않았습니다.");
                    break;
                case 4:
                    System.out.println("\n프로그램을 종료합니다. 감사합니다!");
                    running = false;
                    break;
                default:
                    System.out.println("\n잘못된 입력입니다. 1~4 중에서 선택하세요.");
            }
        }
        scanner.close();
    }
	
    private static void printMenu(String[] names, int[] prices) {
        System.out.println("\n[메뉴 보기]");
        
        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + ". " + names[i] + " - " + prices[i] + "원");
        }
    }
    
    // ===== 메뉴 출력 (카테고리 구분) =====
    private static void printMenu(String[] names, int[] prices, String[] categories) {
        System.out.println("\n[메뉴 보기]");

        // 카테고리를 "식사", "음료", "커피" 순으로 출력
        String[] categoryOrder = {"식사", "음료", "커피"};

        for (String cat : categoryOrder) {
        	
            System.out.println("=== " + cat + " ===");
            
            for (int i = 0; i < names.length; i++) {
                if (categories[i].equals(cat)) {
                    System.out.printf(" %s - %d원%n", names[i], prices[i]);
                }
            }
        }
    }
}
